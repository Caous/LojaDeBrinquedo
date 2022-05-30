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
import loja.Dominio.Model.TipoAcessoModel;
import loja.Dominio.Service.TipoAcessoService;

/**
 *
 * @author Gustavo Nascimento
 */
public class AcessoController {

    public AcessoController() {
    }

    public AcessoController(TipoAcessoModel acesso) {
        this._acesso = acesso;
    }

    TipoAcessoModel _acesso;

    public static void Excluir(TipoAcessoModel perfil) {

    }

    public static boolean update(TipoAcessoModel entity) {
        try {
            TipoAcessoService acessoService = new TipoAcessoService();
            acessoService.update(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean finishValidity(TipoAcessoModel entity) {
        try {
            TipoAcessoService acessoService = new TipoAcessoService();
            acessoService.finishValidity(entity);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static TipoAcessoModel findId(int id) {

        TipoAcessoModel perfils = new TipoAcessoModel();

        try {

            TipoAcessoService acessoService = new TipoAcessoService();
            perfils = acessoService.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return perfils;
    }

    public static List<TipoAcessoModel> findAll(TipoAcessoModel entity) {

        List<TipoAcessoModel> acessos = new ArrayList<TipoAcessoModel>();

        try {

            TipoAcessoService acessoService = new TipoAcessoService();
            acessos = acessoService.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return acessos;
    }

    public static boolean save(TipoAcessoModel entity) {
        try {
            TipoAcessoService acessoService = new TipoAcessoService();
            return acessoService.save(entity);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AcessoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
