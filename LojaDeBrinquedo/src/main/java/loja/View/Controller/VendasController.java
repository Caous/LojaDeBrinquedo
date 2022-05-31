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
import loja.Dominio.Model.VendaModel;
import loja.Dominio.DAO.VendaService;

/**
 *
 * @author Gustavo Nascimento
 */
public class VendasController {

    public VendasController() {
    }

    public VendasController(VendaModel entity) {
        this._entity = entity;
    }

    VendaModel _entity;

    public static void delete(VendaModel entity) {

    }

    public static VendaModel findId(int id) {

        VendaModel vendaService = new VendaModel();

        try {
            VendaService vendaC = new VendaService();
            vendaService = vendaC.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vendaService;
    }

    public static List<VendaModel> findAll(VendaModel entity) {

        List<VendaModel> vendas = new ArrayList<VendaModel>();

        try {
            VendaService vendaC = new VendaService();
            vendas = vendaC.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return vendas;
    }

    public static boolean save(VendaModel entity) {

        try {
            VendaService vendaC = new VendaService();
            return vendaC.save(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean update(VendaModel entity) {
        try {
            VendaService vendaC = new VendaService();
            vendaC.update(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean finishValidity(VendaModel entity) {
        try {
            VendaService vendaC = new VendaService();
            vendaC.finishValidity(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
