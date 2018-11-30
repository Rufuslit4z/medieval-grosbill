<#import "/spring.ftl" as spring/>

<link rel="stylesheet" type="text/css" href="<@spring.url '/css/show-tables.css'/>">

<h1>Find with criteria</h1>

<form method="POST">
	<!--
	<input name="id" type="text" placeholder="id">
	-->
	<input name="name" type="text" placeholder="name">
	<!--
	<input name="type" type="text" placeholder="type">
	<input name="value" type="text" placeholder="value">
	<input type="submit" value="FIND">
	-->
</form>

<#if effect??>
<table>
	<tr>
		<td>ID</td>
		<td>NOM</td>
		<td>TYPE</td>
		<td>VALEUR</td>
	</tr>
	<tr>
		<td>${effect.getId()}</td>
		<td>${effect.getName()}</td>
		<td>${effect.getType()}</td>
		<td>${effect.getValue()}</td>
		<td><a id="delete" href="<@spring.url '/admins/effect/delete/${fx.getId()}'/>">DELETE</a></td>
	</tr>
</table>
<#else>
	<!-- 
	<p>${error}</p>
	-->
</#if>