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
import loja.Dominio.Model.TipoPagamentoModel;
import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author Gustavo Nascimento
 */
public class TipoPagamentoService implements CrudService<TipoPagamentoModel> {

    public TipoPagamentoService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    Connection conn;

    @Override
    public List<TipoPagamentoModel> findAll(TipoPagamentoModel entity) {

        List<TipoPagamentoModel> pagamentos = new ArrayList<TipoPagamentoModel>();

        try {

            String sql = "SELECT * FROM tb_pagamento";
            String complemento = "";

            if (entity != null) {

                if (entity.getDescPagamento() != null && entity.getDescPagamento() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " descricao = '" + entity.getDescPagamento() + "'";
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

                TipoPagamentoModel pagamento = new TipoPagamentoModel();

                pagamento.setId(rs.getInt("id"));
                pagamento.setDescPagamento(rs.getString("descricao"));
                pagamento.setDtCad(rs.getDate("dt_inclusao"));
                pagamento.setDtDel(rs.getDate("dt_exclusao"));
                pagamento.setUsuDel(rs.getInt("usu_exclusao"));
                pagamento.setUsuInclus(rs.getInt("usu_inclusao"));

                pagamentos.add(pagamento);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoPagamentoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pagamentos;
    }

    @Override
    public boolean save(TipoPagamentoModel entity) {

        try {

            String sql = "INSERT INTO tb_pagamento ( descricao, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, entity.getDescPagamento());
            ps.setInt(2, entity.getUsuInclus());
            Date dt = new Date();
            java.sql.Date dtCad = new java.sql.Date(dt.getTime());
            ps.setDate(3, dtCad);

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoPagamentoService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_pagamento WHERE id = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoPagamentoService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TipoPagamentoModel findId(int id) {
        TipoPagamentoModel pagamento = new TipoPagamentoModel();
        try {
            String sql = "SELECT * from tb_pagamento where ID = " + id;
            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {

                pagamento.setId(rs.getInt("id"));
                pagamento.setDescPagamento(rs.getString("descricao"));
                pagamento.setDtCad(rs.getDate("dt_inclusao"));
                pagamento.setDtDel(rs.getDate("dt_exclusao"));
                pagamento.setUsuDel(rs.getInt("usu_exclusao"));
                pagamento.setUsuInclus(rs.getInt("usu_inclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pagamento;
    }

    @Override
    public boolean update(TipoPagamentoModel entity) {
        try {

            String sql = "update tb_pagamento set descricao = ?, usu_inclusao = ?, dt_inclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, entity.getDescPagamento());
            ps.setInt(2, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(3, dtCad);
            ps.setInt(4, entity.getId());

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
    public boolean finishValidity(TipoPagamentoModel entity) {
        try {

            String sql = "update tb_pagamento set usu_exclusao = ?, dt_exclusao = ? "
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
