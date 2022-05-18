package loja.Presentation.Controller;

import loja.Presentation.Dto.LoginDto;

public class LoginController {

    public LoginController() {
    }

    public LoginController(LoginDto login) {
        this._login = login;
    }

    LoginDto _login;

    public boolean validLogin(LoginDto login) {
        
        if (login != null) 
            return true;
        
        return false;
    }
}
