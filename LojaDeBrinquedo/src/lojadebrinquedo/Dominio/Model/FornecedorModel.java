/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojadebrinquedo.Dominio.Model;

import java.util.Date;
import lojadebrinquedo.Dominio.Util.IPropertiesValidator;
import lojadebrinquedo.Dominio.Util.PropertiesValidator;

/**
 *
 * @author morai
 */
public class FornecedorModel implements IPropertiesValidator<FornecedorModel> {

    public FornecedorModel() {

    }

    private int Id;
    private String Nome;
    private String NomeFant;
    private String Cpf;
    private String Cnpj;
    private String Endereco;
    private int Cep;
    private String Estado;
    private String Municipio;
    private int Telefone;
    private int Celular;
    private String Email;
    private int ContatoResp;
    private String IE;
    private String IM;
    private Date DataNasc;
    private Date DataNascCont;
    private String TipoPessoa;
    private Date DataCad;
    private Date DataDel;
    private int UsuarioCad;
    private int UsuarioDel;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNomeFant() {
        return NomeFant;
    }

    public void setNomeFant(String NomeFant) {
        this.NomeFant = NomeFant;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getContatoResp() {
        return ContatoResp;
    }

    public void setContatoResp(int ContatoResp) {
        this.ContatoResp = ContatoResp;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getIM() {
        return IM;
    }

    public void setIM(String IM) {
        this.IM = IM;
    }

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public Date getDataNascCont() {
        return DataNascCont;
    }

    public void setDataNascCont(Date DataNascCont) {
        this.DataNascCont = DataNascCont;
    }

    public String getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(String TipoPessoa) {
        this.TipoPessoa = TipoPessoa;
    }

    public Date getDataCad() {
        return DataCad;
    }

    public void setDataCad(Date DataCad) {
        this.DataCad = DataCad;
    }

    public Date getDataDel() {
        return DataDel;
    }

    public void setDataDel(Date DataDel) {
        this.DataDel = DataDel;
    }

    public int getUsuarioCad() {
        return UsuarioCad;
    }

    public void setUsuarioCad(int UsuarioCad) {
        this.UsuarioCad = UsuarioCad;
    }

    public int getUsuarioDel() {
        return UsuarioDel;
    }

    public void setUsuarioDel(int UsuarioDel) {
        this.UsuarioDel = UsuarioDel;
    }
    
    @Override
    public void validObject(FornecedorModel objeto) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validString(String value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validDate(Date value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validInt(int value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validDouble(double value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
