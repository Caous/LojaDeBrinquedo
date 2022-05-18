package loja.lojadebrinquedoteste;

import loja.Infrastructure.DB.BDContext;

public class main {

    public static void main(String[] args) throws Exception {

        java.sql.Connection conn = BDContext.obterConexao();
        System.out.println("foi");
    }
}
