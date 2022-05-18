/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import loja.Presentation.Dto.PerfilDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public class PerfilController {

    public PerfilController() {
    }

    public PerfilController(PerfilDto perfil) {
        this._perfil = perfil;
    }    
    
    PerfilDto _perfil;

    public static void Excluir(PerfilDto perfil) {

    }

    public static PerfilDto Pesquisar(PerfilDto perfil) {
        PerfilDto user = new PerfilDto();
        return user;
    }

    public static List<PerfilDto> RetornaLista() {

        List<PerfilDto> perfils = new ArrayList<PerfilDto>();

        return perfils;
    }

    public static void Salvar(PerfilDto perfil) {

    }

}
