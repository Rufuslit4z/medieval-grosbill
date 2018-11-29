<#import "/spring.ftl" as spring/>

<#include "../general/header.ftl">
<head>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/admin/style.css'/>">
</head>

<div id="conteneur">

    <div class="admin">
        <h3>MENU ADMIN</h3>
        <ul>
            <li><a href="cards">Cards</a></li>
            <li><a href="effect">Effects</a></li>
            <li><a href="users">Utilisateurs</a></li>
            <li><a href="roles">Roles</a></li>
        </ul>
    </div>