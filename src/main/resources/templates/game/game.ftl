<!DOCTYPE html>
<html>
<head>
	<title>Partie en cours</title>
	<link rel="stylesheet" type="text/css" href="game.css">
	<meta charset="utf-8">
</head>
<body>

	<div id="shared-board">
		<div class="play-card"></div>
		<div id="draw-treasure" class="game-card">
			<div class="sb_card">
				<div class="card-front game_card treasure"></div>
				<div class="card-back game_card" style="background-image: url(carte.jpg);"></div>
			</div>
		</div>
		<div id="discard-treasure" class="game-card"></div>
		<div id="draw-donjon" class="game-card">
			<div class="sb_card">
				<div class="card-front game_card donjon"></div>
				<div class="card-back game_card" style="background-image: url(carte2.jpg);"></div>
			</div>
		</div>
		<div id="discard-donjon" class="game-card"></div>
	</div>
	
	<div id="handDragZone"></div>

	<div id="main-board" class="board">
		<div class="avatar">
			<div class="level"></div>
			<div class="attack"></div>
		</div>
		<div id="main-hand" class="hand" onmouseover="test()" onmouseout="teste()">
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

	<script type="text/javascript" src="hand_card.js"></script>