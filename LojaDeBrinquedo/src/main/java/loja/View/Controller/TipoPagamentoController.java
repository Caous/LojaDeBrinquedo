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
import loja.Dominio.Model.TipoPagamentoModel;
import loja.Dominio.DAO.TipoPagamentoService;

/**
 *
 * @author Gustavo Nascimento
 */
public class TipoPagamentoController {

    public TipoPagamentoController() {
    }

    public TipoPagamentoController(TipoPagamentoModel tipoPagamento) {
        this._tipoPagamento = tipoPagamento;
    }

    TipoPagamentoModel _tipoPagamento;

    public static void Excluir(TipoPagamentoModel perfil) {

    }

    public static boolean update(TipoPagamentoModel entity) {
        try {
            TipoPagamentoService tipoPagamentoService = new TipoPagamentoService();
            tipoPagamentoService.update(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean finishValidity(TipoPagamentoModel entity) {
        try {
            TipoPagamentoService tipoPagamentoService = new TipoPagamentoService();;
            tipoPagamentoService.finishValidity(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static TipoPagamentoModel findId(int id) {

        TipoPagamentoModel perfils = new TipoPagamentoModel();

        try {

            TipoPagamentoService tipoPagamentoService = new TipoPagamentoService();
            perfils = tipoPagamentoService.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return perfils;
    }

    public static List<TipoPagamentoModel> findAll(TipoPagamentoModel entity) {

        List<TipoPagamentoModel> acessos = new ArrayList<TipoPagamentoModel>();

        try {

            TipoPagamentoService tipoPagamentoService = new TipoPagamentoService();
            acessos = tipoPagamentoService.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return acessos;
    }

    public static boolean save(TipoPagamentoModel entity) {
        try {
            TipoPagamentoService tipoPagamentoService = new TipoPagamentoService();
            return tipoPagamentoService.save(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
