/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loja.Presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import loja.Dominio.Model.MenuModel;
import loja.Dominio.Model.PerfilModel;
import loja.Dominio.Model.TipoAcessoModel;
import loja.Dominio.Model.TipoPagamentoModel;
import loja.Dominio.Model.UserModel;
import loja.Dominio.Util.PropertiesValidator;
import loja.Dominio.Util.eAcaoTela;
import loja.Presentation.Controller.AcessoController;
import loja.Presentation.Controller.MenuController;
import loja.Presentation.Controller.PerfilController;
import loja.Presentation.Controller.TipoPagamentoController;

/**
 *
 * @author Gustavo Nascimento
 */
public class Configuracao extends javax.swing.JFrame {
    
    public Configuracao() {
        initComponents();
        LoadTable();
        acaoTela = eAcaoTela.ABRIR.getValor();
        GerenciarBotoes();
        CarregarComboBox();
    }
    
    public Configuracao(UserModel user) {
        this.usuSystem = user;
        initComponents();
        LoadTable();
        acaoTela = eAcaoTela.ABRIR.getValor();
        GerenciarBotoes();
        CarregarComboBox();
    }
    
    private UserModel usuSystem;
    private int acaoTela;
    private MenuModel _menu;
    private PerfilModel _perfil;
    private TipoPagamentoModel _pagamento;
    private TipoAcessoModel _acessoModel;
    
