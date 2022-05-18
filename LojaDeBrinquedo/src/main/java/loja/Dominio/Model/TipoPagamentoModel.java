package loja.Dominio.Model;

import loja.Dominio.Util.IPropertiesValidator;
import loja.Dominio.Util.PropertiesValidator;
import java.util.Date;

public class TipoPagamentoModel implements IPropertiesValidator<TipoPagamentoModel> {

    public TipoPagamentoModel() {
    }

    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private String DescPagamento;

    public void setDescPagamento(String _DescPagamento) {
        this.DescPagamento = _DescPagamento;
    }

    public String getDescPagamento() {
        return this.DescPagamento;
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
        if (validString(this.DescPagamento)) {
            throw new PropertiesValidator("Por favor preencher a descrição do pagamento");
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
