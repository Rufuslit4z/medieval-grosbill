<#import "/spring.ftl" as spring/>

<h1>${pageName}</h1>
<div>

<form action="${detailPath}/edit" method="POST">
<#if item??>
    <div>Id</div>
    <#if item.getId()??>
    <div>${item.getId()}</div>
    <input type="hidden" name="id" value="${item.getId()}">
    <#else>
    <div>NA</div>
    </#if>
</#if>
    <div>Firstname</div>
    <input type="text" name="firstname" value="<#if item?? && item.getFirstname()??>${item.getFirstname()}</#if>">
    <div>Lastname</div>
    <input type="text" name="lastname" value="<#if item?? && item.getLastname()??>${item.getLastname()}</#if>">
    
    <#if roles??>
    <select name="role">
        <#list roles as r>
            <option value=${r.getId()}>${r.getName()}</option>
        </#list>
    </select>
    </#if>
    <div><input type="submit" value="Save"></div>
</form> 

<#if item?? && item.getId()??>
	<div><a href="${detailPath}/delete/${item.getId()}">Delete</a></div>
</#if>
</div>
<div><a href="${detailPath}/index">Back</a></div>