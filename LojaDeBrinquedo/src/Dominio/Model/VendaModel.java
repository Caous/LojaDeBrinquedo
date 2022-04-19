package Dominio.Model;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class VendaModel implements IPropertiesValidator<VendaModel> {

    public VendaModel() {
    }
    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private List<ProdutoModel> produtos;

    public void setIdProd(ProdutoModel _produto) {
        if (produtos == null) {
            produtos = new ArrayList<ProdutoModel>();
            produtos.add(_produto);
        } else {
            produtos.add(_produto);
        }
    }

    public List<ProdutoModel> getIdProd() {
        return this.produtos;
    }

    private int IdUsuVend;

    public void setIdUsuVend(int _IdUsuVend) {
        this.IdUsuVend = _IdUsuVend;
    }

    public int getIdUsuVend() {
        return this.IdUsuVend;
    }

    private int IdCli;

    public void setIdCli(int _IdCli) {
        this.IdCli = _IdCli;
    }

    public int getIdCli() {
        return this.IdCli;
    }

    private double ValorPrd;

    public void setValorPrd(int _ValorPrd) {
        this.ValorPrd = _ValorPrd;
    }

    public double getValorPrd() {
        return this.ValorPrd;
    }

    private Date DtVenda;

    public void setDtVenda(Date _DtVenda) {
        this.DtVenda = _DtVenda;
    }

    public Date getDtVenda() {
        return this.DtVenda;
    }

    private double ValorTotal;

    public void setValorTotal(int _ValorTotal) {
        this.ValorTotal = _ValorTotal;
    }

    public double getValorTotal() {
        return this.ValorTotal;
    }

    private int TipoPagamento;

    public void setTipoPagamento(int _TipoPagamento) {
        this.TipoPagamento = _TipoPagamento;
    }

    public int getTipoPagamento() {
        return this.TipoPagamento;
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
    public void validObject(VendaModel objeto) throws PropertiesValidator {
        if (!validInt(this.IdCli)) {
            throw new PropertiesValidator("Por favor preencher o cliente");
        }
        if (!validInt(this.produtos.size())) {
            throw new PropertiesValidator("Por favor preencher o produto");
        }
        if (!validInt(this.IdUsuVend)) {
            throw new PropertiesValidator("Por favor preencher o usuário da venda (TI)");
        }
        if (!validInt(this.TipoPagamento)) {
            throw new PropertiesValidator("Por favor preencher o tipo pagamento");
        }
        if (!validDate(this.DtCad)) {
            throw new PropertiesValidator("Por favor preencher a Data de cadrasto da empresa (TI)");
        }
        if (!validInt(this.UsuInclus)) {
            throw new PropertiesValidator("Por favor preencher o usuário de inclusão da empresa (TI)");
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
