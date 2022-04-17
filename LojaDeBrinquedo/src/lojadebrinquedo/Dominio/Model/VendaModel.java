/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojadebrinquedo.Dominio.Model;

import java.util.Date;
import lojadebrinquedo.Dominio.Util.IPropertiesValidator;
import lojadebrinquedo.Dominio.Util.PropertiesValidator;

public class VendaModel implements IPropertiesValidator<VendaModel> {
    
    public VendaModel(){
        
    }
    
    private int Id_Venda;

    public int getId_Venda() {
        return Id_Venda;
    }

    public void setId_Venda(int Id_Venda) {
        this.Id_Venda = Id_Venda;
    }
    
    private int Id_Prod;

    public int getId_Prod() {
        return Id_Prod;
    }

    public void setId_Prod(int Id_Prod) {
        this.Id_Prod = Id_Prod;
    }
    
    private int Cod_Prod;

    public int getCod_Prod() {
        return Cod_Prod;
    }

    public void setCod_Prod(int Cod_Prod) {
        this.Cod_Prod = Cod_Prod;
    }
    
    private String Desc_Prod;

    public String getDesc_Prod() {
        return Desc_Prod;
    }

    public void setDesc_Prod(String Desc_Prod) {
        this.Desc_Prod = Desc_Prod;
    }
   

    private int Id_Usu;

    public int getId_Usu() {
        return Id_Usu;
    }

    public void setId_Usu(int Id_Usu) {
        this.Id_Usu = Id_Usu;
    }
    
    
    private int Cod_Cli;

    public int getCod_Cli() {
        return Cod_Cli;
    }

    public void setCod_Cli(int Cod_Cli) {
        this.Cod_Cli = Cod_Cli;
    }
    
    private String Desc_Cli;

    public String getDesc_Cli() {
        return Desc_Cli;
    }

    public void setDesc_Cli(String Desc_Cli) {
        this.Desc_Cli = Desc_Cli;
    }
    
    private double Vlr_Prod;

    public double getVlr_Prod() {
        return Vlr_Prod;
    }

    public void setVlr_Prod(double Vlr_Prod) {
        this.Vlr_Prod = Vlr_Prod;
    }
    
    private int Qtd_Prod;

    public int getQtd_Prod() {
        return Qtd_Prod;
    }

    public void setQtd_Prod(int Qtd_Prod) {
        this.Qtd_Prod = Qtd_Prod;
    }
    
    private double Vlr_Tot;

    public double getVlr_Tot() {
        return Vlr_Tot;
    }

    public void setVlr_Tot(double Vlr_Tot) {
        this.Vlr_Tot = Vlr_Tot;
    }
    
    private Date Dta_Venda;

    public Date getDta_Venda() {
        return Dta_Venda;
    }

    public void setDta_Venda(Date Dta_Venda) {
        this.Dta_Venda = Dta_Venda;
    }
    
    
    private int Tip_Pag;

    public int getTip_Pag() {
        return Tip_Pag;
    }

    public void setTip_Pag(int Tip_Pag) {
        this.Tip_Pag = Tip_Pag;
    }
    
    @Override
    public void validObject(VendaModel objeto) throws PropertiesValidator{
        if (!validInt(this.Cod_Prod))
            throw new PropertiesValidator("Por favor informe o código do produto.");
        
        if (!validString(this.Desc_Prod))
            throw new PropertiesValidator("Por favor informe a descrição do produto.");
        
        if (!validInt(this.Cod_Cli))
            throw new PropertiesValidator("Por favor informe o código do cliente.");
        
        if (!validString(this.Desc_Cli))
            throw new PropertiesValidator("Por favor informe a descrição do cliente");
        
        if(!validInt(this.Qtd_Prod))
            throw new PropertiesValidator("Por favor informe a quantidade de produtos.");
        
        if(!validInt(this.Tip_Pag))
            throw new PropertiesValidator("Por favor informe o Tipo de pagamento.");
        
        if(!validDouble(this.Vlr_Prod))
            throw new PropertiesValidator("O valor do produto não pode ser 0");
        
        if(!validDouble(this.Vlr_Tot))
            throw new PropertiesValidator("O valor da compra não pode ser 0");
    }
    
    @Override
    public boolean validInt(int value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validDouble(double value) throws PropertiesValidator {
        throw new UnsupportedOperationException("Not supported yet.");
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
}
