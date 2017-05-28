

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
var pid = document.forms["patientDetails"]["patientId"].value;
var pname = document.forms["patientDetails"]["patientName"].value;
var pg = document.forms["patientDetails"]["patientGender"].value;
var patientAge = document.forms["patientDetails"]["patientAge"].value;
var padd = document.forms["patientDetails"]["patientAddress"].value;
var pphone = document.forms["patientDetails"]["patientPhone"].value;
 

if (pid == null || pid == "") {
    alert("ENTER PATIENT ID");
    return false;
    }
    else if (pname == null || pname == "") {
        alert("ENTER PATIENT NAME");
        return false;
    }
    
    else if (pg == null || pg == "") {
        alert("ENTER PATIENT GENDER");
        return false;
    }
    
    else if (patientAge == null || pname == "") {
        alert("ENTER PATIENT AGE");
        return false;
    }
    
    else if (padd == null || padd == "") {
        alert("ENTER PATIENT ADDRESS");
        return false;
    }
    
    else if (pphone == null || pphone == "") {
        alert("ENTER PATIENT PHONE NUMBER");
        return false;
    }
    else if(isNaN(pphone) ||pphone.length!=10){
   	 alert("You have entered an invalid phone number");
   	 return false;
    }
    else if(isNaN(pid)){
    	alert(" PATIENT ID should be in digits");
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

<a href="patientDetails.jsp" target="_self">Insert Patient Details</a><br/><br/>
<a href="patientAppointment.jsp" target="_self">Fix Appointment</a><br/><br/>
<a href="postponeAppointment.jsp" target="_self">Postpone Appointment</a><br/><br/>


</div>
<div id="section">
        <center>
<h2><u>ADD PATIENT DETAILS</u></h2>
<table border=0>

    <form:form  name="patientDetails" action="./patient.controller" commandName="cmdCus">
<tr><th>Patient Id:</th><td><input type="text" name="patientId" id="patientId" ></td></tr>
<tr><th>Patient Name:</th><td><input type="text" name="patientName" id="patientName" ></td></tr>
<tr><th>Patient Gender:</th><td><input type="text" name="patientGender" id="patientGender" ></td></tr>
<tr><th>Patient Age:</th><td><input type="text" name="patientAge" id="patientAge" ></td></tr>
<tr><th>Patient Address:</th><td><input type="text" name="patientAddress" id="patientAddress" ></td></tr>
<tr><th>Patient PhoneNumber:</th><td><input type="text" name="patientPhone" id="patientPhone" ></td></tr>


<tr><br><center><td><input type="submit" name="add" value="add" onclick="return formValidation()"> </center>
</form:form>
</table>

</center>

</div>


    </body>
</html>
