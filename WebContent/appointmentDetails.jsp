

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         
<style>
#header {
    background-color:#FF9900;
    
    text-align:center;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#D3D3D3;
    height:530px;
    width:250px;
    float:left;
    padding:5px; 
}
#section {
    width:350px;
    float:left;
     
}
#aside {
line-height:40px;
width:350px;
float:right;

}
</style>

<script>
function formValidation()
{
var docId = document.forms["appointmentDetails"]["doctorId"].value;

	if ( docId == null  || docId == "")
	{
	alert("Doctor  Id should not be empty");
	return false;
	}
	else if(isNaN(docId)){
    	alert(" DOCTOR ID should be in digits");
        return false;
    }
	if(docId==1||docId==2||docId==3){
		return true;
	}
	else{
		alert(" DOCTOR ID should be either 1, 2 or 3");
		 return false;
	}
}
</script>


    </head>
    <body>
      


<div id="header">
<table style="width:100%">
  <tr>
    
    <td><h1><center>DOCTOR APPOINTMENT</center></td>		
   
  </tr>
</table>
<div style='float: right;'><h2><a href="website.html">Log out</a></h2></div>
</div>
<div id="nav">


<a href="appointmentDetails.jsp" target="_self">Get Appointment Details</a><br/><br/>

</div>
<div id="section">
        <center>
<h2><u>VIEW PATIENT APPOINTMENT DETAILS</u></h2>
<table border=0>

    <form:form name="appointmentDetails" action="./ViewPatientDetails.controller" commandName="cmdView" >
<tr><th>Doctor Id:</th><td><input type="" name="doctorId" id="doctorId" ></td></tr>
<tr><br><center><td><button type="submit" name="view" value="view" onclick="return formValidation()">view</button> </center>
</form:form>
</table>

</center>

</div>


    </body>
</html>
