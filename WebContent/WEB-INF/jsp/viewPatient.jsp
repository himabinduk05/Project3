

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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


<a href="appointmentDetails.jsp" target="_self">Get Appointment Details</a><br/><br/>

</div>
<div id="section">
        <center>
<h2><u>PATIENT DETAILS</u></h2>
    <table border=2 align="center"  width="150" >
<tr><th>COUPON_NUMBER</th><th>SLOT</th><th>DOCTOR_ID</th><th>APPOINTMENT_DATE</th><th>PATIENT_ID</th><th>APPOINTMENT_BOOKED</th>
<c:forEach var="c" items="${requestScope.list}"><tr>
<td><c:out value="${c.couponNumber}"></c:out></td>
   <td><c:out value="${c.slot}"></c:out></td>
   <td><c:out value="${c.doctorId}"></c:out></td>
   <td><c:out value="${c. appointmentDate}"></c:out></td>
   <td><c:out value="${c.patientId}"></c:out></td>
   <td><c:out value="${c.appointmentBooked}"></c:out></td>
 </c:forEach>
</table>
</center>

</div>


    </body>
</html>
