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
    public List<TipoPagamentoModel> findAll() {
        List<TipoPagamentoModel> pagamentos = new ArrayList<TipoPagamentoModel>();

        try {

            String sql = "SELECT * FROM tb_cliente";

            PreparedStatement ps = this.conn.prepareStatement(sql,
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
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pagamentos;
    }

    @Override
    public TipoPagamentoModel save(TipoPagamentoModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TipoPagamentoModel findId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(TipoPagamentoModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean finishValidity(TipoPagamentoModel entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
