package edu.fpdual.jsp.web.servlet;

import controller.UserController;
import edu.fpdual.jsp.web.servlet.dto.Usuario;
import manager.impl.UserManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "nuevoUsuarioServletPre", urlPatterns ={"/nuevo_usuario-pre"})
public class nuevoUsuarioServletPre extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws
            ServletException,
            IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws
            ServletException,
            IOException {

        try {
            UserController userController = new UserController(new UserManagerImpl());
            req.getSession().setAttribute("listaUsuarios", userController.findAllUsuario());
            resp.sendRedirect("/JSP_y_JDBC/comun/usuarios.jsp");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}