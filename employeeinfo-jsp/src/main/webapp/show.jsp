<%@page import="com.cetpa.*"%>
<html>
 <body onload="makeActive('search')">
  <%
  int eid=Integer.parseInt(request.getParameter("eid"));
  Employee emp=EmployeeRepository.getEmployee(eid);
  if(emp!=null)
  {
	 %>
	 	<%@ include file="navbar.jsp" %>
	 	<table border='1' class='tar' style='width:45%'>
		  <tr style='background-color:orange;color:white'>
		   <th colspan="2" style="text-align: center">Employee Details</th>
		  </tr>
		  <tr>
		   <th align="left">Employee id</th>
		   <td><%=emp.getEid()%></td>
		  </tr>
		  <tr>
		   <th align="left">First name</th>
		   <td><%=emp.getFirstname()%></td>
		  </tr>
		  <tr>
		   <th align="left">Last name</th>
		   <td><%=emp.getLastname()%></td>
		  </tr>
		  <tr>
		   <th align="left">Phone number</th>
		   <td><%=emp.getPhone()%></td>
		  </tr>
		  <tr>
		   <th align="left">Email id</th>
		   <td><%=emp.getEmail()%></td>
		  </tr>
		  <tr>
		   <th align="left">Department</th>
		   <td><%=emp.getDepartment()%></td>
		  </tr>
		  <tr>
		   <th align="left">Salary</th>
		   <td>&#8377;<%=emp.getSalary()%></td>
		  </tr>
		</table>  
	 <% 
  }
  else
  {
	  %>
	  <jsp:include page="search.jsp" />
	  <div class='dvv'>
	    <label style="color:red;font-size:1.7vw">Employee record with id <%=eid%> not found</label>
	  </div>
	  <%
  }
  %>
 </body>
</html>