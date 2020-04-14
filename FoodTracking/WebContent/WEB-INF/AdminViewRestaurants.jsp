<html>
    <head>
        <title>Restaurants</title>
    <link rel="stylesheet" href="Style.css">
    </head>
    <body>
        <h1>Admin Panel</h1>
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
                ArrayList<int> RID=new ArrayList<int>(); 
                ArrayList<String> RName=new ArrayList<String>(); 
                ArrayList<String> RName=new ArrayList<String>();
                ArrayList<int> RContact=new ArrayList<int>(); 

                RID=request.getAttribute("RIDList");
                RName=request.getAttribute("RNameList");
                RLocation=request.getAttribute("RLocationList");
                RContact=request.getAttribute("RContactList");

                for ( int i =0; i < RID.size() ; i++)
                {

                %>

                <tr>
                <td> <%=RID[i]%></td>
                <td><%=RName[i]%> </td>
                <td> <%=RLocation[i]%></td>
                <td> <%=RContact[i]%></td>
                <td><button class="btn-modify" onclick="viewMenu()" >View Menu</button></td>
                </tr>

                <%       
                }
                %>

                </table>
               
    </body>
</html>
