/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Bai2 extends javax.swing.JFrame {
    private JFrame frame;
    /**
     * Creates new form Bai2
     */
    public Bai2() {
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

        GroupSex = new javax.swing.ButtonGroup();
        txtname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdmale = new javax.swing.JRadioButton();
        rafamale = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cbnganh = new javax.swing.JComboBox<>();
        cklvn = new javax.swing.JCheckBox();
        cktt = new javax.swing.JCheckBox();
        ckgt = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btnbq = new javax.swing.JButton();
        btndk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtname.setName("txtname"); // NOI18N

        jLabel1.setText("Họ và tên:");

        jLabel5.setText("Giới tính:");

        GroupSex.add(rdmale);
        rdmale.setText("Nam");
        rdmale.setName("chkmale"); // NOI18N
        rdmale.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                rdmaleAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        rdmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmaleActionPerformed(evt);
            }
        });

        GroupSex.add(rafamale);
        rafamale.setText("Nữ");
        rafamale.setName("chkFamale"); // NOI18N

        jLabel2.setText("Ngành học:");

        cbnganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Ngôn ngữ anh" }));
        cbnganh.setName("cbqualification"); // NOI18N

        cklvn.setText("Làm việc nhóm");

        cktt.setText("Làm việc nhóm");

        ckgt.setText("Giao tiếp");

        jLabel4.setText("Kỹ năng:");

        btnbq.setText("BỎ QUA");
        btnbq.setName("btnbq"); // NOI18N
        btnbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbqActionPerformed(evt);
            }
        });

        btndk.setText("ĐĂNG KÝ");
        btndk.setName("btndk"); // NOI18N
        btndk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndkActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("HỒ SƠ NHÂN VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(rdmale)
                                .addGap(18, 18, 18)
                                .addComponent(rafamale))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btndk)
                                        .addGap(23, 23, 23)
                                        .addComponent(btnbq))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cklvn)
                                    .addComponent(ckgt)
                                    .addComponent(cktt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel3)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rafamale)
                    .addComponent(rdmale))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbnganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cklvn)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cktt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckgt)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndk)
                    .addComponent(btnbq))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdmaleAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_rdmaleAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmaleAncestorMoved

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmaleActionPerformed

    private void btnbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbqActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        GroupSex.clearSelection();
        cklvn.setSelected(false);
        ckgt.setSelected(false);
        cktt.setSelected(false);
    }//GEN-LAST:event_btnbqActionPerformed

    private void btndkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndkActionPerformed
        // TODO add your handling code here:'

        String name = txtname.getText();

        if("".equals(name) ) {
            JOptionPane.showMessageDialog(frame, "Name is empty!");
        } else if (GroupSex.getSelection() == null) {
            JOptionPane.showMessageDialog(frame, "Sex is empty!");
        } else if (cklvn.isSelected() == true || cktt.isSelected() == true || ckgt.isSelected() == true ) {

        } else {
            JOptionPane.showMessageDialog(frame, "Skill is empty!");
        }
    }//GEN-LAST:event_btndkActionPerformed

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
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupSex;
    private javax.swing.JButton btnbq;
    private javax.swing.JButton btndk;
    private javax.swing.JComboBox<String> cbnganh;
    private javax.swing.JCheckBox ckgt;
    private javax.swing.JCheckBox cklvn;
    private javax.swing.JCheckBox cktt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rafamale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}