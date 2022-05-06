package Presentation.Dto;

import Dominio.Model.UserModel;
import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

public class LoginDto implements IPropertiesValidator<LoginDto> {

    public LoginDto() {
    }

    public LoginDto(String user, String pass) {

    }

    private String User;

    public void setUser(String _User) {
        this.User = _User;
    }

    public String getUser() {
        return this.User;
    }

    private String Pass;

    public void setPass(String _Pass) {
        this.Pass = _Pass;
    }

    public String getPass() {
        return this.Pass;
    }

    private boolean Exist;

    public void setPass(boolean _Exist) {
        this.Exist = _Exist;
    }

    public boolean getExist() {
        return this.Exist;
    }

    @Override
    public void validObject() throws PropertiesValidator {
        if (!validString(this.User)) {
            throw new PropertiesValidator("Por favor preencher o usuário");
        }
        if (!validString(this.Pass)) {
            throw new PropertiesValidator("Por favor preencher a senha");
        }
        
        
    }

    @Override
    public boolean validString(String value) throws PropertiesValidator {

        if (value.isBlank() || value.isEmpty()) {
            return false;
        }

        return true;
    }

    @Override
    public boolean validDate(Date value) throws PropertiesValidator {
        if (value == null || value.toString().isBlank() || value.toString().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean validInt(int value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validDouble(double value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
