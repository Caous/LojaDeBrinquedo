package loja.Presentation.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.UserModel;
import loja.Dominio.Service.UserService;

public class UserController {

    public UserController() {
    }

    public UserController(UserModel userDto) {
        this._user = userDto;
    }

    UserModel _user;

    public static void delete(UserModel userDto) {

    }

    public static UserModel findId(int id) {
        
        UserModel user = new UserModel();
        
        try {
            UserService users = new UserService();
            user = users.findId(id);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }

    public static List<UserModel> findAll(UserModel entity) {

        List<UserModel> users = new ArrayList<UserModel>();
        
        try {
            UserService user = new UserService();
            user.findAll(entity);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return users;
    }

    public static void save(UserModel userMod) {
        
        try {
            UserService user = new UserService();
            user.save(userMod);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }

    public static boolean UsuarioExite(UserModel userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }

    public void update(UserModel user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
