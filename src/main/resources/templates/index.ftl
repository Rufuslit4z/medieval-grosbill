<#import "/spring.ftl" as spring/>

<!DOCTYPE html>
<html>
	<head>
		<title>Home Médieval GrosBill</title>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>">
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
		
		<a href="<@spring.url '/admins'/>">GO TO ADMIN</a>
		
		<div class="conteneur carousel">
			<h1>Carousel</h1>
		</div>
	
		<div class="conteneur presentation">
			<h1>Présentation du jeu</h1>
		</div>
	</body>
</html>
