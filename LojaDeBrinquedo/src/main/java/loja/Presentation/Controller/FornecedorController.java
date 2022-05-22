/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.FornecedorModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class FornecedorController {

    public FornecedorController() {
    }

    public FornecedorController(FornecedorModel fornecedor) {
        this._fornecedor = fornecedor;
    }
    private FornecedorModel _fornecedor;
    
    public static void Excluir(FornecedorModel produto) {

    }

    public static FornecedorModel Pesquisar(FornecedorModel fornecedor) {
        FornecedorModel fornecedores = new FornecedorModel();
        return fornecedores;
    }

    public static List<FornecedorModel> RetornaLista() {

        List<FornecedorModel> fornecedores = new ArrayList<FornecedorModel>();

        return fornecedores;
    }

    public static void Salvar(FornecedorModel fornecedor) {

    }
}
