/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loja.Presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import loja.Dominio.Model.ClienteModel;
import loja.Dominio.Model.ProdutoModel;
import loja.Dominio.Model.TipoPagamentoModel;
import loja.Dominio.Model.UserModel;
import loja.Dominio.Util.PropertiesValidator;
import loja.Dominio.Util.eAcaoTela;
import loja.Presentation.Controller.ClienteController;
import loja.Presentation.Controller.ProdutoController;
import loja.Presentation.Controller.TipoPagamentoController;

/**
 *
 * @author Gustavo Nascimento
 */
public class Venda extends javax.swing.JFrame {

    /**
     * Creates new form Venda
     */
    public Venda() {
        initComponents();
        carregarPagamento();
    }

    public Venda(UserModel usu) {
        initComponents();
        this.usuModel = usu;
        carregarPagamento();
    }

    private UserModel usuModel;
    private ClienteModel cliente;
    private List<ProdutoModel> produtos;
    private int acaoTela;
    private ProdutoModel prodTemp;

    private void GerenciarBotoes() {

    }

    private void LoadTableProduto(List<ProdutoModel> entity) {

        DefaultTableModel tmProduto = new DefaultTableModel();
        tmProduto.addColumn("ID");
        tmProduto.addColumn("Nome");
        tmProduto.addColumn("Nome Fantasia");
        tmProduto.addColumn("Empresa");
        tmProduto.addColumn("Cpf/Cnjp");
        tmProduto.addColumn("E-mail");
        tmProduto.addColumn("Celular");
        tmProduto.addColumn("Endereço");
        tmProduto.addColumn("Ativo");

        tblProdutos.setModel(tmProduto);

        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);

        tmProduto.setRowCount(0);

