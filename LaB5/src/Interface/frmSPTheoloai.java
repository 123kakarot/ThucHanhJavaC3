/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Proccess.LoaiSP;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class frmSPTheoloai extends javax.swing.JFrame {

    LoaiSP sp = new LoaiSP();
    DefaultTableModel tableModel = new DefaultTableModel();
//Ham do du lieu vao tableModel

    public final void ShowDataCombo() {
        ResultSet result = null;
        try {
            result = sp.ShowLoaiSP();
            while (result.next()) {
//Them du lieu vao Combobox
                cbCSP.addItem(result.getString("Maloai"));
            }
        } catch (SQLException e) {
        }
    }
    public void ClearData() throws SQLException{
//Lay chi so dong cuoi cung
//Lay chi so dong cuoi cung
int n=tableModel.getRowCount()-1;
for(int i=n;i>=0;i--)
tableModel.removeRow(i);//Remove tung dong
}
    public final void ShowData(String ml) {
    ResultSet result=null;
        result = sp.ShowSPTheoloai(ml);
        try {
        ClearData();
        while(result.next()){
        String rows[] = new String[4];
        rows[0] = result.getString(1);
        rows[1] = result.getString(2);
        rows[2] = result.getString(3);
        rows[3] = result.getString(4);
        tableModel.addRow(rows);
        }
        }
        catch (SQLException e) {
        }
    }

    public frmSPTheoloai() {

    initComponents();
    ShowDataCombo();
    String []colsName = {"Mã SP", "Tên SP", "Giá bán","Loại"};
    // đặt tiêu đề cột cho tableModel
    tableModel.setColumnIdentifiers(colsName);
    // kết nối jtable với tableModel
    tbLSP.setModel(tableModel);
    }

//Code tu sinh khi thiet ke giao dien va cac code khac ở đây…….

    public static void main(String args[]) throws SQLException {
        frmSPTheoloai f = new frmSPTheoloai();
        f.setVisible(true);
    }

    /**
     * Creates new form frmSPTheoloai
     */

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLSP = new javax.swing.JTable();
        cbCSP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Sản Phẩm Theo Loại");

        jLabel2.setText("Chọn Sản Phẩm: ");

        tbLSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên Sản Phẩm", "Đơn giá", "Loại SP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLSP);

        cbCSP.setEnabled(false);
        cbCSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCSPItemStateChanged(evt);
            }
        });
        cbCSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbCSP, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLSPMouseClicked

    }//GEN-LAST:event_tbLSPMouseClicked

    private void cbCSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCSPActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbCSPActionPerformed

    private void cbCSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCSPItemStateChanged
        // TODO add your handling code here:
        String ml=cbCSP.getSelectedItem().toString();
        ShowData( ml);
    }//GEN-LAST:event_cbCSPItemStateChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLSP;
    // End of variables declaration//GEN-END:variables
}
