<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Data of Prime Minister</h1>
<br>
<form action="example" method="post">
Name : <input type="text" id="name" name="name"/>
<br>
<br>
Country :
<select id="country" name="country">
<option>--Select Country</option>
<option>India</option>
<option>USA</option>
<option>China</option>
<option>Germany</option>
</select>
<br>
<br>
Marriage Status : 
<input type="radio" id="marriage" name="marriage" value="Married"/>
<label for="marriage">Married</label>
<input type="radio" id="marriage" name="marriage" value="UnMarried"/>
<label for="unmarried">UnMarried</label>
<br>
<br>
Party :
<select id="party" name="party">
<option>--Select Party--</option>
<option>BJP</option>
<option>JDS</option>
<option>Congress</option>
</select>
<br>
<br>
Age : <input type="type" id="age" name="age"/>
<br>
<br>
Gender : 
<input type="radio" id="gender" name="gender" value="Male"/>
<label for="gender">Male</label>
<input type="radio" id="gender" name="gender" value="Female"/>
<label for="gender">Female</label>
<input type="radio" id="gender" name="gender" value="Others"/>
<label for="gender">Others</label>
<br>
<br>
Period as : <input type="type" id="period" name="period"/>
<br>
<br>
Times Represented : 
<select id="represented" name="represented">
<option>--Select Times</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
</select>
<br><br>
<input type="submit" value="Save">

</form>

</body>
</html>