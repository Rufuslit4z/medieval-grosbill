<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Création d'effet</h1>
        </div>

        <form id="formulaire" action="${detailPath}/create" method="POST">
            <label>Nom :</label>
            <input class="form-control" name="name" type="text" placeholder="name">
            <label>Type d'effet :</label>
            <select class="form-control" name="type">
                <option value="">niveau(exemple)</option>
                <option value="">attaque(exemple)</option>
                <option value="">cartes(exemple)</option>
            </select>
            <label>Valeur :</label>
            <input class="form-control" name="value" type="number" value="0">
            <br>
            <input class="btn btn-success" type="submit" id="submit" value="Save">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </div>
</div>