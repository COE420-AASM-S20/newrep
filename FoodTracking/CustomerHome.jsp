<html>
    <head>
        <title>Customer Menu</title>
        <link rel="stylesheet" href="Style.css">
    </head>
    <body>
        <h1>Customer Panel</h1>
        <ul class="nav">
       		<li><a href="CustomerHome.jsp">Home</a></li>
                <li><a href="CViewRestaurants.jsp">View Restaurants</a></li>
                <li><a href="ManageOrders.html">Manage Orders</a></li>
                <li><a href="ManageAccount.html">Manage Account</a></li>
              </ul>
           
            <h1>Remove Restaurants</h1>

<% 	String username = request.getParameter("username"); %>
	<h1> Welcome <%System.out.println(username); %> </h1>
	
          
          </body>
</html>