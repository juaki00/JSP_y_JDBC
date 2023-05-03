package edu.fpdual.jsp.web.servlet;

import edu.fpdual.jsp.web.servlet.dto.Usuario;

import controller.UserController;
import manager.impl.UserManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletLogin", urlPatterns = {"/servlet-login"})
public class ServletLogin extends HttpServlet {
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
            Usuario usuario = null;
            UserController userController = new UserController(new UserManagerImpl());
            String nickIntroducido = req.getParameter("usuario");
            String passwordIntroducido = req.getParameter("contrasena");
            String passwodCorrecto = null;

            passwodCorrecto = userController.passwordFromNick(nickIntroducido);
            req.getSession().setAttribute("listaUsuarios", userController.findAllUsuario());
            usuario = userController.userFromNick(nickIntroducido);

            if ((usuario != null && passwordIntroducido != null
                    && passwordIntroducido.equals(passwodCorrecto))
            ) {
                req.getSession().setMaxInactiveInterval(40);
                req.getSession().setAttribute("usuarioSesion", usuario);
                resp.sendRedirect("/JSP_y_JDBC/comun/usuarios.jsp");
            } else {
                req.setAttribute("error", "Error al insertar usuario o contraseña");

                req.getRequestDispatcher("/index.jsp").forward(req, resp);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Error de base de datos");
        }

    }
}
