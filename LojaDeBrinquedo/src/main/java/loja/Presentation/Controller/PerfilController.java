/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.PerfilModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class PerfilController {

    public PerfilController() {
    }

    public PerfilController(PerfilModel perfil) {
        this._perfil = perfil;
    }    
    
    PerfilModel _perfil;

    public static void Excluir(PerfilModel perfil) {

    }

    public static PerfilModel Pesquisar(PerfilModel perfil) {
        PerfilModel user = new PerfilModel();
        return user;
    }

    public static List<PerfilModel> RetornaLista() {

        List<PerfilModel> perfils = new ArrayList<PerfilModel>();

        return perfils;
    }

    public static void Salvar(PerfilModel perfil) {

    }

}
