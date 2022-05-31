/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja.Dominio.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
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
            String complemento = "";

            if (entity != null) {

                if (entity.getMenu() != null && entity.getMenu() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " nome = '" + entity.getMenu() + "'";
                }

                if (entity.getDescMenu() != null && entity.getDescMenu() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " descricao = '" + entity.getDescMenu() + "'";
                }

                if (entity.getUsuDel() == -1) {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " dt_exclusao IS NOT NULL";
                } else {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " dt_exclusao IS NULL";
                }
            }

            PreparedStatement ps = this.conn.prepareStatement(sql + complemento,
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
    public boolean save(MenuModel entity) {

        try {

            String sql = "INSERT INTO tb_menu (nome, descricao, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, entity.getMenu());
            ps.setString(2, entity.getDescMenu());
            ps.setInt(3, entity.getUsuInclus());
            Date dt = new Date();
            java.sql.Date dtCad = new java.sql.Date(dt.getTime());
            ps.setDate(4, dtCad);
            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;

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

            String sql = "UPDATE tb_menu SET nome = ?, descricao = ?, usu_inclusao = ?, dt_inclusao = ?"
                    + " where ID = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, entity.getMenu());
            ps.setString(2, entity.getDescMenu());
            ps.setInt(3, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(4, dtCad);
            ps.setInt(5, entity.getId());

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
        try {

            String sql = "update tb_menu set usu_exclusao = ?, dt_exclusao = ? "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            Date dt = new Date();
            java.sql.Date dtDel = new java.sql.Date(dt.getTime());
            ps.setDate(2, dtDel);
            ps.setInt(3, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
