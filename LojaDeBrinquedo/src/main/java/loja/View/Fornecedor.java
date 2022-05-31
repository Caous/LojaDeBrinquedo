/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loja.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import loja.Dominio.Model.FornecedorModel;
import loja.Dominio.Model.UserModel;
import loja.Dominio.Util.PropertiesValidator;
import loja.Dominio.Util.eAcaoTela;
import loja.View.Controller.FornecedorController;

/**
 *
 * @author Gustavo Nascimento
 */
public class Fornecedor extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public Fornecedor() {
        initComponents();
        LoadTable();
        acaoTela = eAcaoTela.ABRIR.getValor();
        GerenciarBotoes();
    }

    public Fornecedor(UserModel user) {
        this.usuSystem = user;
        initComponents();
        LoadTable();
        acaoTela = eAcaoTela.ABRIR.getValor();
        GerenciarBotoes();        
    }

    private UserModel usuSystem;
    private int acaoTela;
    private FornecedorModel forne;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        txtNomeFan = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContResp = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtIE = new javax.swing.JTextField();
        txtIM = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(201, 232, 242));

        jLabel1.setFont(new java.awt.Font("Rubik Light", 1, 24)); // NOI18N
        jLabel1.setText("Controle de Fornecedor");

        tblFornecedores.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFornecedores.setGridColor(new java.awt.Color(64, 87, 184));
        tblFornecedores.setSelectionForeground(new java.awt.Color(79, 109, 234));
        tblFornecedores.setShowGrid(true);
        jScrollPane1.setViewportView(tblFornecedores);

        jCheckBox1.setBackground(new java.awt.Color(201, 232, 242));
        jCheckBox1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox1.setText("Excluir");

        txtNome.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtNomeFan.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNomeFan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Fantasia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEmail.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtContResp.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtContResp.setForeground(new java.awt.Color(255, 255, 255));
        txtContResp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cont. Responsável", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtTel.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 14))); // NOI18N

        txtIE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtIE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtIM.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtIM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCNPJ.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtCNPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCel.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtCel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEndereco.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCEP.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtDtNasc.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtDtNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dt. Nascimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEstado.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtMunicipio.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtMunicipio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        btnSalvar.setBackground(new java.awt.Color(61, 189, 61));
        btnSalvar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(51, 102, 255));
        btnPesquisar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Procurar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelar.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNomeFan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtContResp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtIM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtIE, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        GerenciarBotoes();
        if (acaoTela == eAcaoTela.VISUALIZAR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        if (acaoTela == eAcaoTela.ABRIR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }

        FornecedorController fornecedController = new FornecedorController();

        FornecedorModel forneced = new FornecedorModel();

        if (acaoTela == eAcaoTela.EDITAR.getValor() || acaoTela == eAcaoTela.EXCLUIR.getValor()) {
            forneced = forne;
        }

        forneced = preencherFornecedor(forneced);

        boolean result = false;

        switch (acaoTela) {
            case 1:
            result = fornecedController.save(forneced);
            break;
            case 5:
            result = fornecedController.update(forneced);
            break;
            case 6:
            if (this.usuSystem == null) {
                forneced.setUsuDel(1);
            }
            result = fornecedController.finishValidity(forneced);
            break;
        }

        if (result) {
            
        }

        LimparCampos();
        LoadTable();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        GerenciarBotoes();
        
        FornecedorController fornecedController = new FornecedorController();
        FornecedorModel fornecedor = new FornecedorModel();
        
        try {
            if (fornecedor.validString(txtNome.getText())){
                fornecedor.setNome(txtNome.getText());
            }
            
            if(fornecedor.validString(txtNomeFan.getText())){
                fornecedor.setNomeFantasia(txtNomeFan.getText());
            }
            
            if(fornecedor.validString(txtEmail.getText())){
                fornecedor.setEmail(txtEmail.getText());
            }
            
            if(fornecedor.validString(txtContResp.getText())){
                fornecedor.setContatoResposavel(txtContResp.getText());
            }
            
            if(fornecedor.validString(txtCNPJ.getText())){
                fornecedor.setCnpj(txtCNPJ.getText());
            }
            
            if(fornecedor.validString(txtCNPJ.getText())){
                fornecedor.setIM(Integer.parseInt(txtCNPJ.getText()));
            }
            
            if(fornecedor.validString(txtIE.getText())){
                fornecedor.setEM(Integer.parseInt(txtIE.getText()));
            }
            
            if(fornecedor.validString(txtTel.getText())){
                fornecedor.setTelefone(txtTel.getText());
            }
            
            if(fornecedor.validString(txtCel.getText())){
                fornecedor.setCelular(txtCel.getText());
            }
            
            if(fornecedor.validString(txtDtNasc.getText())){
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                fornecedor.setDtNasc(formatter1.parse(txtDtNasc.getText().replace("/", "-")));
            }
            
            if(fornecedor.validString(txtEndereco.getText())){
                fornecedor.setEndereco(txtEndereco.getText());
            }
            
            if(fornecedor.validString(txtMunicipio.getText())){
                fornecedor.setMunicipio(txtMunicipio.getText());
            }
            
            if(fornecedor.validString(txtCEP.getText())){
                fornecedor.setCEP(txtCEP.getText());
            }
            
            if(fornecedor.validString(txtEstado.getText())){
                fornecedor.setEstado(txtEstado.getText());
            }
            
        } catch (PropertiesValidator ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<FornecedorModel> fornecedores = fornecedController.findAll(fornecedor);
        LoadTableFilters(fornecedores);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        LimparCampos();
        acaoTela = eAcaoTela.ABRIR.getValor();
        GerenciarBotoes();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void LoadTable() {
        FornecedorController fornecedController = new FornecedorController();
        FornecedorModel fornecedFiltro = new FornecedorModel();
        List<FornecedorModel> fornecedores = fornecedController.findAll(fornecedFiltro);
        
        DefaultTableModel tmFornecedores = new DefaultTableModel();
        tmFornecedores.addColumn("ID");
        tmFornecedores.addColumn("Nome");
        tmFornecedores.addColumn("Nome Fantasia");
        tmFornecedores.addColumn("CNPJ");
        tmFornecedores.addColumn("E-mail");
        tmFornecedores.addColumn("IM");
        tmFornecedores.addColumn("IE");
        
        tblFornecedores.setModel(tmFornecedores);
        
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);

        tmFornecedores.setRowCount(0);
        
        for (FornecedorModel forn : fornecedores) {
            tmFornecedores.addRow(new String[]{String.valueOf(forn.getId()), forn.getNome(), forn.getNomeFantasia(),
                forn.getCnpj(), forn.getEmail(), String.valueOf(forn.getIM()), String.valueOf(forn.getEM())});
        }
    }

    private void GerenciarBotoes() {
        switch (acaoTela) {
            case 1:
                btnPesquisar.setEnabled(false);
                btnSalvar.setEnabled(true);
                break;
            case 2:
                btnSalvar.setEnabled(true);
                btnPesquisar.setEnabled(true);
                break;
            case 3:
                btnPesquisar.setEnabled(true);
                btnSalvar.setEnabled(false);
                break;
            case 4:
                btnPesquisar.setEnabled(false);
                btnSalvar.setEnabled(false);
                break;
            case 5:
                btnPesquisar.setEnabled(false);
                btnSalvar.setEnabled(true);
                break;
            case 6:
                btnPesquisar.setEnabled(false);
                btnSalvar.setEnabled(true);
                break;
        }
    }

    private void LimparCampos() {
        txtNome.setText("");
        txtNomeFan.setText("");
        txtEmail.setText("");
        txtContResp.setText("");
        txtCNPJ.setText("");
        txtIM.setText("");
        txtIE.setText("");
        txtTel.setText("");
        txtCel.setText("");
        txtDtNasc.setText("");
        txtEndereco.setText("");
        txtMunicipio.setText("");
        txtCEP.setText("");
        txtEstado.setText("");
    }

    private FornecedorModel preencherFornecedor(FornecedorModel forneced) {
        if (forneced == null){
            forneced = new FornecedorModel();
        }
        
        try {
            if (forneced.validString(txtNome.getText())){
                forneced.setNome(txtNome.getText());
            }
            
            if(forneced.validString(txtNomeFan.getText())){
                forneced.setNomeFantasia(txtNomeFan.getText());
            }
            
            if(forneced.validString(txtEmail.getText())){
                forneced.setEmail(txtEmail.getText());
            }
            
            if(forneced.validString(txtContResp.getText())){
                forneced.setContatoResposavel(txtContResp.getText());
            }
            
            if(forneced.validString(txtCNPJ.getText())){
                forneced.setCnpj(txtCNPJ.getText());
            }
            
            if(forneced.validString(txtIM.getText())){
                forneced.setIM(Integer.parseInt(txtIM.getText()));
            }
            
            if(forneced.validString(txtIE.getText())){
                forneced.setEM(Integer.parseInt(txtIE.getText()));
            }
            
            if(forneced.validString(txtTel.getText())){
                forneced.setTelefone(txtTel.getText());
            }
            
            if(forneced.validString(txtCel.getText())){
                forneced.setCelular(txtCel.getText());
            }
            
            if(forneced.validString(txtDtNasc.getText())){
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                forneced.setDtNasc(formatter1.parse(txtDtNasc.getText().replace("/", "-")));
            }
            
            if(forneced.validString(txtEndereco.getText())){
                forneced.setEndereco(txtEndereco.getText());
            }
            
            if(forneced.validString(txtMunicipio.getText())){
                forneced.setMunicipio(txtMunicipio.getText());
            }
            
            if(forneced.validString(txtCEP.getText())){
                forneced.setCEP(txtCEP.getText());
            }
            
            if(forneced.validString(txtEstado.getText())){
                forneced.setEstado(txtEstado.getText());
            }
            
        } catch (PropertiesValidator ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return forneced;
    }

    private void LoadTableFilters(List<FornecedorModel> fornecedores) {
        DefaultTableModel tmFornecedores = new DefaultTableModel();
        tmFornecedores.addColumn("ID");
        tmFornecedores.addColumn("Nome");
        tmFornecedores.addColumn("Nome Fantasia");
        tmFornecedores.addColumn("CNPJ");
        tmFornecedores.addColumn("E-mail");
        tmFornecedores.addColumn("IM");
        tmFornecedores.addColumn("IE");
        
        tblFornecedores.setModel(tmFornecedores);
        
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblFornecedores.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblFornecedores.getColumnModel().getColumn(0).setPreferredWidth(100);

        tmFornecedores.setRowCount(0);
        
        for (FornecedorModel forne : fornecedores) {
            tmFornecedores.addRow(new String[]{String.valueOf(forne.getId()), forne.getNome(), forne.getNomeFantasia(),
                forne.getCnpj(), forne.getEmail(), String.valueOf(forne.getIM()), String.valueOf(forne.getEM())});
        }
    }
    
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
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCNPJ;
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