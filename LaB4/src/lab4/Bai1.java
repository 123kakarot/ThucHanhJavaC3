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
public class Bai1 extends javax.swing.JFrame {

    
    private JFrame frame;
    /**
     * Creates new form Bai1
     */
    public Bai1() {
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

        groupSex = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbquali = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        rdmale = new javax.swing.JRadioButton();
        rafamale = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btnvalidate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        ckReading = new javax.swing.JCheckBox();
        cksinging = new javax.swing.JCheckBox();
        ckdancing = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        txtname.setName("txtname"); // NOI18N

        jLabel2.setText("Address:");

        jLabel3.setText("Qualification");

        cbquali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduate", "Student" }));
        cbquali.setName("cbqualification"); // NOI18N

        jLabel4.setText("Hobby");

        panel2.setBackground(new java.awt.Color(239, 239, 239));

        groupSex.add(rdmale);
        rdmale.setText("Male");
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

        groupSex.add(rafamale);
        rafamale.setText("Famale");
        rafamale.setName("chkFamale"); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdmale)
                    .addComponent(rafamale)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdmale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rafamale)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Sex:");

        btnvalidate.setText("Validate");
        btnvalidate.setName("btnvalidate"); // NOI18N
        btnvalidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvalidateActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.setName("btnreset"); // NOI18N
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        ckReading.setText("Reading");

        cksinging.setText("Singing");

        ckdancing.setText("Dancing");

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnvalidate)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbquali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ckReading)
                                    .addComponent(cksinging)
                                    .addComponent(ckdancing)))
                            .addComponent(btnreset))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbquali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ckReading))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cksinging)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckdancing))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvalidate)
                    .addComponent(btnreset))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmaleActionPerformed

    private void btnvalidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvalidateActionPerformed
        // TODO add your handling code here:'
        
       String name = txtname.getText();
        String address = txtaddress.getText();
        
        if("".equals(name) ) {
            JOptionPane.showMessageDialog(frame, "Name is empty!");
        } else if ("".equals(address)) {
            JOptionPane.showMessageDialog(frame, "Address is empty!");
        } else if (groupSex.getSelection() == null) {
            JOptionPane.showMessageDialog(frame, "Sex is empty!");
        } else if (ckReading.isSelected() == true || cksinging.isSelected() == true || ckdancing.isSelected() == true ) {
         
        } else {
            JOptionPane.showMessageDialog(frame, "Hobby is empty!");
        }

    }//GEN-LAST:event_btnvalidateActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
         txtname.setText("");
        txtaddress.setText("");
        groupSex.clearSelection();
        ckReading.setSelected(false);
        ckdancing.setSelected(false);
        cksinging.setSelected(false);
    }//GEN-LAST:event_btnresetActionPerformed

    private void rdmaleAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_rdmaleAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmaleAncestorMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai1().setVisible(true);
            }
        });
       
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnvalidate;
    private javax.swing.JComboBox<String> cbquali;
    private javax.swing.JCheckBox ckReading;
    private javax.swing.JCheckBox ckdancing;
    private javax.swing.JCheckBox cksinging;
    private javax.swing.ButtonGroup groupSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel2;
    private javax.swing.JRadioButton rafamale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
