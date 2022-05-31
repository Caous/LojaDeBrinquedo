/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Dominio.Model;

import java.util.Date;
import loja.Dominio.Util.IPropertiesValidator;
import loja.Dominio.Util.PropertiesValidator;

/**
 *
 * @author Gustavo Nascimento
 */
public class ItemVendaModel implements IPropertiesValidator<ItemVendaModel> {

    public ItemVendaModel() {

    }
    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private int IdVenda;

    public void setIdVenda(int _idVenda) {
        this.IdVenda = _idVenda;
    }

    public int getIdVenda() {
        return this.IdVenda;
    }

    private int idProduto;

    public void setIdProduto(int _idProduto) {
        this.idProduto = _idProduto;
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    private int qtdProduto;

    public void setqtdProduto(int _qtdProduto) {
        this.qtdProduto = _qtdProduto;
    }

    public int getqtdProduto() {
        return this.qtdProduto;
    }

    private double vlrProduto;

    public void setvlrProduto(double _vlrProduto) {
        this.vlrProduto = _vlrProduto;
    }

    public double getvlrProduto() {
        return this.vlrProduto;
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
