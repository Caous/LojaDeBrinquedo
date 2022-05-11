/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation.Controller;

import Presentation.Dto.MenuDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Nascimento
 */
public class MenuController {
     public MenuController() {
    }

    public MenuController(MenuDto menu) {
        this._menu = menu;
    }    
    
    MenuDto _menu;

    public static void Excluir(MenuDto perfil) {

    }

    public static MenuDto Pesquisar(MenuDto perfil) {
        MenuDto menu = new MenuDto();
        return menu;
    }

    public static List<MenuDto> RetornaLista() {

        List<MenuDto> menus = new ArrayList<MenuDto>();

        return menus;
    }

    public static void Salvar(MenuDto perfil) {

    }
}
