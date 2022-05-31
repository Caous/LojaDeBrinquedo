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
import loja.Dominio.Model.FornecedorModel;
import loja.Dominio.Service.FornecedorService;

/**
 *
 * @author Gustavo Nascimento
 */
public class FornecedorController {

    public FornecedorController() {
    }

    public FornecedorController(FornecedorModel fornecedor) {
        this.forneced = fornecedor;
    }
    private FornecedorModel forneced;
    
    public static void delete(FornecedorModel produto) {

    }

    public static FornecedorModel findId(FornecedorModel fornecedor) {
        FornecedorModel fornecedores = new FornecedorModel();
        return fornecedores;
    }

    public static List<FornecedorModel> findAll( FornecedorModel entity) {

        List<FornecedorModel> fornecedores = new ArrayList<FornecedorModel>();
        
        try {
            FornecedorService fornecedor = new FornecedorService();
            fornecedores = fornecedor.findAll(entity);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return fornecedores;
    }

    public static boolean save(FornecedorModel fornecedor) {
        try {
            FornecedorService forneced = new FornecedorService();
            return forneced.save(fornecedor);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }

    public boolean update(FornecedorModel fornecedor) {
        try {
            FornecedorService forneced = new FornecedorService();
            forneced.update(fornecedor);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean finishValidity(FornecedorModel fornecedor) {
        try {
            FornecedorService fornecedserive = new FornecedorService();
            fornecedserive.finishValidity(fornecedor);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
