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
import loja.Dominio.Model.PerfilModel;
import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author Gustavo Nascimento
 */
public class PerfilService implements CrudService<PerfilModel> {

    private Connection conn;

    public PerfilService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<PerfilModel> findAll(PerfilModel entity) {
        
        List<PerfilModel> perfis = new ArrayList<PerfilModel>();

        try {

            String sql = "SELECT * FROM tb_perfil";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                PerfilModel perfil = new PerfilModel();

                perfil.setId(rs.getInt("id"));
                perfil.setPerfile(rs.getString("nome"));
                perfil.setDescPerfil(rs.getString("descricao"));
                perfil.setDtCad(rs.getDate("dt_inclusao"));
                perfil.setUsuInclus(rs.getInt("usu_inclusao"));
                perfil.setUsuDel(rs.getInt("usu_exclusao"));
                perfil.setDtDel(rs.getDate("dt_exclusao"));

                perfis.add(perfil);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perfis;
    }

    @Override
    public PerfilModel save(PerfilModel entity) {
        
        try {

            String sql = "INSERT INTO tb_perfil (nome, descricao, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setString(1, entity.getPerfil());
            ps.setString(2, entity.getDescPerfil());
            ps.setInt(3, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(4, dtCad);

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);

        }
        return entity;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_perfil WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PerfilModel findId(int id) {
        PerfilModel perfil = new PerfilModel();

        try {

            String sql = "SELECT * FROM tb_perfil WHERE id = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            if (rs.first()) {

                perfil.setId(rs.getInt("id"));
                perfil.setPerfile(rs.getString("nome"));
                perfil.setDescPerfil(rs.getString("descricao"));
                perfil.setDtCad(rs.getDate("dt_inclusao"));
                perfil.setUsuInclus(rs.getInt("usu_inclusao"));
                perfil.setUsuDel(rs.getInt("usu_exclusao"));
                perfil.setDtDel(rs.getDate("dt_exclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return perfil;
    }

    @Override
    public boolean update(PerfilModel entity) {
         try {

            String sql = "update tb_perfil set nome = ?, descricao = ?, usu_inclusao = ?, dt_inclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

             ps.setString(1, entity.getPerfil());
            ps.setString(2, entity.getDescPerfil());
            ps.setInt(3, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
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
    public boolean finishValidity(PerfilModel entity) {
         try {

            String sql = "update tb_perfil set usu_exclusao = ?, dt_exclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            java.sql.Date dtExclu = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(2, dtExclu);            
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
