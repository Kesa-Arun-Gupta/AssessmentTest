<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body align="center">
	<form method="post" action="registervalues">
		<pre>
<h1>
			<b>User Registration</b>			</h1>

Full name:&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp<input type="text" name="name" />

E-mail:&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp&nbsp &nbsp<input type="email" name="email" />

Password:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="password" name="password" />

Birthday(yyyy-mm-dd):&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="date" name="date" />

Gender:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="radio" name="gender" value="male">Male</input><input
				type="radio" name="gender" value="female">Female</input>

Profession:&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp&nbsp&nbsp&emsp;&emsp;&emsp;&emsp;<select name="profession">

  <option value="developer">Developer</option>

  <option value="teamlead">Team Lead</option>

  <option value="manager">Manager</option>

</select>

Married?&emsp;&emsp;&emsp;&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp&nbsp &nbsp<input type="radio" name="married" value="married" />

Note:&nbsp &nbsp &nbsp &nbsp&nbsp &nbsp&nbsp &nbsp<textarea rows="5" cols="10" name="note"></textarea>

<input type="submit" value="Register" />

</pre>

	</form>

</body>

</html>
