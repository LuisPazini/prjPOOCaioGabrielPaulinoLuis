/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAluno;
import fatec.poo.model.Aluno;
import fatec.poo.model.Pessoa;

import javax.swing.JOptionPane;

/**
 * @author Caio
 * @author Gabriel Paulino
 * @author Luis
 */
public class GuiAluno extends javax.swing.JFrame {

    /**
     * Creates new form guiInstrutor
     */
    public GuiAluno() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtDataNascto = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtTelRes = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cbxEscolaridade = new javax.swing.JComboBox<>();
        cbxSexo = new javax.swing.JComboBox<>();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Aluno");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("CPF");

        jLabel2.setText("Nome");

        jLabel3.setText("Sexo");

        jLabel4.setText("Endereço");

        jLabel5.setText("Bairro");

        jLabel6.setText("Cidade");

        jLabel7.setText("RG");

        jLabel8.setText("Email");

        jLabel10.setText("Estado Civil");

        jLabel11.setText("Data Nascto");

        jLabel12.setText("Escolaridade");

        jLabel13.setText("Nº");

        jLabel14.setText("CEP");

        jLabel15.setText("Tel. Res");

        jLabel16.setText("Celular");

        jLabel17.setText("Estado");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtDataNascto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtDataNascto.setEnabled(false);

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setEnabled(false);

