package loja.View.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.ItemVendaModel;
import loja.Dominio.DAO.ItemVendaService;

public class ItemVendaController {

    public ItemVendaController() {
    }

    public ItemVendaController(ItemVendaModel entity) {
        this._entity = entity;
    }

    ItemVendaModel _entity;

    public static void delete(ItemVendaModel entity) {

    }

    public static ItemVendaModel findId(int id) {

        ItemVendaModel itemVenda = new ItemVendaModel();

        try {
            ItemVendaService itemVendaC = new ItemVendaService();
            itemVenda = itemVendaC.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return itemVenda;
    }

    public static List<ItemVendaModel> findAll(ItemVendaModel entity) {

        List<ItemVendaModel> itemVendas = new ArrayList<ItemVendaModel>();

        try {
            ItemVendaService itemVendaC = new ItemVendaService();
            itemVendas = itemVendaC.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return itemVendas;
    }

    public static boolean save(ItemVendaModel entity) {

        try {
            ItemVendaService itemVendaC = new ItemVendaService();
            return itemVendaC.save(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    public boolean update(ItemVendaModel entity) {
        try {
            ItemVendaService itemVendaC = new ItemVendaService();
            itemVendaC.update(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean finishValidity(ItemVendaModel entity) {
        try {
            ItemVendaService itemVendaC = new ItemVendaService();
            itemVendaC.finishValidity(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ItemVendaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
