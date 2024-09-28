<%@page import="com.cetpa.*"%>
<html>
 <body onload="makeActive('edit')">
  <%
  int eid=Integer.parseInt(request.getParameter("eid"));
  Employee emp=EmployeeRepository.getEmployee(eid);
  if(emp!=null)
  {
	 %>
	 	<%@ include file="navbar.jsp" %>
	 	<form action="update-record.jsp">
	 	<table border='1' class='tar' style='width:45%'>
		  <tr style='background-color:orange;color:white'>
		   <th colspan="2" style="text-align: center">Employee Details</th>
		  </tr>
		  <tr>
		   <th align="left">Employee id</th>
		   <td>
		   		<%=eid%>
		   		<input type="hidden" name="eid" value="<%=eid%>">
		   </td>
		  </tr>
		   <tr>
		   <th align="left">Edit First name</th>
		   <td><input type='text' name='firstname' value='<%=emp.getFirstname()%>'></td>
		  </tr>
		  <tr>
		   <th align="left">Edit Last name</th>
		   <td><input type='text' name='lastname' value='<%=emp.getLastname()%>'></td>
		  </tr>
		  <tr>
		   <th align="left">Edit Phone number</th>
		   <td><input type='text' name='phone' value='<%=emp.getPhone()%>'></td>
		  </tr>
		  <tr>
		   <th align="left">Edit Email id</th>
		   <td><input type='text' name='email' value='<%=emp.getEmail()%>'></td>
		  </tr>
		  <tr>
		   <th align="left">Edit Department</th>
		   <td><input type='text' name='department' value='<%=emp.getDepartment()%>'></td>
		  </tr>
		  <tr>
		   <th align="left">Edit Salary</th>
		   <td><input type='text' name='salary' value='<%=emp.getSalary()%>'></td>
		  </tr>
		  <tr>
		   <td colspan="2" align="right">
		   	 <button class='btn btn-secondary'>Update Record</button>
		   </td>
		  </tr>
		</table>  
		</form>
	 <% 
  }
  else
  {
	  %>
	  <jsp:include page="delete.jsp" />
	  <div class='dvv'>
	    <label style="color:red;font-size:1.7vw">Employee record with id <%=eid%> does not exist</label>
	  </div>
	  <%
  }
  %>
 </body>
</html>