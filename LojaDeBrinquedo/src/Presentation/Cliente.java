/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

/**
 *
 * @author Gustavo Nascimento
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public Cliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnBg = new javax.swing.JPanel();
        lblCtrlCliente = new javax.swing.JLabel();
        rbtEmpresa = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtNomeFan = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContResp = new javax.swing.JTextField();
        txtIM = new javax.swing.JTextField();
        txtIE = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();
        rbtMasc = new javax.swing.JRadioButton();
        rbtFem = new javax.swing.JRadioButton();
        txtEndereco = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtIM1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnBg.setBackground(new java.awt.Color(79, 109, 234));
        jpnBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCtrlCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblCtrlCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCtrlCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/cliente.png"))); // NOI18N
        lblCtrlCliente.setText("Controle de clientes");
        jpnBg.add(lblCtrlCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 190, 50));

        rbtEmpresa.setBackground(new java.awt.Color(79, 109, 234));
        rbtEmpresa.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbtEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        rbtEmpresa.setText("Empresa");
        rbtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmpresaActionPerformed(evt);
            }
        });
        jpnBg.add(rbtEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNome.setBackground(new java.awt.Color(79, 109, 234));
        txtNome.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Senac");
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, -1));

        txtNomeFan.setBackground(new java.awt.Color(79, 109, 234));
        txtNomeFan.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNomeFan.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeFan.setText("Senac Santo Maro");
        txtNomeFan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Fantasia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtNomeFan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 210, -1));

        txtEmail.setBackground(new java.awt.Color(79, 109, 234));
        txtEmail.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("senacsp@senacsp.edu.br");
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 210, -1));

        txtContResp.setBackground(new java.awt.Color(79, 109, 234));
        txtContResp.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtContResp.setForeground(new java.awt.Color(255, 255, 255));
        txtContResp.setText("(##) #####-####");
        txtContResp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cont. Responsável", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtContResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 210, -1));

        txtIM.setBackground(new java.awt.Color(79, 109, 234));
        txtIM.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtIM.setForeground(new java.awt.Color(255, 255, 255));
        txtIM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF/CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, -1));

        txtIE.setBackground(new java.awt.Color(79, 109, 234));
        txtIE.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtIE.setForeground(new java.awt.Color(255, 255, 255));
        txtIE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 210, -1));

        txtTel.setBackground(new java.awt.Color(79, 109, 234));
        txtTel.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(255, 255, 255));
        txtTel.setText("(##) ####-####");
        txtTel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 210, -1));

        txtCel.setBackground(new java.awt.Color(79, 109, 234));
        txtCel.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCel.setForeground(new java.awt.Color(255, 255, 255));
        txtCel.setText("(##) #####-####");
        txtCel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        txtDtNasc.setBackground(new java.awt.Color(79, 109, 234));
        txtDtNasc.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtDtNasc.setForeground(new java.awt.Color(255, 255, 255));
        txtDtNasc.setText("00/00/0000");
        txtDtNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dt. Nascimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtDtNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 210, -1));

        rbtMasc.setBackground(new java.awt.Color(79, 109, 234));
        rbtMasc.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbtMasc.setForeground(new java.awt.Color(255, 255, 255));
        rbtMasc.setText("Masculino");
        jpnBg.add(rbtMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        rbtFem.setBackground(new java.awt.Color(79, 109, 234));
        rbtFem.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbtFem.setForeground(new java.awt.Color(255, 255, 255));
        rbtFem.setText("Feminino");
        jpnBg.add(rbtFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        txtEndereco.setBackground(new java.awt.Color(79, 109, 234));
        txtEndereco.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(255, 255, 255));
        txtEndereco.setText("Av. Eng. Eusébio Stevaux");
        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, -1));

        txtCEP.setBackground(new java.awt.Color(79, 109, 234));
        txtCEP.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCEP.setForeground(new java.awt.Color(255, 255, 255));
        txtCEP.setText("00000-000");
        txtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 210, -1));

        txtEstado.setBackground(new java.awt.Color(79, 109, 234));
        txtEstado.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setText("São Paulo");
        txtEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 210, -1));

        txtMunicipio.setBackground(new java.awt.Color(79, 109, 234));
        txtMunicipio.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        txtMunicipio.setText("São Paulo");
        txtMunicipio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 210, -1));

        btnSalvar.setBackground(new java.awt.Color(51, 153, 0));
        btnSalvar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Procurar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setOpaque(true);
        jpnBg.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, 50));

        btnSalvar1.setBackground(new java.awt.Color(64, 87, 184));
        btnSalvar1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvar1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar1.setText("Salvar");
        btnSalvar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar1.setContentAreaFilled(false);
        btnSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar1.setOpaque(true);
        jpnBg.add(btnSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, 50));

        jCheckBox1.setBackground(new java.awt.Color(79, 109, 234));
        jCheckBox1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Excluir");
        jpnBg.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, -1));

        jTable1.setBackground(new java.awt.Color(64, 87, 184));
        jTable1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Gustavo", "gustavo@happy.com.br", "000.000.000-00", "Dan"},
                {"Erick", "erick@happy.com.br", "000.000.000-00", "Vitor"},
                {"Fernando", "fernando@happy.com.br", "000.000.000-00", "N/A"}
            },
            new String [] {
                "Nome", "E-mail", "CPF/CNPJ", "Cont. Resp."
            }
        ));
        jTable1.setGridColor(new java.awt.Color(64, 87, 184));
        jTable1.setSelectionForeground(new java.awt.Color(79, 109, 234));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jpnBg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 900, 160));

        txtIM1.setBackground(new java.awt.Color(79, 109, 234));
        txtIM1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtIM1.setForeground(new java.awt.Color(255, 255, 255));
        txtIM1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtIM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBg, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBg, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnBg;
    private javax.swing.JLabel lblCtrlCliente;
    private javax.swing.JRadioButton rbtEmpresa;
    private javax.swing.JRadioButton rbtFem;
    private javax.swing.JRadioButton rbtMasc;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtContResp;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIE;
    private javax.swing.JTextField txtIM;
    private javax.swing.JTextField txtIM1;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFan;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