    public void LoadTable() {

        //Menu
        MenuController menuController = new MenuController();
        MenuModel menuFiltro = new MenuModel();
        List<MenuModel> menus = menuController.findAll(menuFiltro);
        
        DefaultTableModel tbMenus = new DefaultTableModel();
        
        tbMenus.addColumn("ID");
        tbMenus.addColumn("Nome");
        tbMenus.addColumn("Descrição");
        tbMenus.addColumn("Usu. Inclusão");
        tbMenus.addColumn("Dt. Inclusão");
        
        tblMenus.setModel(tbMenus);
        
        tblMenus.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblMenus.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblMenus.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblMenus.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblMenus.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        tbMenus.setRowCount(0);
        
        if (menus == null || menus.size() == 0) {
            tbMenus.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (MenuModel menu : menus) {
            tbMenus.addRow(new String[]{String.valueOf(menu.getId()),
                menu.getMenu(), menu.getDescMenu(), "Dt", "Dt"});
        }

        //Perfil
        PerfilController perfilController = new PerfilController();
        PerfilModel perfilFiltro = new PerfilModel();
        List<PerfilModel> perfils = perfilController.findAll(perfilFiltro);
        
        DefaultTableModel tbPerfil = new DefaultTableModel();
        
        tbPerfil.addColumn("ID");
        tbPerfil.addColumn("Nome");
        tbPerfil.addColumn("Descrição");
        tbPerfil.addColumn("Usu. Inclusão");
        tbPerfil.addColumn("Dt. Inclusão");
        
        tblPerfil.setModel(tbPerfil);
        
        tblPerfil.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPerfil.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblPerfil.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblPerfil.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblPerfil.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        tbPerfil.setRowCount(0);
        
        if (perfils == null || perfils.size() == 0) {
            tbPerfil.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (PerfilModel perfil : perfils) {
            tbPerfil.addRow(new String[]{String.valueOf(perfil.getId()),
                perfil.getPerfil(), perfil.getDescPerfil(), "Dt", "Dt"});
        }

        //Acesso
        AcessoController acessoController = new AcessoController();
        TipoAcessoModel acessoFiltro = new TipoAcessoModel();
        List<TipoAcessoModel> acessos = acessoController.findAll(acessoFiltro);
        
        DefaultTableModel tbAcesso = new DefaultTableModel();
        tbAcesso.addColumn("ID");
        tbAcesso.addColumn("Perfil");
        tbAcesso.addColumn("Menu");
        tbAcesso.addColumn("Usu. Inclusão");
        tbAcesso.addColumn("Dt. Inclusão");
        
        tblAcessos.setModel(tbAcesso);
        
        tblAcessos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblAcessos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblAcessos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblAcessos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblAcessos.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        tbAcesso.setRowCount(0);
        
        if (acessos == null || acessos.size() == 0) {
            tbAcesso.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (TipoAcessoModel acesso : acessos) {
            tbAcesso.addRow(new String[]{String.valueOf(acesso.getId()),
                "", "", "Dt", "Dt"});
        }

        //Tipo Pagamento
        TipoPagamentoController pagamentoController = new TipoPagamentoController();
        TipoPagamentoModel pagamentoFiltro = new TipoPagamentoModel();
        List<TipoPagamentoModel> pagamentos = pagamentoController.findAll(pagamentoFiltro);
        
        DefaultTableModel tbPagamentos = new DefaultTableModel();
        tbPagamentos.addColumn("ID");
        tbPagamentos.addColumn("Desc. Pagamento");
        tbPagamentos.addColumn("Usu. Inclusão");
        tbPagamentos.addColumn("Dt. Inclusão");
        
        tblPagamento.setModel(tbPagamentos);
        
        tblPagamento.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPagamento.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblPagamento.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblPagamento.getColumnModel().getColumn(1).setPreferredWidth(50);
        
        tbPagamentos.setRowCount(0);
        
        if (pagamentos == null || pagamentos.size() == 0) {
            tbPagamentos.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (TipoPagamentoModel pagamento : pagamentos) {
            tbPagamentos.addRow(new String[]{String.valueOf(pagamento.getId()),
                pagamento.getDescPagamento(), "Dt", "Dt"});
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
        txtMenu.setText("");
        txaDescricao.setText("");
        txtPerfil.setText("");
        txaPerfil.setText("");
        txaPagamento.setText("");
        _menu = null;
    }
    
    private boolean preencherMenu(MenuModel entity) {
        
        if (entity == null) {
            entity = new MenuModel();
        }
        
        try {
            if (entity.validString(txtMenu.getText())) {
                entity.setMenu(txtMenu.getText());
            } else {
                
                JOptionPane.showMessageDialog(null, "Por favor preencher o nome do menu ou com caracteres mínimos", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if (entity.validString(txaDescricao.getText())) {
                entity.setDescMenu(txaDescricao.getText());
            } else {
                
                JOptionPane.showMessageDialog(null, "Por favor preencher o a descrição do menu ou com caracteres mínimos", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if (ckbExcluir.isSelected()) {
                acaoTela = eAcaoTela.EXCLUIR.getValor();
                if (this.usuSystem != null) {
                    entity.setUsuDel(this.usuSystem.getId());
                }
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        this._menu = entity;
        return true;
    }
    
    public void recuperarMenu(int id) {
        
        MenuController menuController = new MenuController();
        
        _menu = menuController.findId(id);
        
        txtMenu.setText(_menu.getMenu());
        txaDescricao.setText(_menu.getDescMenu());
        
    }
    
    public void LoadTableMenu(MenuModel menuFiltro) {

        //Menu
        MenuController menuController = new MenuController();
        
        List<MenuModel> menus = menuController.findAll(menuFiltro);
        
        DefaultTableModel tbMenus = new DefaultTableModel();
        
        tbMenus.addColumn("ID");
        tbMenus.addColumn("Nome");
        tbMenus.addColumn("Descrição");
        tbMenus.addColumn("Usu. Inclusão");
        tbMenus.addColumn("Dt. Inclusão");
        
        tblMenus.setModel(tbMenus);
        
        tblMenus.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblMenus.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblMenus.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblMenus.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblMenus.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        tbMenus.setRowCount(0);
        
        if (menus == null || menus.size() == 0) {
            tbMenus.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (MenuModel menu : menus) {
            tbMenus.addRow(new String[]{String.valueOf(menu.getId()),
                menu.getMenu(), menu.getDescMenu(), "Dt", "Dt"});
        }
    }
    
    public void recuperarPerfil(int id) {
        
        PerfilController perfilController = new PerfilController();
        
        _perfil = perfilController.findId(id);
        
        txtPerfil.setText(_perfil.getPerfil());
        txaPerfil.setText(_perfil.getDescPerfil());
        
    }
    
    public void recuperarPagamento(int id) {
        
        TipoPagamentoController pagamentoController = new TipoPagamentoController();
        
        _pagamento = pagamentoController.findId(id);
        
        txaPagamento.setText(_pagamento.getDescPagamento());
        
    }
    
    private boolean preencherPerfil(PerfilModel entity) {
        
        if (entity == null) {
            entity = new PerfilModel();
        }
        
        try {
            if (entity.validString(txtPerfil.getText())) {
                entity.setPerfile(txtPerfil.getText());
            } else {
                
                JOptionPane.showMessageDialog(null, "Por favor preencher o perfil do menu ou caracteres mínimos", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if (entity.validString(txaPerfil.getText())) {
                entity.setDescPerfil(txaPerfil.getText());
            } else {
                
                JOptionPane.showMessageDialog(null, "Por favor preencher a descrição do perfil ou caracteres mínimos", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if (ckbExcluirPerfil.isSelected()) {
                
                acaoTela = eAcaoTela.EXCLUIR.getValor();
                
                if (this.usuSystem != null && entity.validInt(this.usuSystem.getId())) {
                    entity.setUsuDel(this.usuSystem.getId());
                }
                
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        this._perfil = entity;
        return true;
    }
    
    private boolean preencherPagamento(TipoPagamentoModel entity) {
        
        if (entity == null) {
            entity = new TipoPagamentoModel();
        }
        
        try {
            if (entity.validString(txaPagamento.getText())) {
                entity.setDescPagamento(txaPagamento.getText());
            } else {
                
                JOptionPane.showMessageDialog(null, "Por favor preencher nome do pagamento ou caracteres mínimos", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            
            if (ckbExcluirPagamento.isSelected()) {
                acaoTela = eAcaoTela.EXCLUIR.getValor();
                if (this.usuSystem != null && entity.validInt(this.usuSystem.getId())) {
                    entity.setUsuDel(this.usuSystem.getId());
                }
                
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        this._pagamento = entity;
        return true;
    }
    
    private boolean preencherAcesso(TipoAcessoModel entity) {
        
        if (entity == null) {
            entity = new TipoAcessoModel();
        }
        
        try {
            if (entity.validString(ckbMenu.getSelectedItem().toString())) {
                
                String menu = ckbMenu.getSelectedItem().toString();
                
                MenuController menuController = new MenuController();
                MenuModel menuFiltro = new MenuModel();
                menuFiltro.setMenu(menu);
                
                List<MenuModel> menus = menuController.findAll(menuFiltro);
                
                entity.setIdMenu(menus.get(0).getId());
            }
            
            if (entity.validString(ckbPerfil.getSelectedItem().toString())) {
                
                String perfil = ckbMenu.getSelectedItem().toString();
                
                PerfilController perfilController = new PerfilController();
                PerfilModel perfilFiltro = new PerfilModel();
                perfilFiltro.setPerfile(perfil);
                
                List<PerfilModel> perfils = perfilController.findAll(perfilFiltro);
                
                entity.setIdPerfil(perfils.get(0).getId());
            }
            
            if (ckbExcluirAcesso.isSelected()) {
                acaoTela = eAcaoTela.EXCLUIR.getValor();
                if (this.usuSystem != null && entity.validInt(this.usuSystem.getId())) {
                    entity.setUsuDel(this.usuSystem.getId());
                }
                
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        
        this._acessoModel = entity;
        return true;
    }
    
    public void recuperarAcesso(int id) {
        
        AcessoController acessoController = new AcessoController();
        
        _acessoModel = acessoController.findId(id);
        
    }
    
    private void CarregarComboBox() {
        
        MenuController menuController = new MenuController();
        MenuModel menuFiltro = new MenuModel();
        List<MenuModel> menus = menuController.findAll(menuFiltro);
        
        PerfilController perfilController = new PerfilController();
        PerfilModel perfilFiltro = new PerfilModel();
        List<PerfilModel> perfils = perfilController.findAll(perfilFiltro);
        
        for (int i = 0; i < perfils.size(); i++) {
            ckbPerfil.addItem(perfils.get(i).getPerfil());
        }
        
        for (int i = 0; i < menus.size(); i++) {
            ckbMenu.addItem(menus.get(i).getMenu());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTablePanel = new javax.swing.JTabbedPane();
        jPanelMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        txtMenu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenus = new javax.swing.JTable();
        txtDescricao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblListaMenus = new javax.swing.JLabel();
        ckbExcluir = new javax.swing.JCheckBox();
        jPanelPerfil = new javax.swing.JPanel();
        lblPerfil = new javax.swing.JLabel();
        txtPerfil = new javax.swing.JTextField();
        txtDescricao1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaPerfil = new javax.swing.JTextArea();
        lblListaMenus1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPerfil = new javax.swing.JTable();
        btnSalvarPerfil = new javax.swing.JButton();
        btnPesquisarPerfil = new javax.swing.JButton();
        btnCancelarPerfil = new javax.swing.JButton();
        ckbExcluirPerfil = new javax.swing.JCheckBox();
        jPanelTipoPagamento = new javax.swing.JPanel();
        txtDescricao2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaPagamento = new javax.swing.JTextArea();
        lblListaMenus3 = new javax.swing.JLabel();
        btnSalvarPagamento = new javax.swing.JButton();
        btnPesquisarPagamento = new javax.swing.JButton();
        btnCancelarPagamento = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPagamento = new javax.swing.JTable();
        ckbExcluirPagamento = new javax.swing.JCheckBox();
        jPanelAcesso = new javax.swing.JPanel();
        lblListaMenus2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAcessos = new javax.swing.JTable();
        btnSalvarAcesso = new javax.swing.JButton();
        btnProcurarAcesso = new javax.swing.JButton();
        btnCancelarAcesso = new javax.swing.JButton();
        lblMenuAcesso = new javax.swing.JLabel();
        lblPerfilAcesso = new javax.swing.JLabel();
        ckbMenu = new javax.swing.JComboBox<>();
        ckbPerfil = new javax.swing.JComboBox<>();
        ckbExcluirAcesso = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTablePanel.setFont(new java.awt.Font("Rubik Light", 1, 12)); // NOI18N

        jPanelMenu.setBackground(new java.awt.Color(201, 232, 242));

        lblMenu.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblMenu.setText("Menu:");

        txtMenu.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N

        tblMenus.setBackground(new java.awt.Color(64, 87, 184));
        tblMenus.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblMenus.setForeground(new java.awt.Color(255, 255, 255));
        tblMenus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMenus.setGridColor(new java.awt.Color(64, 87, 184));
        tblMenus.setSelectionForeground(new java.awt.Color(79, 109, 234));
        tblMenus.setShowGrid(true);
        tblMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenus);

        txtDescricao.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        txtDescricao.setText("Descrição:");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane2.setViewportView(txaDescricao);

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

        lblListaMenus.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblListaMenus.setText("Lista de Menus");

        ckbExcluir.setBackground(new java.awt.Color(201, 232, 242));
        ckbExcluir.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        ckbExcluir.setForeground(new java.awt.Color(153, 0, 0));
        ckbExcluir.setText("Excluir");
        ckbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbExcluirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbExcluir)
                    .addComponent(lblListaMenus)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addComponent(txtDescricao)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanelMenuLayout.createSequentialGroup()
                            .addComponent(lblMenu)
                            .addGap(18, 18, 18)
                            .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenu)
                    .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtDescricao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblListaMenus)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTablePanel.addTab("Menu", jPanelMenu);

        jPanelPerfil.setBackground(new java.awt.Color(201, 232, 242));

        lblPerfil.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblPerfil.setText("Perfil:");

        txtPerfil.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N

        txtDescricao1.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        txtDescricao1.setText("Descrição:");

        txaPerfil.setColumns(20);
        txaPerfil.setRows(5);
        jScrollPane3.setViewportView(txaPerfil);

        lblListaMenus1.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblListaMenus1.setText("Lista de Perfil:");

        tblPerfil.setBackground(new java.awt.Color(64, 87, 184));
        tblPerfil.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        tblPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPerfil.setGridColor(new java.awt.Color(64, 87, 184));
        tblPerfil.setSelectionForeground(new java.awt.Color(79, 109, 234));
        tblPerfil.setShowGrid(true);
        tblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerfilMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblPerfil);

        btnSalvarPerfil.setBackground(new java.awt.Color(61, 189, 61));
        btnSalvarPerfil.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarPerfil.setText("Salvar");
        btnSalvarPerfil.setBorder(null);
        btnSalvarPerfil.setBorderPainted(false);
        btnSalvarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerfilActionPerformed(evt);
            }
        });

        btnPesquisarPerfil.setBackground(new java.awt.Color(51, 102, 255));
        btnPesquisarPerfil.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarPerfil.setText("Procurar");
        btnPesquisarPerfil.setBorder(null);
        btnPesquisarPerfil.setBorderPainted(false);
        btnPesquisarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPerfilActionPerformed(evt);
            }
        });

        btnCancelarPerfil.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarPerfil.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnCancelarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPerfil.setText("Cancelar");
        btnCancelarPerfil.setBorder(null);
        btnCancelarPerfil.setBorderPainted(false);
        btnCancelarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPerfilActionPerformed(evt);
            }
        });

        ckbExcluirPerfil.setBackground(new java.awt.Color(201, 232, 242));
        ckbExcluirPerfil.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        ckbExcluirPerfil.setForeground(new java.awt.Color(153, 0, 0));
        ckbExcluirPerfil.setText("Excluir");
        ckbExcluirPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbExcluirPerfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbExcluirPerfil)
                    .addComponent(lblListaMenus1)
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addComponent(btnSalvarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(txtDescricao1)
                        .addComponent(jScrollPane4)
                        .addGroup(jPanelPerfilLayout.createSequentialGroup()
                            .addComponent(lblPerfil)
                            .addGap(18, 18, 18)
                            .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfil)
                    .addComponent(txtPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtDescricao1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbExcluirPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblListaMenus1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTablePanel.addTab("Perfil", jPanelPerfil);

        jPanelTipoPagamento.setBackground(new java.awt.Color(201, 232, 242));

        txtDescricao2.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        txtDescricao2.setText("Descrição:");

        txaPagamento.setColumns(20);
        txaPagamento.setRows(5);
        jScrollPane6.setViewportView(txaPagamento);

        lblListaMenus3.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblListaMenus3.setText("Lista de Pagamentos");

        btnSalvarPagamento.setBackground(new java.awt.Color(61, 189, 61));
        btnSalvarPagamento.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarPagamento.setText("Salvar");
        btnSalvarPagamento.setBorder(null);
        btnSalvarPagamento.setBorderPainted(false);
        btnSalvarPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPagamentoActionPerformed(evt);
            }
        });

        btnPesquisarPagamento.setBackground(new java.awt.Color(51, 102, 255));
        btnPesquisarPagamento.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarPagamento.setText("Procurar");
        btnPesquisarPagamento.setBorder(null);
        btnPesquisarPagamento.setBorderPainted(false);
        btnPesquisarPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPagamentoActionPerformed(evt);
            }
        });

        btnCancelarPagamento.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarPagamento.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnCancelarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarPagamento.setText("Cancelar");
        btnCancelarPagamento.setBorder(null);
        btnCancelarPagamento.setBorderPainted(false);
        btnCancelarPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPagamentoActionPerformed(evt);
            }
        });

        tblPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPagamentoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblPagamento);

        ckbExcluirPagamento.setBackground(new java.awt.Color(201, 232, 242));
        ckbExcluirPagamento.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        ckbExcluirPagamento.setForeground(new java.awt.Color(153, 0, 0));
        ckbExcluirPagamento.setText("Excluir");

        javax.swing.GroupLayout jPanelTipoPagamentoLayout = new javax.swing.GroupLayout(jPanelTipoPagamento);
        jPanelTipoPagamento.setLayout(jPanelTipoPagamentoLayout);
        jPanelTipoPagamentoLayout.setHorizontalGroup(
            jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoPagamentoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbExcluirPagamento)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTipoPagamentoLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblListaMenus3)
                        .addGroup(jPanelTipoPagamentoLayout.createSequentialGroup()
                            .addComponent(btnSalvarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPesquisarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btnCancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDescricao2))
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        jPanelTipoPagamentoLayout.setVerticalGroup(
            jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoPagamentoLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(ckbExcluirPagamento)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTipoPagamentoLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(txtDescricao2)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                    .addComponent(lblListaMenus3)
                    .addGap(250, 250, 250)
                    .addGroup(jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSalvarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelTipoPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(56, 56, 56)))
        );

        jTablePanel.addTab("Tipo Pagamento", jPanelTipoPagamento);

        jPanelAcesso.setBackground(new java.awt.Color(201, 232, 242));

        lblListaMenus2.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblListaMenus2.setText("Lista de Acessos:");

        tblAcessos.setBackground(new java.awt.Color(64, 87, 184));
        tblAcessos.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblAcessos.setForeground(new java.awt.Color(255, 255, 255));
        tblAcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAcessos.setGridColor(new java.awt.Color(64, 87, 184));
        tblAcessos.setSelectionForeground(new java.awt.Color(79, 109, 234));
        tblAcessos.setShowGrid(true);
        tblAcessos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAcessosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblAcessos);

