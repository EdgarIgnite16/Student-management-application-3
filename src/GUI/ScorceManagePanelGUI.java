package GUI;

import BUS.*;
import DAO.ScoreBoardDAO;
import DAO.StudentDAO;
import DTO.ScoreBoardDTO;
import DTO.StudentDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class ScorceManagePanelGUI extends javax.swing.JPanel {
    private MainFormGUI parrentForm;
    private DefaultTableModel model_table;

    /**
     * Creates new form ScorceManagePanelGUI
     */
    public ScorceManagePanelGUI() {
        initDataTable();
        initComponents();
    }

    private void initDataTable() {
        String[] columnNames = new String[] {"id", "idStudent", "nameStudent", "Toan", "Ly", "Hoa"};
        model_table = new DefaultTableModel();
        model_table.setColumnIdentifiers(columnNames);

        try {
            ArrayList<ScoreBoardDTO> listScoreBoard = new ScoreBoardBUS().getListScoreBoard();
            this.model_table.setRowCount(0);
            listScoreBoard.forEach(item -> {
                model_table.addRow(new Object[] {
                        item.getIdResult().trim(),
                        item.getIdStudent().trim(),
                        new StudentBUS().getNameStudent(item.getIdStudent()),
                        String.valueOf(item.getToan()),
                        String.valueOf(item.getLy()),
                        String.valueOf(item.getHoa())
                });
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parrentForm, ex.getMessage(), "Error !");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        lbTitle.setText("Qu???n l?? ??i???m GPA");

        lbIdSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIdSinhVien.setText("M?? sinh vi??n: ");

        txtIdSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnIdSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIdSinhVien.setIcon(new javax.swing.ImageIcon("resource\\iconSys\\search-icon-16.png")); // NOI18N
        btnIdSinhVien.setText("T??m");
        btnIdSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdSinhVienActionPerformed(evt);
            }
        });

        tblMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbIdOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIdOut.setText("M?? sinh vi??n:");

        lbHotenOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHotenOut.setText("H??? t??n:");

        lbToanOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbToanOut.setText("To??n:");

        lbHoaOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHoaOut.setText("Ho??:");

        lbLyOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLyOut.setText("L??:");

        txtIdOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdOutFocusLost(evt);
            }
        });

        txtHotenOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHotenOut.setEnabled(false);

        txtToanOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtToanOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTinhToanOutFocusLost(evt);
            }
        });

        txtLyOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLyOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTinhToanOutFocusLost(evt);
            }
        });

        txtHoaOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoaOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTinhToanOutFocusLost(evt);
            }
        });

        pnShowResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbTitleDTB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTitleDTB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitleDTB.setText("??i???m TB:");

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
                                        .addComponent(txtHotenOut, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
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
        btnRefresh.setIcon(new javax.swing.ImageIcon("resource\\iconSys\\new-icon-16.png")); // NOI18N
        btnRefresh.setText("Nh???p m???i");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("resource\\iconSys\\Actions-document-edit-icon-16.png")); // NOI18N
        btnUpdate.setText("C???p nh???t");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("resource\\iconSys\\Save-icon.png")); // NOI18N
        btnSave.setText("L??u");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("resource\\iconSys\\Actions-edit-delete-icon-16.png")); // NOI18N
        btnDelete.setText("Xo??");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblPanel.setPreferredSize(new java.awt.Dimension(452, 201));

        tblStudents.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblStudents.setModel(model_table);
        tblStudents.addMouseListener(new MouseListener()  {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                tblStudentsMousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
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
                        .addComponent(tblPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
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
    }// </editor-fold>

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        refreshData();
        txtIdOut.setText("");
        txtHotenOut.setText("");
        txtToanOut.setText("");
        txtLyOut.setText("");
        txtHoaOut.setText("");
        lbDiemTB.setText("---");

        // set Background
        txtIdOut.setBackground(Color.WHITE);
        txtHotenOut.setBackground(Color.WHITE);
        txtToanOut.setBackground(Color.WHITE);
        txtLyOut.setBackground(Color.WHITE);
        txtHoaOut.setBackground(Color.WHITE);
        // set Foreground
        txtIdOut.setForeground(Color.BLACK);
        txtHotenOut.setForeground(Color.BLACK);
        txtToanOut.setForeground(Color.BLACK);
        txtLyOut.setForeground(Color.BLACK);
        txtHoaOut.setForeground(Color.BLACK);
    }

    private void btnIdSinhVienActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            StringBuilder sb = new StringBuilder();
            _DataValidator.validateEmpty(txtIdSinhVien, sb, "M?? sinh vi??n kh??ng ???????c ????? tr???ng !");

            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parrentForm, String.valueOf(sb), "Error Input Value");
            } else {
                ScoreBoardDTO scoreBoardDTO = new ScoreBoardBUS().getScoreboardById(txtIdSinhVien.getText());
                printDataIntoField(scoreBoardDTO);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parrentForm, ex.getMessage(), "Error");
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            StringBuilder sb = new StringBuilder();
            _DataValidator.validateEmpty(txtIdOut, sb, "M?? sinh vi??n kh??ng ???????c ????? tr???ng !");
            _DataValidator.validateEmpty(txtToanOut, sb, "??i???m To??n kh??ng ???????c ????? tr???ng !");
            _DataValidator.validateEmpty(txtLyOut, sb, "??i???m L?? kh??ng ???????c ????? tr???ng !");
            _DataValidator.validateEmpty(txtHoaOut, sb, "??i???m Ho?? kh??ng ???????c ????? tr???ng !");
            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parrentForm, String.valueOf(sb), "Error Input Value");
            } else {
                ScoreBoardDTO scoreboardDTO = new ScoreBoardDTO();
                scoreboardDTO.setIdStudent(txtIdOut.getText().trim());
                scoreboardDTO.setToan(Float.parseFloat(txtToanOut.getText()));
                scoreboardDTO.setLy(Float.parseFloat(txtLyOut.getText()));
                scoreboardDTO.setHoa(Float.parseFloat(txtHoaOut.getText()));

                ScoreBoardDAO scoreBoardDAO = new ScoreBoardDAO();
                // n???u trong csdl ???? t???n t???i tr?????ng ??i???m c???a ?????i t?????ng th?? th???c hi???n c???p nh???t ??i???m cho ?????i t?????ng ????
                if(_MessageDialogHelper.showConfirmDialog(parrentForm, "B???n c?? mu???n c???p nh???t ??i???m kh??ng ?",
                        "Update value") == JOptionPane.YES_OPTION) {
                    if(scoreBoardDAO.update(scoreboardDTO)) {
                        refreshData(); // c???p nh???t l???i d??? li???u l??n
                        btnRefreshActionPerformed(evt); // clean d??? li???u tr??n form
                        _MessageDialogHelper.showMessageDialog(parrentForm, "T???o m???i ?????i t?????ng th??nh c??ng !", "Success Query Data");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parrentForm, "T???o m???i ?????i t?????ng th???t b???i !", "Failure Query Data");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parrentForm, ex.getMessage(), "Error");
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            StringBuilder sb = new StringBuilder();
            _DataValidator.validateEmpty(txtIdOut, sb, "M?? sinh vi??n kh??ng ???????c ????? tr???ng !");
            _DataValidator.validateEmpty(txtToanOut, sb, "??i???m To??n kh??ng ???????c ????? tr???ng !");
            _DataValidator.validateEmpty(txtLyOut, sb, "??i???m L?? kh??ng ???????c ????? tr???ng !");
            _DataValidator.validateEmpty(txtHoaOut, sb, "??i???m Ho?? kh??ng ???????c ????? tr???ng !");
            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parrentForm, String.valueOf(sb), "Error Input Value");
            } else {
                ScoreBoardDTO scoreboardDTO = new ScoreBoardDTO();
                scoreboardDTO.setIdStudent(txtIdOut.getText().trim());
                scoreboardDTO.setToan(Float.parseFloat(txtToanOut.getText()));
                scoreboardDTO.setLy(Float.parseFloat(txtLyOut.getText()));
                scoreboardDTO.setHoa(Float.parseFloat(txtHoaOut.getText()));

                ScoreBoardDAO scoreBoardDAO = new ScoreBoardDAO();
                ScoreBoardBUS scoreBoardBUS = new ScoreBoardBUS();
                if(scoreBoardBUS.getScoreboardById(txtIdOut.getText()) == null) {
                    // n???u trong csdl ch??a t???n t???i tr?????ng ??i???m c???a ?????i t?????ng th?? th???c hi???n t???o m???i cho ?????i t?????ng ????
                    if(scoreBoardDAO.insert(scoreboardDTO)) {
                        refreshData(); // c???p nh???t l???i d??? li???u l??n GUI
                        _MessageDialogHelper.showMessageDialog(parrentForm, "T???o m???i ?????i t?????ng th??nh c??ng !", "Success Query Data");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parrentForm, "T???o m???i ?????i t?????ng th???t b???i !", "Failure Query Data");
                    }
                } else {
                    // n???u trong csdl ???? t???n t???i tr?????ng ??i???m c???a ?????i t?????ng th?? th???c hi???n c???p nh???t ??i???m cho ?????i t?????ng ????
                    btnUpdateActionPerformed(evt);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parrentForm, ex.getMessage(), "Error");
        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuilder sb = new StringBuilder();
        try {
            _DataValidator.validateEmpty(txtIdOut, sb, "M?? sinh vi??n kh??ng ???????c ????? tr???ng !");
            if(sb.length() > 0) {
                _MessageDialogHelper.showErrorDialog(parrentForm, String.valueOf(sb), "Error Input Value");
            } else {
                if(_MessageDialogHelper.showConfirmDialog(parrentForm,
                        "B???n c?? mu???n xo?? ?????i t?????ng ra kh???i c?? s??? d??? li???u kh??ng ?",
                        "Xo?? d??? li???u") == JOptionPane.YES_OPTION) {

                    ScoreBoardDAO scoreBoardDAO = new ScoreBoardDAO();
                    if(scoreBoardDAO.delete(txtIdOut.getText().trim())) {
                        refreshData(); // c???p nh???t l???i d??? li???u l??n GUI
                        btnRefreshActionPerformed(evt); // g???i l???i event c???a h??m ????? clear data kh???i c??c field
                        _MessageDialogHelper.showMessageDialog(parrentForm, "Xo?? ?????i t?????ng d??? li???u th??nh c??ng !", "Success Query Data");
                    } else {
                        _MessageDialogHelper.showErrorDialog(parrentForm, "Xo?? ?????i t?????ng th???t b???i !", "Failure Query Data");
                    }
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parrentForm, ex.getMessage(), "Error Query");
        }
    }

    private void txtIdOutFocusLost(java.awt.event.FocusEvent evt) {
        try {
            StudentDTO studentDTO = new StudentBUS().getStudentById(txtIdOut.getText());
            ScoreBoardDTO scoreBoardDTO = new ScoreBoardBUS().getScoreboardById(txtIdOut.getText());

            if(studentDTO != null) {
                txtHotenOut.setText(studentDTO.getName());
            }

            if(scoreBoardDTO != null) {
                String score = new ScoreBoardBUS().getAVGScore(scoreBoardDTO);
                txtToanOut.setText(String.valueOf(scoreBoardDTO.getToan()));
                txtLyOut.setText(String.valueOf(scoreBoardDTO.getLy()));
                txtHoaOut.setText(String.valueOf(scoreBoardDTO.getHoa()));
                lbDiemTB.setText(score);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void txtTinhToanOutFocusLost(java.awt.event.FocusEvent evt) {
        try {
            float Toan = Float.parseFloat(txtToanOut.getText());
            float Ly = Float.parseFloat(txtLyOut.getText());
            float Hoa = Float.parseFloat(txtHoaOut.getText());

            ScoreBoardDTO scoreBoardDTO = new ScoreBoardDTO();
            scoreBoardDTO.setToan(Toan);
            scoreBoardDTO.setLy(Ly);
            scoreBoardDTO.setHoa(Hoa);

            String score = new ScoreBoardBUS().getAVGScore(scoreBoardDTO);
            lbDiemTB.setText(score);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void tblStudentsMousePressed(MouseEvent e) {
        int selectedRow = tblStudents.getSelectedRow();
        printDataIntoField(selectedRow);
        try {
            String id = (String) tblStudents.getValueAt(selectedRow, 1);
            ScoreBoardDTO item = new ScoreBoardBUS().getScoreboardById(txtIdOut.getText());
            String score = new ScoreBoardBUS().getAVGScore(item);
            lbDiemTB.setText(score);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void printDataIntoField(int selectedRow) {
        try {
            // l???y d??? li???u t??? d??ng s??? n c???t th??? m trong table
            String id = (String) tblStudents.getValueAt(selectedRow, 1);
            ScoreBoardDTO scoreBoard = new ScoreBoardBUS().getScoreboardById(id.trim());
            if(scoreBoard != null) {
                txtIdOut.setText(scoreBoard.getIdStudent().trim());
                txtHotenOut.setText(new StudentBUS().getNameStudent(scoreBoard.getIdStudent()).trim());
                txtToanOut.setText(String.valueOf(scoreBoard.getToan()).trim());
                txtLyOut.setText(String.valueOf(scoreBoard.getLy()).trim());
                txtHoaOut.setText(String.valueOf(scoreBoard.getHoa()).trim());
            } else {
                _MessageDialogHelper.showErrorDialog(parrentForm, "Kh??ng t??m th???y sinh vi??n", "L???i t??m ki???m");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void printDataIntoField(ScoreBoardDTO scoreBoard) {
        try {
            // l???y d??? li???u t??? d??ng s??? n c???t th??? m trong table
            if(scoreBoard != null) {
                txtIdOut.setText(scoreBoard.getIdStudent().trim());
                txtHotenOut.setText(new StudentBUS().getNameStudent(scoreBoard.getIdStudent()).trim());
                txtToanOut.setText(String.valueOf(scoreBoard.getToan()).trim());
                txtLyOut.setText(String.valueOf(scoreBoard.getLy()).trim());
                txtHoaOut.setText(String.valueOf(scoreBoard.getHoa()).trim());
            } else {
                _MessageDialogHelper.showErrorDialog(parrentForm, "Kh??ng t??m th???y sinh vi??n", "L???i t??m ki???m");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void refreshData() {
        try {
            ArrayList<ScoreBoardDTO> listScoreBoard = new ScoreBoardBUS().getListScoreBoard();
            this.model_table.setRowCount(0);
            listScoreBoard.forEach(item -> {
                model_table.addRow(new Object[] {
                        item.getIdResult().trim(),
                        item.getIdStudent().trim(),
                        new StudentBUS().getNameStudent(item.getIdStudent().trim()),
                        String.valueOf(item.getToan()),
                        String.valueOf(item.getLy()),
                        String.valueOf(item.getHoa())
                });
            });
        } catch (Exception ex) {
            ex.printStackTrace();
            _MessageDialogHelper.showErrorDialog(parrentForm, ex.getMessage(), "Error !");
        }
    }

    // Variables declaration - do not modify
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
    // End of variables declaration                   
}
