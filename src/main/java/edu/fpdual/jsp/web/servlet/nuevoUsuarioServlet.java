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

@WebServlet(name = "nuevoUsuarioServlet", urlPatterns = {"/nuevo_usuario"})
public class nuevoUsuarioServlet extends HttpServlet {
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
        Usuario usuario = (Usuario)
                req.getSession().getAttribute("usuarioSesion");
        try {

            String nickIntroducido = req.getParameter("nick");
            String passIntroducido = req.getParameter("passwd");
            String nombreIntroducido = req.getParameter("nombre");
            String apellidoIntroducido = req.getParameter("apellido");
            String telefonoIntroducido = req.getParameter("telefono");
            String emailIntroducido = req.getParameter("email");

            UserController controller = new UserController(new UserManagerImpl());

            if (controller.existeNick(nickIntroducido)) {
                req.getSession().setAttribute("existe", "El nick " + nickIntroducido + " ya existe");
                resp.sendRedirect("/JSP_y_JDBC/comun/nuevoUsuario.jsp");
            } else {

                controller.insertUser(nickIntroducido, passIntroducido, nombreIntroducido, apellidoIntroducido, telefonoIntroducido, emailIntroducido);
                System.out.println("Usuario insertado");
                UserController userController = new UserController(new UserManagerImpl());
                req.getSession().setAttribute("listaUsuarios", userController.findAllUsuario());
                resp.sendRedirect("/JSP_y_JDBC/usuarios.jsp");
            }


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}