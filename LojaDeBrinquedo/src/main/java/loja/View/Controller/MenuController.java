/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.View.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.MenuModel;
import loja.Dominio.DAO.MenuService;

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

    public static boolean update(MenuModel entity) {
        try {
            MenuService menuService = new MenuService();
            menuService.update(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean finishValidity(MenuModel cli) {
        try {
            MenuService menuService = new MenuService();
            menuService.finishValidity(cli);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static MenuModel findId(int id) {

        MenuModel cliente = new MenuModel();

        try {

            MenuService menu = new MenuService();
            cliente = menu.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    }

    public static List<MenuModel> findAll(MenuModel entity) {

        List<MenuModel> menus = new ArrayList<MenuModel>();

        try {

            MenuService menu = new MenuService();
            menus = menu.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return menus;
    }

    public static boolean save(MenuModel entity) {
        try {
            MenuService menu = new MenuService();
            return menu.save(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
