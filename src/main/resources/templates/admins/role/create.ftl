<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Créer un role</h1>
        </div>

<!--
<form method="POST">
	<label for="role">
		Name : 
		<input id="role" name="name" type="text">
	</label>
	<input type="submit" value="Submit">
</form>
-->

        <form action="${detailPath}/create" method="POST" id="formulaire">
            <label for="name">Name :</label>
            <input class="form-control" type="text" name="name" id="name" maxlength="64" onkeypress="title_card.innerText=this.value">
            <div id="insertForm"></div>
            <div id="insertFormWeapon"></div>
            <input class="btn btn-success" type="submit" name="submit" value="Ajouter">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

    </div>
</div>


<script type="text/javascript">
    console.log("test");
    var effectList = '<#list effect as e><option value="${e.id}">${e.name}</option></#list>';
</script>
<script src="<@spring.url '/javascript/cards/createCards.js'/>"></script>