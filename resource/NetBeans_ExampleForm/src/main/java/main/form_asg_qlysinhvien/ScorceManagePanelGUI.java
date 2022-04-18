/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.form_asg_qlysinhvien;

/**
 *
 * @author edgar
 */
public class ScorceManagePanelGUI extends javax.swing.JPanel {

    /**
     * Creates new form ScorceManagePanelGUI
     */
    public ScorceManagePanelGUI() {
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

        lbTitle = new javax.swing.JLabel();
        srt1 = new javax.swing.JSeparator();
        lbIdSinhVien = new javax.swing.JLabel();
        txtIdSinhVien = new javax.swing.JTextField();
        btnIdSinhVien = new javax.swing.JButton();
        tblMain = new javax.swing.JPanel();
        lbIdOut = new javax.swing.JLabel();
        lbHotenOut = new javax.swing.JLabel();
        lbToanOut = new javax.swing.JLabel();
        lbHoaOut = new javax.swing.JLabel();
        lbLyOut = new javax.swing.JLabel();
        txtIdOut = new javax.swing.JTextField();
        txtHotenOut = new javax.swing.JTextField();
        txtToanOut = new javax.swing.JTextField();
        txtLyOut = new javax.swing.JTextField();
        txtHoaOut = new javax.swing.JTextField();
        pnShowResult = new javax.swing.JPanel();
        lbTitleDTB = new javax.swing.JLabel();
        lbDiemTB = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tblPanel = new javax.swing.JPanel();
        tblScrollPane = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(546, 615));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle.setText("Quản lí điểm GPA");

        lbIdSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIdSinhVien.setText("Mã sinh viên: ");

        txtIdSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnIdSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIdSinhVien.setText("Tìm");
        btnIdSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdSinhVienActionPerformed(evt);
            }
        });

        tblMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbIdOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIdOut.setText("Mã sinh viên:");

        lbHotenOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHotenOut.setText("Họ tên:");

        lbToanOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbToanOut.setText("Toán:");

        lbHoaOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHoaOut.setText("Hoá:");

        lbLyOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLyOut.setText("Lý:");

        txtIdOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdOutFocusLost(evt);
            }
        });

        txtHotenOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtToanOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtLyOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtHoaOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnShowResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTitleDTB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTitleDTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitleDTB.setText("Điểm TB:");

        lbDiemTB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDiemTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiemTB.setText("---");

        javax.swing.GroupLayout pnShowResultLayout = new javax.swing.GroupLayout(pnShowResult);
        pnShowResult.setLayout(pnShowResultLayout);
        pnShowResultLayout.setHorizontalGroup(
            pnShowResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnShowResultLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnShowResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleDTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDiemTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        pnShowResultLayout.setVerticalGroup(
            pnShowResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnShowResultLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lbTitleDTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDiemTB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout tblMainLayout = new javax.swing.GroupLayout(tblMain);
        tblMain.setLayout(tblMainLayout);
        tblMainLayout.setHorizontalGroup(
            tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblMainLayout.createSequentialGroup()
                .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tblMainLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHoaOut)
                            .addComponent(lbLyOut)))
                    .addGroup(tblMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHotenOut)
                            .addComponent(lbToanOut)
                            .addComponent(lbIdOut))))
                .addGap(18, 18, 18)
                .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHotenOut, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txtLyOut)
                    .addComponent(txtToanOut)
                    .addComponent(txtHoaOut)
                    .addComponent(txtIdOut))
                .addGap(18, 18, 18)
                .addComponent(pnShowResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblMainLayout.setVerticalGroup(
            tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblMainLayout.createSequentialGroup()
                .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tblMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnShowResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tblMainLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdOut)
                            .addComponent(txtIdOut))
                        .addGap(18, 18, 18)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHotenOut)
                            .addComponent(txtHotenOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbToanOut)
                            .addComponent(txtToanOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLyOut)
                            .addComponent(txtLyOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tblMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHoaOut)
                            .addComponent(txtHoaOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGap(17, 17, 17))
        );

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRefresh.setText("Nhập mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblPanel.setPreferredSize(new java.awt.Dimension(452, 201));

        tblStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblScrollPane.setViewportView(tblStudents);

        javax.swing.GroupLayout tblPanelLayout = new javax.swing.GroupLayout(tblPanel);
        tblPanel.setLayout(tblPanelLayout);
        tblPanelLayout.setHorizontalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblScrollPane)
        );
        tblPanelLayout.setVerticalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(srt1)
                            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tblMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbIdSinhVien)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIdSinhVien)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tblPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srt1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdSinhVien)
                    .addComponent(txtIdSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIdSinhVien))
                .addGap(15, 15, 15)
                .addComponent(tblMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(tblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdSinhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIdSinhVienActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIdOutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdOutFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOutFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnIdSinhVien;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lbDiemTB;
    private javax.swing.JLabel lbHoaOut;
    private javax.swing.JLabel lbHotenOut;
    private javax.swing.JLabel lbIdOut;
    private javax.swing.JLabel lbIdSinhVien;
    private javax.swing.JLabel lbLyOut;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitleDTB;
    private javax.swing.JLabel lbToanOut;
    private javax.swing.JPanel pnShowResult;
    private javax.swing.JSeparator srt1;
    private javax.swing.JPanel tblMain;
    private javax.swing.JPanel tblPanel;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtHoaOut;
    private javax.swing.JTextField txtHotenOut;
    private javax.swing.JTextField txtIdOut;
    private javax.swing.JTextField txtIdSinhVien;
    private javax.swing.JTextField txtLyOut;
    private javax.swing.JTextField txtToanOut;
    // End of variables declaration//GEN-END:variables
}
