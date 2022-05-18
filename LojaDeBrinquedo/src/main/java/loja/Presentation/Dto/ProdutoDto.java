/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Dto;

import loja.Dominio.Model.ProdutoModel;
import loja.Dominio.Util.IPropertiesValidator;
import loja.Dominio.Util.PropertiesValidator;
import java.util.Date;

/**
 *
 * @author Gustavo Nascimento
 */
public class ProdutoDto implements IPropertiesValidator<ProdutoModel> {
    
    public ProdutoDto(){}

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

    public void setComentario(Date _DtValidade) {
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
