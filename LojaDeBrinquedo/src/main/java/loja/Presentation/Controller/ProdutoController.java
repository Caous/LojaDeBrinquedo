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
import loja.Dominio.Model.ProdutoModel;
import loja.Dominio.Service.ProdutoService;

/**
 *
 * @author Gustavo Nascimento
 */
public class ProdutoController {
     public ProdutoController() {
    }

    public ProdutoController(ProdutoModel produto) {
        this._produto = produto;
    }    
    
    ProdutoModel _produto;

    public static void delete(ProdutoModel produto) {

    }

    public static ProdutoModel finId(int id) {
        ProdutoModel produtos = new ProdutoModel();
        
         try {
             ProdutoService prod = new ProdutoService();
             produtos = prod.findId(id);
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return produtos;
    }

    public static List<ProdutoModel> findAll(ProdutoModel entity) {

        List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();
        
         try {
             ProdutoService prod = new ProdutoService();
             produtos = prod.findAll(entity);
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         }

        return produtos;
    }

    public static boolean save(ProdutoModel prodModel) {
        
         try {
             ProdutoService prod = new ProdutoService();
             return prod.save(prodModel);
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;

    }
    
    public static boolean update(ProdutoModel produto){
        
         try {
             ProdutoService prod = new ProdutoService();
             prod.update(produto);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        return false;
    }

    public boolean finishValidity(ProdutoModel prod) {
        
         try {
             ProdutoService prodserice = new ProdutoService();
             prodserice.finishValidity(prod);
             return true;
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
         }
         return false;
    }
}
