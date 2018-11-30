<#import "/spring.ftl" as spring/>

<#include "../general/header.ftl">
<head>
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/admin/style.css'/>">
</head>

<div id="conteneur">

    <div class="admin">
        <h3>MENU ADMIN</h3>
        <ul>
            <li><a href="<@spring.url '/admins/cards'/>">Cartes</a></li>
            <li><a href="<@spring.url '/admins/effect'/>">Effet</a></li>
            <li><a href="<@spring.url '/admins/user'/>">Utilisateur</a></li>
            <li><a href="<@spring.url '/admins/role'/>">Role</a></li>
        </ul>
    </div>