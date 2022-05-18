/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import loja.Presentation.Dto.ProdutoDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public class ProdutoController {
     public ProdutoController() {
    }

    public ProdutoController(ProdutoDto produto) {
        this._produto = produto;
    }    
    
    ProdutoDto _produto;

    public static void Excluir(ProdutoDto produto) {

    }

    public static ProdutoDto Pesquisar(ProdutoDto produto) {
        ProdutoDto produtos = new ProdutoDto();
        return produtos;
    }

    public static List<ProdutoDto> RetornaLista() {

        List<ProdutoDto> produtos = new ArrayList<ProdutoDto>();

        return produtos;
    }

    public static void Salvar(ProdutoDto produto) {

    }
}
