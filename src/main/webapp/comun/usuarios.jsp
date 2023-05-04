<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="edu.fpdual.jsp.web.servlet.dto.Usuario" %>
<%@ page import="java.util.Set" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>


<html lang="es-ES">
<head>
    <link rel="stylesheet" type="text/css" href="../css/estilo.css">

    <title>Ejemplo entrada y salida de datos</title>
</head>
<body>
<table>
    <tr>
        <th>Nombre</th>
        <th>Apellido</th>
        <th>Telefono</th>
        <th>Email</th>
        <th>Acciones</th>
    </tr>
    <%
        Set<Usuario> listaUsuarios = (Set<Usuario>) session.getAttribute("listaUsuarios");

        for (Usuario contacto : listaUsuarios) { %>
    <tr>
        <td><%=contacto.getNombre()%>
        </td>
        <td><%=contacto.getApellido()%>
        </td>
        <td><%=contacto.getTelefono()%>
        </td>
        <td><%=contacto.getEmail()%>
        </td>
        <td><img src="https://cdn-icons-png.flaticon.com/128/3858/3858474.png" alt="">
            <img src="https://cdn-icons-png.flaticon.com/512/3159/3159218.png" alt=""></td>
    </tr>
    <%}
    if(request.getAttribute("existe")!=null){%>
    <p><%=request.getAttribute("existe")%></p>
    <%}%>

</table>
<form action="/JSP_y_JDBC/comun/nuevoUsuario.jsp">
    <button type="submit" class="nuevo">Nuevo</button>
</form>
</body>
</html>
