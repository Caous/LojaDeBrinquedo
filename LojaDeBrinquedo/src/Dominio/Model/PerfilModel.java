package Dominio.Model;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

public class PerfilModel implements IPropertiesValidator<PerfilModel> {

    public PerfilModel() {
    }

    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private String Perfil;

    public void setPerfile(String _Perfil) {
        this.Perfil = _Perfil;
    }

    public String getPerfil() {
        return this.Perfil;
    }
    
    private String DescPerfil;

    public void setDescPerfil(String _DescPerfil) {
        this.DescPerfil = _DescPerfil;
    }

    public String getDescPerfil() {
        return this.DescPerfil;
    }

    @Override
    public void validObject(PerfilModel objeto) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
