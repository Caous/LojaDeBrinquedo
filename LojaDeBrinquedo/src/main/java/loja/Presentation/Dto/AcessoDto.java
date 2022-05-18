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
public class AcessoDto implements IPropertiesValidator<AcessoDto> {

    private int IdPerfil;

    public void setIdPerfil(int _IdPerfil) {
        this.IdPerfil = _IdPerfil;
    }

    public int getIdPerfil() {
        return this.IdPerfil;
    }

    private int IdMenu;

    public void setIdMenu(int _IdMenu) {
        this.IdMenu = _IdMenu;
    }

    public int getIdMenu() {
        return this.IdMenu;
    }

    @Override
    public void validObject() throws PropertiesValidator {
        if (!validInt(this.IdMenu)) {
            throw new PropertiesValidator("Por favor selecionar o menu");
        }
        if (!validInt(this.IdPerfil)) {
            throw new PropertiesValidator("Por favor selecionar o perfil");
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
