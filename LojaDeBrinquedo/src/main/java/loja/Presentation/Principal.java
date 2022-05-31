/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loja.Presentation;

import java.util.Date;
import javax.swing.JFrame;
import loja.Dominio.Util.PropertiesValidator;
import loja.Presentation.Controller.LoginController;
import javax.swing.JOptionPane;
import loja.Dominio.Model.UserModel;

/**
 *
 * @author Gustavo Nascimento
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public Principal(UserModel user) {
        initComponents();
        this.userSystem = user;
        lblUsuario.setText(user.getNome());
        Date dt = new Date();
        dtFiltroInicio.setDate(dt);
        dtFiltroFim.setDate(dt);
    }
    private UserModel userSystem;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBg = new javax.swing.JPanel();
        jpnMenus = new javax.swing.JPanel();
        lblBemVindo = new java.awt.Label();
        jpnHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        jpnVenda = new javax.swing.JPanel();
        lblVenda = new javax.swing.JLabel();
        jpnClientes = new javax.swing.JPanel();
        lblClientes = new javax.swing.JLabel();
        jpnProdutos = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        jpnFornecedor = new javax.swing.JPanel();
        lblFornecedor = new javax.swing.JLabel();
        jpnRelatorio = new javax.swing.JPanel();
        lblRelatorio = new javax.swing.JLabel();
        jpnConfiguracoes = new javax.swing.JPanel();
        lblConfiguracao = new javax.swing.JLabel();
        jpnUsuario = new javax.swing.JPanel();
        lblUsu = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jpnProdVendido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpnTotalVendas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpnDescontos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblFiltroData = new javax.swing.JLabel();
        dtFiltroInicio = new com.toedter.calendar.JDateChooser();
        dtFiltroFim = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnBg.setBackground(new java.awt.Color(201, 232, 242));

        jpnMenus.setBackground(new java.awt.Color(64, 87, 184));

        lblBemVindo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("Bem-vindo,");

        jpnHome.setBackground(new java.awt.Color(79, 109, 234));
        jpnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnHomeMouseClicked(evt);
            }
        });
        jpnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Home");
        jpnHome.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnVenda.setBackground(new java.awt.Color(64, 87, 184));
        jpnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnVendaMouseClicked(evt);
            }
        });
        jpnVenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVenda.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblVenda.setForeground(new java.awt.Color(255, 255, 255));
        lblVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenda.setText("Venda");
        jpnVenda.add(lblVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnClientes.setBackground(new java.awt.Color(64, 87, 184));
        jpnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnClientesMouseClicked(evt);
            }
        });
        jpnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setText("Clientes");
        jpnClientes.add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnProdutos.setBackground(new java.awt.Color(64, 87, 184));
        jpnProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnProdutosMouseClicked(evt);
            }
        });
        jpnProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProdutos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("Produtos");
        jpnProdutos.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnFornecedor.setBackground(new java.awt.Color(64, 87, 184));
        jpnFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnFornecedorMouseClicked(evt);
            }
        });
        jpnFornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFornecedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFornecedor.setText("Fornecedor");
        jpnFornecedor.add(lblFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnRelatorio.setBackground(new java.awt.Color(64, 87, 184));
        jpnRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnRelatorioMouseClicked(evt);
            }
        });
        jpnRelatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRelatorio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorio.setText("Relatórios");
        jpnRelatorio.add(lblRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnConfiguracoes.setBackground(new java.awt.Color(64, 87, 184));
        jpnConfiguracoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnConfiguracoesMouseClicked(evt);
            }
        });
        jpnConfiguracoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblConfiguracao.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblConfiguracao.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfiguracao.setText("Configurações");
        jpnConfiguracoes.add(lblConfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnUsuario.setBackground(new java.awt.Color(64, 87, 184));
        jpnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnUsuarioMouseClicked(evt);
            }
        });
        jpnUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblUsu.setForeground(new java.awt.Color(255, 255, 255));
        lblUsu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsu.setText("Usuário");
        jpnUsuario.add(lblUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lblUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnMenusLayout = new javax.swing.GroupLayout(jpnMenus);
        jpnMenus.setLayout(jpnMenusLayout);
        jpnMenusLayout.setHorizontalGroup(
            jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenusLayout.createSequentialGroup()
                .addGroup(jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jpnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jpnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jpnRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jpnConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jpnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jpnMenusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenusLayout.setVerticalGroup(
            jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenusLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jpnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        jpnProdVendido.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Produtos Vendidos");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("0");

        javax.swing.GroupLayout jpnProdVendidoLayout = new javax.swing.GroupLayout(jpnProdVendido);
        jpnProdVendido.setLayout(jpnProdVendidoLayout);
        jpnProdVendidoLayout.setHorizontalGroup(
            jpnProdVendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdVendidoLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jpnProdVendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnProdVendidoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnProdVendidoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23))))
        );
        jpnProdVendidoLayout.setVerticalGroup(
            jpnProdVendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdVendidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnTotalVendas.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Total de Vendas");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("R$ 0");

        javax.swing.GroupLayout jpnTotalVendasLayout = new javax.swing.GroupLayout(jpnTotalVendas);
        jpnTotalVendas.setLayout(jpnTotalVendasLayout);
        jpnTotalVendasLayout.setHorizontalGroup(
            jpnTotalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTotalVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
            .addGroup(jpnTotalVendasLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTotalVendasLayout.setVerticalGroup(
            jpnTotalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTotalVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnDescontos.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setText("Descontos Aplicados");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setText("R$ 0");

        javax.swing.GroupLayout jpnDescontosLayout = new javax.swing.GroupLayout(jpnDescontos);
        jpnDescontos.setLayout(jpnDescontosLayout);
        jpnDescontosLayout.setHorizontalGroup(
            jpnDescontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDescontosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnDescontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDescontosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDescontosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(65, 65, 65))))
        );
        jpnDescontosLayout.setVerticalGroup(
            jpnDescontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDescontosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(64, 87, 184));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(64, 87, 184));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        lblFiltroData.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblFiltroData.setText("Filtro por data");

        javax.swing.GroupLayout jpnBgLayout = new javax.swing.GroupLayout(jpnBg);
        jpnBg.setLayout(jpnBgLayout);
        jpnBgLayout.setHorizontalGroup(
            jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBgLayout.createSequentialGroup()
                .addComponent(jpnMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBgLayout.createSequentialGroup()
                        .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtFiltroInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltroData))
                        .addGap(18, 18, 18)
                        .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnBgLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jpnProdVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpnDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dtFiltroFim, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        jpnBgLayout.setVerticalGroup(
            jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnBgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblFiltroData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtFiltroInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtFiltroFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnProdVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpnBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnHomeMouseClicked

    }//GEN-LAST:event_jpnHomeMouseClicked

    private void jpnVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnVendaMouseClicked
        Venda venda = new Venda(this.userSystem);
        venda.setVisible(true);

    }//GEN-LAST:event_jpnVendaMouseClicked

    private void jpnUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnUsuarioMouseClicked
        Usuario usu = new Usuario(this.userSystem);

        usu.setVisible(true);
    }//GEN-LAST:event_jpnUsuarioMouseClicked

    private void jpnRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnRelatorioMouseClicked
        Relatorio rel = new Relatorio(this.userSystem);

        rel.setVisible(true);
    }//GEN-LAST:event_jpnRelatorioMouseClicked

    private void jpnFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnFornecedorMouseClicked
        Fornecedor fornece = new Fornecedor(this.userSystem);

        fornece.setVisible(true);
    }//GEN-LAST:event_jpnFornecedorMouseClicked

    private void jpnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnProdutosMouseClicked
        Produto prod = new Produto(this.userSystem);
        prod.setVisible(true);
    }//GEN-LAST:event_jpnProdutosMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jpnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnClientesMouseClicked
        Cliente cli = new Cliente(this.userSystem);
        cli.setVisible(true);
    }//GEN-LAST:event_jpnClientesMouseClicked

    private void jpnConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnConfiguracoesMouseClicked
        Configuracao conf = new Configuracao(this.userSystem);
        conf.setVisible(true);
    }//GEN-LAST:event_jpnConfiguracoesMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dtFiltroFim;
    private com.toedter.calendar.JDateChooser dtFiltroInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnBg;
    private javax.swing.JPanel jpnClientes;
    private javax.swing.JPanel jpnConfiguracoes;
    private javax.swing.JPanel jpnDescontos;
    private javax.swing.JPanel jpnFornecedor;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenus;
    private javax.swing.JPanel jpnProdVendido;
    private javax.swing.JPanel jpnProdutos;
    private javax.swing.JPanel jpnRelatorio;
    private javax.swing.JPanel jpnTotalVendas;
    private javax.swing.JPanel jpnUsuario;
    private javax.swing.JPanel jpnVenda;
    private java.awt.Label lblBemVindo;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblConfiguracao;
    private javax.swing.JLabel lblFiltroData;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVenda;
    // End of variables declaration//GEN-END:variables
}
