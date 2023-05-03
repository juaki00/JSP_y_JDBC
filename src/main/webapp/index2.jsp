<%@ page pageEncoding="UTF-8" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="./css/estilo.css">
    </head>
    <body>
        <form action="/JSP_y_JDBC/servlet-login" method="POST">
            <p>Usuario: </p> <input type="text" name="usuario"/>
            <p>Contraseña: </p> <input type="password" name="contrasena"/></br></br>
            <button type="submit">Iniciar Sesión</button>
            <button type="reset">Cancelar</button>
            <%if(request.getAttribute("error")!=null){%>
                <p><%=request.getAttribute("error")%></p>
            <%}%>
        </form>
        <form action="/JSP_y_JDBC/servlet-logout" method="POST">
            <button type="submit">Log out</button>
        </form>
    </body>
</html>