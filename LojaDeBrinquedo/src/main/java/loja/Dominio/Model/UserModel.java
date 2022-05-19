package loja.Dominio.Model;

import java.util.Date;
import loja.Dominio.Util.IPropertiesValidator;
import loja.Dominio.Util.PropertiesValidator;

public class UserModel implements IPropertiesValidator<UserModel> {

    public UserModel() {

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

    private String CPF;

    public void setCPF(String _CPF) {
        this.CPF = _CPF;
    }

    public String getCPF() {
        return this.CPF;
    }

    private Date DtNasc;

    public void setDtNasc(Date _DtNasc) {
        this.DtNasc = _DtNasc;
    }

    public Date getDtNasc() {
        return this.DtNasc;
    }

    private int EstadoCivil;

    public void setEstadoCivil(int _EstadoCivil) {
        this.EstadoCivil = _EstadoCivil;
    }

    public int getEstadoCivil() {
        return this.EstadoCivil;
    }

    private String Email;

    public void setEmail(String _Email) {
        this.Email = _Email;
    }

    public String getEmail() {
        return this.Email;
    }

    private String Password;

    public void setPassword(String _Password) {
        this.Password = _Password;
    }

    public String getPassword() {
        return this.Password;
    }

    private int IdPerfil;

    public void setIdPerfil(int _IdPerfil) {
        this.IdPerfil = _IdPerfil;
    }

    public int getIdPerfil() {
        return this.IdPerfil;
    }

    private String Sexo;

    public void setSexo(String _Sexo) {
        this.Sexo = _Sexo;
    }

    public String getSexo() {
        return this.Sexo;
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

        if (!validString(this.Nome)) 
            throw new PropertiesValidator("Por favor preencher o nome");
        
        if (!validString(this.CPF)) 
            throw new PropertiesValidator("Por favor preencher o CPF");
        
        if (!validString(this.Email)) 
            throw new PropertiesValidator("Por favor preencher o Email");
        
        if (!validString(this.Password)) 
            throw new PropertiesValidator("Por favor preencher o Password");
        
        if (!validString(this.Sexo)) 
            throw new PropertiesValidator("Por favor preencher o Sexo");
        
        if (!validDate(this.DtNasc)) 
            throw new PropertiesValidator("Por favor preencher a Data de Nascimento");
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
