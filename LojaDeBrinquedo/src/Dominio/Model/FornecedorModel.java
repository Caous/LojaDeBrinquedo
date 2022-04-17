package Dominio.Model;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

public class FornecedorModel implements IPropertiesValidator<FornecedorModel> {

    public FornecedorModel() {
    }

    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private String Nome;

    public void setNome(String _nome) {
        this.Nome = _nome;
    }

    public String getNome() {
        return this.Nome;
    }

    private String NomeFantasia;

    public void setNomeFantasia(String _nomeFantasia) {
        this.NomeFantasia = _nomeFantasia;
    }

    public String getNomeFantasia() {
        return this.NomeFantasia;
    }

    private String Cnpj;

    public void setCnpj(String _Cnpj) {
        this.Cnpj = _Cnpj;
    }

    public String getCnpj() {
        return this.Cnpj;
    }

    private String Endereco;

    public void setEndereco(String _Endereco) {
        this.Endereco = _Endereco;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    private String CEP;

    public void setCEP(String _CEP) {
        this.CEP = _CEP;
    }

    public String getCEP() {
        return this.CEP;
    }

    private String Estado;

    public void setEstado(String _Estado) {
        this.CEP = _Estado;
    }

    public String getEstado() {
        return this.Estado;
    }

    private String Municipio;

    public void setMunicipio(String _Municipio) {
        this.Municipio = _Municipio;
    }

    public String getMunicipio() {
        return this.Municipio;
    }

    private String Telefone;

    public void setTelefone(String _Telefone) {
        this.Telefone = _Telefone;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    private String Celular;

    public void setCelular(String _Celular) {
        this.Celular = _Celular;
    }

    public String getCelular() {
        return this.Celular;
    }

    private String ContatoResposavel;

    public void setContatoResposavel(String _ContatoResposavel) {
        this.ContatoResposavel = _ContatoResposavel;
    }

    public String getContatoResposavel() {
        return this.ContatoResposavel;
    }

    private int IM;

    public void setIM(int _IM) {
        this.IM = _IM;
    }

    public int getIM() {
        return this.IM;
    }

    private int EM;

    public void setEM(int _EM) {
        this.EM = _EM;
    }

    public int getEM() {
        return this.EM;
    }

    private Date DtNasc;

    public void setDtNasc(Date _DtNasc) {
        this.DtNasc = _DtNasc;
    }

    public Date getDtNasc() {
        return this.DtNasc;
    }

    private String Email;

    public void setEmail(String _Email) {
        this.Email = _Email;
    }

    public String getEmail() {
        return this.Email;
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
    public void validObject(FornecedorModel objeto) throws PropertiesValidator {
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean validDouble(double value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
