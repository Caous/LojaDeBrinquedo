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
import loja.Dominio.Model.ProdutoModel;
import loja.Infrastructure.DB.BDContext;

/**
 *
 * @author Gustavo Nascimento
 */
public class ProdutoService implements CrudService<ProdutoModel> {

    private Connection conn;

    public ProdutoService() throws ClassNotFoundException, SQLException {
        this.conn = BDContext.obterConexao();
    }

    @Override
    public List<ProdutoModel> findAll() {
        List<ProdutoModel> produtos = new ArrayList<ProdutoModel>();

        try {

            String sql = "SELECT * FROM tb_produto";

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ProdutoModel produto = new ProdutoModel();

                produto.setId(rs.getInt("id"));
                produto.setIdFornecedor(rs.getInt("id_fornecedor"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setMarca(rs.getString("marca"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setValor(rs.getInt("valor"));
                produto.setDescricaoProduto(rs.getString("descricao"));
                produto.setAvaliacao(rs.getInt("avaliacao"));
                produto.setComentario(rs.getString("comentario"));
                produto.setDtValidade(rs.getDate("validade"));
                produto.setPorcentagemDesc(rs.getInt("porcentagem_desc"));
                produto.setUsuInclus(rs.getInt("usu_inclusao"));
                produto.setDtCad(rs.getDate("dt_inclusao"));
                produto.setUsuDel(rs.getInt("usu_exclusao"));
                produto.setDtDel(rs.getDate("dt_exclusao"));

                produtos.add(produto);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }

    @Override
    public ProdutoModel save(ProdutoModel entity) {

        try {

            String sql = "INSERT INTO tb_produto (id_fornecedor, nome, categoria, marca, qtd, valor, descricao, avaliacao, comentario, validade, porcentagem_desc, usu_inclusao, dt_inclusao)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdFornecedor());
            ps.setString(2, entity.getNomeProduto());
            ps.setString(3, entity.getCategoria());
            ps.setString(4, entity.getMarca());
            ps.setInt(5, entity.getQtd());
            ps.setDouble(6, entity.getValor());
            ps.setString(7, entity.getDescricaoProduto());
            ps.setInt(8, entity.getAvaliacao());
            ps.setString(9, entity.getComentario());
            java.sql.Date dtVencimento = new java.sql.Date(entity.getDtValidade().getTime());
            ps.setDate(10, dtVencimento);
            ps.setDouble(11, entity.getPorcentagemDesc());
            ps.setInt(12, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(13, dtCad);

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
            String sql = "DELETE FROM tb_produto WHERE id = " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ProdutoModel findId(int id) {

        ProdutoModel produto = new ProdutoModel();

        try {

            String sql = "SELECT * FROM tb_produto WHERE id =  " + id;

            PreparedStatement ps = this.conn.prepareStatement(sql,
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                produto.setId(rs.getInt("id"));
                produto.setIdFornecedor(rs.getInt("id_fornecedor"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setMarca(rs.getString("marca"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setValor(rs.getInt("valor"));
                produto.setDescricaoProduto(rs.getString("descricao"));
                produto.setAvaliacao(rs.getInt("avaliacao"));
                produto.setComentario(rs.getString("comentario"));
                produto.setDtValidade(rs.getDate("validade"));
                produto.setPorcentagemDesc(rs.getInt("porcentagem_desc"));
                produto.setUsuInclus(rs.getInt("usu_inclusao"));
                produto.setDtCad(rs.getDate("dt_inclusao"));
                produto.setUsuDel(rs.getInt("usu_exclusao"));
                produto.setDtDel(rs.getDate("dt_exclusao"));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produto;
    }

    @Override
    public boolean update(ProdutoModel entity) {
        try {

            String sql = "update tb_produto set tb_cliente id_fornecedor = ?, nome = ?, categoria = ?, marca = ?, qtd = ?, valor = ?, descricao = ?, avaliacao = ?, comentario = ?, validade = ?, porcentagem_desc = ?, usu_inclusao = ?, dt_inclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getIdFornecedor());
            ps.setString(2, entity.getNomeProduto());
            ps.setString(3, entity.getCategoria());
            ps.setString(4, entity.getMarca());
            ps.setInt(5, entity.getQtd());
            ps.setDouble(6, entity.getValor());
            ps.setString(7, entity.getDescricaoProduto());
            ps.setInt(8, entity.getAvaliacao());
            ps.setString(9, entity.getComentario());
            java.sql.Date dtVencimento = new java.sql.Date(entity.getDtValidade().getTime());
            ps.setDate(10, dtVencimento);
            ps.setDouble(11, entity.getPorcentagemDesc());
            ps.setInt(12, entity.getUsuInclus());
            java.sql.Date dtCad = new java.sql.Date(entity.getDtCad().getTime());
            ps.setDate(13, dtCad);
            ps.setInt(14, entity.getId());

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
    public boolean finishValidity(ProdutoModel entity) {
         try {

            String sql = "update tb_produto set tb_produto usu_exclusao = ?, dt_exclusao = ?"
                    + "  where id = ?";

            PreparedStatement ps = this.conn.prepareStatement(sql);

            ps.setInt(1, entity.getUsuDel());           
            java.sql.Date dtDel = new java.sql.Date(entity.getDtDel().getTime());
            ps.setDate(2, dtDel);
            ps.setInt(3, entity.getId());

            ps.execute();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return false;
        }
        return true;
    }

}
