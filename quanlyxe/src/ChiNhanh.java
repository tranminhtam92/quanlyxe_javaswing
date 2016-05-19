/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Teo
 */
public class ChiNhanh extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChiNhanh
     */
    private Connect_Var cnDB;
    private DefaultTableModel mtable;
    private DefaultComboBoxModel model;
    private ResultSet rs;
    private ResultSetMetaData rsmd;
    private Vector vt;
    private int n = -1, edit;
    private String MaCN, TenCN, MaTP;
    public ChiNhanh() {
        initComponents();
        Initcbbox();
        InitTable();
    }
private void Initcbbox()
    {
            try {
            cnDB = new Connect_Var();
            rs = cnDB.s.executeQuery("select * from ThanhPho");
            rsmd = rs.getMetaData();
            if (rs != null) {
                 model=new DefaultComboBoxModel();
                while (rs.next()) {
                   
                    model.addElement(rs.getString(1));
                }
                rs.close();
                cnDB.s.close();
                cnDB.cn.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbMaTP.setModel(model);
    }
  private void InitTable(){
        vt = new Vector();
        vt.add("MaCN");
        vt.add("TenCN");
        vt.add("MaTP");
        mtable = new DefaultTableModel(vt,0);
        //tXe.setModel(mtable);
        try {
            cnDB = new Connect_Var();
            rs = cnDB.s.executeQuery("select * from ChiNhanh");
            rsmd = rs.getMetaData();
            if (rs != null) {
                while (rs.next()) {
                    vt = new Vector();
                    vt.add(rs.getString(1));
                    vt.add(rs.getString(2));
                    vt.add(rs.getString(3));
                    mtable.addRow(vt);
                }
                rs.close();
                cnDB.s.close();
                cnDB.cn.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
        }
        tChiNhanh.setModel(mtable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tChiNhanh = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCN = new javax.swing.JTextField();
        txtTenCN = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        cbMaTP = new javax.swing.JComboBox();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        rbMaCN = new javax.swing.JRadioButton();
        rbTenCN = new javax.swing.JRadioButton();
        lbMes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("::Chi Nhánh::");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/chinhanh.jpg"))); // NOI18N

        tChiNhanh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tChiNhanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tChiNhanhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tChiNhanh);

        jLabel1.setText("Mã Chi Nhánh:");

        jLabel2.setText("Tên Chi Nhánh:");

        jLabel3.setText("Mã Thành Phố:");

        jLabel4.setText("Tìm theo:");

        txtMaCN.setEnabled(false);

        txtTenCN.setEnabled(false);

        txtSearch.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cbMaTP.setEnabled(false);

        btnNew.setBackground(new java.awt.Color(255, 255, 255));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/add.png"))); // NOI18N
        btnNew.setText("Thêm");
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/Save.jpg"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setEnabled(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(255, 255, 255));
        btnDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/delete.jpg"))); // NOI18N
        btnDel.setText("Xóa");
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/hình ảnh.jpg"))); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMaCN);
        rbMaCN.setSelected(true);
        rbMaCN.setText("Mã Chi Nhánh");
        rbMaCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaCNActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTenCN);
        rbTenCN.setText("Tên Chi Nhánh");
        rbTenCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTenCNActionPerformed(evt);
            }
        });

        lbMes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMes.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/search.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(rbTenCN))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(rbMaCN)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMaTP, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaCN)
                                .addComponent(txtTenCN, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDel)
                                    .addComponent(btnNew))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave)
                                    .addComponent(btnEdit))
                                .addGap(57, 57, 57)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMaTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDel)
                            .addComponent(btnEdit)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMaCN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTenCN)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (n == -1) {
            lbMes.setText("BAN CHUA CHON THONG TIN CAN XOA");
        } else {
            int m;
            m = JOptionPane.showConfirmDialog(this, "các thư liên quan sẽ bị xoá, bạn có chắc muốn xóa không", "delete", JOptionPane.OK_CANCEL_OPTION);
             lbMes.setText("");
            if (m == 0) {
                try {
                    cnDB=new Connect_Var();
                    String deletesql="delete from ChiNhanh where MaCN ='"+String.valueOf(tChiNhanh.getValueAt(n, 0))+"'";
                    String deletesql1="delete from Taixe where MaCN ='"+String.valueOf(tChiNhanh.getValueAt(n, 0))+"'";
                    String deletesql2="delete from Xe where MaCN ='"+String.valueOf(tChiNhanh.getValueAt(n, 0))+"'";
                    cnDB.SQL(deletesql);
                    cnDB.SQL(deletesql1);
                    cnDB.SQL(deletesql2);
                } catch (Exception ex) {
                    Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
                }
                mtable.removeRow(n);
                txtMaCN.setText("");
                txtTenCN.setText("");
            }
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        edit = 0;
        txtMaCN.setEnabled(true);
        txtTenCN.setEnabled(true);
        cbMaTP.setEnabled(true);
        btnNew.setEnabled(false);
        btnSave.setEnabled(true);
        txtMaCN.setText("");
        txtTenCN.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        MaCN = txtMaCN.getText();
        TenCN = txtTenCN.getText();
        MaTP = (String) cbMaTP.getSelectedItem();
        if (MaCN.equals("") || TenCN.equals("") || MaTP.equals("")) {
            lbMes.setText("yeu cau dien day du thong tin");
            return;
        }
        if (edit == 0) {
            int m = JOptionPane.showConfirmDialog(this, "ban co muon luu hay khong", "save", JOptionPane.YES_NO_OPTION);
            if (m == 0) {
               
                try {
                    cnDB=new Connect_Var();
                    String insertsql="insert into ChiNhanh values('"+MaCN+"','"+TenCN+"','"+MaTP+"')";
                    cnDB.SQL(insertsql);
                    vt = new Vector();
                    vt.add(MaCN);
                    vt.add(TenCN);
                    vt.add(MaTP);
                    mtable.addRow(vt);
                    JOptionPane.showMessageDialog(this, "ban da luu thanh cong");
                } catch (Exception ex) {
                    Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            int m = JOptionPane.showConfirmDialog(this, "ban chac chan muon thay doi", "save", JOptionPane.YES_NO_OPTION);
            if (m == 0) {
                try {
                    cnDB=new Connect_Var();
                    String updatesql="update ChiNhanh set TenCN='"+TenCN+"',MaTP='"+MaTP+"' where MaCN='"+MaCN+"'";
                    cnDB.SQL(updatesql);
                    mtable.setValueAt(MaCN, n, 0);
                    mtable.setValueAt(TenCN, n, 1);
                    mtable.setValueAt(MaTP, n, 2);
                    JOptionPane.showMessageDialog(this, "ban da luu thanh cong");
                } catch (Exception ex) {
                    Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        lbMes.setText("");
        txtMaCN.setEnabled(false);
        txtTenCN.setEnabled(false);
        cbMaTP.setEnabled(false);
        btnNew.setEnabled(true);
        btnSave.setEnabled(false);
        btnEdit.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tChiNhanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tChiNhanhMouseClicked
         n = tChiNhanh.getSelectedRow(); 
        if (n != -1) {
            txtMaCN.setText(String.valueOf(tChiNhanh.getValueAt(n, 0)));
            txtTenCN.setText(String.valueOf(tChiNhanh.getValueAt(n, 1)));
            cbMaTP.setSelectedItem(String.valueOf(tChiNhanh.getValueAt(n, 2)));
        }
    }//GEN-LAST:event_tChiNhanhMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        edit = 1;
        if (n == -1) {
            lbMes.setText("BAN CHUA CHON THONG TIN CAN SUA");
        } else {
            txtTenCN.setEnabled(true);
            cbMaTP.setEnabled(true);
            btnSave.setEnabled(true);
            btnEdit.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        while (mtable.getRowCount() >0) 
        mtable.removeRow(0);
        if (rbMaCN.isSelected()) {
            try {
                cnDB = new Connect_Var();
                rs = cnDB.s.executeQuery("select* from ChiNhanh where MaCN like '%" + txtSearch.getText() + "%' ");

            } catch (Exception ex) {
                Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                cnDB = new Connect_Var();
                rs = cnDB.s.executeQuery("select* from ChiNhanh where TenCN like '%" + txtSearch.getText() + "%' ");
            } catch (Exception ex) {
                Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            rsmd = rs.getMetaData();
            if (rs != null) {
                while (rs.next()) {
                    vt = new Vector();
                    vt.add(rs.getString(1));
                    vt.add(rs.getString(2));
                    vt.add(rs.getString(3));
                    mtable.addRow(vt);
                }
                rs.close();
                cnDB.s.close();
                cnDB.cn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiNhanh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void rbTenCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTenCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTenCNActionPerformed

    private void rbMaCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaCNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbMaTP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMes;
    private javax.swing.JRadioButton rbMaCN;
    private javax.swing.JRadioButton rbTenCN;
    private javax.swing.JTable tChiNhanh;
    private javax.swing.JTextField txtMaCN;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenCN;
    // End of variables declaration//GEN-END:variables
}
