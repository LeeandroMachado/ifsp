<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta chartset="UTF-8" />
    <title>Calcular area</title>
  </head>
  <body> 
    <h1>Calcular area</h1>
    
    <form action="Calculate" method="POST">
      <input type="hidden" name="geometry" value="<%= request.getParameter("geometry") %>" />
      
      <% if (request.getParameter("geometry").equals("square")) { %>
        <%@ include file="includes/square.jsp" %>
      <% } else if (request.getParameter("geometry").equals("triangle")) { %>
        <%@ include file="includes/triangle.jsp" %>
      <% } else if (request.getParameter("geometry").equals("circle")) { %>
        <%@ include file="includes/circle.jsp" %>
      <% } else { %>
        <p>Geometria inválida</p>
      <% }%>
			
      <br>

      <input type="submit" value="Submit" />
    </form>
  </body>
</html>