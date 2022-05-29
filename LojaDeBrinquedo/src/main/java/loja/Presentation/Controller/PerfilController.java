/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Presentation.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.PerfilModel;
import loja.Dominio.Service.MenuService;
import loja.Dominio.Service.PerfilService;

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

    public static boolean update(PerfilModel entity) {
        try {
            PerfilService perfilService = new PerfilService();
            perfilService.update(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean finishValidity(PerfilModel entity) {
        try {
            PerfilService perfilService = new PerfilService();
            perfilService.finishValidity(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static PerfilModel findId(int id) {

        PerfilModel perfils = new PerfilModel();

        try {

            PerfilService perfilService = new PerfilService();
            perfils = perfilService.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return perfils;
    }

    public static List<PerfilModel> findAll(PerfilModel entity) {

        List<PerfilModel> menus = new ArrayList<PerfilModel>();

        try {

            PerfilService perfilService = new PerfilService();
            menus = perfilService.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return menus;
    }

    public static boolean save(PerfilModel entity) {
        try {
            PerfilService perfilService = new PerfilService();
            return perfilService.save(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
