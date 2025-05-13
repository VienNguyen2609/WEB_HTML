package Test;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Account;

public class Fomrs extends javax.swing.JFrame {

    private ArrayList<Account> listAccount = new ArrayList<>();

    private String tenText;
    private String matKhauText;
    private String danTocText;
    private String gioiTinhText;
    private StringBuilder ngoaiNguText = new StringBuilder();
    private Account a ; 
    private int selectedRow;

    private ButtonGroup buttonGroupDanToc;

    private DefaultTableModel model;

    public Fomrs() {

        initComponents();
        editComponents();

    }

    private void editComponents() {

        setLocationRelativeTo(null);
        setResizable(false);
        buttonGroupDanToc = new ButtonGroup();
        buttonGroupDanToc.add(rbNam);
        buttonGroupDanToc.add(rbNu);
    }

    private void getTextInformation() {

        ngoaiNguText.setLength(0);
        tenText = txtName.getText().trim();
        matKhauText = txtMatKhau.getText().trim();

        if (rbNam.isSelected()) {
            gioiTinhText = rbNam.getText().trim();
        } else if (rbNu.isSelected()) {
            gioiTinhText = rbNu.getText().trim();
        } else {
            gioiTinhText = "";
        }

        danTocText = cbDanToc.getSelectedItem().toString();

        if (rbAnh.isSelected()) {
            ngoaiNguText.append(rbAnh.getText().trim()).append("; ");
        }
        if (rbPhap.isSelected()) {
            ngoaiNguText.append(rbPhap.getText().trim()).append("; ");
        }
        if (rbNhat.isSelected()) {
            ngoaiNguText.append(rbNhat.getText().trim()).append("; ");
        }
        if (rbTrung.isSelected()) {
            ngoaiNguText.append(rbTrung.getText().trim()).append("; ");
        }

        if (ngoaiNguText.length() == 0) {
            ngoaiNguText.append("khong ngoai ngu");
        }
        if (checkInformation() == false) {
            return;
        }

        a = new Account(tenText, matKhauText, gioiTinhText, danTocText, ngoaiNguText.toString());
        listAccount.add(a);
    }

    private void loadTabelAccount() {

        model = (DefaultTableModel) tbAccount.getModel();
        model.setNumRows(0);
        int n = 0;
        for (Account _account : listAccount) {
            model.addRow(new Object[]{n++, _account.getName(), _account.getPass(), _account.getGioiTinh(),
                _account.getDaToc(), _account.getNgoaiNgu().toString()});
        }
    }

    private boolean checkInformation() {

        if (tenText.isEmpty() || matKhauText.isEmpty() || gioiTinhText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Information not be empty!");
            return false;
        }
        for (Account _account : listAccount) {
            if (_account.getName().equalsIgnoreCase(tenText)) {
                JOptionPane.showMessageDialog(this, "Ten ton tai");
                return false;
            }
        }
        return true;
    }

    private void View() {

        txtName.setText("");
        txtMatKhau.setText("");
        buttonGroupDanToc.clearSelection();
        cbDanToc.setSelectedIndex(0);
        rbAnh.setSelected(false);
        rbNhat.setSelected(false);
        rbPhap.setSelected(false);
        rbTrung.setSelected(false);

    }

    private void clickTableAccount() {

        selectedRow = tbAccount.getSelectedRow();

        if (selectedRow != -1) {

            tenText = tbAccount.getValueAt(selectedRow, 1).toString();
            matKhauText = tbAccount.getValueAt(selectedRow, 2).toString();
            gioiTinhText = tbAccount.getValueAt(selectedRow, 3).toString();
            danTocText = tbAccount.getValueAt(selectedRow, 4).toString();
            String ngoaiNgu = tbAccount.getValueAt(selectedRow, 5).toString();

            txtName.setText(tenText);
            txtMatKhau.setText(matKhauText);

            if (gioiTinhText.equalsIgnoreCase("Nam")) {
                rbNam.setSelected(true);
            } else {
                rbNu.setSelected(true);
            }
            cbDanToc.setSelectedItem(danTocText);

            rbAnh.setSelected(ngoaiNgu.contains("Anh"));

            rbPhap.setSelected(ngoaiNgu.contains("Phap"));

            rbTrung.setSelected(ngoaiNgu.contains("Trung"));

            rbNhat.setSelected(ngoaiNgu.contains("Nhat"));

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbDanToc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        rbAnh = new javax.swing.JRadioButton();
        rbPhap = new javax.swing.JRadioButton();
        rbNhat = new javax.swing.JRadioButton();
        rbTrung = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ten");

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mat khau ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Gioi tinh");

        cbDanToc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbDanToc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kinh", "Mong", "tay" }));

        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No1", "Name", "Pass", "Gioi Tinh", "Dan Toc", "Ngoai Ngu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccount.getTableHeader().setResizingAllowed(false);
        tbAccount.getTableHeader().setReorderingAllowed(false);
        tbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbAccountMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccount);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngoai  Ngu");

        rbAnh.setText("Anh");

        rbPhap.setText("Phap");

        rbNhat.setText("Nhat");

        rbTrung.setText("Trung");

        jButton1.setText("Lưu");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Hủy");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        rbNam.setText("Nam");

        rbNu.setText("Nu");

        jButton3.setText("Xóa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Chỉnh sửa");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Làm mới");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(rbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(rbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbPhap, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbTrung, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(rbNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rbNam)
                            .addComponent(rbNu))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbAnh)
                    .addComponent(rbPhap)
                    .addComponent(rbNhat)
                    .addComponent(rbTrung)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         
        getTextInformation();
        loadTabelAccount();
        View();

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        View();

    }//GEN-LAST:event_jButton2MouseClicked

    private void tbAccountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseReleased
        clickTableAccount();
    }//GEN-LAST:event_tbAccountMouseReleased

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        
        tenText = txtName.getText().trim();
        
        for(Account a : listAccount){
            if(a.getName().equalsIgnoreCase(tenText)){
                listAccount.remove(a);
                return ;
            }         
        }
        loadTabelAccount();
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       
        tenText = txtName.getText().trim();
        for(Account a : listAccount){
            if(a.getName().equalsIgnoreCase(tenText)){
                a.setPass(tenText);
                return ;
            }         
        }
        JOptionPane.showMessageDialog(this, "Chinh sua thanh cong ");
        loadTabelAccount();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        loadTabelAccount();
    }//GEN-LAST:event_jButton5MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fomrs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDanToc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAnh;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNhat;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JRadioButton rbPhap;
    private javax.swing.JRadioButton rbTrung;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
