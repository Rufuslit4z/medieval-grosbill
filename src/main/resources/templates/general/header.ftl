<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html>
<head>
    <title>Home Médieval GrosBill</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="<@spring.url '/css/general/header.css'/>">
</head>
<body>

<header>
    <div id="logo">
        <p>Médieval GrosBill</p>
    </div>
    <div class="menu">
        <nav>
            <ul>
                <li><a href="#">Rules</a></li>
                <li><a href="#">News</a></li>
                <li><a href="#">Profil</a></li>
                <li><a href="#">Rank</a></li>
                <li><a href="<@spring.url '/admins'/>">Admin Panel</a></li>
            </ul>
        </nav>
    </div>
    <div class="menu connexion">
        <nav>
            <ul>
                <li><a href="#">Login</a></li>
                <li><a href="<@spring.url '/register'/>">Register</a></li>
            </ul>
        </nav>
    </div>
</header>