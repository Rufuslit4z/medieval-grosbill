<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html>
<head>
    <title>Home Médieval GrosBill</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/general/header.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.cs'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/general/fix_bootstrap.css'/>">
</head>
<body>

<header>
    <div id="logo">
        <p>Médieval GrosBill</p>
    </div>
    <div class="menu">
        <nav>
            <ul class="menu-header">
                <li><a href="#">Règles</a></li>
                <li><a href="#">Nouveauté</a></li>
                <li><a href="#">Profil</a></li>
                <li><a href="#">Classement</a></li>
                <li><a href="<@spring.url '/admins'/>">Admin Panel</a></li>
            </ul>
        </nav>
    </div>
    <div class="menu connexion">
        <nav>
            <ul>
                <li><a class="menu-account btn-login" onclick="document.getElementById('login').style.display='block';" href="#">Connexion</a></li>
                <li><a class="menu-account btn-register" onclick="document.getElementById('register').style.display='block';" href="#">Inscription</a></li>
                <li><a hidden class="menu-account btn-logout" href="<@spring.url '/logout'/>">Déconnexion</a></li>
            </ul>
        </nav>
    </div>
</header>

<#include "../security/login-popup.ftl">
<#include "../security/registration-popup.ftl">