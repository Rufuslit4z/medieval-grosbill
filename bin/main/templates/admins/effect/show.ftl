<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/show-tables.css'/>">
<h1>SHOW EFFECT</h1>

<table>
	<tr>
		<td>ID</td>
		<td>NAME</td>
		<td>TYPE</td>
		<td>VALUE</td>
		<td><a href="<@spring.url '/admins/effect'/>">+</a></td>
	</tr>
<#list effect as fx>
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
	<td id="${fx.getId()}">-</td>
	</tr>		
</#list>
</table>
<br>
<a href="<@spring.url '/admins'/>">BACK</a>