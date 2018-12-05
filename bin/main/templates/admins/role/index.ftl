<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Gestion des roles</h1>

            <form class="form-inline my-2 my-lg-0" action="${detailPath}/find" method="POST">
                <input class="form-control mr-sm-2" type="search" name="search" id="search" placeholder="Rechercher">
                <button type="submit" class="btn btn-outline-success">Rechercher</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>
		
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th><a class="btn btn-success btn-sm" href="${detailPath}/create">Ajouter</a></th>
			</tr>
		<#list roles as r>
			<tr>
				<td><#if r.getId()??> ${r.getId()} <#else> NULL </#if></td>
				<td><#if r.getName()??> ${r.getName()} <#else> NULL </#if></td>
				<td><a class="btn btn-danger" href="${detailPath}/delete/${r.getId()}">Supprimer</a></td>
			</tr>
		</#list>
		</table>
	</div>
</div>