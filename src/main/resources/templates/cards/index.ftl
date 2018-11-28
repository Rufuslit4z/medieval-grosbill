<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<!DOCTYPE html>

<form action="${detailPath}/edit" method="POST" id="formulaire">
    <label for="name">Nom :</label>
    <input type="text" name="name" id="name" maxlength="64" onkeypress="title_card.innerText=this.value">
    <label for="desc">Description :</label>
    <textarea id="desc" name="description" maxlength="232" rows="9" onkeypress="desc_card.innerText=this.value"></textarea>
    <label for="img">Image :</label>
    <input type="file" name="imgage" id="img" accept="image/*">
    <label for="type">Type de carte :</label>
    <select name="type" onchange="addForm()">
        <option selected value="equipment">Equipement</option>
        <option value="monster">Monstre</option>
        <option value="curse">Malédiction</option>
    </select>

    <div id="insertForm"></div>
    <div id="insertFormWeapon"></div>

    <input type="submit" name="submit" value="Ajouter">
</form>

<script src="<@spring.url '/javascript/cards/createCards.js'/>"></script>