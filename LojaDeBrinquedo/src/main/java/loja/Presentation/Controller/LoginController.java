package loja.Presentation.Controller;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.UserModel;
import loja.Dominio.Service.UserService;

public class LoginController {

    public LoginController() {
    }

    public LoginController(UserModel login) {
        this._login = login;
    }

    UserModel _login;

    public boolean validLogin(UserModel login) {

        try {
            UserService usuService = new UserService();

            List<UserModel> usus = usuService.findAll(login);

            if (usus != null && !usus.isEmpty() && usus.size() > 0) {
                return true;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
