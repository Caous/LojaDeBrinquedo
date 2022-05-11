package Dominio.Model;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

public class TipoAcessoModel implements IPropertiesValidator<TipoAcessoModel> {

    public TipoAcessoModel() {
    }
    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

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
    public void validObject() throws PropertiesValidator {
        if (!validInt(this.IdMenu)) {
            throw new PropertiesValidator("Por favor selecionar o menu");
        }
        if (!validInt(this.IdPerfil)) {
            throw new PropertiesValidator("Por favor selecionar o perfil");
        }
        if (!validDate(this.DtCad)) {
            throw new PropertiesValidator("Por favor preencher a Data de cadrasto do pagamento (TI)");
        }
        if (!validInt(this.UsuInclus)) {
            throw new PropertiesValidator("Por favor preencher o usuário de inclusão do pagamento (TI)");
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
