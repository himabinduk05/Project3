

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
var patientId = document.forms["patientDetails"]["patientId"].value;
var appointmentDate = document.forms["patientDetails"]["appointmentDate"].value;
var letters = /^([012]?\d|3[01])-([012]?\d|3[01])-\d\d$/;


if (patientId == null || patientId == "") {
    alert("ENTER PATIENT ID");
    return false;
}
    else if (appointmentDate == null || appointmentDate == "") {
        alert("ENTER APPOINTMENT DATE");
        return false;
    }
    else if(!(appointmentDate.match(letters))){
    	alert("PLease enter valid Appointment date format (Eg:03-01-15)");
    	 
    	 return false;

    }
    else if(isNaN(patientId)){
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
<h2><u>FIX PATIENT APPOINTMENT</u></h2>
<table border=0>

    <form:form name="patientDetails" action="./appointment.controller" commandName="cmdPatient">
<tr><th>Patient Id:</th><td><input type="text" name="patientId" id="patientId" ></td></tr>
<tr><th>Appointment Date:</th><td><input type="text" name="appointmentDate" id="appointmentDate" ></td></tr>
<tr><br><center><td><input type="submit" name="fixapointment" value="fixapointment" onclick="return formValidation()"> </center>
</form:form>
</table>

</center>

</div>


    </body>
</html>
