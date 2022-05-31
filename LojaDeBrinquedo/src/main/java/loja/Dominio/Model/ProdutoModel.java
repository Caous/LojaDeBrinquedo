package loja.Dominio.Model;

import loja.Dominio.Util.IPropertiesValidator;
import loja.Dominio.Util.PropertiesValidator;
import java.util.Date;

public class ProdutoModel implements IPropertiesValidator<ProdutoModel> {

    public ProdutoModel() {
    }

    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private int IdFornecedor;

    public void setIdFornecedor(int _idForncedor) {
        this.IdFornecedor = _idForncedor;
    }

    public int getIdFornecedor() {
        return this.IdFornecedor;
    }

    private String NomeProduto;

    public void setNomeProduto(String _NomeProduto) {
        this.NomeProduto = _NomeProduto;
    }

    public String getNomeProduto() {
        return this.NomeProduto;
    }

    private String Categoria;

    public void setCategoria(String _Categoria) {
        this.Categoria = _Categoria;
    }

    public String getCategoria() {
        return this.Categoria;
    }

    private String Marca;

    public void setMarca(String _Marca) {
        this.Marca = _Marca;
    }

    public String getMarca() {
        return this.Marca;
    }

    private String DescricaoProduto;

    public void setDescricaoProduto(String _DescricaoProduto) {
        this.DescricaoProduto = _DescricaoProduto;
    }

    public String getDescricaoProduto() {
        return this.DescricaoProduto;
    }

    private int Qtd;

    public void setQtd(int _Qtd) {
        this.Qtd = _Qtd;
    }

    public int getQtd() {
        return this.Qtd;
    }

    private double Valor;

    public void setValor(double _Valor) {
        this.Valor = _Valor;
    }

    public double getValor() {
        return this.Valor;
    }

    private int Avaliacao;

    public void setAvaliacao(int _Avaliacao) {
        this.Avaliacao = _Avaliacao;
    }

    public int getAvaliacao() {
        return this.Avaliacao;
    }

    private String Comentario;

    public void setComentario(String _Comentario) {
        this.Comentario = _Comentario;
    }

    public String getComentario() {
        return this.Comentario;
    }

    private Date DtValidade;

    public void setDtValidade(Date _DtValidade) {
        this.DtValidade = _DtValidade;
    }

    public Date getDtValidade() {
        return this.DtValidade;
    }

    private double PorcentagemDesc;

    public void setPorcentagemDesc(double _PorcentagemDesc) {
        this.PorcentagemDesc = _PorcentagemDesc;
    }

    public double getPorcentagemDesc() {
        return this.PorcentagemDesc;
    }

    private String Foto;

    public void setFoto(String _Foto) {
        this.Foto = _Foto;
    }

    public String getFoto() {
        return this.Foto;
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
        if (!validString(this.NomeProduto)) {
            throw new PropertiesValidator("Por favor preencher o nome do Produto");
        }
        if (!validString(this.Categoria)) {
            throw new PropertiesValidator("Por favor preencher o Categoria do Produto");
        }
        if (!validString(this.DescricaoProduto)) {
            throw new PropertiesValidator("Por favor preencher o Descrição do Produto");
        }
        if (!validString(this.Marca)) {
            throw new PropertiesValidator("Por favor preencher o Marca do Produto");
        }
        if (!validInt(this.IdFornecedor)) {
            throw new PropertiesValidator("Por favor preencher o fornecedor");
        }
        if (!validInt(this.Qtd)) {
            throw new PropertiesValidator("Por favor preencher a quantidade de produto");
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
        if (value > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean validDouble(double value) throws PropertiesValidator {
        if (value > 0) {
            return true;
        }
        return false;
    }
}
