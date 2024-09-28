<%@page import="com.cetpa.*"%>
<%@ include file="navbar.jsp" %>
<html>
 <body onload="makeActive('delete')">
  <%
  int eid=Integer.parseInt(request.getParameter("eid"));
  Employee emp=EmployeeRepository.getEmployee(eid);
  EmployeeRepository.deleteEmployee(emp);
  %>
  <div class='dv'> 
  	<label class='lah' style='color:red'>Employee record has been deleted successfully</label>
  </div>
 </body>
</html>