/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.TipoPagamentoModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class TipoPagamentoController {
     public TipoPagamentoController() {
    }

    public TipoPagamentoController(TipoPagamentoModel tipoPagamento) {
        this._tipoPagamento = tipoPagamento;
    }    
    
    TipoPagamentoModel _tipoPagamento;

    public static void Excluir(TipoPagamentoModel perfil) {

    }

    public static TipoPagamentoModel Pesquisar(TipoPagamentoModel perfil) {
        TipoPagamentoModel pagamento = new TipoPagamentoModel();
        return pagamento;
    }

    public static List<TipoPagamentoModel> RetornaLista() {

        List<TipoPagamentoModel> pagamentos = new ArrayList<TipoPagamentoModel>();

        return pagamentos;
    }

    public static void Salvar(TipoPagamentoModel perfil) {

    }
}
