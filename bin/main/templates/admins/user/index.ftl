<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Gestion des utilisateurs</h1>

            <form class="form-inline my-2 my-lg-0" action="${detailPath}/find" method="POST">
                <input class="form-control mr-sm-2" type="search" name="search" id="search" placeholder="Rechercher">
                <button type="submit" class="btn btn-outline-success">Rechercher</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>

		<#assign enable  = 1>
		<#assign disable = 0>
		
		<table class="table table-striped">
			<tr>
				<th>ID</th>
				<th>Username</th>
				<th>Email</th>
				<th>Active</th>
				<th>Role</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>
		<#list users as u>
			<tr>
				<td><#if u.getId()??> ${u.getId()} <#else> NULL </#if></td>
				<td><#if u.getUsername()??> ${u.getUsername()} <#else> NULL </#if></td>
				<td><#if u.getEmail()??> ${u.getEmail()} <#else> NULL </#if></td>
				<td><#if u.getActive()??> ${u.getActive()} <#else> NULL </#if></td>
				<td>
					<#if u.getRoles()??>
					<#list u.getRoles() as roles>
						${roles.getName()}
					</#list>
					<#else> NULL </#if>
				</td>
				<td><a class="btn btn-secondary" href="${detailPath}/active/${u.getId()}=${enable}">Activer</a></td>
				<td><a class="btn btn-secondary" href="${detailPath}/active/${u.getId()}=${disable}">Désactiver</a></td>
				<td><a class="btn btn-danger" href="${detailPath}/delete/${u.getId()}">Supprimer</a></td>
			</tr>
		</#list>
		</table>
	</div>
</div>



<!--
VOIR/SUPPRIMER/DESACTIVER
AJOUTER UN ROLE/SUPPRIMER
-->
