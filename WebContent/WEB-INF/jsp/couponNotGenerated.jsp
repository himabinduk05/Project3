

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
        <center> <h2>Sorry! Your Appointment cannot be fixed</h2> </center>
       
</div>


    </body>
</html>
