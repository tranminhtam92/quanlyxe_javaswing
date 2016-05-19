
//import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PhanCong extends javax.swing.JInternalFrame {

 private Connect_Var cnDB;
    private DefaultTableModel mtable;
    private DefaultComboBoxModel model;
    private ResultSet rs;
    private ResultSetMetaData rsmd;
    private Vector vt;
    private int n = -1, edit,Songay,Sogio,Gioquydinh,ID;
    private String  Soxe,MaTX,Date;
    public PhanCong() {
        initComponents();
        InitTable();
    }
private void InitTable(){
        vt = new Vector();
        vt.add("ID");
        vt.add("MaTX");
        vt.add("Soxe");
        vt.add("ngay,thang,nam");
        vt.add("Số ngày lái");
        vt.add("Số giờ lái");
        vt.add("Giờ quy định");
        mtable = new DefaultTableModel(vt,0);
        try {
            cnDB = new Connect_Var();
            rs = cnDB.s.executeQuery("select * from PhanCong");
            rsmd = rs.getMetaData();
            if (rs != null) {
                while (rs.next()) {
                    vt = new Vector();
                    vt.add(rs.getInt(1));
                    vt.add(rs.getString(2));
                    vt.add(rs.getString(3));
                    vt.add(rs.getDate(4));
                    vt.add(rs.getInt(5));
                    vt.add(rs.getInt(6));
                    vt.add(rs.getInt(7));
                    mtable.addRow(vt);
                }
                rs.close();
                cnDB.s.close();
                cnDB.cn.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
        }
        tPhanCong.setModel(mtable);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPhanCong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaTX = new javax.swing.JTextField();
        txtSoxe = new javax.swing.JTextField();
        txtSongay = new javax.swing.JTextField();
        txtSogiolai = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtGioquydinh = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        lbMes = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        rbMaTX = new javax.swing.JRadioButton();
        rbSoxe = new javax.swing.JRadioButton();
        rbDate = new javax.swing.JRadioButton();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("::Phân Công::");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/phancong.jpg"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(985, 500));

        tPhanCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tPhanCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPhanCongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPhanCong);

        jLabel1.setText("Mã tài xế:");

        jLabel2.setText("Số xe:");

        jLabel3.setText("Date");

        jLabel4.setText("Số ngày lái:");

        jLabel5.setText("Số giờ lái:");

        jLabel6.setText("Giờ quy định");

        txtMaTX.setEnabled(false);
        txtMaTX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTXActionPerformed(evt);
            }
        });

        txtSoxe.setEnabled(false);

        txtSongay.setEnabled(false);
        txtSongay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSongayActionPerformed(evt);
            }
        });

        txtSogiolai.setEnabled(false);
        txtSogiolai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSogiolaiActionPerformed(evt);
            }
        });

        txtDate.setEnabled(false);
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        txtGioquydinh.setEnabled(false);

        btnNew.setBackground(new java.awt.Color(255, 255, 255));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        btnDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/delete.jpg"))); // NOI18N
        btnDel.setText("Xóa");
        btnDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        lbMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMes.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setText("Tìm theo");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        buttonGroup1.add(rbMaTX);
        rbMaTX.setSelected(true);
        rbMaTX.setText("Mã tài xế");

        buttonGroup1.add(rbSoxe);
        rbSoxe.setText("Số xe");

        buttonGroup1.add(rbDate);
        rbDate.setText("mm/dd/yyyy");

        txtID.setEnabled(false);

        jLabel7.setText("ID:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/search.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMaTX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbSoxe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbDate)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSogiolai)
                                    .addComponent(txtMaTX)
                                    .addComponent(txtID)
                                    .addComponent(txtSoxe)
                                    .addComponent(txtSongay)
                                    .addComponent(txtDate)
                                    .addComponent(txtGioquydinh, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addGap(43, 43, 43)
                                .addComponent(btnDel)
                                .addGap(30, 30, 30)
                                .addComponent(btnSave)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addComponent(txtSongay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSogiolai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGioquydinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnNew)
                    .addComponent(btnDel))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbMaTX)
                            .addComponent(rbSoxe)
                            .addComponent(rbDate)
                            .addComponent(jLabel8)))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaTXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTXActionPerformed

    private void tPhanCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPhanCongMouseClicked
        n = tPhanCong.getSelectedRow(); 
        if (n != -1) {
            txtID.setText(String.valueOf(tPhanCong.getValueAt(n, 0)));
            txtMaTX.setText(String.valueOf(tPhanCong.getValueAt(n, 1)));
            txtSoxe.setText(String.valueOf(tPhanCong.getValueAt(n, 2)));
            txtSongay.setText(String.valueOf(tPhanCong.getValueAt(n, 4)));
            txtSogiolai.setText(String.valueOf(tPhanCong.getValueAt(n, 5)));
            txtDate.setText(String.valueOf(tPhanCong.getValueAt(n, 3)));
            txtGioquydinh.setText(String.valueOf(tPhanCong.getValueAt(n, 6)));
        }
    }//GEN-LAST:event_tPhanCongMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        edit = 0;
        txtID.setEnabled(true);
        txtMaTX.setEnabled(true);
        txtSoxe.setEnabled(true);
        txtSongay.setEnabled(true);
        txtSogiolai.setEnabled(true);
        txtDate.setEnabled(true);
        txtGioquydinh.setEnabled(true);
        btnNew.setEnabled(false);
        btnSave.setEnabled(true);
        txtMaTX.setText("");
        txtSoxe.setText("");
        txtSongay.setText("");
        txtSogiolai.setText("");
        txtDate.setText("");
        txtGioquydinh.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        MaTX = txtMaTX.getText();
        Soxe = txtSoxe.getText();
         Date=txtDate.getText();
        try {
            
            ID = Integer.parseInt(txtID.getText());
            Songay = Integer.parseInt(txtSongay.getText());
            Sogio = Integer.parseInt(txtSogiolai.getText());
            Gioquydinh = Integer.parseInt(txtGioquydinh.getText());
        } catch (NumberFormatException e) {
            lbMes.setText("SO ngày,giờ,giờ quy định PHAI LA SO NGUYEN");
            txtSogiolai.requestFocus();
            return;
        }
        if (Soxe.equals("") || MaTX.equals("") || Songay < 1 ||Sogio < 1 ||Gioquydinh < 1 ) {
            lbMes.setText("yeu cau dien day du thong tin");
            return;
        }
            int m = JOptionPane.showConfirmDialog(this, "ban co muon luu hay khong", "save", JOptionPane.YES_NO_OPTION);
            if (m == 0) {
               
                try {
                    cnDB=new Connect_Var();
                    String insertsql="insert into PhanCong values('"+ID+"','"+MaTX+"','"+Soxe+"','"+Date+"','"+Songay+"','"+Sogio+"','"+Gioquydinh+"')";
                    cnDB.SQL(insertsql);
                    vt = new Vector();
                    vt.add(ID);
                    vt.add(MaTX);
                    vt.add(Soxe);
                    vt.add(Date);
                    vt.add(Songay);
                    vt.add(Sogio);
                    vt.add(Gioquydinh);
                    mtable.addRow(vt);
                    JOptionPane.showMessageDialog(this, "ban da luu thanh cong");
                } catch (Exception ex) {
                    Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        lbMes.setText("");
        txtMaTX.setEnabled(false);
        txtSoxe.setEnabled(false);
        txtSongay.setEnabled(false);
        txtSogiolai.setEnabled(false);
        txtDate.setEnabled(false);
        txtGioquydinh.setEnabled(false);
        btnNew.setEnabled(true);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        if (n == -1) {
        lbMes.setText("BAN CHUA CHON THONG TIN CAN XOA");
        } else {
            int m;
            m = JOptionPane.showConfirmDialog(this, "ban co chac muon xoa khong", "delete", JOptionPane.OK_CANCEL_OPTION);
            if (m == 0) {
                try {
                     cnDB=new Connect_Var();
                    String deletesql="delete from PhanCong where ID="+Integer.parseInt(txtID.getText())+"";
                     cnDB.SQL(deletesql);
                      
               } catch (Exception ex) {
                    Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
                }
                mtable.removeRow(n);
                txtID.setText("");
                txtMaTX.setText("");
                txtSoxe.setText("");
                txtSongay.setText("");
                txtSogiolai.setText("");
                txtDate.setText("");
                txtGioquydinh.setText("");
            }
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        while (mtable.getRowCount() >0) 
        mtable.removeRow(0);
        if (rbMaTX.isSelected()) {
            try {
                cnDB = new Connect_Var();
                rs = cnDB.s.executeQuery("select* from PhanCong where MaTX like '%" + txtSearch.getText() + "%' ");

            } catch (Exception ex) {
                Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            if(rbMaTX.isSelected()){
                try {
                    cnDB = new Connect_Var();
                    rs = cnDB.s.executeQuery("select* from PhanCong where Soxe like '%" + txtSearch.getText() + "%' ");
                } catch (Exception ex) {
                    Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    cnDB = new Connect_Var();
                    rs = cnDB.s.executeQuery("select* from PhanCong where Date like '%" + txtSearch.getText() + "%' ");
                } catch (Exception ex) {
                    Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        try {
            rsmd = rs.getMetaData();
            if (rs != null) {
                while (rs.next()) {
                    vt = new Vector();
                    vt.add(rs.getInt(1));
                    vt.add(rs.getString(2));
                    vt.add(rs.getString(3));
                    vt.add(rs.getDate(4));
                    vt.add(rs.getInt(5));
                    vt.add(rs.getInt(6));
                    vt.add(rs.getInt(7));
                    mtable.addRow(vt);
                }
                rs.close();
                cnDB.s.close();
                cnDB.cn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtSongayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSongayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSongayActionPerformed

    private void txtSogiolaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSogiolaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSogiolaiActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMes;
    private javax.swing.JRadioButton rbDate;
    private javax.swing.JRadioButton rbMaTX;
    private javax.swing.JRadioButton rbSoxe;
    private javax.swing.JTable tPhanCong;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGioquydinh;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaTX;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSogiolai;
    private javax.swing.JTextField txtSongay;
    private javax.swing.JTextField txtSoxe;
    // End of variables declaration//GEN-END:variables
}
