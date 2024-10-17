/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package higopproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class employee extends javax.swing.JPanel {
  
    public employee() {
        initComponents(); 
        updateTableModel(); 
        loadLoginHistory(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        loginHistoryTable = new javax.swing.JTable();

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name : ");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Search ID number : ");

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(1630, 736));

        loginHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "username", "login_time"
            }
        ));
        loginHistoryTable.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                loginHistoryTableMouseWheelMoved(evt);
            }
        });
        loginHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginHistoryTableMouseClicked(evt);
            }
        });
        loginHistoryTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginHistoryTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(loginHistoryTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
    }// </editor-fold>//GEN-END:initComponents
    void loadLoginHistory() {
        try {
        DefaultTableModel dt = (DefaultTableModel) loginHistoryTable.getModel();
        dt.setRowCount(0); 

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM login_history");

        while (rs.next()) {
            Vector<String> rowData = new Vector<>();
            rowData.add(rs.getString("id")); 
            rowData.add(rs.getString("username")); 
            rowData.add(rs.getString("login_time")); 
            rowData.add(rs.getString("logout_time"));
            dt.addRow(rowData); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateTableModel() {
    DefaultTableModel model = new DefaultTableModel();
    
        model.addColumn("id");
        model.addColumn("username");
        model.addColumn("login_time");
        model.addColumn("logout_time"); 

        loginHistoryTable.setModel(model);
    }
    
    private void loginHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginHistoryTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginHistoryTableMouseClicked

    private void loginHistoryTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginHistoryTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginHistoryTableKeyPressed

    private void loginHistoryTableMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_loginHistoryTableMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_loginHistoryTableMouseWheelMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable loginHistoryTable;
    // End of variables declaration//GEN-END:variables
}