        btnSalvarAcesso.setBackground(new java.awt.Color(61, 189, 61));
        btnSalvarAcesso.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvarAcesso.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAcesso.setText("Salvar");
        btnSalvarAcesso.setBorder(null);
        btnSalvarAcesso.setBorderPainted(false);
        btnSalvarAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAcessoActionPerformed(evt);
            }
        });

        btnProcurarAcesso.setBackground(new java.awt.Color(51, 102, 255));
        btnProcurarAcesso.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnProcurarAcesso.setForeground(new java.awt.Color(255, 255, 255));
        btnProcurarAcesso.setText("Procurar");
        btnProcurarAcesso.setBorder(null);
        btnProcurarAcesso.setBorderPainted(false);
        btnProcurarAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcurarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarAcessoActionPerformed(evt);
            }
        });

        btnCancelarAcesso.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarAcesso.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnCancelarAcesso.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAcesso.setText("Cancelar");
        btnCancelarAcesso.setBorder(null);
        btnCancelarAcesso.setBorderPainted(false);
        btnCancelarAcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAcessoActionPerformed(evt);
            }
        });

        lblMenuAcesso.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblMenuAcesso.setText("Menu");

        lblPerfilAcesso.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblPerfilAcesso.setText("Perfil");

        ckbExcluirAcesso.setBackground(new java.awt.Color(201, 232, 242));
        ckbExcluirAcesso.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        ckbExcluirAcesso.setForeground(new java.awt.Color(153, 0, 0));
        ckbExcluirAcesso.setText("Excluir");
        ckbExcluirAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbExcluirAcessoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcessoLayout = new javax.swing.GroupLayout(jPanelAcesso);
        jPanelAcesso.setLayout(jPanelAcessoLayout);
        jPanelAcessoLayout.setHorizontalGroup(
            jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcessoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAcessoLayout.createSequentialGroup()
                        .addGroup(jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblListaMenus2)
                            .addGroup(jPanelAcessoLayout.createSequentialGroup()
                                .addComponent(btnSalvarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProcurarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnCancelarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanelAcessoLayout.createSequentialGroup()
                        .addGroup(jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbExcluirAcesso)
                            .addGroup(jPanelAcessoLayout.createSequentialGroup()
                                .addComponent(lblPerfilAcesso)
                                .addGap(18, 18, 18)
                                .addComponent(ckbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMenuAcesso)
                                .addGap(18, 18, 18)
                                .addComponent(ckbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelAcessoLayout.setVerticalGroup(
            jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcessoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerfilAcesso)
                    .addComponent(lblMenuAcesso)
                    .addComponent(ckbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ckbExcluirAcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(lblListaMenus2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProcurarAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );

        jTablePanel.addTab("Acesso", jPanelAcesso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTablePanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTablePanel)
        );

        jTablePanel.getAccessibleContext().setAccessibleName("Tipo Pagamento");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblMenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenusMouseClicked
        if (tblMenus.getSelectedRow() >= 0) {
            
            acaoTela = eAcaoTela.EDITAR.getValor();
            GerenciarBotoes();
            int id = Integer.parseInt(tblMenus.getModel().getValueAt(tblMenus.getSelectedRow(), 0).toString());
            
            recuperarMenu(id);
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para editar!");
        }
    }//GEN-LAST:event_tblMenusMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        GerenciarBotoes();
        if (acaoTela == eAcaoTela.VISUALIZAR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        if (acaoTela == eAcaoTela.ABRIR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        
        MenuController menuController = new MenuController();
        
        boolean valid = preencherMenu(this._menu);
        
        if (valid) {
            
            switch (acaoTela) {
                case 1:
                    if (menuController.save(this._menu)) {
                        JOptionPane.showMessageDialog(null, "Menu cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Menu", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    if (menuController.update(this._menu)) {
                        JOptionPane.showMessageDialog(null, "Menu atualizado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Menu", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 6:
                    Date dt = new Date();
                    
                    this._menu.setDtDel(dt);
                    
                    if (this.usuSystem == null) {
                        this._menu.setUsuDel(1);
                    } else {
                        this._menu.setUsuInclus(this.usuSystem.getId());
                    }
                    
                    if (menuController.finishValidity(this._menu)) {
                        JOptionPane.showMessageDialog(null, "Menu deletado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Menu", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;
            }
            
            LimparCampos();
            LoadTable();
            acaoTela = eAcaoTela.ABRIR.getValor();
            GerenciarBotoes();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        GerenciarBotoes();
        
        MenuController menuController = new MenuController();
        
        MenuModel entity = new MenuModel();
        
        try {
            if (entity.validString(txtMenu.getText())) {
                entity.setMenu(txtMenu.getText());
            }
            
            if (entity.validString(txaDescricao.getText())) {
                entity.setDescMenu(txaDescricao.getText());
            }
            if (ckbExcluir.isSelected()) {
                entity.setUsuDel(-1);
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        
        LoadTableMenu(entity);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCamposMenu();
        this._menu = null;
        acaoTela = eAcaoTela.ABRIR.getValor();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void LimparCamposMenu() {
        txtMenu.setText("");
        txaDescricao.setText("");
    }

    private void tblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerfilMouseClicked
        if (tblPerfil.getSelectedRow() >= 0) {
            
            acaoTela = eAcaoTela.EDITAR.getValor();
            GerenciarBotoes();
            int id = Integer.parseInt(tblPerfil.getModel().getValueAt(tblPerfil.getSelectedRow(), 0).toString());
            
            recuperarPerfil(id);
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para editar!");
        }
    }//GEN-LAST:event_tblPerfilMouseClicked

    private void btnSalvarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerfilActionPerformed
        GerenciarBotoes();
        if (acaoTela == eAcaoTela.VISUALIZAR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        if (acaoTela == eAcaoTela.ABRIR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        
        PerfilController perfilController = new PerfilController();
        
        boolean valid = preencherPerfil(this._perfil);
        
        if (valid) {
            
            switch (acaoTela) {
                case 1:
                    if (perfilController.save(this._perfil)) {
                        JOptionPane.showMessageDialog(null, "Perfil cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    if (perfilController.update(this._perfil)) {
                        JOptionPane.showMessageDialog(null, "Perfil atualizado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 6:
                    Date dt = new Date();
                    
                    this._perfil.setDtDel(dt);
                    
                    if (this.usuSystem == null) {
                        this._perfil.setUsuDel(1);
                    } else {
                        this._perfil.setUsuInclus(this.usuSystem.getId());
                    }
                    
                    if (perfilController.finishValidity(this._perfil)) {
                        JOptionPane.showMessageDialog(null, "Perfil deletado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;
            }
            
            LimparCampos();
            LoadTable();
            acaoTela = eAcaoTela.ABRIR.getValor();
            GerenciarBotoes();
        }
    }//GEN-LAST:event_btnSalvarPerfilActionPerformed

    private void btnPesquisarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPerfilActionPerformed
        
        GerenciarBotoes();
        
        PerfilModel entity = new PerfilModel();
        
        try {
            if (entity.validString(txtPerfil.getText())) {
                entity.setPerfile(txtPerfil.getText());
            }
            
            if (entity.validString(txaPerfil.getText())) {
                entity.setDescPerfil(txaPerfil.getText());
            }
            if (ckbExcluir.isSelected()) {
                entity.setUsuDel(-1);
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        
        LoadTablePerfil(entity);
    }//GEN-LAST:event_btnPesquisarPerfilActionPerformed
    
    private void LoadTablePerfil(PerfilModel entity) {
        
        PerfilController perfilController = new PerfilController();
        
        List<PerfilModel> perfils = perfilController.findAll(entity);
        
        DefaultTableModel tbPerfil = new DefaultTableModel();
        
        tbPerfil.addColumn("ID");
        tbPerfil.addColumn("Nome");
        tbPerfil.addColumn("Descrição");
        tbPerfil.addColumn("Usu. Inclusão");
        tbPerfil.addColumn("Dt. Inclusão");
        
        tblPerfil.setModel(tbPerfil);
        
        tblPerfil.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPerfil.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblPerfil.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblPerfil.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblPerfil.getColumnModel().getColumn(0).setPreferredWidth(100);
        
        tbPerfil.setRowCount(0);
        
        if (perfils == null || perfils.size() == 0) {
            tbPerfil.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (PerfilModel perfil : perfils) {
            tbPerfil.addRow(new String[]{String.valueOf(perfil.getId()),
                perfil.getPerfil(), perfil.getDescPerfil(), "Dt", "Dt"});
        }
        
    }

    private void btnCancelarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPerfilActionPerformed
        LimparCamposPerfil();
        _perfil = null;
        acaoTela = eAcaoTela.ABRIR.getValor();
    }//GEN-LAST:event_btnCancelarPerfilActionPerformed
    
    private void LimparCamposPerfil() {
        txtPerfil.setText("");
        txaPerfil.setText("");
        
    }
    private void tblAcessosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAcessosMouseClicked
        
        if (tblAcessos.getSelectedRow() >= 0) {
            
            acaoTela = eAcaoTela.EDITAR.getValor();
            GerenciarBotoes();
            int id = Integer.parseInt(tblAcessos.getModel().getValueAt(tblAcessos.getSelectedRow(), 0).toString());
            
            recuperarAcesso(id);
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para editar!");
        }

    }//GEN-LAST:event_tblAcessosMouseClicked

    private void btnSalvarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAcessoActionPerformed
        
        GerenciarBotoes();
        
        if (acaoTela == eAcaoTela.VISUALIZAR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        if (acaoTela == eAcaoTela.ABRIR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        
        AcessoController acessoController = new AcessoController();
        
        boolean valid = preencherAcesso(this._acessoModel);
        
        if (valid) {
            
            switch (acaoTela) {
                case 1:
                    if (acessoController.save(this._acessoModel)) {
                        JOptionPane.showMessageDialog(null, "Perfil cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
//                    if (acessoController.update(this._acessoModel)) {
//                        JOptionPane.showMessageDialog(null, "Perfil atualizado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
//                    }
                    break;
                case 6:
                    Date dt = new Date();
                    
                    this._menu.setDtDel(dt);
                    
                    if (this.usuSystem == null) {
                        this._menu.setUsuDel(1);
                    } else {
                        this._menu.setUsuInclus(this.usuSystem.getId());
                    }
                    
                    if (acessoController.finishValidity(this._acessoModel)) {
                        JOptionPane.showMessageDialog(null, "Perfil deletado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;
            }
            
            LimparCampos();
            LoadTable();
            acaoTela = eAcaoTela.ABRIR.getValor();
            GerenciarBotoes();
        }
    }//GEN-LAST:event_btnSalvarAcessoActionPerformed

    private void btnProcurarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarAcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcurarAcessoActionPerformed

    private void btnCancelarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAcessoActionPerformed
        this._acessoModel = null;
        acaoTela = eAcaoTela.ABRIR.getValor();
    }//GEN-LAST:event_btnCancelarAcessoActionPerformed

    private void btnSalvarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPagamentoActionPerformed
        GerenciarBotoes();
        if (acaoTela == eAcaoTela.VISUALIZAR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        if (acaoTela == eAcaoTela.ABRIR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        
        TipoPagamentoController pagamentoController = new TipoPagamentoController();
        
        boolean valid = preencherPagamento(this._pagamento);
        
        if (valid) {
            
            switch (acaoTela) {
                case 1:
                    if (pagamentoController.save(this._pagamento)) {
                        JOptionPane.showMessageDialog(null, "Perfil cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    if (pagamentoController.update(this._pagamento)) {
                        JOptionPane.showMessageDialog(null, "Perfil atualizado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 6:
                    Date dt = new Date();
                    
                    this._pagamento.setDtDel(dt);
                    
                    if (this.usuSystem == null) {
                        this._pagamento.setUsuDel(1);
                    } else {
                        this._pagamento.setUsuInclus(this.usuSystem.getId());
                    }
                    
                    if (pagamentoController.finishValidity(this._pagamento)) {
                        JOptionPane.showMessageDialog(null, "Perfil deletado com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Houve um erro na exclusão do Perfil", "Erro", JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    break;
            }
            
            LimparCampos();
            LoadTable();
            acaoTela = eAcaoTela.ABRIR.getValor();
            GerenciarBotoes();
        }
    }//GEN-LAST:event_btnSalvarPagamentoActionPerformed

    private void btnPesquisarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPagamentoActionPerformed
        
        GerenciarBotoes();
        
        TipoPagamentoModel entity = new TipoPagamentoModel();
        
        try {
            if (entity.validString(txaPagamento.getText())) {
                entity.setDescPagamento(txaPagamento.getText());
            }
            
            if (ckbExcluir.isSelected()) {
                entity.setUsuDel(-1);
            }
            
        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        }
        
        LoadTablePagamento(entity);
        

    }//GEN-LAST:event_btnPesquisarPagamentoActionPerformed
    
    private void LoadTablePagamento(TipoPagamentoModel entity) {
        
        TipoPagamentoController pagamentoController = new TipoPagamentoController();
        List<TipoPagamentoModel> pagamentos = pagamentoController.findAll(entity);
        
        DefaultTableModel tbPagamentos = new DefaultTableModel();
        tbPagamentos.addColumn("ID");
        tbPagamentos.addColumn("Desc. Pagamento");
        tbPagamentos.addColumn("Usu. Inclusão");
        tbPagamentos.addColumn("Dt. Inclusão");
        
        tblPagamento.setModel(tbPagamentos);
        
        tblPagamento.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblPagamento.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblPagamento.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblPagamento.getColumnModel().getColumn(1).setPreferredWidth(50);
        
        tbPagamentos.setRowCount(0);
        
        if (pagamentos == null || pagamentos.size() == 0) {
            tbPagamentos.addRow(new String[]{String.valueOf("Sem Registro"),
                "Sem Registro", "Sem Registro", "Sem Registro"});
        }
        
        for (TipoPagamentoModel pagamento : pagamentos) {
            tbPagamentos.addRow(new String[]{String.valueOf(pagamento.getId()),
                pagamento.getDescPagamento(), "Dt", "Dt"});
        }
    }

    private void btnCancelarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPagamentoActionPerformed
        txaPagamento.setText("");
        _pagamento = null;
        acaoTela = eAcaoTela.ABRIR.getValor();
    }//GEN-LAST:event_btnCancelarPagamentoActionPerformed

    private void ckbExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbExcluirMouseClicked
        

    }//GEN-LAST:event_ckbExcluirMouseClicked

    private void ckbExcluirPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbExcluirPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbExcluirPerfilMouseClicked

    private void tblPagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPagamentoMouseClicked
        if (tblPagamento.getSelectedRow() >= 0) {
            
            acaoTela = eAcaoTela.EDITAR.getValor();
            GerenciarBotoes();
            int id = Integer.parseInt(tblPagamento.getModel().getValueAt(tblPagamento.getSelectedRow(), 0).toString());
            
            recuperarPagamento(id);
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para editar!");
        }
    }//GEN-LAST:event_tblPagamentoMouseClicked

    private void ckbExcluirAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbExcluirAcessoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbExcluirAcessoMouseClicked

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
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarAcesso;
    private javax.swing.JButton btnCancelarPagamento;
    private javax.swing.JButton btnCancelarPerfil;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarPagamento;
    private javax.swing.JButton btnPesquisarPerfil;
    private javax.swing.JButton btnProcurarAcesso;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAcesso;
    private javax.swing.JButton btnSalvarPagamento;
    private javax.swing.JButton btnSalvarPerfil;
    private javax.swing.JCheckBox ckbExcluir;
    private javax.swing.JCheckBox ckbExcluirAcesso;
    private javax.swing.JCheckBox ckbExcluirPagamento;
    private javax.swing.JCheckBox ckbExcluirPerfil;
    private javax.swing.JComboBox<String> ckbMenu;
    private javax.swing.JComboBox<String> ckbPerfil;
    private javax.swing.JPanel jPanelAcesso;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelTipoPagamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTablePanel;
    private javax.swing.JLabel lblListaMenus;
    private javax.swing.JLabel lblListaMenus1;
    private javax.swing.JLabel lblListaMenus2;
    private javax.swing.JLabel lblListaMenus3;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMenuAcesso;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPerfilAcesso;
    private javax.swing.JTable tblAcessos;
    private javax.swing.JTable tblMenus;
    private javax.swing.JTable tblPagamento;
    private javax.swing.JTable tblPerfil;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextArea txaPagamento;
    private javax.swing.JTextArea txaPerfil;
    private javax.swing.JLabel txtDescricao;
    private javax.swing.JLabel txtDescricao1;
    private javax.swing.JLabel txtDescricao2;
    private javax.swing.JTextField txtMenu;
    private javax.swing.JTextField txtPerfil;
    // End of variables declaration//GEN-END:variables
}
