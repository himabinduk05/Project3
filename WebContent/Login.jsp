<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <script>
  function formValidation()
  {
  var uid = document.forms["login"]["userName"].value;
  var passid = document.forms["login"]["password"].value;

  if (uid == null || uid == "") {
      alert("ENTER USERNAME");
      return false;
  }
      else if (passid == null || passid == "") {
          alert("ENTER PASSWORD");
          return false;
      }
  }
  </script>
</head>
<body>
<div class="container-fluid" style="background-color:#FF9900">   
      
      <div class="col-md-4">
    <a href="website.html" class="thumbnail">
      
      <img src="onlineappointment.png" alt="Pulpit Rock" style="width:500px;height:150px">
    </a>
  </div>    
  <div class="col-md-4">
    <center><h2 style="color:white">Doctor Appointment System<h2></center>
    
  </div> 
    </div>
    
  </div>
</nav>

<div class="container">  
  <div class="jumbotron">
  <center> <h2>Login</h2></center>
  <form:form name="login" action="./login.controller" commandName="cmdCus">
   
    <div class="col-xs-4">
      <label for="User Name">User Name:</label>
      <input type="textbox" class="form-control" name="userName" id="userName" placeholder="Enter User Name" >
       </div>
      <br><br><br>
   
    <div class="col-xs-4">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" name="password" id="password" placeholder="Enter password" >
    </div>
      <br><br> <br>&nbsp&nbsp&nbsp&nbsp
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>&nbsp&nbsp
    <button type="submit" class="btn btn-success" onclick="return formValidation()">Submit</button>&nbsp&nbsp
    <button type="cancel" class="btn btn-danger">cancel</button>
    
  </form:form>
  </div>
</div>
 
<div class="container-fluid" style="background-color:#FF9900";color:white">
   <center><p> 2015 Doctor Appointment System</p></center>
  </div>

</body>
</html>