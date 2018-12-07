<#import "/spring.ftl" as spring/>

<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase-app.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase-database.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase-functions.js"></script>

GAME CONTROLLER

${game.getName()} clicked ${game.getClicks()}


<script>
	var config = {
		apiKey: "AIzaSyDu5rfplbj9tvIkwj200FhOGfYQKRLb2hw ",
	    authDomain: "medieval-grosbill.firebaseapp.com",
	    databaseURL: "https://medieval-grosbill.firebaseio.com",
	    projectId: "medieval-grosbill",
	  };
	firebase.initializeApp(config);
  
  
  
  
    var updateStarCount = function(element, value) {
        console.log(value);
        document.getElementById(element).innerHTML = value.name + " " + value.clicks;
    };
    
    var starCountRef = firebase.database().ref('/notifications/');
    starCountRef.on('value', function(snap) {
        console.log(JSON.stringify(snap.val()));
        updateStarCount("notification", snap.val());
    });
  
  function sayClicked(){
    firebase.database().ref('/notifications/').once('value', function(snap){
            console.log(JSON.stringify(snap.val()));
            firebase.database().ref('/notifications/').set({
                name: snap.val().name,
                clicks: snap.val().clicks + 1
            });
        });
    }
</script>