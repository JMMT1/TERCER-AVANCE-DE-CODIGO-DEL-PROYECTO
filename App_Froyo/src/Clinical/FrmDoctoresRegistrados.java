/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinical;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class FrmDoctoresRegistrados extends javax.swing.JFrame {

    /**
     * Creates new form FrmDoctoresRegistrados
     */
    public FrmDoctoresRegistrados() {
        initComponents();

        Color fondo = new Color(134, 187, 216);
        this.getContentPane().setBackground(fondo);

        setLocationRelativeTo(null);
        btnDoctores.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMosrtrar_2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnMostrar_3 = new javax.swing.JButton();
        btnDoctores = new javax.swing.JButton();
        btnPerfil_Paciente = new javax.swing.JButton();
        btnPadecim = new javax.swing.JButton();
        btnMostrar_1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_doc1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtA_doc2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtA_doc3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 187, 216));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctores Registrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        btnMosrtrar_2.setText("Mostrar:");
        btnMosrtrar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMosrtrar_2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Doctor 3:");

        btnMostrar_3.setText("Mostrar:");
        btnMostrar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar_3ActionPerformed(evt);
            }
        });

        btnDoctores.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnDoctores.setForeground(new java.awt.Color(0, 0, 0));
        btnDoctores.setText("Doctores ");
        btnDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctoresActionPerformed(evt);
            }
        });

        btnPerfil_Paciente.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnPerfil_Paciente.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil_Paciente.setText("Perfil del Paciente");
        btnPerfil_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfil_PacienteActionPerformed(evt);
            }
        });

        btnPadecim.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnPadecim.setForeground(new java.awt.Color(0, 0, 0));
        btnPadecim.setText("Padecimientos");
        btnPadecim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPadecimActionPerformed(evt);
            }
        });

        btnMostrar_1.setText("Mostrar:");
        btnMostrar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar_1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Doctor 1:");

        txtA_doc1.setColumns(20);
        txtA_doc1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtA_doc1.setRows(5);
        jScrollPane1.setViewportView(txtA_doc1);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Doctores Registrados");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Doctor 2:");

        txtA_doc2.setColumns(20);
        txtA_doc2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtA_doc2.setRows(5);
        jScrollPane2.setViewportView(txtA_doc2);

        txtA_doc3.setColumns(20);
        txtA_doc3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        txtA_doc3.setRows(5);
        jScrollPane3.setViewportView(txtA_doc3);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Menu de Opciones:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnPerfil_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btnPadecim, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(btnMostrar_1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMosrtrar_2)
                                    .addComponent(jLabel3))
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(btnMostrar_3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMosrtrar_2)
                            .addComponent(btnMostrar_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoctores)
                            .addComponent(btnPerfil_Paciente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrar_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnPadecim)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctoresActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDoctoresActionPerformed

    private void btnPerfil_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfil_PacienteActionPerformed
        this.setVisible(true);
        javax.swing.JFrame frmPac = new FrmPaciente();
        frmPac.setVisible(true);
    }//GEN-LAST:event_btnPerfil_PacienteActionPerformed

    private void btnPadecimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPadecimActionPerformed
        this.setVisible(true);
        javax.swing.JFrame frmPad = new FrmPadecimientos();
        frmPad.setVisible(true);


    }//GEN-LAST:event_btnPadecimActionPerformed

    private void btnMostrar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar_1ActionPerformed

        txtA_doc1.setEditable(false);
        txtA_doc1.setText(FrmPrincipal.medicos.mostrarMedico());
        btnMostrar_1.setEnabled(false);


    }//GEN-LAST:event_btnMostrar_1ActionPerformed

    private void btnMosrtrar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMosrtrar_2ActionPerformed

        txtA_doc2.setEditable(false);
        txtA_doc2.setText(FrmPrincipal.medicos.mostrarMedico());

        btnMosrtrar_2.setEnabled(false);
    }//GEN-LAST:event_btnMosrtrar_2ActionPerformed

    private void btnMostrar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar_3ActionPerformed

        txtA_doc3.setEditable(false);
        txtA_doc3.setText(FrmPrincipal.medicos.mostrarMedico());
        btnMostrar_3.setEnabled(false);
    }//GEN-LAST:event_btnMostrar_3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctores;
    private javax.swing.JButton btnMosrtrar_2;
    private javax.swing.JButton btnMostrar_1;
    private javax.swing.JButton btnMostrar_3;
    private javax.swing.JButton btnPadecim;
    private javax.swing.JButton btnPerfil_Paciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtA_doc1;
    private javax.swing.JTextArea txtA_doc2;
    private javax.swing.JTextArea txtA_doc3;
    // End of variables declaration//GEN-END:variables
}
