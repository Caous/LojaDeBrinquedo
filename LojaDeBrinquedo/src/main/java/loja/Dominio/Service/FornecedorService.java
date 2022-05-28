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
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Interface.CrudService;
import loja.Dominio.Model.FornecedorModel;
import loja.Infrastructure.DB.BDContext;

public class FornecedorService implements CrudService<FornecedorModel> {

    private Connection conn;

    public FornecedorService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<FornecedorModel> findAll(FornecedorModel entity) {

        List<FornecedorModel> fornecedores = new ArrayList<FornecedorModel>();

        try {

            String sql = "SELECT * FROM tb_fornecedor";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                FornecedorModel forn = new FornecedorModel();

                forn.setId(rs.getInt("id"));
                forn.setCnpj(rs.getString("cpnj"));
                forn.setCEP(rs.getString("cep"));
                forn.setCelular(rs.getString("celular"));
                forn.setContatoResposavel(rs.getString("cont_resp"));
                forn.setDtCad(rs.getDate("dt_inclusao"));
                forn.setDtDel(rs.getDate("dt_exclusao"));
                forn.setDtNasc(rs.getDate("dt_nasc"));
                forn.setEM(rs.getInt("EM"));
                forn.setIM(rs.getInt("IM"));
                forn.setEmail(rs.getString("email"));
                forn.setEndereco(rs.getString("endereco"));
                forn.setEstado(rs.getString("estado"));
                forn.setMunicipio(rs.getString("municipio"));
                forn.setNome(rs.getString("nome"));
                forn.setNomeFantasia(rs.getString("nome_fantasia"));
                forn.setTelefone(rs.getString("telefone"));
                forn.setUsuDel(rs.getInt("usu_exclusao"));
                forn.setUsuInclus(rs.getInt("usu_inclusao"));
                forn.setDtNasc(rs.getDate("dt_nasc_cont"));

                fornecedores.add(forn);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fornecedores;
    }

    @Override
    public boolean save(FornecedorModel entity) {

        try {

            String sql = "INSERT INTO tb_fornecedor (dt_criacao, nome, nome_fantasia, cpnj, endereco, cep, estado, municipio, telefone, celular, email, cont_resp, dt_nasc_cont, IM, EM, dt_nasc, sexo, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(1, dtCad);
            ps.setString(2, entity.getNome());

            ps.setString(3, entity.getNomeFantasia());
            ps.setString(4, entity.getCnpj());
            ps.setString(5, entity.getEndereco());
            ps.setString(6, entity.getCEP());
            ps.setString(7, entity.getEstado());
            ps.setString(8, entity.getMunicipio());

            ps.setString(9, entity.getTelefone());
            ps.setString(10, entity.getCelular());
            ps.setString(11, entity.getEmail());
            ps.setString(12, entity.getContatoResposavel());
            java.sql.Date dtNasc = new java.sql.Date(entity.getDtNasc().getTime());
            ps.setDate(13, dtNasc);
            ps.setInt(14, entity.getIM());
            ps.setInt(15, entity.getEM());            
            ps.setDate(16, dtNasc);
            //ps.setInt(17, entity.getse());
            ps.setInt(18, entity.getUsuInclus());
            ps.setDate(19, dtCad);

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_fornecedor WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public FornecedorModel findId(int id) {
        FornecedorModel forn = new FornecedorModel();
        try {
            String sql = "SELECT * from tb_fornecedor where ID = " + id;
            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {

                forn.setId(rs.getInt("id"));
                forn.setCnpj(rs.getString("cpnj"));
                forn.setCEP(rs.getString("cep"));
                forn.setCelular(rs.getString("celular"));
                forn.setContatoResposavel(rs.getString("cont_resp"));
                forn.setDtCad(rs.getDate("dt_inclusao"));
                forn.setDtDel(rs.getDate("dt_exclusao"));
                forn.setDtNasc(rs.getDate("dt_nasc"));
                forn.setEM(rs.getInt("EM"));
                forn.setIM(rs.getInt("IM"));
                forn.setEmail(rs.getString("email"));
                forn.setEndereco(rs.getString("endereco"));
                forn.setEstado(rs.getString("estado"));
                forn.setMunicipio(rs.getString("municipio"));
                forn.setNome(rs.getString("nome"));
                forn.setNomeFantasia(rs.getString("nome_fantasia"));
                forn.setTelefone(rs.getString("telefone"));
                forn.setUsuDel(rs.getInt("usu_exclusao"));
                forn.setUsuInclus(rs.getInt("usu_inclusao"));
                forn.setDtNasc(rs.getDate("dt_nasc_cont"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return forn;
    }

    @Override
    public boolean update(FornecedorModel entity) {
        try {

            String sql = "update tb_fornecedor set tb_fornecedor nome = ?, nome_fantasia = ?, cpnj = ?, endereco = ?, cep = ?, estado = ?, municipio = ?, telefone = ?, celular = ?, email = ?, cont_resp = ?, dt_nasc_cont = ?, IM = ?, EM = ?,  usu_inclusao = ?, dt_inclusao = ? "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, entity.getNome());
            ps.setString(2, entity.getNomeFantasia());
            ps.setString(3, entity.getCnpj());
            ps.setString(4, entity.getEndereco());
            ps.setString(5, entity.getCEP());
            ps.setString(6, entity.getEstado());
            ps.setString(7, entity.getMunicipio());
            ps.setString(8, entity.getTelefone());
            ps.setString(9, entity.getCelular());
            ps.setString(10, entity.getEmail());
            ps.setString(11, entity.getContatoResposavel());            
            java.sql.Date dtNasc = new java.sql.Date(entity.getDtNasc().getTime());
            ps.setDate(12, dtNasc);
            ps.setInt(13, entity.getIM());
            ps.setInt(14, entity.getEM());
            ps.setInt(15, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(16, dtCad);
            ps.setInt(17, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean finishValidity(FornecedorModel entity) {
        try {

            String sql = "update tb_fornecedor set usu_exclusao = ?, dt_exclusao = ?  "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            java.sql.Date dtExclu = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(2, dtExclu);
            ps.setInt(3, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
