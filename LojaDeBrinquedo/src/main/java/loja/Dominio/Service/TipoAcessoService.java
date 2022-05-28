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
import loja.Dominio.Model.TipoAcessoModel;
import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author Gustavo Nascimento
 */
public class TipoAcessoService implements CrudService<TipoAcessoModel> {

    private Connection conn;

    public TipoAcessoService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<TipoAcessoModel> findAll(TipoAcessoModel entity) {
        List<TipoAcessoModel> acessos = new ArrayList<TipoAcessoModel>();

        try {

            String sql = "SELECT * FROM tb_acesso";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                TipoAcessoModel acesso = new TipoAcessoModel();

                acesso.setId(rs.getInt("id"));
                acesso.setIdMenu(rs.getInt("id_menu"));
                acesso.setIdPerfil(rs.getInt("id_perfil"));
                acesso.setDtCad(rs.getDate("dt_inclusao"));
                acesso.setUsuInclus(rs.getInt("usu_inclusao"));
                acesso.setUsuDel(rs.getInt("usu_exclusao"));
                acesso.setDtDel(rs.getDate("dt_exclusao"));

                acessos.add(acesso);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoAcessoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acessos;
    }

    @Override
    public boolean save(TipoAcessoModel entity) {

        try {

            String sql = "INSERT INTO tb_acesso (id_perfil, id_menu, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdPerfil());
            ps.setInt(2, entity.getIdMenu());
            ps.setInt(3, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(4, dtCad);

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoAcessoService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_acesso WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TipoAcessoModel findId(int id) {

        TipoAcessoModel acesso = new TipoAcessoModel();

        try {

            String sql = "SELECT * FROM tb_acesso";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                acesso.setId(rs.getInt("id"));
                acesso.setIdMenu(rs.getInt("id_menu"));
                acesso.setIdPerfil(rs.getInt("id_perfil"));
                acesso.setDtCad(rs.getDate("dt_inclusao"));
                acesso.setUsuInclus(rs.getInt("usu_inclusao"));
                acesso.setUsuDel(rs.getInt("usu_exclusao"));
                acesso.setDtDel(rs.getDate("dt_exclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TipoAcessoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return acesso;
    }

    @Override
    public boolean update(TipoAcessoModel entity) {
        try {

            String sql = "update tb_acesso set id_perfil = ?, id_menu = ?, usu_inclusao = ?, dt_inclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdPerfil());
            ps.setInt(2, entity.getIdMenu());
            ps.setInt(3, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(4, dtCad);

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(TipoAcessoService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean finishValidity(TipoAcessoModel entity) {
        try {

            String sql = "update tb_acesso set usu_exclusao = ?, dt_exclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            java.sql.Date dtDel = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(2, dtDel);
            ps.setInt(3, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(TipoAcessoService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}
