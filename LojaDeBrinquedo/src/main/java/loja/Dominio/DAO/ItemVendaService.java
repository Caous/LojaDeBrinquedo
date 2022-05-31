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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Interface.CrudService;
import loja.Dominio.Model.ItemVendaModel;

import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author Gustavo Nascimento
 */
public class ItemVendaService implements CrudService<ItemVendaModel> {

    private Connection conn;

    public ItemVendaService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<ItemVendaModel> findAll(ItemVendaModel entity) {

        List<ItemVendaModel> itens = new ArrayList<ItemVendaModel>();

        try {

            String sql = "SELECT * FROM tb_item_venda";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ItemVendaModel venda = new ItemVendaModel();

                venda.setId(rs.getInt("id"));
                venda.setIdProduto(rs.getInt("id_produto"));
                venda.setIdVenda(rs.getInt("id_venda"));
                venda.setqtdProduto(rs.getInt("qtd_produto"));
                venda.setvlrProduto(rs.getDouble("vlr_produto"));
                venda.setUsuInclus(rs.getInt("usu_inclusao"));
                venda.setDtCad(rs.getDate("dt_inclusao"));
                venda.setUsuDel(rs.getInt("usu_exclusao"));
                venda.setDtDel(rs.getDate("dt_exclusao"));

                itens.add(venda);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itens;
    }

    @Override
    public boolean save(ItemVendaModel entity) {
        try {

            String sql = "INSERT INTO tb_item_venda (id_venda, id_produto, usu_inclusao, qtd_produto, vlr_produto)"
                    + " values (?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdVenda());
            ps.setInt(2, entity.getIdProduto());
            ps.setInt(3, entity.getUsuInclus());
            ps.setInt(4, entity.getqtdProduto());
            ps.setDouble(5, entity.getvlrProduto());

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_item_venda WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ItemVendaModel findId(int id) {
        ItemVendaModel itemVenda = new ItemVendaModel();
        try {

            String sql = "SELECT * FROM tb_item_venda WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                itemVenda.setId(rs.getInt("id"));
                itemVenda.setIdProduto(rs.getInt("id_produto"));
                itemVenda.setIdVenda(rs.getInt("id_venda"));
                itemVenda.setqtdProduto(rs.getInt("qtd_produto"));
                itemVenda.setvlrProduto(rs.getDouble("vlr_produto"));
                itemVenda.setUsuInclus(rs.getInt("usu_inclusao"));
                itemVenda.setDtCad(rs.getDate("dt_inclusao"));
                itemVenda.setUsuDel(rs.getInt("usu_exclusao"));
                itemVenda.setDtDel(rs.getDate("dt_exclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemVenda;
    }

    @Override
    public boolean update(ItemVendaModel entity) {
        try {

            String sql = "update tb_item_venda set id_produto = ?, id_venda = ?, qtd_produto = ?, vlr_produto = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdProduto());
            ps.setInt(2, entity.getIdVenda());
            ps.setInt(3, entity.getIdProduto());
            ps.setDouble(4, entity.getvlrProduto());
            ps.setInt(5, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean finishValidity(ItemVendaModel entity) {
        try {

            String sql = "update tb_item_venda set usu_exclusao = ?, dt_exclusao = ?  "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            java.sql.Date dtExclu = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(2, dtExclu);
            ps.setInt(3, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
