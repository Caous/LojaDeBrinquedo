package Presentation.Dto;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

public class ClienteDto implements IPropertiesValidator<ClienteDto> {

    public ClienteDto() {
    }

    private int Id;

    public void setId(int _id) {
        this.Id = _id;
    }

    public int getId() {
        return this.Id;
    }

    private int TipoCliente;

    public void setTipoCliente(int _TipoCliente) {
        this.TipoCliente = _TipoCliente;
    }

    public int getTipoCliente() {
        return this.TipoCliente;
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

    private String CpfCnpj;

    public void setCpfCnpj(String _CpfCnpj) {
        this.CpfCnpj = _CpfCnpj;
    }

    public String getCpfCnpj() {
        return this.CpfCnpj;
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

    private String IM;

    public void setIM(String _IM) {
        this.IM = _IM;
    }

    public String getIM() {
        return this.IM;
    }

    private String EM;

    public void setEM(String _EM) {
        this.EM = _EM;
    }

    public String getEM() {
        return this.EM;
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

        if (this.TipoCliente == 1) {

            if (!validString(this.ContatoResposavel)) {
                throw new PropertiesValidator("Por favor preencher o Responsável");
            }
            if (!validString(this.CpfCnpj)) {
                throw new PropertiesValidator("Por favor preencher o CNPJ");
            }
            if (!validString(this.Nome)) {
                throw new PropertiesValidator("Por favor preencher o Nome da empresa");
            }
            if (!validString(this.NomeFantasia)) {
                throw new PropertiesValidator("Por favor preencher o Nome Fantasia da empresa");
            }
            if (!validString(this.CEP)) {
                throw new PropertiesValidator("Por favor preencher o CEP da empresa");
            }
            if (!validString(this.Celular)) {
                throw new PropertiesValidator("Por favor preencher o Celular da empresa");
            }
            if (!validString(this.Email)) {
                throw new PropertiesValidator("Por favor preencher o Email da empresa");
            }
            if (!validString(this.Endereco)) {
                throw new PropertiesValidator("Por favor preencher o Endereco da empresa");
            }
            if (!validString(this.Estado)) {
                throw new PropertiesValidator("Por favor preencher o Estado da empresa");
            }
            if (!validString(this.Municipio)) {
                throw new PropertiesValidator("Por favor preencher o Municipio da empresa");
            }
            if (!validString(this.Telefone)) {
                throw new PropertiesValidator("Por favor preencher o Telefone da empresa");
            }
            if (!validDate(this.DtCad)) {
                throw new PropertiesValidator("Por favor preencher a Data de cadrasto da empresa (TI)");
            }
            if (!validInt(this.UsuInclus)) {
                throw new PropertiesValidator("Por favor preencher o usuário de inclusão da empresa (TI)");
            }

        } else {

            if (!validString(this.Nome)) {
                throw new PropertiesValidator("Por favor preencher o Nome do cliente");
            }
            if (!validString(this.CEP)) {
                throw new PropertiesValidator("Por favor preencher o CEP do cliente");
            }
            if (!validString(this.Celular)) {
                throw new PropertiesValidator("Por favor preencher o Celular do cliente");
            }
            if (!validString(this.CpfCnpj)) {
                throw new PropertiesValidator("Por favor preencher o Cpf do cliente");
            }
            if (!validString(this.Email)) {
                throw new PropertiesValidator("Por favor preencher o Email do cliente");
            }
            if (!validString(this.Endereco)) {
                throw new PropertiesValidator("Por favor preencher o Endereco do cliente");
            }
            if (!validString(this.Estado)) {
                throw new PropertiesValidator("Por favor preencher o Estado do cliente");
            }
            if (!validString(this.Municipio)) {
                throw new PropertiesValidator("Por favor preencher o Municipio do cliente");
            }
            if (!validString(this.Sexo)) {
                throw new PropertiesValidator("Por favor preencher o Sexo do cliente");
            }
            if (!validString(this.Telefone)) {
                throw new PropertiesValidator("Por favor preencher o Telefone do cliente");
            }
            if (!validDate(this.DtCad)) {
                throw new PropertiesValidator("Por favor preencher a Data de cadastro do cliente (TI)");
            }
            if (!validDate(this.DtNasc)) {
                throw new PropertiesValidator("Por favor preencher a Data de nascimento do cliente (TI)");
            }
            if (!validInt(this.UsuInclus)) {
                throw new PropertiesValidator("Por favor preencher o usuário de inclusão do cliente (TI)");
            }

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
