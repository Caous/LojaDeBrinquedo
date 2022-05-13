/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation.Controller;

import Presentation.Dto.FornecedorDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public class FornecedorController {

    public FornecedorController() {
    }

    public FornecedorController(FornecedorDto fornecedor) {
        this._fornecedor = fornecedor;
    }
    private FornecedorDto _fornecedor;
    
    public static void Excluir(FornecedorDto produto) {

    }

    public static FornecedorDto Pesquisar(FornecedorDto fornecedor) {
        FornecedorDto fornecedores = new FornecedorDto();
        return fornecedores;
    }

    public static List<FornecedorDto> RetornaLista() {

        List<FornecedorDto> fornecedores = new ArrayList<FornecedorDto>();

        return fornecedores;
    }

    public static void Salvar(FornecedorDto fornecedor) {

    }
}
