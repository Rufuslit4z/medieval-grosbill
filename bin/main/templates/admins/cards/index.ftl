<#import "/spring.ftl" as spring/>
<#include "../index.ftl" />
<!DOCTYPE html>

<div class="presentation">

<h1>Créer une carte</h1>

		<div id="create_card">

            <div id="preview">

                <div class="card">
                    <div class="textzone">
                        <p class="info" id="bonus1">+3</p>
                        <p class="info" id="bonus2">+3</p>
                        <p class="title">Ma super carte de test</p>
                        <p class="description">Ceci est un test d'une prévisualisation de la carte. Cette carte ne possède aucun bonus ni malus et sert donc juste à tester l'affichage de notre futur panel admin. Voilà voilà ^^</p>
                        <img class="img_card" src="">
                        <p class="info left-bottom">Gros</p>
                        <p class="info right-bottom">200 pièces d'or</p>
                    </div>
                </div>

            </div>

<form action="${detailPath}/edit" method="POST" id="formulaire">
    <label for="name">Nom :</label>
    <input type="text" name="name" id="name" maxlength="64">
    <label for="desc">Description :</label>
    <textarea id="desc" name="description" maxlength="232" rows="9"></textarea>
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

        </div>

<script src="<@spring.url '/javascript/cards/createCards.js'/>"></script>