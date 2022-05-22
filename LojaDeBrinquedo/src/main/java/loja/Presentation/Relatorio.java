/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loja.Presentation;

import javax.swing.JFrame;

/**
 *
 * @author Gustavo Nascimento
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatório
     */
    public Relatorio() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnProduto = new javax.swing.JPanel();
        txtValorProduto = new javax.swing.JTextField();
        txtPorcentagem = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblProdutos = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtFornecedor1 = new javax.swing.JTextField();
        txtPorcentagem1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnProduto.setBackground(new java.awt.Color(79, 109, 234));

        txtValorProduto.setBackground(new java.awt.Color(79, 109, 234));
        txtValorProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtValorProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtValorProduto.setText("12/12/9999");
        txtValorProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dt. Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtPorcentagem.setBackground(new java.awt.Color(79, 109, 234));
        txtPorcentagem.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        txtPorcentagem.setText("0");
        txtPorcentagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porcentagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtQtd.setBackground(new java.awt.Color(79, 109, 234));
        txtQtd.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtQtd.setForeground(new java.awt.Color(255, 255, 255));
        txtQtd.setText("0");
        txtQtd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtNomeProduto.setBackground(new java.awt.Color(79, 109, 234));
        txtNomeProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProduto.setText("Administrador");
        txtNomeProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jTable1.setBackground(new java.awt.Color(64, 87, 184));
        jTable1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bola de futebol", "10", "69,90", "Nike", "Nike", "5", "R$ 1.526,00"},
                {"Boneca", "5", "120,00", "Barbie", "Happy", "0", "R$ 50,00"},
                {"Nerf", "2", "50,00", "Nerf", "Disneylandia", "2", "R$ 5,00"}
            },
            new String [] {
                "Nome", "Qtd", "Valor", "Marca", "Fornecedor", "Desconto", "Valor Total"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(64, 87, 184));
        jTable1.setSelectionForeground(new java.awt.Color(64, 87, 184));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        lblProdutos.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setText("Relatório");

        btnPesquisar.setBackground(new java.awt.Color(51, 153, 0));
        btnPesquisar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setOpaque(true);

        txtCategoria.setBackground(new java.awt.Color(79, 109, 234));
        txtCategoria.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtCategoria.setText("Futebol");
        txtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtMarca.setBackground(new java.awt.Color(79, 109, 234));
        txtMarca.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setText("Nike");
        txtMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtFornecedor1.setBackground(new java.awt.Color(79, 109, 234));
        txtFornecedor1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtFornecedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtFornecedor1.setText("Nike");
        txtFornecedor1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fornecedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtPorcentagem1.setBackground(new java.awt.Color(79, 109, 234));
        txtPorcentagem1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtPorcentagem1.setForeground(new java.awt.Color(255, 255, 255));
        txtPorcentagem1.setText("Erick");
        txtPorcentagem1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jpnProdutoLayout = new javax.swing.GroupLayout(jpnProduto);
        jpnProduto.setLayout(jpnProdutoLayout);
        jpnProdutoLayout.setHorizontalGroup(
            jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdutoLayout.createSequentialGroup()
                .addGroup(jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnProdutoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnProdutoLayout.createSequentialGroup()
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnProdutoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblProdutos))
                            .addGroup(jpnProdutoLayout.createSequentialGroup()
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPorcentagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnProdutoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jpnProdutoLayout.setVerticalGroup(
            jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdutoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblProdutos)
                .addGap(18, 18, 18)
                .addGroup(jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPorcentagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1165, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnProduto;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtFornecedor1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPorcentagem;
    private javax.swing.JTextField txtPorcentagem1;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
