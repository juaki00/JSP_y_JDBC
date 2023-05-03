package edu.fpdual.jsp.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLogout", urlPatterns = {"/servlet-logout"})
public class ServletLogout extends HttpServlet {
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
            req.getSession().setAttribute("usuarioSesion", null);
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
