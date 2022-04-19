package lojadebrinquedo.Dominio.Model;

import java.util.Date;
import lojadebrinquedo.Dominio.Util.IPropertiesValidator;
import lojadebrinquedo.Dominio.Util.PropertiesValidator;

public class ProdutoModel implements IPropertiesValidator<ProdutoModel> {

    public ProdutoModel() {

    }

    private int IdProduto;

    public void setIdProduto(int _idProduto) {
        this.IdProduto = _idProduto;
    }

    public int getIdProduto() {
        return this.IdProduto;
    }

    private String NomeProduto;

    public void setNomeProduto(String _nomeProduto) {
        this.NomeProduto = _nomeProduto;
    }

    public String getNomeProduto() {
        return this.NomeProduto;
    }

    private String CatProduto;

    public void setCatProduto(String _catProduto) {
        this.CatProduto = _catProduto;
    }

    public String getCatProduto() {
        return this.CatProduto;
    }

    private String MarcaProduto;

    public void setMarcaProduto(String _marcaProduto) {
        this.MarcaProduto = _marcaProduto;
    }

    public String getMarcaProduto() {
        return this.MarcaProduto;
    }

    private int QtdProduto;

    public void setQtdProduto(int _qtdProduto) {
        this.QtdProduto = _qtdProduto;
    }

    public int getQtdProduto() {
        return this.QtdProduto;
    }

    private double VlrProduto;

    public void setVlrProduto(double _vlrProduto) {
        this.VlrProduto = _vlrProduto;
    }

    public double getVlrProduto() {
        return this.VlrProduto;
    }

    private String Fornecedor;

    public void setFornecedor(String _fornecedor) {
        this.Fornecedor = _fornecedor;
    }

    public String getFornecedor() {
        return this.Fornecedor;
    }

    private String DescProduto;

    public void setDescProduto(String _descProduto) {
        this.DescProduto = _descProduto;
    }

    public String getDescProduto() {
        return this.DescProduto;
    }

    private double Avaliacao;

    public void setAvaliacao(double _avaliacao) {
        this.Avaliacao = _avaliacao;
    }

    public double getAvaliacao() {
        return this.Avaliacao;
    }

    private String Comentario;

    public void setComenatrio(String _comentario) {
        this.Comentario = _comentario;
    }

    public String getComentario() {
        return this.Comentario;
    }

    private Date Validade;

    public void setValidade(Date _validade) {
        this.Validade = _validade;
    }

    public Date getValidade() {
        return this.Validade;
    }

    private double PorcentDesc;

    public void setPorcentDesc(double _porcentDesc) {
        this.PorcentDesc = _porcentDesc;
    }

    public double getPorcentDesc() {
        return this.PorcentDesc;
    }

    private String FotoProduto;

    public void setFotoProduto(String _fotoProduto) {
        this.FotoProduto = _fotoProduto;
    }

    public String getFotoProduto() {
        return this.FotoProduto;
    }

    @Override
    public void validObject(ProdutoModel objeto) throws PropertiesValidator {

        if (!validString(this.NomeProduto)) 
            throw new PropertiesValidator("Por favor, preencher o nome do produto!");
        
        if (!validInt(this.QtdProduto)) 
            throw new PropertiesValidator("Por favor, preencher a quantidade do produto!");
        
        if (!validDouble(this.VlrProduto)) 
            throw new PropertiesValidator("Por favor, preencher o valor do produto!");
        
        if (!validString(this.Fornecedor)) 
            throw new PropertiesValidator("Por favor, preencher o fornecedor!");
    }

    @Override
    public boolean validString(String value) throws PropertiesValidator {
        
        if (value.isBlank() || value.isEmpty()) 
            return false;
        
        return true;
    }

    @Override
    public boolean validDate(Date value) throws PropertiesValidator {
        if (value == null || value.toString().isBlank() || value.toString().isEmpty()) 
            return false;
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
