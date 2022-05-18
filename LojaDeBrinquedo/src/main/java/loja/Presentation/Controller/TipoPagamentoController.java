/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import loja.Presentation.Dto.TipoPagamentoDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public class TipoPagamentoController {
     public TipoPagamentoController() {
    }

    public TipoPagamentoController(TipoPagamentoDto tipoPagamento) {
        this._tipoPagamento = tipoPagamento;
    }    
    
    TipoPagamentoDto _tipoPagamento;

    public static void Excluir(TipoPagamentoDto perfil) {

    }

    public static TipoPagamentoDto Pesquisar(TipoPagamentoDto perfil) {
        TipoPagamentoDto pagamento = new TipoPagamentoDto();
        return pagamento;
    }

    public static List<TipoPagamentoDto> RetornaLista() {

        List<TipoPagamentoDto> pagamentos = new ArrayList<TipoPagamentoDto>();

        return pagamentos;
    }

    public static void Salvar(TipoPagamentoDto perfil) {

    }
}
