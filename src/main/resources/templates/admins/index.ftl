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
				<h3>Add</h3>
				<hr>
				<a href="<@spring.url '/admins/cards'/>">Card</a>
				<a href="<@spring.url '/admins/effect'/>">Effect</a>
				<hr>
				<h3>Delete</h3>
				<hr>
				<a href="#">Card</a>
				<a href="<@spring.url '/admins/effect/delete'/>">Effect</a>
				<hr>
				<h3>Find</h3>
				<hr>
				<a href="#">Card</a>
				<a href="<@spring.url '/admins/effect/find'/>">Effect</a>
				<!--
				<a href="#" onclick="effect()">Effect</a>
				-->
				<hr>
				<h3>Show</h3>
				<hr>
				<a href="#">Card</a>
				<a href="<@spring.url '/admins/effect/show'/>">Effect</a>
				<hr>
				<a href="<@spring.url '/'/>">BACK</a>
				<hr>
				<h3><a href="<@spring.url '/admins/role'/>">ROLE</h3>
				<hr>
			</div>
			
			<div id="content">
				
			</div>
		</div>
		
		<script>
			/*
			function effect(){			
				var content = document.getElementById("content");
				
				if(content.getElementsByTagName('object').length == 0){
					var addEffect = document.createElement('object');
					addEffect.setAttribute('data',"<@spring.url '/admins/effect'/>");
					addEffect.setAttribute('type','text/html');
					addEffect.style.width = '100%';
					addEffect.style.height = '100%';
					document.getElementById("content").appendChild(addEffect);
				
					var showEffect = document.createElement('object');
					showEffect.setAttribute('data',"<@spring.url '/admins/effect/show'/>");
					showEffect.setAttribute('type','text/html');
					showEffect.style.width = '100%';
					showEffect.style.height = '100%';
					document.getElementById("content").appendChild(showEffect);
				
					var findWithCriteria = document.createElement('object');
					findWithCriteria.setAttribute('data',"<@spring.url '/admins/effect/find'/>");
					findWithCriteria.setAttribute('type','text/html');
					findWithCriteria.style.width = '100%';
					findWithCriteria.style.height = '100%';
					document.getElementById("content").appendChild(findWithCriteria);	
				}
			}
			*/
		</script>
	</body>
</html>
<#include "menu_admin.ftl">