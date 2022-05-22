/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.MenuModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class MenuController {
     public MenuController() {
    }

    public MenuController(MenuModel menu) {
        this._menu = menu;
    }    
    
    MenuModel _menu;

    public static void Excluir(MenuModel perfil) {

    }

    public static MenuModel Pesquisar(MenuModel perfil) {
        MenuModel menu = new MenuModel();
        return menu;
    }

    public static List<MenuModel> RetornaLista() {

        List<MenuModel> menus = new ArrayList<MenuModel>();

        return menus;
    }

    public static void Salvar(MenuModel perfil) {

    }
}
