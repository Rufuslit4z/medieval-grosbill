<#import "/spring.ftl" as spring/>

<#include "../general/header.ftl">
<head>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/admin/style.css'/>">
</head>

<div id="conteneur">

    <div class="admin">
        <h3>MENU ADMIN</h3>
        <ul>
            <li><a href="/admins/cards">Cards</a></li>
            <li><a href="/admins/effect">Effects</a></li>
            <li><a href="/admins/users">Utilisateurs</a></li>
            <li><a href="/admins/roles">Roles</a></li>
        </ul>
    </div>