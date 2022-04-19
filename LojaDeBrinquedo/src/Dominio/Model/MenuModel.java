package Dominio.Model;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

public class MenuModel implements IPropertiesValidator<MenuModel> {

    public MenuModel() {
    }
    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

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
    
    private Date DtCad;

    public void setDtCad(Date _DtCad) {
        this.DtCad = _DtCad;
    }

    public Date getDtCad() {
        return this.DtCad;
    }

    private Date DtDel;

    public void setDtDel(Date _DtDel) {
        this.DtDel = _DtDel;
    }

    public Date getDtDel() {
        return this.DtDel;
    }

    private int UsuInclus;

    public void setUsuInclus(int _UsuInclus) {
        this.UsuInclus = _UsuInclus;
    }

    public int getUsuInclus() {
        return this.UsuInclus;
    }

    private int UsuDel;

    public void setUsuDel(int _UsuDel) {
        this.UsuDel = _UsuDel;
    }

    public int getUsuDel() {
        return this.UsuDel;
    }

    @Override
    public void validObject(MenuModel objeto) throws PropertiesValidator {
        if (validString(this.Menu)) {
            throw new PropertiesValidator("Por favor preencher o nome do menu");
        }
        if (validString(this.DescMenu)) {
            throw new PropertiesValidator("Por favor preencher a descrição do menu");
        }
        if (!validDate(this.DtCad)) {
            throw new PropertiesValidator("Por favor preencher a Data de cadrasto do menu(TI)");
        }
        if (!validInt(this.UsuInclus)) {
            throw new PropertiesValidator("Por favor preencher o usuário de inclusão do menu (TI)");
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
