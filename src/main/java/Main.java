

import controller.UserController;
import manager.impl.UserManagerImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserController userController = new UserController(new UserManagerImpl());
        System.out.println(userController.findAllUsuario().size());
//        System.out.println(userController.findUsuarioById("joaquin123").size());
//        System.out.println(userController.findAllUsuario());
//        System.out.println(userController.findUsuarioById("pablito123"));
//        //userController.insertUser("nuevo","nuevo","4321","b","123","a@a.com");
//        System.out.println(userController.passwordFromNick("nuevo"));
//        System.out.println(userController.existeNick("joaquin123"));
//        System.out.println(userController.existeNick("joaquin321"));
    }

}
