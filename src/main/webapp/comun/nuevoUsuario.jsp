<%@ page pageEncoding="UTF-8" %>
<html>
    <body>
        <form action="/JSP_y_JDBC/nuevo_usuario" method="POST">
            <p>Usuario: <input type="text" name="nick"/></p>
            <p>Contraseña: <input type="password" name="passwd"/></p>
            <p>Nombre: <input type="text" name="nombre"/></p>
            <p>Apellido:  <input type="text" name="apellido"/></p>
            <p>Telefono:  <input type="text" name="telefono"/></p>
            <p>Email:  <input type="text" name="email"/></p>
                <button type="submit">Guardar</button>
                <button type="reset">Cancelar</button>
                <%if(request.getAttribute("error")!=null){%>
            <p><%=request.getAttribute("error")%></p>
            <%}%>
        </form>
    </body>
</html>