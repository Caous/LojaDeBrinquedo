/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import Dominio.Util.PropertiesValidator;
import Presentation.Controller.ClienteController;
import Presentation.Dto.ClienteDto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        txtCPFCNPJ = new javax.swing.JTextField();
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
        btnPesquisar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        ckbExcluir = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtIM = new javax.swing.JTextField();

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
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, -1));

        txtNomeFan.setBackground(new java.awt.Color(79, 109, 234));
        txtNomeFan.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNomeFan.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeFan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Fantasia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtNomeFan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 210, -1));

        txtEmail.setBackground(new java.awt.Color(79, 109, 234));
        txtEmail.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 210, -1));

        txtContResp.setBackground(new java.awt.Color(79, 109, 234));
        txtContResp.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtContResp.setForeground(new java.awt.Color(255, 255, 255));
        txtContResp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cont. Responsável", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtContResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 210, -1));

        txtCPFCNPJ.setBackground(new java.awt.Color(79, 109, 234));
        txtCPFCNPJ.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCPFCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        txtCPFCNPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF/CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtCPFCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, -1));

        txtIE.setBackground(new java.awt.Color(79, 109, 234));
        txtIE.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtIE.setForeground(new java.awt.Color(255, 255, 255));
        txtIE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 210, -1));

        txtTel.setBackground(new java.awt.Color(79, 109, 234));
        txtTel.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(255, 255, 255));
        txtTel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 210, -1));

        txtCel.setBackground(new java.awt.Color(79, 109, 234));
        txtCel.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCel.setForeground(new java.awt.Color(255, 255, 255));
        txtCel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, -1));

        txtDtNasc.setBackground(new java.awt.Color(79, 109, 234));
        txtDtNasc.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtDtNasc.setForeground(new java.awt.Color(255, 255, 255));
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
        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, -1));

        txtCEP.setBackground(new java.awt.Color(79, 109, 234));
        txtCEP.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCEP.setForeground(new java.awt.Color(255, 255, 255));
        txtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 210, -1));

        txtEstado.setBackground(new java.awt.Color(79, 109, 234));
        txtEstado.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 210, -1));

        txtMunicipio.setBackground(new java.awt.Color(79, 109, 234));
        txtMunicipio.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        txtMunicipio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 210, -1));

        btnPesquisar.setBackground(new java.awt.Color(51, 153, 0));
        btnPesquisar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Procurar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.setOpaque(true);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jpnBg.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, 50));

        btnSalvar.setBackground(new java.awt.Color(64, 87, 184));
        btnSalvar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.setOpaque(true);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpnBg.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 170, 50));

        ckbExcluir.setBackground(new java.awt.Color(79, 109, 234));
        ckbExcluir.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        ckbExcluir.setForeground(new java.awt.Color(255, 255, 255));
        ckbExcluir.setText("Excluir");
        jpnBg.add(ckbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, -1));

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

        txtIM.setBackground(new java.awt.Color(79, 109, 234));
        txtIM.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtIM.setForeground(new java.awt.Color(255, 255, 255));
        txtIM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jpnBg.add(txtIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 210, -1));

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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        ClienteController cliController = new ClienteController();

        ClienteDto cliente = new ClienteDto();

        try {
            if (ckbExcluir.isValid()) {
                
            } else {
                if (cliente.validString(txtNome.getText())) {
                    cliente.setNome(txtNome.getText());
                }
                if (cliente.validString(txtNomeFan.getText())) {
                    cliente.setNomeFantasia(txtNomeFan.getText());
                }
                if (cliente.validString(txtEmail.getText())) {
                    cliente.setEmail(txtEmail.getText());
                }
                if (cliente.validString(txtContResp.getText())) {
                    cliente.setContatoResposavel(txtContResp.getText());
                }
                if (cliente.validString(txtCPFCNPJ.getText())) {
                    cliente.setCpfCnpj(txtCPFCNPJ.getText());
                }
                if (cliente.validString(txtIE.getText())) {
                    cliente.setEM(txtIE.getText());
                }
                if (cliente.validString(txtIM.getText())) {
                    cliente.setIM(txtIM.getText());
                }
                if (cliente.validString(txtIM.getText())) {
                    cliente.setIM(txtIM.getText());
                }
                if (cliente.validString(txtTel.getText())) {
                    cliente.setTelefone(txtTel.getText());
                }
                if (cliente.validString(txtCel.getText())) {
                    cliente.setCelular(txtCel.getText());
                }
                if (rbtFem.isValid()) {
                    cliente.setSexo("Feminino");
                }
                if (rbtMasc.isValid()) {
                    cliente.setSexo("Masculino");
                }
                if (cliente.validString(txtEndereco.getText())) {
                    cliente.setEndereco(txtEndereco.getText());
                }
                if (cliente.validString(txtCEP.getText())) {
                    cliente.setCEP(txtCEP.getText());
                }
                if (cliente.validString(txtEstado.getText())) {
                    cliente.setEstado(txtEstado.getText());
                }
                if (cliente.validString(txtMunicipio.getText())) {
                    cliente.setMunicipio(txtMunicipio.getText());
                }
                if (cliente.validString(txtDtNasc.getText())) {
                    SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                    cliente.setDtNasc(formatter1.parse(txtDtNasc.getText()));
                }
                if (rbtEmpresa.isValid()) {
                    cliente.setTipoCliente(1);
                }
                cliController.Salvar(cliente);
            }
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        ClienteController cliController = new ClienteController();

        List<ClienteDto> clientes = cliController.RetornaLista();

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
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnBg;
    private javax.swing.JLabel lblCtrlCliente;
    private javax.swing.JRadioButton rbtEmpresa;
    private javax.swing.JRadioButton rbtFem;
    private javax.swing.JRadioButton rbtMasc;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPFCNPJ;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtContResp;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIE;
    private javax.swing.JTextField txtIM;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFan;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
