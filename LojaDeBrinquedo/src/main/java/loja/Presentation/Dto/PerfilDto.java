/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Dto;

import loja.Dominio.Util.IPropertiesValidator;
import loja.Dominio.Util.PropertiesValidator;
import java.util.Date;

/**
 *
 * @author Gustavo Nascimento
 */
public class PerfilDto implements IPropertiesValidator<PerfilDto> {
    public PerfilDto(){}
    
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
    public void validObject() throws PropertiesValidator {
         if (validString(this.Perfil)) {
            throw new PropertiesValidator("Por favor preencher o nome do perfil");
        }
        if (validString(this.DescPerfil)) {
            throw new PropertiesValidator("Por favor preencher a descrição do perfil");
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
        if (value >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validDouble(double value) throws PropertiesValidator {
        if (value >= 0) {
            return true;
        }
        return false;
    }
}
