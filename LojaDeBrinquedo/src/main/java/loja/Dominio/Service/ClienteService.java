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
import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author Gustavo Nascimento
 */
public class ClienteService implements CrudService<ClienteModel> {

    private Connection conn;

    public ClienteService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<ClienteModel> findAll(ClienteModel entity) {

        List<ClienteModel> clientes = new ArrayList<ClienteModel>();

        try {

            String sql = "SELECT * FROM tb_cliente";
            String complemento = "";
            if (entity != null) {

                if (entity.getCpfCnpj() != null && entity.getCpfCnpj() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " cpfcpnj = '" + entity.getCpfCnpj() + "'";
                }
                if (entity.getEmail() != null && entity.getEmail() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " email = '" + entity.getEmail() + "'";
                }
                if (entity.getNome() != null && entity.getNome() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " nome = '" + entity.getNome() + "'";
                }
                if (entity.getNomeFantasia() != null && entity.getNomeFantasia() != "") {
                    if (complemento == "") {
                        complemento = complemento + " Where ";
                    } else {
                        complemento = complemento + " AND ";
                    }
                    complemento = complemento + " nome_fantasia = " + entity.getNomeFantasia();
                }

            }

            PreparedStatement ps = this.conn.prepareStatement(sql + complemento,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ClienteModel cli = new ClienteModel();

                cli.setId(rs.getInt("id"));
                cli.setCpfCnpj(rs.getString("cpfcpnj"));
                cli.setTipoCliente(rs.getInt("tipo_pessoa"));
                cli.setCEP(rs.getString("cep"));
                cli.setCelular(rs.getString("celular"));
                cli.setContatoResposavel(rs.getString("cont_resp"));
                cli.setDtCad(rs.getDate("dt_inclusao"));
                cli.setDtDel(rs.getDate("dt_exclusao"));
                cli.setDtNasc(rs.getDate("dt_nasc"));
                cli.setEM(rs.getString("EM"));
                cli.setIM(rs.getString("IM"));
                cli.setEmail(rs.getString("email"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setEstado(rs.getString("estado"));
                cli.setEstadoCivil(rs.getInt("est_civil"));
                cli.setMunicipio(rs.getString("municipio"));
                cli.setNome(rs.getString("nome"));
                cli.setNomeFantasia(rs.getString("nome_fantasia"));
                cli.setSexo(rs.getString("sexo"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setUsuDel(rs.getInt("usu_exclusao"));
                cli.setUsuInclus(rs.getInt("usu_inclusao"));

                clientes.add(cli);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    @Override
    public ClienteModel save(ClienteModel entity) {

        try {

            String sql = "INSERT INTO tb_cliente (tipo_pessoa, nome, nome_fantasia, cpfcpnj, endereco, cep, estado, municipio, telefone, celular, email, cont_resp, est_civil, IM, EM, dt_nasc, sexo, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getTipoCliente());
            ps.setString(2, entity.getNome());

            ps.setString(3, entity.getNomeFantasia());
            ps.setString(4, entity.getCpfCnpj());
            ps.setString(5, entity.getEndereco());
            ps.setString(6, entity.getCEP());
            ps.setString(7, entity.getEstado());
            ps.setString(8, entity.getMunicipio());

            ps.setString(9, entity.getTelefone());
            ps.setString(10, entity.getCelular());
            ps.setString(11, entity.getEmail());
            ps.setString(12, entity.getContatoResposavel());
            ps.setInt(13, entity.getEstadoCivil());
            ps.setString(14, entity.getIM());
            ps.setString(15, entity.getEM());
            java.sql.Date dtNasc = new java.sql.Date(entity.getDtNasc().getTime());
            ps.setDate(16, dtNasc);
            ps.setString(17, entity.getSexo());
            ps.setInt(18, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(19, dtCad);

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
            String sql = "DELETE FROM tb_cliente WHERE ID = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ClienteModel findId(int id) {
        ClienteModel cli = new ClienteModel();
        try {
            String sql = "SELECT * from tb_cliente where ID = " + id;
            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps.executeQuery();

            if (rs.first()) {

                cli.setId(rs.getInt("id"));
                cli.setCpfCnpj(rs.getString("cpfcpnj"));
                cli.setTipoCliente(rs.getInt("tipo_pessoa"));
                cli.setCEP(rs.getString("cep"));
                cli.setCelular(rs.getString("celular"));
                cli.setContatoResposavel(rs.getString("cont_resp"));
                cli.setDtCad(rs.getDate("dt_inclusao"));
                cli.setDtDel(rs.getDate("dt_exclusao"));
                cli.setDtNasc(rs.getDate("dt_nasc"));
                cli.setEM(rs.getString("EM"));
                cli.setIM(rs.getString("IM"));
                cli.setEmail(rs.getString("email"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setEstado(rs.getString("estado"));
                cli.setEstadoCivil(rs.getInt("est_civil"));
                cli.setMunicipio(rs.getString("municipio"));
                cli.setNome(rs.getString("nome"));
                cli.setNomeFantasia(rs.getString("nome_fantasia"));
                cli.setSexo(rs.getString("sexo"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setUsuDel(rs.getInt("usu_exclusao"));
                cli.setUsuInclus(rs.getInt("usu_inclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cli;
    }

    @Override
    public boolean update(ClienteModel entity) {
        try {

            String sql = "update tb_cliente set tb_cliente tipo_pessoa = ?, nome = ?, nome_fantasia = ?, cpfcpnj = ?, endereco = ?, cep = ?, estado = ?, municipio = ?, telefone = ?, celular = ?, email = ?, cont_resp = ?, est_civil = ?, IM = ?, EM = ?, dt_nasc = ?, sexo = ?, usu_inclusao = ?, dt_inclusao = ?, usu_exclusao = ?, dt_exclusao = ?  "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getTipoCliente());
            ps.setString(2, entity.getNome());

            ps.setString(3, entity.getNomeFantasia());
            ps.setString(4, entity.getCpfCnpj());
            ps.setString(5, entity.getEndereco());
            ps.setString(6, entity.getCEP());
            ps.setString(7, entity.getEstado());
            ps.setString(8, entity.getMunicipio());

            ps.setString(9, entity.getTelefone());
            ps.setString(10, entity.getCelular());
            ps.setString(11, entity.getEmail());
            ps.setString(12, entity.getContatoResposavel());
            ps.setInt(13, entity.getEstadoCivil());
            ps.setString(14, entity.getIM());
            ps.setString(15, entity.getEM());
            java.sql.Date dtNasc = new java.sql.Date(entity.getDtNasc().getTime());
            ps.setDate(16, dtNasc);
            ps.setString(17, entity.getSexo());
            ps.setInt(18, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(19, dtCad);
            ps.setInt(20, entity.getUsuDel());
            java.sql.Date dtExclu = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(21, dtExclu);
            ps.setInt(22, entity.getId());

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
    public boolean finishValidity(ClienteModel entity) {
        try {

            String sql = "update tb_cliente set usu_exclusao = ?, dt_exclusao = ?  "
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());
            java.sql.Date dtExclu = new java.sql.Date(entity.getDtDel().getTime());
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
