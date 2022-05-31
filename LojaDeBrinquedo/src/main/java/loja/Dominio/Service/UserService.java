package loja.Dominio.Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Interface.CrudService;
import loja.Dominio.Model.UserModel;
import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author gustavo.snasciment11
 */
public class UserService implements CrudService<UserModel> {

    private Connection conn;

    public UserService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<UserModel> findAll(UserModel entity) {
        List<UserModel> users = new ArrayList<UserModel>();
        try {

            String sql = "SELECT * FROM tb_usuario";
            String complemento = "";
            if (entity != null) {

                if (entity.getNome() != null && entity.getNome() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " nome = '" + entity.getNome() + "'";
                }

                if (entity.getCPF() != null && entity.getCPF() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " cpf = '" + entity.getCPF() + "'";
                }
                if (entity.getEmail() != null && entity.getEmail() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " email = '" + entity.getEmail() + "'";
                }
                if (entity.getPassword() != null && entity.getPassword() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " pass = '" + entity.getPassword() + "'";
                }
                if (entity.getIdPerfil() > 0) {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " id_perfil = " + entity.getIdPerfil();
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
                UserModel usu = new UserModel();

                usu.setCPF(rs.getString("cpf"));
                usu.setDtCad(rs.getDate("dt_inclusao"));
                usu.setDtDel(rs.getDate("dt_exclusao"));
                usu.setDtNasc(rs.getDate("dt_nasc"));
                usu.setEstadoCivil(rs.getString("est_civil"));
                usu.setEmail(rs.getString("email"));
                usu.setId(rs.getInt("id"));
                usu.setIdPerfil(rs.getInt("id_perfil"));
                usu.setNome(rs.getString("nome"));
                usu.setPassword(rs.getString("pass"));
                usu.setSexo(rs.getString("sexo"));
                usu.setUsuDel(rs.getInt("usu_exclusao"));
                usu.setUsuInclus(rs.getInt("usu_inclusao"));

                users.add(usu);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    @Override
    public boolean save(UserModel entity) {

        try {

            String sql = "INSERT INTO tb_usuario (id_perfil, nome, cpf, dt_nasc, email, pass, sexo, est_civil, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdPerfil());
            ps.setString(2, entity.getNome());
            ps.setString(3, entity.getCPF());
            java.sql.Date dtNasc = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(4, dtNasc);
            ps.setString(5, entity.getEmail());
            ps.setString(6, entity.getPassword());
            ps.setString(7, entity.getSexo());
            ps.setString(8, entity.getEstadoCivil());
            ps.setInt(9, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(10, dtCad);

            ps.execute();

            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public void delete(int id) {
        try {
            String sql = "DELETE FROM tb_usuario WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public UserModel findId(int id) {
        UserModel user = new UserModel();
        try {
            String sql = "SELECT * from tb_usuario where ID = " + id;
            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {

                user.setCPF(rs.getString("cpf"));
                user.setDtCad(rs.getDate("dt_inclusao"));
                user.setDtDel(rs.getDate("dt_exclusao"));
                user.setDtNasc(rs.getDate("dt_nasc"));
                user.setEstadoCivil(rs.getString("est_civil"));
                user.setEmail(rs.getString("email"));
                user.setId(rs.getInt("id"));
                user.setIdPerfil(rs.getInt("id_perfil"));
                user.setNome(rs.getString("nome"));
                user.setPassword(rs.getString("pass"));
                user.setSexo(rs.getString("sexo"));
                user.setUsuDel(rs.getInt("usu_exclusao"));
                user.setUsuInclus(rs.getInt("usu_inclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    @Override
    public boolean update(UserModel entity) {
        try {

            String sql = "update tb_usuario set id_perfil = ?, nome = ?, cpf = ?, dt_nasc = ?, email = ?, pass = ?, sexo = ?, est_civil = ?, usu_inclusao = ?, dt_inclusao = ? "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdPerfil());
            ps.setString(2, entity.getNome());
            ps.setString(3, entity.getCPF());
            java.sql.Date dtNasc = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(4, dtNasc);
            ps.setString(5, entity.getEmail());
            ps.setString(6, entity.getPassword());
            ps.setString(7, entity.getSexo());
            ps.setString(8, entity.getEstadoCivil());
            ps.setInt(9, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(10, dtCad);
            ps.setInt(11, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean finishValidity(UserModel entity) {
        try {

            String sql = "update tb_usuario set usu_exclusao = ?, dt_exclusao = ? "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            java.sql.Date dtExclu = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(2, dtExclu);
            ps.setInt(3, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
            String guts = ex.toString();
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
