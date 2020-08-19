
import java.awt.Color;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Main extends javax.swing.JFrame {

    DefaultTableModel jTableModelEstado;
    DefaultTableModel jTableModelTransicao;

    JComboBox estados = new JComboBox();
    JComboBox alfabeto = new JComboBox();

    TableColumn estadoAtual;
    TableColumn condicao;
    TableColumn proximoEstado;

    int numEstados = 0;
    int numTransicoes = 0;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);

        jTableModelEstado = ((DefaultTableModel) jTableEstado.getModel());
        jTableModelTransicao = ((DefaultTableModel) jTableTransicao.getModel());

        estadoAtual = jTableTransicao.getColumnModel().getColumn(0);
        condicao = jTableTransicao.getColumnModel().getColumn(1);
        proximoEstado = jTableTransicao.getColumnModel().getColumn(2);

        estadoAtual.setCellEditor(new DefaultCellEditor(estados));
        condicao.setCellEditor(new DefaultCellEditor(alfabeto));
        proximoEstado.setCellEditor(new DefaultCellEditor(estados));

        jTextResultado.setEditable(false);
        jTextSequencia.setEditable(false);
        jTextFita.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jTextFita = new javax.swing.JTextField();
        jButtonIniciarTeste = new javax.swing.JButton();
        jButtonAdicionarEstado = new javax.swing.JButton();
        jButtonRemoverEstado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTransicao = new javax.swing.JTable();
        jButtonAdicionarTransicao = new javax.swing.JButton();
        jButtonRemoverTransicao = new javax.swing.JButton();
        jTextResultado = new javax.swing.JTextField();
        jTextSequencia = new javax.swing.JTextField();
        jTextAlfabeto = new javax.swing.JTextField();
        jButtonDefinirAlfabeto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Implementação do AFD");
        setResizable(false);

        jTableEstado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado", "Inicial", "Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstado.setRowHeight(30);
        jTableEstado.setRowSelectionAllowed(false);
        jTableEstado.setShowGrid(false);
        jTableEstado.setShowHorizontalLines(true);
        jTableEstado.setShowVerticalLines(true);
        jTableEstado.getTableHeader().setResizingAllowed(false);
        jTableEstado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableEstado);

        jTextFita.setBackground(new java.awt.Color(240, 240, 240));
        jTextFita.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fita:"));

        jButtonIniciarTeste.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonIniciarTeste.setText("INICIAR TESTE");
        jButtonIniciarTeste.setEnabled(false);
        jButtonIniciarTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarTesteActionPerformed(evt);
            }
        });

        jButtonAdicionarEstado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAdicionarEstado.setText("ADICIONAR ESTADO");
        jButtonAdicionarEstado.setEnabled(false);
        jButtonAdicionarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarEstadoActionPerformed(evt);
            }
        });

        jButtonRemoverEstado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonRemoverEstado.setText("REMOVER ESTADO");
        jButtonRemoverEstado.setEnabled(false);
        jButtonRemoverEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverEstadoActionPerformed(evt);
            }
        });

        jTableTransicao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTableTransicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado atual", "Condição", "Próximo estado"
            }
        ));
        jTableTransicao.setRowHeight(30);
        jTableTransicao.setRowSelectionAllowed(false);
        jTableTransicao.getTableHeader().setResizingAllowed(false);
        jTableTransicao.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableTransicao);

        jButtonAdicionarTransicao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonAdicionarTransicao.setText("ADICIONAR TRANSIÇÃO");
        jButtonAdicionarTransicao.setEnabled(false);
        jButtonAdicionarTransicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarTransicaoActionPerformed(evt);
            }
        });

        jButtonRemoverTransicao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonRemoverTransicao.setText("REMOVER TRANSIÇÃO");
        jButtonRemoverTransicao.setEnabled(false);
        jButtonRemoverTransicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverTransicaoActionPerformed(evt);
            }
        });

        jTextResultado.setBackground(new java.awt.Color(240, 240, 240));
        jTextResultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextResultado.setText("-");
        jTextResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resultado:"));

        jTextSequencia.setBackground(new java.awt.Color(240, 240, 240));
        jTextSequencia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextSequencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSequencia.setText("-");
        jTextSequencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sequência:"));

        jTextAlfabeto.setBackground(new java.awt.Color(240, 240, 240));
        jTextAlfabeto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextAlfabeto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextAlfabeto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alfabeto:"));

        jButtonDefinirAlfabeto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonDefinirAlfabeto.setText("DEFINIR ALFABETO");
        jButtonDefinirAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefinirAlfabetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFita, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonIniciarTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonRemoverEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdicionarEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemoverTransicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAdicionarTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addComponent(jTextResultado)
                    .addComponent(jTextSequencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextAlfabeto)
                    .addComponent(jButtonDefinirAlfabeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDefinirAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRemoverEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemoverTransicao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIniciarTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarTesteActionPerformed
        if (verificarErrosIniciarTeste() == false) {
            String estado = (String) jTableEstado.getValueAt(estadoInicial(), 0);
            jTextSequencia.setText("");

            for (int i = 0; i < jTextFita.getText().length(); i++) {
                estado = proximoEstado(estado, jTextFita.getText().substring(i, i + 1), jTableTransicao.getRowCount());
                if (i < jTextFita.getText().length() - 1) {
                    jTextSequencia.setText(jTextSequencia.getText() + estado + "-");
                } else {
                    jTextSequencia.setText(jTextSequencia.getText() + estado);
                }
            }
            if (estadoFinal(estado) == true) {
                jTextResultado.setForeground(Color.GREEN);
                jTextResultado.setText("ENTRADA ACEITA");
            } else {
                jTextResultado.setForeground(Color.RED);
                jTextResultado.setText("ENTRADA REJEITADA");
                jTextSequencia.setText("-");
            }
        }
    }//GEN-LAST:event_jButtonIniciarTesteActionPerformed

    private void jButtonAdicionarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarEstadoActionPerformed
        jTableModelEstado.addRow(new Object[]{"q" + numEstados, false, false});

        estados.addItem("q" + numEstados);
        estadoAtual.setCellEditor(new DefaultCellEditor(estados));
        proximoEstado.setCellEditor(new DefaultCellEditor(estados));

        numEstados++;
    }//GEN-LAST:event_jButtonAdicionarEstadoActionPerformed

    private void jButtonRemoverEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverEstadoActionPerformed
        if (numEstados > 0) {
            jTableModelEstado.removeRow(jTableEstado.getRowCount() - 1);

            estados.removeItemAt(estados.getItemCount() - 1);
            estadoAtual.setCellEditor(new DefaultCellEditor(estados));
            proximoEstado.setCellEditor(new DefaultCellEditor(estados));

            numEstados--;
        }
    }//GEN-LAST:event_jButtonRemoverEstadoActionPerformed

    private void jButtonAdicionarTransicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarTransicaoActionPerformed
        jTableModelTransicao.addRow(new Object[]{"", "", ""});
        numTransicoes++;
    }//GEN-LAST:event_jButtonAdicionarTransicaoActionPerformed

    private void jButtonRemoverTransicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverTransicaoActionPerformed
        if (numTransicoes > 0) {
            jTableModelTransicao.removeRow(jTableTransicao.getRowCount() - 1);
            numTransicoes--;
        }
    }//GEN-LAST:event_jButtonRemoverTransicaoActionPerformed

    private void jButtonDefinirAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDefinirAlfabetoActionPerformed
        if (verificarErrosAlfabeto() == false) {
            habilitarBotoes();
            String alfabetoTemp = jTextAlfabeto.getText();

            alfabetoTemp = alfabetoTemp.replaceAll("[^a-z]", "");

            alfabeto.removeAllItems();
            for (int i = 0; i < alfabetoTemp.length(); i++) {
                alfabeto.addItem(alfabetoTemp.charAt(i));
            }
            condicao.setCellEditor(new DefaultCellEditor(alfabeto));
        }
    }//GEN-LAST:event_jButtonDefinirAlfabetoActionPerformed

    public boolean verificarErrosIniciarTeste() {
        boolean erro = false;

        int vezesInicio = 0;
        int vezesFinal = 0;

        for (int i = 0; i < numEstados; i++) {
            if (jTableEstado.getValueAt(i, 1).equals(true)) {
                vezesInicio++;
            }
            if (jTableEstado.getValueAt(i, 2).equals(true)) {
                vezesFinal++;
            }
        }

        if (numEstados == 0) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Insira pelo menos um estado.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else if (numTransicoes == 0) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Insira pelo menos uma transição.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else if (vezesInicio == 0){
            erro = true;
            JOptionPane.showMessageDialog(null, "Marque um estado inicial.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else if (vezesInicio > 1) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Só é permitido um estado inicial.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else if (vezesFinal == 0) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Marque pelo menos um estado final.", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }

        return erro;
    }

    public boolean verificarErrosAlfabeto() {
        boolean erro = false;

        String alfabetoOriginal = jTextAlfabeto.getText();
        String alfabetoAlterado = alfabetoOriginal.replaceAll("[^a-z]", "");

        if (alfabetoOriginal.isEmpty()) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Insira um alfabeto que não seja vazio. (Ex.: a, b, c)", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else if (!alfabetoOriginal.matches("[a-z,]*")) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Insira um alfabeto válido. (Ex.: a,b,c)", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        } else if (verificarAlfabetoRepetido(alfabetoAlterado) == true) {
            erro = true;
            JOptionPane.showMessageDialog(null, "Insira apenas uma letra de cada. (Ex.: a, b, c)", "Mensagem de aviso", JOptionPane.WARNING_MESSAGE);
        }

        return erro;
    }

    public boolean verificarAlfabetoRepetido(CharSequence g) {
        for (int i = 0; i < g.length(); i++) {
            for (int j = i + 1; j < g.length(); j++) {
                if (g.charAt(i) == g.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String proximoEstado(String estadoInicial, String condicao, int qtdLinhas) {
        String proxEstado = "";

        for (int i = 0; i < qtdLinhas; i++) {
            if (jTableTransicao.getValueAt(i, 0).toString().equals(estadoInicial) && jTableTransicao.getValueAt(i, 1).toString().equals(condicao)) {
                proxEstado = (String) jTableTransicao.getValueAt(i, 2);
                break;
            }
        }
        return proxEstado;
    }

    public int estadoInicial() {
        int i;
        for (i = 0; i < jTableEstado.getRowCount(); i++) {
            if (jTableEstado.getValueAt(i, 1).equals(true)) {
                break;
            }
        }
        return i;
    }

    public boolean estadoFinal(String estado) {
        int i;
        for (i = 0; i < jTableEstado.getRowCount(); i++) {
            if (jTableEstado.getValueAt(i, 2).equals(true)) {
                if (jTableEstado.getValueAt(i, 0).equals(estado)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void habilitarBotoes() {
        jButtonAdicionarEstado.setEnabled(true);
        jButtonRemoverEstado.setEnabled(true);
        jButtonAdicionarTransicao.setEnabled(true);
        jButtonRemoverTransicao.setEnabled(true);
        jButtonIniciarTeste.setEnabled(true);
        jTextFita.setEditable(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarEstado;
    private javax.swing.JButton jButtonAdicionarTransicao;
    private javax.swing.JButton jButtonDefinirAlfabeto;
    private javax.swing.JButton jButtonIniciarTeste;
    private javax.swing.JButton jButtonRemoverEstado;
    private javax.swing.JButton jButtonRemoverTransicao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTable jTableTransicao;
    private javax.swing.JTextField jTextAlfabeto;
    private javax.swing.JTextField jTextFita;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JTextField jTextSequencia;
    // End of variables declaration//GEN-END:variables

}