        for (ProdutoModel prod : entity) {
            tmProduto.addRow(new String[]{String.valueOf(prod.getId()),
                prod.getNomeProduto(), "Ativo"});
        }
    }

    private void carregarPagamento() {
        TipoPagamentoController pagamentoController = new TipoPagamentoController();
        TipoPagamentoModel pagamentoFiltro = new TipoPagamentoModel();
        List<TipoPagamentoModel> pagamento = pagamentoController.findAll(pagamentoFiltro);

        for (int i = 0; i < pagamento.size(); i++) {
            cbxPagamento.addItem(pagamento.get(i).getDescPagamento());
        }

    }

    private void PreencherProduto(ProdutoModel prodm) {

        if (prodm == null) {
            prodm = new ProdutoModel();
        }

        try {
            if (prodm.validString(txtNome.getText())) {
                prodm.setNomeProduto(txtNome.getText());
            }

            if (prodm.validString(txtCategoria.getText())) {
                prodm.setCategoria(txtCategoria.getText());
            }

            if (prodm.validString(txtMarca.getText())) {
                prodm.setMarca(txtMarca.getText());
            }

            if (prodm.validInt(Integer.parseInt(txtQtd.getText()))) {
                prodm.setQtd(Integer.parseInt(txtQtd.getText()));
            }

            if (prodm.validInt(Integer.parseInt(txtValor.getText()))) {
                prodm.setValor(Integer.parseInt(txtValor.getText()));
            }

            if (prodm.validInt(Integer.parseInt(txtAvaliacao.getText()))) {
                prodm.setAvaliacao(Integer.parseInt(txtAvaliacao.getText()));
            }

            if (prodm.validString(txtValidade.getText())) {
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                prodm.setDtValidade(formatter1.parse(txtValidade.getText().replace("/", "-")));
            }

            if (prodm.validInt(Integer.parseInt(txtDesconto.getText()))) {
                prodm.setPorcentagemDesc(Integer.parseInt(txtDesconto.getText()));
            }

        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
        produtos.add(prodm);
    }

    private void CarregarProduto(ProdutoModel produto) {
        prodTemp = produto;
        txtProduto.setText(produto.getNomeProduto());
        txtCategoria.setText(produto.getCategoria());
        txtMarca.setText(produto.getMarca());
        txtValidade.setText(produto.getDtValidade().toString());
        txtQtd.setText(Integer.toString(produto.getQtd()));
        txtValor.setText(Double.toString(produto.getValor()));
        txtAvaliacao.setText(Integer.toString(produto.getAvaliacao()));
        txtDesconto.setText(Double.toString(produto.getPorcentagemDesc()));

    }

    private void LimparCamposProduto() {
        txtProduto.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        txtValidade.setText("");
        txtQtd.setText("");
        txtValor.setText("");
        txtAvaliacao.setText("");
        txtDesconto.setText("");

    }

    private void LimparCamposCliente() {
        txtNome.setText("");
        txtNomeFan.setText("");
        txtEmail.setText("");
        txtContResp.setText("");
        txtCPFCNPJ.setText("");
        txtIM.setText("");
        txtEM.setText("");
        txtTel.setText("");
        txtDtNasc.setText("");
        txtEndereco.setText("");
        txtCEP.setText("");
        txtEstado.setText("");
        txtMunicipio.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jtab = new javax.swing.JTabbedPane();
        jPanelCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ckbClienteCadastrado = new javax.swing.JCheckBox();
        txtCPFCNPJ = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        rbtEmpresa = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtNomeFan = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContResp = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtEM = new javax.swing.JTextField();
        txtIM = new javax.swing.JTextField();
        txtCPFCNPJ1 = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtDtNasc = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        rbtMasc = new javax.swing.JRadioButton();
        rbtFem = new javax.swing.JRadioButton();
        txtMunicipio = new javax.swing.JTextField();
        btnCancelarCliente = new javax.swing.JButton();
        jPanelProdutos = new javax.swing.JPanel();
        txtProduto = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        txtAvaliacao = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtDesconto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRemoverProduto = new javax.swing.JButton();
        btnPesquisarProduto = new javax.swing.JButton();
        btnCancelarProduto = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        jPanelPagamento = new javax.swing.JPanel();
        jpnProdVendido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpnTotalVendas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpnDescontos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvarCompra = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        txtCpfCnpjCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        lblConfirmacao = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JTextField();
        txtEstadoCliente = new javax.swing.JTextField();
        txtMunicipioCliente = new javax.swing.JTextField();
        cbxPagamento = new javax.swing.JComboBox<>();
        lblPagamento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutoFinal = new javax.swing.JTable();
        txtTelCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelCliente.setBackground(new java.awt.Color(201, 232, 242));

        jLabel1.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel1.setText("Possuí cadastro?");

        ckbClienteCadastrado.setBackground(new java.awt.Color(201, 232, 242));
        ckbClienteCadastrado.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        ckbClienteCadastrado.setText("Sim");
        ckbClienteCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbClienteCadastradoActionPerformed(evt);
            }
        });

        txtCPFCNPJ.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCPFCNPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF/CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

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

        rbtEmpresa.setBackground(new java.awt.Color(201, 232, 242));
        rbtEmpresa.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbtEmpresa.setText("Empresa");
        rbtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmpresaActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtNomeFan.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNomeFan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Fantasia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEmail.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtContResp.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtContResp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cont. Responsável", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtTel.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtTel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEM.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtIM.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtIM.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCPFCNPJ1.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCPFCNPJ1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF/CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCel.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Celular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtDtNasc.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtDtNasc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dt. Nascimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEndereco.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCEP.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCEP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtEstado.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        rbtMasc.setBackground(new java.awt.Color(201, 232, 242));
        rbtMasc.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbtMasc.setText("Masculino");

        rbtFem.setBackground(new java.awt.Color(201, 232, 242));
        rbtFem.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        rbtFem.setText("Feminino");

        txtMunicipio.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtMunicipio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        btnCancelarCliente.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnCancelarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.setBorder(null);
        btnCancelarCliente.setBorderPainted(false);
        btnCancelarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtEmpresa)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNomeFan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtContResp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(txtCPFCNPJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtIM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(rbtMasc)
                        .addGap(7, 7, 7)
                        .addComponent(rbtFem))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(ckbClienteCadastrado))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbClienteCadastrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCPFCNPJ))
                .addGap(29, 29, 29)
                .addComponent(rbtEmpresa)
                .addGap(23, 23, 23)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeFan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPFCNPJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtMasc)
                            .addComponent(rbtFem))))
                .addGap(6, 6, 6)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        Jtab.addTab("Cliente", jPanelCliente);

        jPanelProdutos.setBackground(new java.awt.Color(201, 232, 242));

        txtProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtCategoria.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtMarca.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtMarca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtValidade.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtValidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtAvaliacao.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtAvaliacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avaliação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtQtd.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtQtd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtValor.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "R$", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        txtDesconto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtDesconto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Porcentagem %", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N

        tblProdutos.setBackground(new java.awt.Color(64, 87, 184));
        tblProdutos.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProdutos.setGridColor(new java.awt.Color(64, 87, 184));
        tblProdutos.setSelectionForeground(new java.awt.Color(64, 87, 184));
        tblProdutos.setShowGrid(true);
        jScrollPane1.setViewportView(tblProdutos);

        jLabel2.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel2.setText("Carrinho");

        btnRemoverProduto.setBackground(new java.awt.Color(204, 0, 0));
        btnRemoverProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnRemoverProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.setBorder(null);
        btnRemoverProduto.setBorderPainted(false);
        btnRemoverProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });

        btnPesquisarProduto.setBackground(new java.awt.Color(51, 102, 255));
        btnPesquisarProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnPesquisarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarProduto.setText("Procurar");
        btnPesquisarProduto.setBorder(null);
        btnPesquisarProduto.setBorderPainted(false);
        btnPesquisarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        btnCancelarProduto.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelarProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnCancelarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.setBorder(null);
        btnCancelarProduto.setBorderPainted(false);
        btnCancelarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        btnAdicionarProduto.setBackground(new java.awt.Color(61, 189, 61));
        btnAdicionarProduto.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnAdicionarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.setBorder(null);
        btnAdicionarProduto.setBorderPainted(false);
        btnAdicionarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProdutosLayout = new javax.swing.GroupLayout(jPanelProdutos);
        jPanelProdutos.setLayout(jPanelProdutosLayout);
        jPanelProdutosLayout.setHorizontalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutosLayout.createSequentialGroup()
                        .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanelProdutosLayout.createSequentialGroup()
                        .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanelProdutosLayout.setVerticalGroup(
            jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        Jtab.addTab("Produtos", jPanelProdutos);

        jPanelPagamento.setBackground(new java.awt.Color(201, 232, 242));

        jpnProdVendido.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel3.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jLabel3.setText("Produtos Vendidos");

        jLabel4.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel4.setText("0");

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
                .addComponent(jLabel4)
                .addGap(72, 72, 72))
        );
        jpnProdVendidoLayout.setVerticalGroup(
            jpnProdVendidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProdVendidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpnTotalVendas.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel6.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jLabel6.setText("Total de Vendas");

        jLabel7.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
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
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jpnDescontos.setPreferredSize(new java.awt.Dimension(269, 102));

        jLabel8.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        jLabel8.setText("Descontos Aplicados");

        jLabel9.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        jLabel9.setText("R$ 0");

        javax.swing.GroupLayout jpnDescontosLayout = new javax.swing.GroupLayout(jpnDescontos);
        jpnDescontos.setLayout(jpnDescontosLayout);
        jpnDescontosLayout.setHorizontalGroup(
            jpnDescontosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDescontosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnSalvarCompra.setBackground(new java.awt.Color(61, 189, 61));
        btnSalvarCompra.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        btnSalvarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarCompra.setText("Concluír");
        btnSalvarCompra.setBorder(null);
        btnSalvarCompra.setBorderPainted(false);
        btnSalvarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCompraActionPerformed(evt);
            }
        });

        txtNomeCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtNomeCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtNomeCliente.setEnabled(false);

        txtCpfCnpjCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCpfCnpjCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCpfCnpjCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF/CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtCpfCnpjCliente.setEnabled(false);
        txtCpfCnpjCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfCnpjClienteActionPerformed(evt);
            }
        });

        txtEmailCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEmailCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtEmailCliente.setEnabled(false);

        lblConfirmacao.setFont(new java.awt.Font("Rubik Light", 1, 18)); // NOI18N
        lblConfirmacao.setText("Confirmação");

        txtEnderecoCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEnderecoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtEnderecoCliente.setEnabled(false);

        txtCepCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtCepCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CEP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtCepCliente.setEnabled(false);

        txtEstadoCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtEstadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtEstadoCliente.setEnabled(false);

        txtMunicipioCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtMunicipioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Municipio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtMunicipioCliente.setEnabled(false);

        lblPagamento.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        lblPagamento.setText("Pagamento");

        tblProdutoFinal.setBackground(new java.awt.Color(64, 87, 184));
        tblProdutoFinal.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        tblProdutoFinal.setForeground(new java.awt.Color(255, 255, 255));
        tblProdutoFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProdutoFinal.setGridColor(new java.awt.Color(64, 87, 184));
        tblProdutoFinal.setSelectionForeground(new java.awt.Color(64, 87, 184));
        tblProdutoFinal.setShowGrid(true);
        jScrollPane2.setViewportView(tblProdutoFinal);

        txtTelCliente.setFont(new java.awt.Font("Rubik Light", 1, 14)); // NOI18N
        txtTelCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtTelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rubik Light", 1, 14))); // NOI18N
        txtTelCliente.setEnabled(false);

        javax.swing.GroupLayout jPanelPagamentoLayout = new javax.swing.GroupLayout(jPanelPagamento);
        jPanelPagamento.setLayout(jPanelPagamentoLayout);
        jPanelPagamentoLayout.setHorizontalGroup(
            jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jpnProdVendido, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jpnTotalVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpnDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPagamento)
                    .addComponent(cbxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmacao)
                    .addComponent(btnSalvarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPagamentoLayout.createSequentialGroup()
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanelPagamentoLayout.setVerticalGroup(
            jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPagamentoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblConfirmacao)
                .addGap(18, 18, 18)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMunicipioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(lblPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnProdVendido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnDescontos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTotalVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnSalvarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Jtab.addTab("Pagamento", jPanelPagamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jtab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jtab)
        );

        Jtab.getAccessibleContext().setAccessibleName("Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbClienteCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbClienteCadastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckbClienteCadastradoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        String cpfCnpj = txtCPFCNPJ.getText();

        if (ckbClienteCadastrado.isSelected()) {

            ClienteController cliController = new ClienteController();

            ClienteModel cliFiltro = new ClienteModel();

            cliFiltro.setCpfCnpj(cpfCnpj);

            List<ClienteModel> cli = cliController.findAll(cliFiltro);

            cliente = cli.get(0);

            txtNome.setText(cliente.getNome());
            txtNomeFan.setText(cliente.getNomeFantasia());
            txtEmail.setText(cliente.getEmail());
            txtContResp.setText(cliente.getContatoResposavel());
            txtCPFCNPJ.setText(cliente.getCpfCnpj());
            txtIM.setText(cliente.getIM());
            txtEM.setText(cliente.getEM());
            txtTel.setText(cliente.getTelefone());
            txtDtNasc.setText(cliente.getDtNasc().toString());
            txtEndereco.setText(cliente.getEndereco());
            txtCEP.setText(cliente.getCEP());
            txtEstado.setText(cliente.getEstado());
            txtMunicipio.setText(cliente.getMunicipio());

        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rbtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtEmpresaActionPerformed

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        if (tblProdutos.getSelectedRow() >= 0) {

            acaoTela = eAcaoTela.EDITAR.getValor();
            GerenciarBotoes();
            int id = Integer.parseInt(tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 0).toString());

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma categoria para editar!");
        }

    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnSalvarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarCompraActionPerformed

    private void txtCpfCnpjClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfCnpjClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfCnpjClienteActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed

        GerenciarBotoes();

        ProdutoController prodControll = new ProdutoController();
        ProdutoModel prod = new ProdutoModel();

        try {
            if (prod.validString(txtNome.getText())) {
                prod.setNomeProduto(txtNome.getText());
            }

            if (prod.validString(txtCategoria.getText())) {
                prod.setCategoria(txtCategoria.getText());
            }

            if (prod.validString(txtMarca.getText())) {
                prod.setMarca(txtMarca.getText());
            }

            if (prod.validString(txtQtd.getText())) {
                prod.setQtd(Integer.parseInt(txtQtd.getText()));
            }

            if (prod.validString(txtValor.getText())) {
                prod.setValor(Integer.parseInt(txtValor.getText()));
            }

            if (prod.validString(txtAvaliacao.getText())) {
                prod.setAvaliacao(Integer.parseInt(txtAvaliacao.getText()));
            }

            if (prod.validString(txtValidade.getText())) {
                SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
                prod.setDtValidade(formatter1.parse(txtValidade.getText()));
            }

            if (prod.validString(txtDesconto.getText())) {
                prod.setAvaliacao(Integer.parseInt(txtDesconto.getText()));
            }

        } catch (PropertiesValidator ex) {
            JOptionPane.showMessageDialog(null, ex, "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<ProdutoModel> produtos = ProdutoController.findAll(prod);
        CarregarProduto(produtos.get(0));
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
        LimparCamposProduto();
        acaoTela = eAcaoTela.ABRIR.getValor();
        GerenciarBotoes();
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        GerenciarBotoes();
        GerenciarBotoes();
        if (acaoTela == eAcaoTela.VISUALIZAR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }
        if (acaoTela == eAcaoTela.ABRIR.getValor()) {
            acaoTela = eAcaoTela.SALVAR.getValor();
        }

        PreencherProduto(prodTemp);
        LoadTableProduto(produtos);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        LimparCamposCliente();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Jtab;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnSalvarCompra;
    private javax.swing.JComboBox<String> cbxPagamento;
    private javax.swing.JCheckBox ckbClienteCadastrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelPagamento;
    private javax.swing.JPanel jPanelProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnDescontos;
    private javax.swing.JPanel jpnProdVendido;
    private javax.swing.JPanel jpnTotalVendas;
    private javax.swing.JLabel lblConfirmacao;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JRadioButton rbtEmpresa;
    private javax.swing.JRadioButton rbtFem;
    private javax.swing.JRadioButton rbtMasc;
    private javax.swing.JTable tblProdutoFinal;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtAvaliacao;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPFCNPJ;
    private javax.swing.JTextField txtCPFCNPJ1;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCepCliente;
    private javax.swing.JTextField txtContResp;
    private javax.swing.JTextField txtCpfCnpjCliente;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtDtNasc;
    private javax.swing.JTextField txtEM;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCliente;
    private javax.swing.JTextField txtIM;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtMunicipioCliente;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeFan;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTelCliente;
    private javax.swing.JTextField txtValidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
