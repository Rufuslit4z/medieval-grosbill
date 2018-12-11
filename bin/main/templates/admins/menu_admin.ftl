<#import "/spring.ftl" as spring/>

<link rel="stylesheet" type="text/css" href="<@spring.url '/css/admin/style.css'/>">

<div class="admin">
    <h3>Menu Admin</h3>
    <ul>
        <li><a href="/admins/cards">Cartes</a></li>
        <li><a href="/admins/effect">Effets</a></li>
        <li><a href="/admins/user">Utilisateurs</a></li>
        <li><a href="/admins/role">Roles</a></li>
    </ul>
</div>

