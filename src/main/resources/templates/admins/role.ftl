<#import "/spring.ftl" as spring/>

<h1>${pageName}</h1>

<form method="POST">
	<label for="role">
		Name : 
		<input id="role" name="name" type="text">
	</label>
	<input type="submit" value="Submit">
</form>