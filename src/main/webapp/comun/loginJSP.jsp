<%@ page pageEncoding="UTF-8" %>
<html>

    <body>
        <form action="/EjemploAplicativoWeb/servlet-login" method="POST">
            <p>Usuario: </p> <input type="text" name="usuario"/>
                <p>Contraseña: </p> <input type="password" name="contrasena"/></br></br>
                <button type="submit">Iniciar Sesión</button>
                <button type="reset">Cancelar</button>
                <%if(request.getAttribute("error")!=null){%>
            <p><%=request.getAttribute("error")%></p>
            <%}%>
        </form>
    </body>
</html>