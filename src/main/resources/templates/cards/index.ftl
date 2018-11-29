<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<!DOCTYPE html>

<form action="${detailPath}/find" method="POST">
    <label for="search">Rechercher :</label>
    <input type="search" name="search" id="search">
</form>

<table>
    <tr>
        <th>Nom</th>
        <th>Type</th>
        <th>Bonus/Level</th>
        <th>Trésor</th>
        <th>Effet</th>
        <th>Modification</th>
    </tr>
<#if cards??>
    <#list cards as c>
        <tr>
            <td>${c.name}</td>
            <td>test</td>
            <td><#if c.level??>${c.level}</#if><#if c.attack??>${c.attack}</#if></td>
            <td><#if c.treasure??>${c.treasure}</#if></td>
            <td><#if c.effect??>${c.effect}</#if></td>
            <td><a href="${detailPath}/edit/${c.id}">Modifier</a> <a href="${detailPath}/delete/${c.id}">Supprimer</a></td>
        </tr>
    </#list>
</#if>
</table>
