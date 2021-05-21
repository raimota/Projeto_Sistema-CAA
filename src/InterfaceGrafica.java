import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author grupo 05
 */
public class InterfaceGrafica extends javax.swing.JFrame {
    
    //As filas 
    private Queue fPreferencial = new Queue();
    private Queue fNormal = new Queue();
    
    //auto explicativo
    private ArrayList<String> todosAlunos = new ArrayList();    
    
    public InterfaceGrafica() {
        initComponents();
        txtNomeAluno.requestFocus();
        //Grupo preferencial
        btnPreferencial.add(PreSim);
        btnPreferencial.add(PreNao);

        //Grupo sexo
        btnSexo.add(SexoF);
        btnSexo.add(SexoM);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPreferencial = new javax.swing.ButtonGroup();
        btnSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PreSim = new javax.swing.JRadioButton();
        PreNao = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        SexoF = new javax.swing.JRadioButton();
        SexoM = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        btnFilaNormal = new javax.swing.JButton();
        btnFilaPreferencial = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        btnEncerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Sistema CAA");

        jLabel2.setText("Nome do aluno:");

        txtNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preferencial:");

        PreSim.setText("Sim");
        PreSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreSimActionPerformed(evt);
            }
        });

        PreNao.setText("Não");

        jLabel4.setText("Sexo:");

        SexoF.setText("Feminino");

        SexoM.setText("Masculino");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnCadastrar.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnFilaNormal.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnFilaNormal.setText("Mostrar fila normal");
        btnFilaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilaNormalActionPerformed(evt);
            }
        });

        btnFilaPreferencial.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnFilaPreferencial.setText("Mostrar fila preferencial");
        btnFilaPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilaPreferencialActionPerformed(evt);
            }
        });

        btnTodos.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnTodos.setText("Todos os alunos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnAtender.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        btnEncerrar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnEncerrar.setText("Encerrar Atendimento");
        btnEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_home-outline_216240.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PreNao)
                                    .addGap(77, 77, 77))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PreSim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SexoM)
                                .addComponent(SexoF))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFilaPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(btnAtender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEncerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFilaNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PreSim)
                            .addComponent(jLabel4)
                            .addComponent(SexoF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PreNao)
                            .addComponent(SexoM)))
                    .addComponent(btnFilaNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFilaPreferencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //Botão cadastrar
        try {            
            //Caso não tenha preenchido todos os campos esse if joga pro catch
            if(txtNomeAluno.getText().equals("") || SexoM.isSelected() == false && SexoF.isSelected() == false || PreSim.isSelected() == false && PreNao.isSelected() == false) btnCadastrarActionPerformed(dispatchEvent(ERROR));
            
            //Se for preferencial
            if(PreSim.isSelected() == true){
                //se for do sexo masculino
                if(SexoM.isSelected() == true){
                    fPreferencial.enqueue(new Aluno(txtNomeAluno.getText(), 'M', "Sim"));
                    todosAlunos.add(new Aluno(txtNomeAluno.getText(), 'M', "Sim")+"");
                    txtNomeAluno.setText("");
                    btnSexo.clearSelection(); //resetar radio button
                    btnPreferencial.clearSelection();//resetar radio button
                    txtNomeAluno.requestFocus();//focar no campo nome
                }                    
                else{
                    //sexo feminino
                    fPreferencial.enqueue(new Aluno(txtNomeAluno.getText(), 'F', "Sim"));
                    todosAlunos.add(new Aluno(txtNomeAluno.getText(), 'F', "Sim") +"");
                    txtNomeAluno.setText("");
                    btnSexo.clearSelection();//resetar radio button
                    btnPreferencial.clearSelection();//resetar radio button
                    txtNomeAluno.requestFocus(); //focar no campo nome
                }                    
            }
            //Se não for preferencial
            else{
               //sexo masculino 
               if(SexoM.isSelected() == true){
                    fNormal.enqueue(new Aluno(txtNomeAluno.getText(), 'M', "Não"));
                    todosAlunos.add(new Aluno(txtNomeAluno.getText(), 'M', "Não")+"");
                    txtNomeAluno.setText("");
                    btnSexo.clearSelection();//resetar radio button
                    btnPreferencial.clearSelection();//resetar radio button
                    txtNomeAluno.requestFocus();//focar no campo nome
               }    
               else{
                   //sexo feminino
                    fNormal.enqueue(new Aluno(txtNomeAluno.getText(), 'F', "Não"));
                    todosAlunos.add(new Aluno(txtNomeAluno.getText(), 'F', "Não")+"");
                    txtNomeAluno.setText("");
                    btnSexo.clearSelection();//resetar radio button
                    btnPreferencial.clearSelection();//resetar radio button
                    txtNomeAluno.requestFocus();//focar no campo nome
               }    
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos !", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }    
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarActionPerformed
        // encerrar atendimento
        int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza ?", "Aviso", JOptionPane.YES_NO_OPTION);        
        if(resposta == 0){
            btnCadastrar.setEnabled(false);
            btnEncerrar.setEnabled(false);
        }
            
    }//GEN-LAST:event_btnEncerrarActionPerformed

    private void btnFilaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilaNormalActionPerformed
        // fila normal        
        txtResultado.setText(fNormal.toString());
    }//GEN-LAST:event_btnFilaNormalActionPerformed

    private void btnFilaPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilaPreferencialActionPerformed
        //fila prefencial
        txtResultado.setText(fPreferencial.toString());        
    }//GEN-LAST:event_btnFilaPreferencialActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        // btn atender
        try {
            //Se não tiver mais alunos ele dispara o evento e joga pro catch 
            if(fPreferencial.isEmpty() && fNormal.isEmpty()) btnAtenderActionPerformed(dispatchEvent(ERROR));
            
            //Atender todos os preferenciais primeiro 
            if(!fPreferencial.isEmpty()){                
                todosAlunos.remove(fPreferencial.peek()+"");
                JOptionPane.showMessageDialog(null, fPreferencial.dequeue(), "Atendido", JOptionPane.INFORMATION_MESSAGE);                
            }           
            else{
                todosAlunos.remove(fNormal.peek()+"");
                JOptionPane.showMessageDialog(null, fNormal.dequeue(), "Atendido", JOptionPane.INFORMATION_MESSAGE);
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há mais alunos a serem atendidos !", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
                 
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void txtNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlunoActionPerformed

    private void PreSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreSimActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // Btn todos alunos
        if(!todosAlunos.isEmpty())
            txtResultado.setText(todosAlunos.toString().replace("[", "T:[\n").replace(", Aluno: ", "\nAluno: ").replace("]", "\n]"));
        else
            txtResultado.setText("Vázio");
    }//GEN-LAST:event_btnTodosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Grupo 05
        JOptionPane.showMessageDialog(null, "Aline Ribeiro\nBeatriz Santos\nGabriel Tenorio\nLarissa Gabriel\nRai Mota", "Grupo 05", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton PreNao;
    private javax.swing.JRadioButton PreSim;
    private javax.swing.JRadioButton SexoF;
    private javax.swing.JRadioButton SexoM;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEncerrar;
    private javax.swing.JButton btnFilaNormal;
    private javax.swing.JButton btnFilaPreferencial;
    private javax.swing.ButtonGroup btnPreferencial;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables

    private ActionEvent dispatchEvent(int ERROR) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
