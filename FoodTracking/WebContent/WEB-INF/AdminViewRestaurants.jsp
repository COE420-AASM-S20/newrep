<html>
    <head>
        <title>Restaurants</title>
    <link rel="stylesheet" href="Style.css">
    </head>
    <body>
        <h1>Admin Panel</h1>
        <% request.setAttribute("requestType","ViewRest"); %>
        <ul class="nav">
                <li><a href="AdminHome.html">Home</a></li>
                <li><a href="Restaurants.html">View Restaurants</a></li>
                <li><a href="Add.html">Add Restaurant</a></li>
                <li><a href="Remove.html">Remove Restaurant</a></li>
                <li><a class="active" href="Modify.html">Modify Restaurant</a></li>
              </ul>
              <h1>Restaurants List</h1>
             
        <table id="restaurants">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Location</th>
                <th>Contact</th>
                </tr>
                <%
                ArrayList<Restaurant> RList=new ArrayList<Restaurant>(); 
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
