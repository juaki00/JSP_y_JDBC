package controller;

import connector.MySQLConnector;
import edu.fpdual.jsp.web.servlet.dto.Usuario;
import manager.UserManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public class UserController {

    private UserManager userManager;

    public UserController(final UserManager userManager){
        this.userManager = userManager;
    }

    public Set<Usuario> findAllUsuario() throws SQLException, ClassNotFoundException {
        Connection connection = new MySQLConnector().getMySQLConnection();
        Set<Usuario> usuarios = userManager.findAllUsuario(connection);

        for(Usuario user : usuarios){
            user.setNombre(user.getNombre().toUpperCase());
        }

        return usuarios;
    }



    public Set<Usuario> findUsuarioById(String nick) throws SQLException, ClassNotFoundException {
        Connection con = new MySQLConnector().getMySQLConnection();
        return userManager.findUsuarioById(con, nick);
    }

    public void insertUser(String nick,String nombre,String passwd,String apellido,String telefono,String email) throws SQLException, ClassNotFoundException {
        Connection con = new MySQLConnector().getMySQLConnection();
        userManager.insertUser(con,nick, nombre, passwd, apellido, telefono, email);
    }

    public String passwordFromNick(String nick) throws SQLException, ClassNotFoundException {
        Connection con = new MySQLConnector().getMySQLConnection();
        return userManager.passwordFromNick(con, nick);

    }

    public Usuario userFromNick(String nick) throws SQLException, ClassNotFoundException {
        Connection con = new MySQLConnector().getMySQLConnection();
        return userManager.userFromNick(con, nick);

    }

    public boolean existeNick(String nick) throws SQLException, ClassNotFoundException {
        Connection con = new MySQLConnector().getMySQLConnection();
        return userManager.existeNick(con, nick);
    }
}
