
package com.mycompany.dangkyvnworks;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DKVNW extends javax.swing.JFrame {

    public DKVNW() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelTaiKhoan = new javax.swing.JPanel();
        jLabelTaiKhoan = new javax.swing.JLabel();
        jTextHo = new javax.swing.JTextField();
        jIconUser = new javax.swing.JLabel();
        jLabelCongTy = new javax.swing.JLabel();
        jIconWork = new javax.swing.JLabel();
        jLabelDangKy = new javax.swing.JLabel();
        jTextTen = new javax.swing.JTextField();
        jLabelHoTen = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelDienThoai = new javax.swing.JLabel();
        jLabelMatKhau = new javax.swing.JLabel();
        jLabelNhapLaiMK = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jTextDienThoai = new javax.swing.JTextField();
        jLabelNganh = new javax.swing.JLabel();
        jTextTenCT = new javax.swing.JTextField();
        jLabelTenCT = new javax.swing.JLabel();
        jTextNganh = new javax.swing.JTextField();
        jLabelCamKet = new javax.swing.JLabel();
        jLabelDiaChi = new javax.swing.JLabel();
        jComboBoxDiaChi = new javax.swing.JComboBox<>();
        jRadioButtonCo = new javax.swing.JRadioButton();
        jRadioButtonKhong = new javax.swing.JRadioButton();
        jLabelCauHoi = new javax.swing.JLabel();
        jCheckBoxDongY = new javax.swing.JCheckBox();
        jLabelToiDongY = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelQuyDinh = new javax.swing.JLabel();
        jLabelVa = new javax.swing.JLabel();
        jLabelThoaThuan = new javax.swing.JLabel();
        jButtonDangKy = new javax.swing.JButton();
        jLabelToiDongY1 = new javax.swing.JLabel();
        jLabelQuyDinh1 = new javax.swing.JLabel();
        jPasswordFieldNhapLai = new javax.swing.JPasswordField();
        jLabelLoiHo = new javax.swing.JLabel();
        jLabelLoiTen = new javax.swing.JLabel();
        jLabelLoiEmail = new javax.swing.JLabel();
        jLabelLoiDT = new javax.swing.JLabel();
        jLabelLoiMK = new javax.swing.JLabel();
        jLabelLoiMK2 = new javax.swing.JLabel();
        jLabelLoiTenCT = new javax.swing.JLabel();
        jLabelLoiNganh = new javax.swing.JLabel();
        jLabelLoiLuaChon = new javax.swing.JLabel();
        jLabelLoiDongY = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTaiKhoan.setText("Tài Khoản");

        jTextHo.setForeground(new java.awt.Color(153, 153, 153));
        jTextHo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextHo.setText("Họ");
        jTextHo.setActionCommand("<Not Set>");
        jTextHo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextHo.setName("Họ Tên"); // NOI18N
        jTextHo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextHoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHoFocusLost(evt);
            }
        });
        jTextHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHoActionPerformed(evt);
            }
        });

        jIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dangkyvnworks/image/user.png"))); // NOI18N

        jLabelCongTy.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabelCongTy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCongTy.setText("Công Ty");

        jIconWork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconWork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dangkyvnworks/image/work.png"))); // NOI18N

        jLabelDangKy.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDangKy.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabelDangKy.setForeground(new java.awt.Color(0, 153, 255));
        jLabelDangKy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDangKy.setText("ĐĂNG KÝ");

        jTextTen.setForeground(new java.awt.Color(153, 153, 153));
        jTextTen.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextTen.setText("Tên");
        jTextTen.setActionCommand("<Not Set>");
        jTextTen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextTen.setName("Họ Tên"); // NOI18N
        jTextTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextTenFocusLost(evt);
            }
        });
        jTextTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTenActionPerformed(evt);
            }
        });

        jLabelHoTen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHoTen.setText("Họ và tên");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setText("Địa chỉ email");

        jLabelDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDienThoai.setText("Điện thoại");

        jLabelMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMatKhau.setText("Mật khẩu (i)");

        jLabelNhapLaiMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNhapLaiMK.setText("Nhập lại mật khẩu");

        jTextEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jTextDienThoai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDienThoaiActionPerformed(evt);
            }
        });

        jLabelNganh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNganh.setText("Nghành nghề");

        jTextTenCT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextTenCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTenCTActionPerformed(evt);
            }
        });

        jLabelTenCT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTenCT.setText("Tên công ty");

        jTextNganh.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNganhActionPerformed(evt);
            }
        });

        jLabelCamKet.setForeground(new java.awt.Color(153, 153, 153));
        jLabelCamKet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCamKet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dangkyvnworks/image/shield.png"))); // NOI18N
        jLabelCamKet.setText("️️ Mật mã tại VietnamWorks luôn được mã hóa và bảo mật tuyệt đối.");

        jLabelDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDiaChi.setText("Địa chỉ");

        jComboBoxDiaChi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa - Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Thành phố Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        jComboBoxDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiaChiActionPerformed(evt);
            }
        });

        jRadioButtonCo.setText("Có");
        jRadioButtonCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCoActionPerformed(evt);
            }
        });

        jRadioButtonKhong.setText("Không");

        jLabelCauHoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCauHoi.setText("Hiện Tại Quý Khách Có Nhu Cầu Tuyển Dụng Hay Không?");

        jCheckBoxDongY.setText("jCheckBox1");

        jLabelToiDongY.setText("Tôi đã đọc và đồng ý với các ");

        jLabelQuyDinh.setForeground(new java.awt.Color(51, 153, 255));
        jLabelQuyDinh.setText("Quy định bảo mật");

        jLabelVa.setText("và");

        jLabelThoaThuan.setForeground(new java.awt.Color(51, 153, 255));
        jLabelThoaThuan.setText("Thỏa thuận sử dụng");

        jButtonDangKy.setBackground(new java.awt.Color(255, 153, 51));
        jButtonDangKy.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDangKy.setText("Đăng Ký");
        jButtonDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangKyActionPerformed(evt);
            }
        });

        jLabelToiDongY1.setText("Bạn đã có tài khoản?");

        jLabelQuyDinh1.setForeground(new java.awt.Color(51, 153, 255));
        jLabelQuyDinh1.setText("Đăng nhập ngay!");

        jLabelLoiHo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiHo.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiTen.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiTen.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiEmail.setForeground(new java.awt.Color(255, 0, 51));

        jLabelLoiDT.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiDT.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiMK.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiMK.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiMK2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiMK2.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiTenCT.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiTenCT.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiNganh.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiNganh.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiLuaChon.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiLuaChon.setForeground(new java.awt.Color(255, 51, 51));

        jLabelLoiDongY.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoiDongY.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanelTaiKhoanLayout = new javax.swing.GroupLayout(jPanelTaiKhoan);
        jPanelTaiKhoan.setLayout(jPanelTaiKhoanLayout);
        jPanelTaiKhoanLayout.setHorizontalGroup(
            jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addComponent(jIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addComponent(jLabelTaiKhoan)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addComponent(jLabelDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextDienThoai)
                                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabelLoiDT, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addComponent(jLabelMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPasswordField)
                                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                                .addComponent(jLabelLoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addComponent(jLabelNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                                .addComponent(jLabelLoiMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jPasswordFieldNhapLai))))
                                .addGap(105, 105, 105))))
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jIconWork, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addComponent(jLabelHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextHo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelLoiHo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextTen, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                            .addComponent(jLabelLoiTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(105, 105, 105))
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addComponent(jLabelLoiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jTextEmail)
                                .addGap(105, 105, 105))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCongTy)
                                    .addComponent(jLabelTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLoiTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLoiNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTaiKhoanLayout.createSequentialGroup()
                                                    .addGap(287, 287, 287)
                                                    .addComponent(jRadioButtonCo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jRadioButtonKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                                    .addGap(25, 25, 25)
                                                    .addComponent(jLabelLoiLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jComboBoxDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxDongY, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLoiDongY, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                                .addComponent(jLabelToiDongY)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelQuyDinh)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelVa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelThoaThuan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(91, Short.MAX_VALUE))))))
            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButtonDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                                .addComponent(jLabelToiDongY1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelQuyDinh1))))
                    .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabelCamKet, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelTaiKhoanLayout.setVerticalGroup(
            jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaiKhoanLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelDangKy)
                .addGap(31, 31, 31)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTaiKhoan)
                    .addComponent(jIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHoTen))
                .addGap(2, 2, 2)
                .addComponent(jLabelLoiHo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiTen)
                .addGap(26, 26, 26)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiEmail)
                .addGap(29, 29, 29)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDienThoai)
                    .addComponent(jTextDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiDT, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatKhau)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNhapLaiMK)
                    .addComponent(jPasswordFieldNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabelLoiMK2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCamKet, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCongTy)
                    .addComponent(jIconWork, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTenCT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNganh)
                    .addComponent(jTextNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabelLoiNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiaChi)
                    .addComponent(jComboBoxDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCauHoi)
                    .addComponent(jRadioButtonKhong)
                    .addComponent(jRadioButtonCo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDongY)
                    .addComponent(jLabelToiDongY)
                    .addComponent(jLabelQuyDinh)
                    .addComponent(jLabelVa)
                    .addComponent(jLabelThoaThuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoiDongY, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jButtonDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelToiDongY1)
                    .addComponent(jLabelQuyDinh1))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHoActionPerformed
       
    }//GEN-LAST:event_jTextHoActionPerformed

    private void jTextHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHoFocusGained
        if (jTextHo.getText().equals("Họ")){
            jTextHo.setText("");
            jTextHo.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextHoFocusGained

    private void jTextTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTenFocusGained
        if (jTextTen.getText().equals("Tên")){
            jTextTen.setText("");
            jTextTen.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextTenFocusGained

    private void jTextTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTenActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDienThoaiActionPerformed

    private void jTextTenCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTenCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTenCTActionPerformed

    private void jTextNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNganhActionPerformed

    private void jRadioButtonCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCoActionPerformed

    private void jTextHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHoFocusLost
        if(jTextHo.getText().isEmpty()){
            jTextHo.setText("Họ");
            jTextHo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTextHoFocusLost

    private void jTextTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextTenFocusLost
        if(jTextTen.getText().isEmpty()){
            jTextTen.setText("Tên");
            jTextTen.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTextTenFocusLost

    private void jButtonDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangKyActionPerformed
        String ho = jTextHo.getText().trim();
        String ten = jTextTen.getText().trim();
        String email = jTextEmail.getText().trim();
        String sdt = jTextDienThoai.getText().trim();
        String mk = jPasswordField.getText().trim();
        String mk2 = jPasswordFieldNhapLai.getText().trim();
        String cty = jTextTenCT.getText().trim();
        String nganh = jTextNganh.getText().trim();
        String diaChi = (String) jComboBoxDiaChi.getSelectedItem();
        boolean luaChon = true;
        
        
        if(ho.equals("Họ")){
           jLabelLoiHo.setText("Vui lòng nhập Họ!");
           return;
        }
        else
            jLabelLoiHo.setText("");
        
        if(ten.equals("Tên")){
           jLabelLoiTen.setText("Vui lòng nhập Tên!");
           return;
        }
        else
            jLabelLoiTen.setText("");
        
        if(email.isEmpty()){
           jLabelLoiEmail.setText("Vui lòng nhập Email!");
           return;
        }
        else
            jLabelLoiEmail.setText("");
        
        if(mk.isEmpty()){
           jLabelLoiMK.setText("Vui lòng nhập Mật Khẩu!");
           return;
        }
        else
            jLabelLoiMK.setText("");
        
        if(sdt.isEmpty()){
           jLabelLoiDT.setText("Vui lòng nhập Tên Công Ty!");
           return;
        }
        else
            jLabelLoiDT.setText("");
        
        if(mk2.isEmpty()){
           jLabelLoiMK2.setText("Vui lòng nhập Nhập Lại Mật Khẩu!");
           return;
        }
        else{
            if(!mk2.equals(mk))
                jLabelLoiMK2.setText("Mật Khẩu Không Giống!");
            else
                jLabelLoiMK2.setText("");
        }
        
        if(cty.isEmpty()){
           jLabelLoiTenCT.setText("Vui lòng nhập Tên Công Ty!");
           return;
        }
        else
            jLabelLoiTenCT.setText("");
        
        if(nganh.isEmpty()){
           jLabelLoiNganh.setText("Vui lòng nhập Ngành Nghề!");
           return;
        }
        else
            jLabelLoiNganh.setText("");
        
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButtonCo);
        group.add(jRadioButtonKhong);
        
        if(!jRadioButtonCo.isSelected() && !jRadioButtonKhong.isSelected()){
            jLabelLoiLuaChon.setText("Vui lòng chọn Có hoặc Không!");
            return;
        }
        else {
            jLabelLoiLuaChon.setText("");
            if(jRadioButtonCo.isSelected())
                luaChon = true;
            else
                luaChon = false;
        }
        
        if(!jCheckBoxDongY.isSelected()){
           jLabelLoiDongY.setText("Vui lòng nhập Ngành Nghề!");
           return;
        }
        else
            jLabelLoiDongY.setText("");
        
        Connection ketNoi = KetNoiCSDL.layKetNoi();
        String nhapThongTin = "insert into DKY (HO, TEN, EMAIL, SDT, MK, TENCT, NGANH, DIACHI, NHUCAU) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            PreparedStatement layThongTin = ketNoi.prepareStatement(nhapThongTin);
            layThongTin.setString(1, ho);
            layThongTin.setString(2, ten);
            layThongTin.setString(3, email);
            layThongTin.setString(4, sdt);
            layThongTin.setString(5, mk);
            layThongTin.setString(6, cty);
            layThongTin.setString(7, nganh);
            layThongTin.setString(8, diaChi);
            layThongTin.setBoolean(9, luaChon);
            
            int rows = layThongTin.executeUpdate();

            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Đăng Ký Thành Công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Đăng Ký Thất Bại! Vui lòng thử lại!","Lỗi", JOptionPane.ERROR_MESSAGE);
            }
            
            System.out.println("Đăng Ký Thành Công!");
            
            layThongTin.close();
            ketNoi.close();
              
        }  catch(SQLException e){
            System.out.println("Khong them duoc thong tin!!!!");
            e.getMessage();
             e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonDangKyActionPerformed

    private void jComboBoxDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDiaChiActionPerformed

    
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
            java.util.logging.Logger.getLogger(DKVNW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DKVNW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DKVNW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DKVNW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DKVNW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangKy;
    private javax.swing.JCheckBox jCheckBoxDongY;
    private javax.swing.JComboBox<String> jComboBoxDiaChi;
    private javax.swing.JLabel jIconUser;
    private javax.swing.JLabel jIconWork;
    private javax.swing.JLabel jLabelCamKet;
    private javax.swing.JLabel jLabelCauHoi;
    private javax.swing.JLabel jLabelCongTy;
    private javax.swing.JLabel jLabelDangKy;
    private javax.swing.JLabel jLabelDiaChi;
    private javax.swing.JLabel jLabelDienThoai;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHoTen;
    private javax.swing.JLabel jLabelLoiDT;
    private javax.swing.JLabel jLabelLoiDongY;
    private javax.swing.JLabel jLabelLoiEmail;
    private javax.swing.JLabel jLabelLoiHo;
    private javax.swing.JLabel jLabelLoiLuaChon;
    private javax.swing.JLabel jLabelLoiMK;
    private javax.swing.JLabel jLabelLoiMK2;
    private javax.swing.JLabel jLabelLoiNganh;
    private javax.swing.JLabel jLabelLoiTen;
    private javax.swing.JLabel jLabelLoiTenCT;
    private javax.swing.JLabel jLabelMatKhau;
    private javax.swing.JLabel jLabelNganh;
    private javax.swing.JLabel jLabelNhapLaiMK;
    private javax.swing.JLabel jLabelQuyDinh;
    private javax.swing.JLabel jLabelQuyDinh1;
    private javax.swing.JLabel jLabelTaiKhoan;
    private javax.swing.JLabel jLabelTenCT;
    private javax.swing.JLabel jLabelThoaThuan;
    private javax.swing.JLabel jLabelToiDongY;
    private javax.swing.JLabel jLabelToiDongY1;
    private javax.swing.JLabel jLabelVa;
    private javax.swing.JPanel jPanelTaiKhoan;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldNhapLai;
    private javax.swing.JRadioButton jRadioButtonCo;
    private javax.swing.JRadioButton jRadioButtonKhong;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextDienThoai;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextHo;
    private javax.swing.JTextField jTextNganh;
    private javax.swing.JTextField jTextTen;
    private javax.swing.JTextField jTextTenCT;
    // End of variables declaration//GEN-END:variables
}
