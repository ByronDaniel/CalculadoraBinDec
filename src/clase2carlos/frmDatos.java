/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase2carlos;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class frmDatos extends javax.swing.JFrame {

    /**
     * Creates new form frmDatos
     */
    public frmDatos() {
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
        botonOpcionB = new javax.swing.JButton();
        botonOpcionA = new javax.swing.JButton();
        botonOpcionD = new javax.swing.JButton();
        botonOpcionC = new javax.swing.JButton();
        botonOpcionE = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DBOpcionA = new javax.swing.JButton();
        DBOpcionB = new javax.swing.JButton();
        DBOpcionC = new javax.swing.JButton();
        DBOpcionD = new javax.swing.JButton();
        DBOpcionE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Conversor de Binarios y Decimales");

        jLabel2.setText("Ejercicio 1 - Binario a Decimal");

        botonOpcionB.setActionCommand("Opción B");
        botonOpcionB.setLabel("Opción B");
        botonOpcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionBActionPerformed(evt);
            }
        });

        botonOpcionA.setText("Opción A");
        botonOpcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionAActionPerformed(evt);
            }
        });

        botonOpcionD.setActionCommand("Opción B");
        botonOpcionD.setLabel("Opción D");
        botonOpcionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionDActionPerformed(evt);
            }
        });

        botonOpcionC.setActionCommand("Opción B");
        botonOpcionC.setLabel("Opción C");
        botonOpcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionCActionPerformed(evt);
            }
        });

        botonOpcionE.setActionCommand("Opción B");
        botonOpcionE.setLabel("Opción E");
        botonOpcionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionEActionPerformed(evt);
            }
        });

        jLabel3.setText("Ejercicio 2 - Decimal a Binario");

        DBOpcionA.setText("Opción A");
        DBOpcionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBOpcionAActionPerformed(evt);
            }
        });

        DBOpcionB.setText("Opción B");
        DBOpcionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBOpcionBActionPerformed(evt);
            }
        });

        DBOpcionC.setText("Opción C");
        DBOpcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBOpcionCActionPerformed(evt);
            }
        });

        DBOpcionD.setText("Opción D");
        DBOpcionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBOpcionDActionPerformed(evt);
            }
        });

        DBOpcionE.setText("Opción E");
        DBOpcionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBOpcionEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(DBOpcionA)
                                        .addGap(18, 18, 18)
                                        .addComponent(DBOpcionB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DBOpcionC))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(botonOpcionA)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonOpcionB)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonOpcionC)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonOpcionD)
                                    .addComponent(DBOpcionD))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonOpcionE)
                                    .addComponent(DBOpcionE))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOpcionA)
                    .addComponent(botonOpcionB)
                    .addComponent(botonOpcionC)
                    .addComponent(botonOpcionD)
                    .addComponent(botonOpcionE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DBOpcionA)
                    .addComponent(DBOpcionB)
                    .addComponent(DBOpcionC)
                    .addComponent(DBOpcionD)
                    .addComponent(DBOpcionE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonOpcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionBActionPerformed
        BinarioADecimal("10000");
    }//GEN-LAST:event_botonOpcionBActionPerformed

    private void botonOpcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionAActionPerformed
        BinarioADecimal("111110");
    }//GEN-LAST:event_botonOpcionAActionPerformed

    private void botonOpcionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionDActionPerformed
        BinarioADecimal("10100");
    }//GEN-LAST:event_botonOpcionDActionPerformed

    private void botonOpcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionCActionPerformed
        BinarioADecimal("10110");
    }//GEN-LAST:event_botonOpcionCActionPerformed

    private void botonOpcionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionEActionPerformed
        BinarioADecimal("1010100");
    }//GEN-LAST:event_botonOpcionEActionPerformed

    private void DBOpcionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBOpcionAActionPerformed
        DecimalABinario(1234);
    }//GEN-LAST:event_DBOpcionAActionPerformed

    private void DBOpcionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBOpcionBActionPerformed
        DecimalABinario(4987);
    }//GEN-LAST:event_DBOpcionBActionPerformed

    private void DBOpcionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBOpcionCActionPerformed
        DecimalABinario(543);
    }//GEN-LAST:event_DBOpcionCActionPerformed

    private void DBOpcionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBOpcionDActionPerformed
        DecimalABinario(2143);
    }//GEN-LAST:event_DBOpcionDActionPerformed

    private void DBOpcionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBOpcionEActionPerformed
        DecimalABinario(9870);
    }//GEN-LAST:event_DBOpcionEActionPerformed

    private void DecimalABinario(int numero){
        int resultadoDivision = numero;
        int residuo = 0;
        String binarioInvertido = "";
        String texto = "Decimal: " + numero + "\n";
        do{
            residuo = resultadoDivision % 2;
            texto += resultadoDivision + " / 2 = ";
            resultadoDivision = (int) resultadoDivision / 2;
            texto += resultadoDivision + ", residuo: " + residuo + "\n";
            binarioInvertido += residuo;
            
        }while(resultadoDivision != 1);
        binarioInvertido += "1";
        StringBuilder builder = new StringBuilder(binarioInvertido);
        String binario = builder.reverse().toString();
        texto += "\nBinario: " + binario;
        JOptionPane.showMessageDialog(rootPane, texto);
    }
    
    private void BinarioADecimal(String binario){
        int resultado = 0;
        int resultadoDigito = 0;
        int digito = 0;
        int elevado = 0;
        String operacionString = "";
        String texto = "Binario: " + binario + "\n"; 
        for (int i=0; i < binario.length(); i++) {
            digito = Character.digit(binario.charAt(i), 10);
            elevado = (binario.length()-1)-i;
            resultadoDigito = (int) (digito*Math.pow((double)2, (double)elevado));
            operacionString += resultadoDigito;
            resultado += resultadoDigito;
            texto += digito + " * 2^" + elevado + " = "  + resultadoDigito + "\n";
            if(i == binario.length()-1){
                 operacionString += " = ";
            }else{
                operacionString += " + ";
            }
        }
        operacionString += resultado;
        texto += operacionString + "\n\nDecimal: " + resultado;
        JOptionPane.showMessageDialog(rootPane, texto);
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
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DBOpcionA;
    private javax.swing.JButton DBOpcionB;
    private javax.swing.JButton DBOpcionC;
    private javax.swing.JButton DBOpcionD;
    private javax.swing.JButton DBOpcionE;
    private javax.swing.JButton botonOpcionA;
    private javax.swing.JButton botonOpcionB;
    private javax.swing.JButton botonOpcionC;
    private javax.swing.JButton botonOpcionD;
    private javax.swing.JButton botonOpcionE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
