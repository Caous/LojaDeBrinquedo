/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import Dominio.Util.PropertiesValidator;
import Presentation.Controller.UserController;
import Presentation.Dto.UserDto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Nascimento
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpnBg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDtNascimento = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        rbMasc = new javax.swing.JRadioButton();
        rbFem = new javax.swing.JRadioButton();
        btnPesquisar = new javax.swing.JButton();
        lblControle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxPerfil = new javax.swing.JComboBox<>();
        ckbExcluir = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(994, 623));

        jpnBg.setBackground(new java.awt.Color(79, 109, 234));
        jpnBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblUsuarios.setBackground(new java.awt.Color(64, 87, 184));
        tblUsuarios.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Gustavo", "gustavo@happy.com.br", "000.000.000-00", "Adm"},
                {"Erick", "erick@happy.com.br", "000.000.000-00", "Caixa"},
                {"Fernando", "fernando@happy.com.br", "000.000.000-00", "Gerente Vendas"}
            },
            new String [] {
                "Nome", "E-mail", "CPF", "Perfil"
            }
        ));
        tblUsuarios.setGridColor(new java.awt.Color(64, 87, 184));
        tblUsuarios.setSelectionForeground(new java.awt.Color(79, 109, 234));
        tblUsuarios.setShowGrid(true);
        jScrollPane1.setViewportView(tblUsuarios);

        jpnBg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 900, 240));

        txtNome.setBackground(new java.awt.Color(79, 109, 234));
        txtNome.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, -1));

        txtEmail.setBackground(new java.awt.Color(79, 109, 234));
        txtEmail.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 210, -1));

        txtDtNascimento.setBackground(new java.awt.Color(79, 109, 234));
        txtDtNascimento.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtDtNascimento.setForeground(new java.awt.Color(255, 255, 255));
        txtDtNascimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dt. Nascimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtDtNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 210, -1));

        txtCpf.setBackground(new java.awt.Color(79, 109, 234));
        txtCpf.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(255, 255, 255));
        txtCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, -1));

        txtPass.setBackground(new java.awt.Color(79, 109, 234));
        txtPass.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 210, -1));

        rbMasc.setBackground(new java.awt.Color(79, 109, 234));
        rbMasc.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbMasc.setForeground(new java.awt.Color(255, 255, 255));
        rbMasc.setText("Masculino");
        jpnBg.add(rbMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        rbFem.setBackground(new java.awt.Color(79, 109, 234));
        rbFem.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbFem.setForeground(new java.awt.Color(255, 255, 255));
        rbFem.setText("Feminino");
        jpnBg.add(rbFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        btnPesquisar.setBackground(new java.awt.Color(51, 153, 0));
        btnPesquisar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.setOpaque(true);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jpnBg.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 170, 50));

        lblControle.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblControle.setForeground(new java.awt.Color(255, 255, 255));
        lblControle.setText("Controle de usuários");
        jpnBg.add(lblControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/user.png"))); // NOI18N
        jpnBg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        cbxPerfil.setBackground(new java.awt.Color(79, 109, 234));
        cbxPerfil.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        cbxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik", 1, 14))); // NOI18N
        cbxPerfil.setOpaque(false);
        cbxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPerfilActionPerformed(evt);
            }
        });
        jpnBg.add(cbxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 50));

        ckbExcluir.setBackground(new java.awt.Color(79, 109, 234));
        ckbExcluir.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        ckbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        ckbExcluir.setText("Excluir");
        jpnBg.add(ckbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jTable2.setBackground(new java.awt.Color(64, 87, 184));
        jTable2.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bola de futebol", "10", "69,90", "Nike", "Nike", "5"},
                {"Boneca", "5", "120,00", "Barbie", "Happy", "0"},
                {"Nerf", "2", "50,00", "Nerf", "Disneylandia", "2"}
            },
            new String [] {
                "Nome", "Qtd", "Valor", "Marca", "Fornecedor", "Desconto"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(64, 87, 184));
        jTable2.setSelectionForeground(new java.awt.Color(64, 87, 184));
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        jpnBg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 900, 150));

        btnSalvar.setBackground(new java.awt.Color(64, 87, 184));
        btnSalvar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setOpaque(true);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpnBg.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 50));

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

    private void cbxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPerfilActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        UserDto user = new UserDto();
        UserController userControll = new UserController();

        try {
            if (user.validString(txtNome.getText())) {
                user.setNome(txtNome.getText());
            }

            if (user.validString(txtEmail.getText())) {
                user.setEmail(txtEmail.getText());
            }

            if (user.validString(txtPass.getPassword().toString())) {
                user.setPassword(txtPass.getPassword().toString());
            }

            if (user.validString(txtCpf.getText())) {
                user.setCPF(txtCpf.getText());
            }

            if (user.validString(txtDtNascimento.getText())) {
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                user.setDtNasc(formatter1.parse(txtDtNascimento.getText()));
            }

            if (ckbExcluir.isValid()) {
                userControll.Excluir(user);
            } else {
                if (!userControll.UsuarioExite(user)) {
                    userControll.Salvar(user);

                }
            }

        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        UserController userControll = new UserController();
        UserDto user = new UserDto();

        try {
            if (user.validString(txtNome.getText())) {
                user.setNome(txtNome.getText());
            }

            if (user.validString(txtEmail.getText())) {
                user.setEmail(txtEmail.getText());
            }        

            if (user.validString(txtCpf.getText())) {
                user.setCPF(txtCpf.getText());
            }

            if (user.validString(txtDtNascimento.getText())) {
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                user.setDtNasc(formatter1.parse(txtDtNascimento.getText()));
            }

            user = userControll.Pesquisar(user);

        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxPerfil;
    private javax.swing.JCheckBox ckbExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel jpnBg;
    private javax.swing.JLabel lblControle;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDtNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
