<#import "/spring.ftl" as spring/>

<h1>${pageName}</h1>

<form method="POST">
	<div>
		<label for="username">Username :
			<input id="username" name="username" type="text">
		</label>
	</div>
	<div>
		<label for="email">Email :
			<input id="email" name="email" type="text">
		</label>
	</div>
	<div>
		<label for="password">Password :
			<input id="password" name="password" type="password">
		</label>
	</div>
	<div>
		<label for="confirmPassword">Confirm password :
			<input id="confirmPassword" name="confirmPassword" type="password">
		</label>
	</div>
	<input type="submit" value="Submit">
</form>