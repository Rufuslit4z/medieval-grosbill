<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Gestion des effets</h1>

            <form class="form-inline my-2 my-lg-0" action="${detailPath}/find" method="POST">
                <input class="form-control mr-sm-2" type="search" name="search" id="search" placeholder="Rechercher">
                <button type="submit" class="btn btn-outline-success">Rechercher</button>
            </form>
        </div>

		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Type</th>
				<th>Valeur</th>
				<th><a class="btn btn-success btn-sm" href="${detailPath}/create">Ajouter</a></th>
			</tr>
		<#list effects as fx>
			<tr>
				<td><#if fx.getId()??> ${fx.getId()} <#else> NULL </#if></td>
				<td><#if fx.getName??> ${fx.getName()} <#else> NULL </#if></td>
				<td><#if fx.getType()??> ${fx.getType()} <#else> NULL </#if></td>
				<td><#if fx.getValue()??> ${fx.getValue()} <#else> NULL </#if></td>
				<td><a class="btn btn-secondary" href="${detailPath}/edit/${fx.getId()}">Modifier</a></td>
				<td><a class="btn btn-danger" href="${detailPath}/delete/${fx.getId()}">Supprimer</a></td>
			</tr>
		</#list>
		</table>
	</div>
</div>