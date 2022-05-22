/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Dominio.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Interface.CrudService;
import loja.Dominio.Model.ClienteModel;
import loja.Dominio.Model.MenuModel;
import loja.Infrastructure.DB.BDContext;

public class MenuService implements CrudService<MenuModel> {

    private Connection conn;

    public MenuService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    public List<MenuModel> findAll(MenuModel entity) {

        List<MenuModel> menus = new ArrayList<MenuModel>();

        try {

            String sql = "SELECT * FROM tb_menu";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                MenuModel menu = new MenuModel();

                menu.setId(rs.getInt("id"));
                menu.setMenu(rs.getString("nome"));
                menu.setDescMenu(rs.getString("descricao"));
                menu.setUsuInclus(rs.getInt("usu_inclusao"));
                menu.setUsuDel(rs.getInt("usu_exclusao"));
                menu.setDtCad(rs.getDate("dt_inclusao"));

                menus.add(menu);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return menus;
    }

    @Override
    public MenuModel save(MenuModel entity) {

        try {

            String sql = "INSERT INTO tb_menu (Id, nome, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getId());
            ps.setString(2, entity.getMenu());
            ps.setString(3, entity.getDescMenu());
            ps.setInt(4, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());

            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);

        }
        return entity;

    }

    @Override
    public void delete(int id) {
         try {
            String sql = "DELETE FROM tb_menu WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public MenuModel findId(int id) {
     
        MenuModel menu = new MenuModel();
        try {
            String sql = "SELECT * from tb_menu where ID = " + id;
            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {

                menu.setId(rs.getInt("id"));
                menu.setMenu(rs.getString("nome"));
                menu.setDescMenu(rs.getString("descricao"));
                menu.setDtCad(rs.getDate("dt_inclusao"));
                menu.setUsuInclus(rs.getInt("usu_inclusao"));
                menu.setUsuDel(rs.getInt("usu_exclusao"));
                menu.setDtDel(rs.getDate("dt_exclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return menu;

    }

    @Override
    public boolean update(MenuModel entity) {
       
        try {

            String sql = "UPDATE tb_menu SET WHERE (Id, nome, usu_inclusao, dt_inclusao, usu_exclusao, dt_exclusao)"
                    + " values (?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getId());
            ps.setString(2, entity.getMenu());
            ps.setString(3, entity.getDescMenu());
            ps.setInt(4, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());

            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);

        }
        return true;

    }

    @Override
    public boolean finishValidity(MenuModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
