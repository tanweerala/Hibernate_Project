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
  Employee emp2=new Employee(eid,fname,lname,phn,eml,dept,sal);
  Employee emp1=EmployeeRepository.getEmployee(eid);
  EmployeeRepository.updateEmployee(emp1,emp2);
  %>
  <div class='dv'> 
  	<label class='lah' style='color:green'>Employee record has been updated successfully</label>
  </div>
 </body>
</html>