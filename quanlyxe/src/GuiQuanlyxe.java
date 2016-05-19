

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teo
 */
public class GuiQuanlyxe extends javax.swing.JFrame {

    private Connect_Var cnDB;
    private ResultSet rs;
    private ResultSetMetaData rsmd;
    private String id="";
    private String mk="";
    static Boolean loggedIn= false;
    static Taixe Taixe;
    static Thongtinxe Thongtinxe;
    static PhanCong PhanCong;
    static ChiNhanh ChiNhanh;
    static Thanhpho Thanhpho;
    static Thongtinnguoidung Thongtinnguoidung;
    static Doimatkhau Doimatkhau;
    public GuiQuanlyxe() {
        initComponents();
        //pnMain.setVisible(false);
 
        Taixe=new Taixe();
        Thongtinxe=new Thongtinxe();
        PhanCong=new PhanCong();
        ChiNhanh =new ChiNhanh();
        Thanhpho =new Thanhpho();
        Thongtinnguoidung=new Thongtinnguoidung();
        Doimatkhau=new Doimatkhau();
         Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
         btnTaixe.setVisible(false);
         btnXe.setVisible(false);
         btnPhanCong.setVisible(false);
         btnChiNhanh.setVisible(false);
         btnUser.setVisible(false);
         btnThanhpho.setVisible(false);
         btnDoipass.setVisible(false);
         pnKhung.add(Taixe);
         pnKhung.add(Thongtinxe);
         pnKhung.add(PhanCong);
         pnKhung.add(ChiNhanh);
         pnKhung.add(Thanhpho);
         pnKhung.add(Thongtinnguoidung);
         pnKhung.add(Doimatkhau);
         ifLogin.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src\\hinh\\1.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        pnKhung = new javax.swing.JPanel();
        ifLogin = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pfPass = new javax.swing.JPasswordField();
        lbMes = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnTaixe = new javax.swing.JButton();
        btnXe = new javax.swing.JButton();
        btnPhanCong = new javax.swing.JButton();
        btnChiNhanh = new javax.swing.JButton();
        btnThanhpho = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnDoipass = new javax.swing.JButton();
        btnLoginagain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        pnMain.setOpaque(false);

        pnKhung.setBackground(new java.awt.Color(255, 255, 255));
        pnKhung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnKhung.setOpaque(false);

        ifLogin.setBackground(new java.awt.Color(255, 255, 255));
        ifLogin.setClosable(true);
        ifLogin.setForeground(new java.awt.Color(51, 153, 255));
        ifLogin.setTitle("::Login::");
        ifLogin.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/login.jpg"))); // NOI18N
        ifLogin.setOpaque(true);
        ifLogin.setVisible(true);
        ifLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ifLoginKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");

        jLabel2.setText("Tài khoản:");

        jLabel3.setText("Mật khẩu:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        pfPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfPassKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/OK.jpg"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/xoa.jpg"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/login.jpg"))); // NOI18N

        javax.swing.GroupLayout ifLoginLayout = new javax.swing.GroupLayout(ifLogin.getContentPane());
        ifLogin.getContentPane().setLayout(ifLoginLayout);
        ifLoginLayout.setHorizontalGroup(
            ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifLoginLayout.createSequentialGroup()
                .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ifLoginLayout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ifLoginLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(34, 34, 34)
                            .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUser)
                                .addComponent(pfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
                        .addComponent(lbMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ifLoginLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnExit)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 463, Short.MAX_VALUE))
        );
        ifLoginLayout.setVerticalGroup(
            ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifLoginLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ifLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnKhung.add(ifLogin);

        btnTaixe.setBackground(new java.awt.Color(255, 255, 255));
        btnTaixe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTaixe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/taixe.jpg"))); // NOI18N
        btnTaixe.setText("Tài xe");
        btnTaixe.setFocusable(false);
        btnTaixe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTaixe.setOpaque(false);
        btnTaixe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTaixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaixeActionPerformed(evt);
            }
        });

        btnXe.setBackground(new java.awt.Color(255, 255, 255));
        btnXe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/xe.jpg"))); // NOI18N
        btnXe.setText("Thông tin xe");
        btnXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXe.setFocusable(false);
        btnXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXe.setOpaque(false);
        btnXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXeActionPerformed(evt);
            }
        });

        btnPhanCong.setBackground(new java.awt.Color(255, 255, 255));
        btnPhanCong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPhanCong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/phancong.jpg"))); // NOI18N
        btnPhanCong.setText("Phân công");
        btnPhanCong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhanCong.setFocusable(false);
        btnPhanCong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPhanCong.setOpaque(false);
        btnPhanCong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPhanCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanCongActionPerformed(evt);
            }
        });

        btnChiNhanh.setBackground(new java.awt.Color(255, 255, 255));
        btnChiNhanh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChiNhanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/chinhanh.jpg"))); // NOI18N
        btnChiNhanh.setText("Chi nhánh");
        btnChiNhanh.setFocusable(false);
        btnChiNhanh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChiNhanh.setOpaque(false);
        btnChiNhanh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChiNhanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiNhanhActionPerformed(evt);
            }
        });

        btnThanhpho.setBackground(new java.awt.Color(255, 255, 255));
        btnThanhpho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThanhpho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/thành phố.jpg"))); // NOI18N
        btnThanhpho.setText("Thành Phố");
        btnThanhpho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThanhpho.setFocusable(false);
        btnThanhpho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThanhpho.setOpaque(false);
        btnThanhpho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThanhpho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhphoActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(255, 255, 255));
        btnUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/iconthôngtin.jpg"))); // NOI18N
        btnUser.setText("Thông tin cá nhân");
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.setFocusable(false);
        btnUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser.setOpaque(false);
        btnUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnDoipass.setBackground(new java.awt.Color(255, 255, 255));
        btnDoipass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDoipass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/icondoipass.jpg"))); // NOI18N
        btnDoipass.setText("Đổi mật khẩu");
        btnDoipass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoipass.setFocusable(false);
        btnDoipass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoipass.setOpaque(false);
        btnDoipass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoipassActionPerformed(evt);
            }
        });

        btnLoginagain.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginagain.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLoginagain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinh/iconlogin.jpg"))); // NOI18N
        btnLoginagain.setText("Đăng nhập lại");
        btnLoginagain.setFocusable(false);
        btnLoginagain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoginagain.setOpaque(false);
        btnLoginagain.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLoginagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginagainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnKhung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTaixe)
                        .addGap(38, 38, 38)
                        .addComponent(btnXe)
                        .addGap(40, 40, 40)
                        .addComponent(btnPhanCong)
                        .addGap(37, 37, 37)
                        .addComponent(btnChiNhanh)
                        .addGap(41, 41, 41)
                        .addComponent(btnThanhpho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(btnUser)
                        .addGap(59, 59, 59)
                        .addComponent(btnDoipass)
                        .addGap(79, 79, 79)
                        .addComponent(btnLoginagain)))
                .addGap(26, 26, 26))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDoipass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLoginagain, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTaixe)
                        .addComponent(btnXe)
                        .addComponent(btnPhanCong)
                        .addComponent(btnChiNhanh)
                        .addComponent(btnThanhpho)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnKhung, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                id=txtUser.getText();
        mk=pfPass.getText();
        int dk=1;
     try {
         cnDB=new Connect_Var();
         rs=cnDB.s.executeQuery("select* from Nhanvien ");
         while(rs.next()){
             if(id.equals(rs.getString(1))&&mk.equals(rs.getString(2)))
                 dk=0;
         }
         if(dk==0){
             pnMain.setVisible(true);
             ifLogin.dispose();
              btnTaixe.setVisible(true);
         btnXe.setVisible(true);
         btnPhanCong.setVisible(true);
         btnChiNhanh.setVisible(true);
         btnUser.setVisible(true);
         btnThanhpho.setVisible(true);
         btnDoipass.setVisible(true);
         btnLoginagain.setVisible(true);
         txtUser.setText("");
        pfPass.setText("");
        lbMes.setText("");
         }
         else{
             lbMes.setText("Ban dien sai tai khoan hoac mat khau");
             txtUser.requestFocus();
         }
               rs.close();
                cnDB.s.close();
                cnDB.cn.close();
     } catch (Exception ex) {
         Logger.getLogger(GuiQuanlyxe.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void pfPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPassKeyPressed
                   //System.out.println(KeyEvent.getKeyText(evt.getKeyCode())+" is pressed!");
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_pfPassKeyPressed

    private void btnTaixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaixeActionPerformed
            Taixe.setVisible(true);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
    }//GEN-LAST:event_btnTaixeActionPerformed

    private void btnXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXeActionPerformed
        Taixe.setVisible(false);
         Thongtinxe.setVisible(true);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
    }//GEN-LAST:event_btnXeActionPerformed

    private void btnPhanCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanCongActionPerformed
          Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(true);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
    }//GEN-LAST:event_btnPhanCongActionPerformed

    private void btnChiNhanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiNhanhActionPerformed
          Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(true);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
    }//GEN-LAST:event_btnChiNhanhActionPerformed

    private void btnThanhphoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhphoActionPerformed
         Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(true);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
    }//GEN-LAST:event_btnThanhphoActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
          Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.init(id);
         Thongtinnguoidung.setVisible(true);
         Doimatkhau.setVisible(false);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnDoipassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoipassActionPerformed
        Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setTextID(id);
         Doimatkhau.setVisible(true);
    }//GEN-LAST:event_btnDoipassActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        ifLogin.dispose();
    }//GEN-LAST:event_btnExitActionPerformed
        
    private void btnLoginagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginagainActionPerformed
           Taixe.setVisible(false);
         Thongtinxe.setVisible(false);
         PhanCong.setVisible(false);
         ChiNhanh.setVisible(false);
         Thanhpho.setVisible(false);
         Thongtinnguoidung.setVisible(false);
         Doimatkhau.setVisible(false);
         btnTaixe.setVisible(false);
         btnXe.setVisible(false);
         btnPhanCong.setVisible(false);
         btnChiNhanh.setVisible(false);
         btnUser.setVisible(false);
         btnThanhpho.setVisible(false);
         btnDoipass.setVisible(false);
         ifLogin.show();
         txtUser.requestFocus();
    }//GEN-LAST:event_btnLoginagainActionPerformed

    private void ifLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifLoginKeyPressed
                int key = evt.getKeyCode();
        //System.out.println(KeyEvent.getKeyText(key)+" is pressed!");
        if(key==KeyEvent.VK_ENTER){
            
            if(pfPass.requestFocusInWindow())
                btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_ifLoginKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
                        int key = evt.getKeyCode();
        //System.out.println(KeyEvent.getKeyText(key)+" is pressed!");
        if(key==KeyEvent.VK_ENTER){
            
            if(pfPass.requestFocusInWindow())
                btnLoginActionPerformed(null);
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed


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
            java.util.logging.Logger.getLogger(GuiQuanlyxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiQuanlyxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiQuanlyxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiQuanlyxe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiQuanlyxe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiNhanh;
    private javax.swing.JButton btnDoipass;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginagain;
    private javax.swing.JButton btnPhanCong;
    private javax.swing.JButton btnTaixe;
    private javax.swing.JButton btnThanhpho;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnXe;
    private javax.swing.JInternalFrame ifLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbMes;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JPanel pnKhung;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
