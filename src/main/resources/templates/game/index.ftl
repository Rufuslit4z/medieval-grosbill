<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html>
<head>
	<title>Partie en cours</title>
	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/game/game.css'/>">
	<meta charset="utf-8">
    <script src="https://www.gstatic.com/firebasejs/5.7.0/firebase.js"></script>
</head>

<script>
	/*
    // Initialize Firebase
    var config = {
        apiKey: "AIzaSyDu5rfplbj9tvIkwj200FhOGfYQKRLb2hw",
        authDomain: "medieval-grosbill.firebaseapp.com",
        databaseURL: "https://medieval-grosbill.firebaseio.com",
        projectId: "medieval-grosbill",
        storageBucket: "medieval-grosbill.appspot.com",
        messagingSenderId: "533112807779"
    };
    firebase.initializeApp(config);
    */
</script>

<body>
	<div id="shared-board">
		<div class="play-card"></div>
		<div id="draw-treasure" class="game-card">
			<div class="sb_card">
				<div class="card-front game_card treasure"></div>
				<div class="card-back game_card" style="background-image: url(/img/game/carte.jpg);"></div>
			</div>
		</div>
		<div id="discard-treasure" class="game-card"></div>
		<div id="draw-donjon" class="game-card">
			<div class="sb_card">
				<div class="card-front game_card donjon"></div>
				<div class="card-back game_card" style="background-image: url(/img/game/carte2.jpg);"></div>
			</div>
		</div>
		<div id="discard-donjon" class="game-card"></div>
	</div>
	
	<div id="handDropZone"></div>

	<div id="main-board" class="board">
		<div class="avatar">
			<div class="level"></div>
			<div class="attack"></div>
		</div>
		<div id="main-hand" class="hand" onmouseover="displayDropZone()" onmouseout="hideDropZone()">
			<div id="hand_p0" class="hand-visibility">
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="batton">
					<div class="card" draggable="true"></div>
				</div>
				<div class="fix_batton"></div>
			</div>
		</div>
		<div id="main-cards" class="cards">
			<div class="card" draggable="false"></div>
			<div class="card" draggable="false"></div>
			<div class="card" draggable="false"></div>
			<div class="card" draggable="false"></div>
		</div>
	</div>

	<div id="player2-board" class="board">
		<div class="avatar">
			<div class="level"></div>
			<div class="attack"></div>
		</div>
		<div id="player2-hand" class="hand">
			<div id="hand_p1" class="hand-visibility">
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="fix_batton"></div>
			</div>
		</div>
		<div id="player2-cards" class="cards">
			<div class="card"></div>
			<div class="card"></div>
			<div class="card"></div>
			<div class="card"></div>
		</div>
	</div>

	<div id="player3-board" class="board">
		<div class="avatar">
			<div class="level"></div>
			<div class="attack"></div>
		</div>
		<div id="player3-hand" class="hand">
			<div id="hand_p2" class="hand-visibility">
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="fix_batton"></div>
			</div>
		</div>
		<div id="player3-cards" class="cards">
			<div class="card"></div>
			<div class="card"></div>
			<div class="card"></div>
			<div class="card"></div>
		</div>
	</div>

	<div id="player4-board" class="board">
		<div class="avatar">
			<div class="level"></div>
			<div class="attack"></div>
		</div>
		<div id="player4-hand" class="hand">
			<div id="hand_p3" class="hand-visibility">
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="batton">
					<div class="card"></div>
				</div>
				<div class="fix_batton"></div>
			</div>
		</div>
		<div id="player4-cards" class="cards">
			<div class="card"></div>
			<div class="card"></div>
			<div class="card"></div>
			<div class="card"></div>
		</div>
	</div>
	
</body>
</html>

<script type="text/javascript" src="<@spring.url '/javascript/game/hand_cards.js'/>"></script>