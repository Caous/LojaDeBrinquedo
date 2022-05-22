/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.TipoAcessoModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class AcessoController {
     public AcessoController() {
    }

    public AcessoController(TipoAcessoModel acesso) {
        this._acesso = acesso;
    }    
    
    TipoAcessoModel _acesso;

    public static void Excluir(TipoAcessoModel perfil) {

    }

    public static TipoAcessoModel Pesquisar(TipoAcessoModel perfil) {
        TipoAcessoModel acesso = new TipoAcessoModel();
        return acesso;
    }

    public static List<TipoAcessoModel> RetornaLista() {

        List<TipoAcessoModel> acessos = new ArrayList<TipoAcessoModel>();

        return acessos;
    }

    public static void Salvar(TipoAcessoModel perfil) {

    }
}
