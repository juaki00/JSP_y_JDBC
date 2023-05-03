<%@ page pageEncoding="UTF-8" %>
<%@ page import="edu.example.aplicativoweb.dto.Usuario" %>

<html>
     <body>
         <%if(session.getAttribute("usuarioSesion")!=null){
             Usuario usuario = (Usuario)session.getAttribute("usuarioSesion"); %>
             <h2> Bienvenido <%=usuario.getUsuario()%> </h2>
         <%} else {%>
             <form action="/EjemploAplicativoWeb/loginJSP.jsp" method="GET">
             <h2> No ha iniciado sesión, por favor ir al login </h2></br>
             <button type="submit">Ir a inicio de sesión</button>
             </form>
         <%}%>
     </body>
</html>
