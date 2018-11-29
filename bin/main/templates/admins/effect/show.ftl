<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/show-tables.css'/>">
<h1>SHOW EFFECT</h1>
<hr>
<table>
	<tr>
		<td>ID</td>
		<td>NAME</td>
		<td>TYPE</td>
		<td>VALUE</td>
		<td><a id="new" href="<@spring.url '/admins/effect'/>">NEW</a></td>
	</tr>
<#list effects as fx>
	<tr>
	<#if fx.getId()??>
		<td>${fx.getId()}</td>
	<#else>
		<td>NULL</td>
	</#if>
	<#if fx.getName??>
		<td>${fx.getName()}</td>
	<#else>
		<td>NULL</td>
	</#if>
	<#if fx.getType()??>
		<td>${fx.getType()}</td>
	<#else>
		<td>NULL</td>
	</#if>
	<#if fx.getValue()??>
		<td>${fx.getValue()}</td>
	<#else>
		<td>NULL</td>
	</#if>
		<td><a id="edit" href="<@spring.url '/admins/effect/edit/${fx.getId()}'/>">MODIFIER</a></td>
		<td><a id="delete" href="<@spring.url '/admins/effect/delete/${fx.getId()}'/>">DELETE</a></td>
	</tr>		
</#list>
</table>
<hr>
<a href="<@spring.url '/admins'/>">BACK</a>