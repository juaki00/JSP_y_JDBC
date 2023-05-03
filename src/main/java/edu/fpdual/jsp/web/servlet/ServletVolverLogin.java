package edu.fpdual.jsp.web.servlet;

import edu.fpdual.jsp.web.servlet.dto.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletVolverLogin", urlPatterns ={"/servlet-volverlogin"})
public class ServletVolverLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws
            ServletException,
            IOException {
        Usuario usuario = (Usuario)
                req.getSession().getAttribute("usuarioSesion");
        if(usuario!=null){
            resp.sendRedirect("/JSP_y_JDBC/servlet-login");
        } else {
            resp.sendRedirect("/JSP_y_JDBC/nuevoUsuario.jsp");
        }
    }
}
