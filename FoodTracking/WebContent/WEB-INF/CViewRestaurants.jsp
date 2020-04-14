<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
<meta charset="UTF-8">

        <title>View Restaurants</title>
    <link rel="stylesheet" href="Style.css">
    </head>
    <body>
       <% request.setAttribute("requestType","ViewRest"); %>
        <h1>Customer Panel</h1>
        <ul class="nav">
                <li><a href="CustomerHome.jsp">Home</a></li>
                <li><a href="CViewRestaurants.html">View Restaurants</a></li>
                <li><a href="ManageOrders.html">Manage Orders</a></li>
                <li><a href="ManageAccount.html">Manage Account</a></li>
                
              </ul>
              <h1>Restaurants List</h1>
             
        <table id="Restaurants">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Location</th>
                <th>Contact</th>
            </tr>

        
<%
ArrayList<Restaurant> RList=new ArrayList<int>(); 
ArrayList<String> RName=new ArrayList<String>(); 
ArrayList<String> RName=new ArrayList<String>(); 

RList=request.getAttribute("RList1");


for ( int i =0; i < RList1.size() ; i++)
{
    
%>

<tr>
                <td> <%=(RList.get(i)).getID()%></td>
                <td><%=(RList.get(i)).getName()%> </td>
                <td> <%=(RList.get(i)).getLocation()%></td>
                <td> <%=(RList.get(i)).getContact()%></td>
<td><button class="btn-modify" onclick="viewMenu()" >View Menu</button></td>
</tr>

<%       
}
%>

</table>
  
               
    </body>
</html> 
