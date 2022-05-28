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
import loja.Dominio.Model.VendaModel;
import loja.Infrastructure.DB.BDContext;

public class VendaService implements CrudService<VendaModel> {

    private Connection conn;

    public VendaService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<VendaModel> findAll(VendaModel entity) {

        List<VendaModel> vendas = new ArrayList<VendaModel>();

        try {

            String sql = "SELECT * FROM tb_venda";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                VendaModel venda = new VendaModel();

                venda.setId(rs.getInt("id"));
                // venda.setIdProd(rs.getInt("id_produto"));
                venda.setIdCli(rs.getInt("id_cliente"));
                venda.setTipoPagamento(rs.getInt("id_tipo_pagamento"));
                venda.setQtdePrd(rs.getInt("qtd_produto"));
                venda.setValorPrd(rs.getInt("vlr_produto"));
                venda.setValorTotal(rs.getInt("vlr_total"));
                venda.setPctDesconto(rs.getInt("vlr_desconto"));
                venda.setValorDesconto(rs.getInt("pct_desconto"));
                venda.setIdUsuVend(rs.getInt("usu_inclusao"));
                venda.setDtCad(rs.getDate("dt_inclusao"));
                venda.setUsuDel(rs.getInt("usu_exclusao"));
                venda.setDtDel(rs.getDate("dt_exclusao"));

                vendas.add(venda);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendas;
    }

    @Override
    public boolean save(VendaModel entity) {

        try {

            String sql = "INSERT INTO tb_venda (id_produto, id_cliente, id_tipo_pagamento, qtd_produto, vlr_produto , vlr_total , vlr_desconto, pct_descont,usu_inclusao,dt_inclusao)"
                    + " values (?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            //ps.setInt(1, entity.getid);
            ps.setInt(2, entity.getIdCli());
            ps.setInt(3, entity.getTipoPagamento());
            ps.setInt(4, entity.getQtdePrd());
            //ps.setInt(5, entity.getValorPrd());
            // ps.setInt(6, entity.getValorTotal());
            ps.setInt(7, entity.getValorDesconto());
            ps.setInt(8, entity.getPctDesconto());
            ps.setInt(9, entity.getUsuInclus());
            java.sql.Date dtInclusao = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(10, dtInclusao);

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_venda WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public VendaModel findId(int id) {
        VendaModel venda = new VendaModel();
        try {
            String sql = "SELECT * from tb_venda where ID = " + id;
            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {

                venda.setId(rs.getInt("id"));
                // venda.setIdProd(rs.getInt("id_produto"));
                venda.setIdCli(rs.getInt("id_cliente"));
                venda.setTipoPagamento(rs.getInt("id_tipo_pagamento"));
                venda.setQtdePrd(rs.getInt("qtd_produto"));
                venda.setValorPrd(rs.getInt("vlr_produto"));
                venda.setValorTotal(rs.getInt("vlr_total"));
                venda.setPctDesconto(rs.getInt("vlr_desconto"));
                venda.setValorDesconto(rs.getInt("pct_desconto"));
                venda.setIdUsuVend(rs.getInt("usu_inclusao"));
                venda.setDtCad(rs.getDate("dt_inclusao"));
                venda.setUsuDel(rs.getInt("usu_exclusao"));
                venda.setDtDel(rs.getDate("dt_exclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;
    }

    @Override
    public boolean update(VendaModel entity) {
        try {

            String sql = "update tb_venda set tb_venda id_produto = ?, id_cliente = ?, id_tipo_pagamento = ? , qtd_produto = ?, vlr_produto = ?, vlr_total = ?, vlr_desconto = ?, pct_desconto = ?, usu_inclusao = ? , dt_inclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            //ps.setInt(1, entity.getid);
            ps.setInt(2, entity.getIdCli());
            ps.setInt(3, entity.getTipoPagamento());
            ps.setInt(4, entity.getQtdePrd());
            //ps.setInt(5, entity.getValorPrd());
            // ps.setInt(6, entity.getValorTotal());
            ps.setInt(7, entity.getValorDesconto());
            ps.setInt(8, entity.getPctDesconto());
            ps.setInt(9, entity.getUsuInclus());
            java.sql.Date dtInclusao = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(10, dtInclusao);
            ps.setInt(11, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(VendaService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean finishValidity(VendaModel entity) {
        try {

            String sql = "update tb_venda set usu_exclusao = ?, dt_exclusao = ?  "
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
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
