<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html>
<head>
    <title>MÃ©dieval GrosBill</title>
    <meta charset="utf-8">
    <link rel="shortcut icon" type="image/x-icon" href="<@spring.url '/img/logoIco.png'/>" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/general/header.css'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.cs'/>">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/general/fix_bootstrap.css'/>">
</head>
<body>

<header>
    <div id="logo">
        <a href="../index.ftl">
            <img src="<@spring.url '/img/titre-logo.png'/>">
        </a>
    </div>
    <div id="menu1" class="menu">
        <nav>
            <ul class="menu-header">
                <li><a href="#">Règles</a></li>
                <li><a href="#">Nouveauté</a></li>
                <#if isConnected == true>
                <li>
                	<a href="#">
                		Profil
                	</a>
                </li>
                </#if>
                <li><a href="#">Classement</a></li>
                <#if isAdmin == true>
                <li>
                	<a href="<@spring.url '/admins'/>">
                		Admin Panel
                	</a>
                </li>
                </#if>
                
                <#if isConnected == true>
                	<li>
                		<a href="<@spring.url '/game'/>">
                			Jouer
                		</a>
                	</li>
                </#if>
            </ul>
        </nav>
    </div>
    <div id="menu2" class="menu connexion">
        <nav>
            <ul>
                <#if isConnected == false>
                	<#if isOnRegister == true>
	                <li>
	                	<a class="menu-account btn-login" onclick="document.getElementById('login').style.display='block';" href="#">
	                		Connexion
	                	</a>
	                </li>
	                </#if>
                </#if>
                
                <#if isConnected == false>
	            	<#if isOnLogin == true>
	                <li>
	                	<a class="menu-account btn-register" onclick="document.getElementById('register').style.display='block';" href="#">
	                		Inscription
	                	</a>
	                </li>
	                </#if>
                </#if>
                
                <#if isConnected == true>
                	<li>
                		<a class="menu-account btn-logout" href="<@spring.url '/logout'/>">
                		Déconnexion
                		</a>
                	</li>
                </#if>
            </ul>
        </nav>
    </div>
</header>

<#include "../security/login-popup.ftl">
<#include "../security/registration-popup.ftl">