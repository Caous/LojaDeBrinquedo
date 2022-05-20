/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import javax.swing.JFrame;

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

        jpnBg = new javax.swing.JPanel();
        jpnMenus = new javax.swing.JPanel();
        lblBemVindo = new java.awt.Label();
        lblUsuario = new java.awt.Label();
        imgUser = new javax.swing.JLabel();
        jpnHome = new javax.swing.JPanel();
        imgHome = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jpnVenda = new javax.swing.JPanel();
        imgCompras = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();
        jpnClientes = new javax.swing.JPanel();
        imgClientes = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        jpnProdutos = new javax.swing.JPanel();
        imgProdutos = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        jpnFornecedor = new javax.swing.JPanel();
        imgFornecedor = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        jpnRelatorio = new javax.swing.JPanel();
        imgRelatorio = new javax.swing.JLabel();
        lblRelatorio = new javax.swing.JLabel();
        jpnConfiguracoes = new javax.swing.JPanel();
        imgConfiguracao = new javax.swing.JLabel();
        lblConfiguracao = new javax.swing.JLabel();
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
        txtFiltroDataFim = new javax.swing.JTextField();
        txtFiltroDataIni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jpnBg.setBackground(new java.awt.Color(79, 109, 234));

        jpnMenus.setBackground(new java.awt.Color(64, 87, 184));

        lblBemVindo.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lblBemVindo.setText("Bem-vindo,");

        lblUsuario.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");

        imgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/user.png"))); // NOI18N

        jpnHome.setBackground(new java.awt.Color(79, 109, 234));
        jpnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnHomeMouseClicked(evt);
            }
        });
        jpnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/home.png"))); // NOI18N
        jpnHome.add(imgHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        lblHome.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Home");
        jpnHome.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnVenda.setBackground(new java.awt.Color(64, 87, 184));
        jpnVenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgCompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/compras.png"))); // NOI18N
        jpnVenda.add(imgCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        lblVenda.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblVenda.setForeground(new java.awt.Color(255, 255, 255));
        lblVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVenda.setText("Venda");
        jpnVenda.add(lblVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnClientes.setBackground(new java.awt.Color(64, 87, 184));
        jpnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/cliente.png"))); // NOI18N
        jpnClientes.add(imgClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblClientes.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setText("Clientes");
        jpnClientes.add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnProdutos.setBackground(new java.awt.Color(64, 87, 184));
        jpnProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/produtos.png"))); // NOI18N
        jpnProdutos.add(imgProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblProdutos.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("Produtos");
        jpnProdutos.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnFornecedor.setBackground(new java.awt.Color(64, 87, 184));
        jpnFornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/fornecedor.png"))); // NOI18N
        jpnFornecedor.add(imgFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblFornecedor.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFornecedor.setText("Fornecedor");
        jpnFornecedor.add(lblFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnRelatorio.setBackground(new java.awt.Color(64, 87, 184));
        jpnRelatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/relatorio.png"))); // NOI18N
        jpnRelatorio.add(imgRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblRelatorio.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRelatorio.setText("Relatórios");
        jpnRelatorio.add(lblRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jpnConfiguracoes.setBackground(new java.awt.Color(64, 87, 184));
        jpnConfiguracoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgConfiguracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgConfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Img/configuracoes.png"))); // NOI18N
        jpnConfiguracoes.add(imgConfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblConfiguracao.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblConfiguracao.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfiguracao.setText("Configurações");
        jpnConfiguracoes.add(lblConfiguracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        javax.swing.GroupLayout jpnMenusLayout = new javax.swing.GroupLayout(jpnMenus);
        jpnMenus.setLayout(jpnMenusLayout);
        jpnMenusLayout.setHorizontalGroup(
            jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgUser)
                .addContainerGap())
            .addComponent(jpnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenusLayout.createSequentialGroup()
                .addGroup(jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnMenusLayout.setVerticalGroup(
            jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenusLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpnMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgUser)
                    .addGroup(jpnMenusLayout.createSequentialGroup()
                        .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnProdVendido.setBackground(new java.awt.Color(64, 87, 184));
        jpnProdVendido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnProdVendido.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel3.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Produtos Vendidos");

        jLabel2.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("0");

        javax.swing.GroupLayout jpnProdVendidoLayout = new javax.swing.GroupLayout(jpnProdVendido);
        jpnProdVendido.setLayout(jpnProdVendidoLayout);
        jpnProdVendidoLayout.setHorizontalGroup(
            jpnProdVendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdVendidoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnProdVendidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
        );
        jpnProdVendidoLayout.setVerticalGroup(
            jpnProdVendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdVendidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTotalVendas.setBackground(new java.awt.Color(64, 87, 184));
        jpnTotalVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnTotalVendas.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel6.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total de Vendas");

        jLabel7.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("R$ 0");

        javax.swing.GroupLayout jpnTotalVendasLayout = new javax.swing.GroupLayout(jpnTotalVendas);
        jpnTotalVendas.setLayout(jpnTotalVendasLayout);
        jpnTotalVendasLayout.setHorizontalGroup(
            jpnTotalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTotalVendasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTotalVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(50, 50, 50))
        );
        jpnTotalVendasLayout.setVerticalGroup(
            jpnTotalVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTotalVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnDescontos.setBackground(new java.awt.Color(64, 87, 184));
        jpnDescontos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpnDescontos.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel8.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descontos Aplicados");

        jLabel9.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("R$ 0");

        javax.swing.GroupLayout jpnDescontosLayout = new javax.swing.GroupLayout(jpnDescontos);
        jpnDescontos.setLayout(jpnDescontosLayout);
        jpnDescontosLayout.setHorizontalGroup(
            jpnDescontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDescontosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDescontosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(62, 62, 62))
        );
        jpnDescontosLayout.setVerticalGroup(
            jpnDescontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDescontosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(64, 87, 184));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(64, 87, 184));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Valores", "Quantidade", "Vendedor"
            }
        ));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        lblFiltroData.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblFiltroData.setForeground(new java.awt.Color(255, 255, 255));
        lblFiltroData.setText("Filtro por data");

        txtFiltroDataFim.setBackground(new java.awt.Color(64, 87, 184));
        txtFiltroDataFim.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtFiltroDataFim.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltroDataFim.setText("18/04/2022");
        txtFiltroDataFim.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtFiltroDataIni.setBackground(new java.awt.Color(64, 87, 184));
        txtFiltroDataIni.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtFiltroDataIni.setForeground(new java.awt.Color(255, 255, 255));
        txtFiltroDataIni.setText("01/01/2022");
        txtFiltroDataIni.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnBgLayout = new javax.swing.GroupLayout(jpnBg);
        jpnBg.setLayout(jpnBgLayout);
        jpnBgLayout.setHorizontalGroup(
            jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBgLayout.createSequentialGroup()
                .addComponent(jpnMenus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnBgLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFiltroData)
                            .addGroup(jpnBgLayout.createSequentialGroup()
                                .addComponent(jpnProdVendido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jpnDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnBgLayout.createSequentialGroup()
                                .addComponent(txtFiltroDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFiltroDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 100, Short.MAX_VALUE))
        );
        jpnBgLayout.setVerticalGroup(
            jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnBgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblFiltroData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltroDataIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFiltroDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jpnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnProdVendido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jpnHomeMouseClicked

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
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgClientes;
    private javax.swing.JLabel imgCompras;
    private javax.swing.JLabel imgConfiguracao;
    private javax.swing.JLabel imgFornecedor;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgProdutos;
    private javax.swing.JLabel imgRelatorio;
    private javax.swing.JLabel imgUser;
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
    private javax.swing.JPanel jpnVenda;
    private java.awt.Label lblBemVindo;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblConfiguracao;
    private javax.swing.JLabel lblFiltroData;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatorio;
    private java.awt.Label lblUsuario;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JTextField txtFiltroDataFim;
    private javax.swing.JTextField txtFiltroDataIni;
    // End of variables declaration//GEN-END:variables
}
