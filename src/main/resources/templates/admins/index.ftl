<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html>
	<head>
		<title>Home M�dieval GrosBill</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>">
	</head>
	<body>
		<header>
			<div id="logo">
				<p>Admin Panel Médieval GrosBill</p>
			</div>
			<div class="menu">
				<nav>
					<ul>
						<li><a href="#">Rules</a></li>
						<li><a href="#">News</a></li>
						<li><a href="#">Profil</a></li>
						<li><a href="#">Rank</a></li>
					</ul>
				</nav>
			</div>
			<div class="menu connexion">
				<nav>
					<ul>
						<li><a href="#">Login</a></li>
						<li><a href="#">Register</a></li>
					</ul>
				</nav>
			</div>
		</header>

		<div id="conteneur">

			<div class="admin">
				<h3>MENU ADMIN</h3>
				<hr>
				<h3>Add something</h3>
				<hr>
				<a href="<@spring.url '/admins/cards'/>">Add card</a>
				<a href="<@spring.url '/admins/effect'/>">Add effect</a>
				<hr>
				<h3>Show tables</h3>
				<hr>
				<a href="#">Card</a>
				<a href="<@spring.url '/admins/effect/show'/>">Effect</a>
				<hr>
				<a href="<@spring.url '/'/>">   BACK</a>
			</div>
