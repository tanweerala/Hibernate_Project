<%@page import="com.cetpa.*"%>
<%@ include file="navbar.jsp" %>
<html>
 <body onload="makeActive('save')">
  <%
  int eid=Integer.parseInt(request.getParameter("eid"));
  String fname=request.getParameter("firstname");
  String lname=request.getParameter("lastname");
  String phn=request.getParameter("phone");
  String eml=request.getParameter("email");
  String dept=request.getParameter("department");
  int sal=Integer.parseInt(request.getParameter("salary"));
  Employee emp=new Employee(eid,fname,lname,phn,eml,dept,sal);
  EmployeeRepository.saveEmployee(emp);
  %>
  <div class='dv'> 
  	<label class='lah' style='color:green'>Employee record has been added successfully</label>
  </div>
 </body>
</html>