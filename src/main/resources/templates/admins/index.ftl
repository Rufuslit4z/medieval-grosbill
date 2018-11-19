<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html>
	<head>
		<title>Home Médieval GrosBill</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="<@spring.url '/css/admin.css'/>">
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
	
		<div class="conteneur">
			<div class="admin">
				<h3>MENU ADMIN</h3>
				<hr>
				<a href="<@spring.url '/admins/effect'/>">Add effect</a>
				<a href="<@spring.url '/admins/card'/>">Add card</a>
				<a href="<@spring.url '/'/>">BACK</a>
			</div>
			<div class="content">
				<div class="carousel">
					<h1>Carousel</h1>
				</div>		
				<div class="presentation">
					<h1>Présentation du jeu</h1>
				</div>
			</div>
		</div>
	</body>
</html>