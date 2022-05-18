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
public class MenuDto implements IPropertiesValidator<MenuDto>{
    private String Menu;

    public void setMenu(String _Menu) {
        this.Menu = _Menu;
    }

    public String getMenu() {
        return this.Menu;
    }
    
    private String DescMenu;

    public void setDescMenu(String _DescMenu) {
        this.DescMenu = _DescMenu;
    }

    public String getDescMenu() {
        return this.DescMenu;
    }
    @Override
    public void validObject() throws PropertiesValidator {
        if (validString(this.Menu)) {
            throw new PropertiesValidator("Por favor preencher o nome do menu");
        }
        if (validString(this.DescMenu)) {
            throw new PropertiesValidator("Por favor preencher a descrição do menu");
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
