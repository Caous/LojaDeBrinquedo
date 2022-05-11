/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation.Dto;

import Dominio.Util.IPropertiesValidator;
import Dominio.Util.PropertiesValidator;
import java.util.Date;

/**
 *
 * @author Gustavo Nascimento
 */
public class TipoPagamentoDto implements IPropertiesValidator<TipoPagamentoDto> {

    public TipoPagamentoDto() {
    
    }
    private String DescPagamento;

    public void setDescPagamento(String _DescPagamento) {
        this.DescPagamento = _DescPagamento;
    }

    public String getDescPagamento() {
        return this.DescPagamento;
    }

    @Override
    public void validObject() throws PropertiesValidator {
        if (validString(this.DescPagamento)) {
            throw new PropertiesValidator("Por favor preencher a descrição do pagamento");
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