        try {
            txtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelRes.setEnabled(false);

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setEnabled(false);

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.setEnabled(false);

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtBairro.setEnabled(false);

        txtCidade.setEnabled(false);

        txtNumero.setEnabled(false);

        txtEmail.setEnabled(false);

        cbxEscolaridade.setEditable(true);
        cbxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino Médio Completo", "Ensino Superior Incompleto", "Ensino Superior Completo", "Pós-Graduação", "Mestrado", "Doutorado", "Pós-Doutorado" }));
        cbxEscolaridade.setSelectedIndex(-1);
        cbxEscolaridade.setEnabled(false);

        cbxSexo.setEditable(true);
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cbxSexo.setSelectedIndex(-1);
        cbxSexo.setEnabled(false);

        cbxEstadoCivil.setEditable(true);
        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Separado", "Divorciado", "Viúvo" }));
        cbxEstadoCivil.setSelectedIndex(-1);
        cbxEstadoCivil.setEnabled(false);

        cbxEstado.setEditable(true);
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cbxEstado.setSelectedIndex(-1);
        cbxEstado.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBairro)
                            .addComponent(txtEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(7, 7, 7)
                                .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCelular)
                                    .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnConsultar)
                        .addGap(29, 29, 29)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(txtDataNascto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("BD1913014", "BD1913014");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        //conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoAluno = new DaoAluno(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        aluno = new Aluno(txtNome.getText(), txtCPF.getText());
        aluno.setDataNasc(txtDataNascto.getText());
        aluno.setEndereco(txtEndereco.getText());

        /*Tratamento de erros de Conversao de String vazia*/
        try {
            if (txtNumero.getText() != null) {
                aluno.setNumero(Integer.parseInt(txtNumero.getText()));
            }
        } catch (NumberFormatException e) {
            aluno.setNumero(0);
        }

        //aluno.setNumero(Integer.parseInt(txtNumero.getText()));
        aluno.setBairro(txtBairro.getText());
        aluno.setCidade(txtCidade.getText());
        aluno.setEstado((String) cbxEstado.getSelectedItem());
        aluno.setCEP(txtCEP.getText());
        aluno.setTelefone(txtTelRes.getText());
        aluno.setCelular(txtCelular.getText());
        aluno.setSexo((String) cbxSexo.getSelectedItem());
        aluno.setEstadoCivil((String) cbxEstadoCivil.getSelectedItem());
        aluno.setRG(txtRG.getText());
        aluno.setEmail(txtEmail.getText());
        aluno.setEscolaridade((String) cbxEscolaridade.getSelectedItem());

        daoAluno.inserir(aluno);

        txtNome.setText("");
        txtDataNascto.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cbxEstado.setSelectedItem(null);
        txtCEP.setText("");
        txtTelRes.setText("");
        txtCelular.setText("");
        cbxSexo.setSelectedItem(null);
        cbxEstadoCivil.setSelectedItem(null);
        txtRG.setText("");
        txtCPF.setText("");
        txtEmail.setText("");
        cbxEscolaridade.setSelectedItem(null);

        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtDataNascto.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxEstado.setEnabled(false);
        txtCEP.setEnabled(false);
        txtTelRes.setEnabled(false);
        txtCelular.setEnabled(false);
        cbxSexo.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        txtRG.setEnabled(false);
        txtEmail.setEnabled(false);
        cbxEscolaridade.setEnabled(false);

        txtCPF.requestFocus();

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        aluno = null;
        aluno = daoAluno.consultar(txtCPF.getText());

        if (pessoa.validarCPF(txtCPF.getText()) == true) {
            //CPF válido
            txtCPF.requestFocus();

            if (aluno == null) {
                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtDataNascto.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxEstado.setEnabled(true);
                txtCEP.setEnabled(true);
                txtTelRes.setEnabled(true);
                txtCelular.setEnabled(true);
                cbxSexo.setEnabled(true);
                cbxEstadoCivil.setEnabled(true);
                txtRG.setEnabled(true);
                txtEmail.setEnabled(true);
                cbxEscolaridade.setEnabled(true);

                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);

            } else {
                txtNome.setText(aluno.getNome());
                txtDataNascto.setText(aluno.getDataNasc());
                txtEndereco.setText(aluno.getEndereco());
                txtNumero.setText(Integer.toString(aluno.getNumero()));
                txtBairro.setText(aluno.getBairro());
                txtCidade.setText(aluno.getCidade());
                cbxEstado.setSelectedItem(aluno.getEstado());
                txtCEP.setText(aluno.getCep());
                txtTelRes.setText(aluno.getTelefone());
                txtCelular.setText(aluno.getCelular());
                cbxSexo.setSelectedItem(aluno.getSexo());
                cbxEstadoCivil.setSelectedItem(aluno.getEstadoCivil());
                txtRG.setText(aluno.getRg());
                txtEmail.setText(aluno.getEmail());
                cbxEscolaridade.setSelectedItem(aluno.getEscolaridade());

                txtCPF.setEnabled(false);
                txtNome.setEnabled(true);
                txtDataNascto.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtBairro.setEnabled(true);
                txtCidade.setEnabled(true);
                cbxEstado.setEnabled(true);
                txtCEP.setEnabled(true);
                txtTelRes.setEnabled(true);
                txtCelular.setEnabled(true);
                cbxSexo.setEnabled(true);
                cbxEstadoCivil.setEnabled(true);
                txtRG.setEnabled(true);
                txtEmail.setEnabled(true);
                cbxEscolaridade.setEnabled(true);

                txtNome.requestFocus();

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }

        } else {
            //CPF inválido
            JOptionPane.showMessageDialog(null, "CPF inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
            txtCPF.setText("");
            txtCPF.requestFocus();
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?") == 0) {
            aluno.setNome(txtNome.getText());
            aluno.setDataNasc(txtDataNascto.getText());
            aluno.setEndereco(txtEndereco.getText());

            /*Tratamento de erros de Conversao de String vazia*/
            
            try {
                if (txtNumero.getText() != null) {
                    aluno.setNumero(Integer.parseInt(txtNumero.getText()));
                }
            } catch (NumberFormatException e) {
                aluno.setNumero(0);
            }

            //aluno.setNumero(Integer.parseInt(txtNumero.getText()));
            aluno.setBairro(txtBairro.getText());
            aluno.setCidade(txtCidade.getText());
            aluno.setEstado((String) cbxEstado.getSelectedItem());
            aluno.setCEP(txtCEP.getText());
            aluno.setTelefone(txtTelRes.getText());
            aluno.setCelular(txtCelular.getText());
            aluno.setSexo((String) cbxSexo.getSelectedItem());
            aluno.setEstadoCivil((String) cbxEstadoCivil.getSelectedItem());
            aluno.setRG(txtRG.getText());
            aluno.setEmail(txtEmail.getText());
            aluno.setEscolaridade((String) cbxEscolaridade.getSelectedItem());

            daoAluno.alterar(aluno);
        }

        txtCPF.setText("");
        txtNome.setText("");
        txtDataNascto.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cbxEstado.setSelectedItem(null);
        txtCEP.setText("");
        txtTelRes.setText("");
        txtCelular.setText("");
        cbxSexo.setSelectedItem(null);
        cbxEstadoCivil.setSelectedItem(null);
        txtRG.setText("");
        txtEmail.setText("");
        cbxEscolaridade.setSelectedItem(null);

        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtDataNascto.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxEstado.setEnabled(false);
        txtCEP.setEnabled(false);
        txtTelRes.setEnabled(false);
        txtCelular.setEnabled(false);
        cbxSexo.setEnabled(false);
        cbxEstadoCivil.setEnabled(false);
        txtRG.setEnabled(false);
        txtEmail.setEnabled(false);
        cbxEscolaridade.setEnabled(false);

        txtCPF.requestFocus();

        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0) {
            daoAluno.excluir(aluno);

            txtNome.setText("");
            txtDataNascto.setText("");
            txtEndereco.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            cbxEstado.setSelectedItem(null);
            txtCEP.setText("");
            txtTelRes.setText("");
            txtCelular.setText("");
            cbxSexo.setSelectedItem(null);
            cbxEstadoCivil.setSelectedItem(null);
            txtRG.setText("");
            txtCPF.setText("");
            txtEmail.setText("");
            cbxEscolaridade.setSelectedItem(null);

            txtCPF.setEnabled(true);
            txtNome.setEnabled(false);
            txtDataNascto.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNumero.setEnabled(false);
            txtBairro.setEnabled(false);
            txtCidade.setEnabled(false);
            cbxEstado.setEnabled(false);
            txtCEP.setEnabled(false);
            txtTelRes.setEnabled(false);
            txtCelular.setEnabled(false);
            cbxSexo.setEnabled(false);
            cbxEstadoCivil.setEnabled(false);
            txtRG.setEnabled(false);
            txtEmail.setEnabled(false);
            cbxEscolaridade.setEnabled(false);

            txtCPF.requestFocus();

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxEscolaridade;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataNascto;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelRes;
    // End of variables declaration//GEN-END:variables
    private DaoAluno daoAluno = null;
    private Aluno aluno = null;
    private Conexao conexao = null;
    private Pessoa pessoa = null;
}
