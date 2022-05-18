/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import loja.Presentation.Dto.AcessoDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public class AcessoController {
     public AcessoController() {
    }

    public AcessoController(AcessoDto acesso) {
        this._acesso = acesso;
    }    
    
    AcessoDto _acesso;

    public static void Excluir(AcessoDto perfil) {

    }

    public static AcessoDto Pesquisar(AcessoDto perfil) {
        AcessoDto acesso = new AcessoDto();
        return acesso;
    }

    public static List<AcessoDto> RetornaLista() {

        List<AcessoDto> acessos = new ArrayList<AcessoDto>();

        return acessos;
    }

    public static void Salvar(AcessoDto perfil) {

    }
}
