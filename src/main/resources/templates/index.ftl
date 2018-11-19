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
				<p>M�dieval GrosBill</p>
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
						<li><a href="#">Register</a></li>
					</ul>
				</nav>
			</div>
		</header>
		
		<div class="conteneur carousel">
			<h1>Carousel</h1>
		</div>
	
		<div class="conteneur presentation">
			<h1>Pr�sentation du jeu</h1>
		</div>
	</body>
</html>

<h1>Test</h1>

