/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.ProdutoModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class ProdutoController {
     public ProdutoController() {
    }

    public ProdutoController(ProdutoModel produto) {
        this._produto = produto;
    }    
    
    ProdutoModel _produto;

    public static void Excluir(ProdutoModel produto) {

    }

    public static ProdutoModel Pesquisar(ProdutoModel produto) {
        ProdutoModel produtos = new ProdutoModel();
        return produtos;
    }

    public static List<ProdutoModel> RetornaLista() {

        List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();

        return produtos;
    }

    public static void Salvar(ProdutoModel produto) {

    }
}
