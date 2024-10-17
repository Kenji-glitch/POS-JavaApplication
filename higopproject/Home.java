package higopproject;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.*;
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();
    
    private int userID;
    private String currentUsername;

    public Home(int userID, String currentUsername) {
        this.userID = userID;
        this.currentUsername = currentUsername; // Initialize the username

        setUndecorated(true);  
        initComponents();  
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);  
        configureAccess(userID);  
    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_load = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sales_btn = new javax.swing.JToggleButton();
        customers_btn = new javax.swing.JToggleButton();
        product_btn = new javax.swing.JToggleButton();
        purchase_btn = new javax.swing.JToggleButton();
        account_btn = new javax.swing.JToggleButton();
        employee_btn = new javax.swing.JToggleButton();
        out_btn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_load.setBackground(new java.awt.Color(0, 0, 0));
        panel_load.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        panel_load.setForeground(new java.awt.Color(255, 255, 255));
        panel_load.setPreferredSize(new java.awt.Dimension(1630, 736));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/higopmenu.png"))); // NOI18N

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel3)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/Logo.higop-removebg-preview.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Higop Snack Cafe");

        sales_btn.setBackground(new java.awt.Color(153, 255, 153));
        sales_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sales_btn.setText("Sales");
        sales_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sales_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_btnActionPerformed(evt);
            }
        });

        customers_btn.setBackground(new java.awt.Color(153, 255, 153));
        customers_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customers_btn.setText("Customers");
        customers_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customers_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_btnActionPerformed(evt);
            }
        });

        product_btn.setBackground(new java.awt.Color(153, 255, 153));
        product_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        product_btn.setText("Product");
        product_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        product_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_btnActionPerformed(evt);
            }
        });

        purchase_btn.setBackground(new java.awt.Color(153, 255, 153));
        purchase_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        purchase_btn.setText("Purchase");
        purchase_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        purchase_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_btnActionPerformed(evt);
            }
        });

        account_btn.setBackground(new java.awt.Color(153, 255, 153));
        account_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        account_btn.setText("Account");
        account_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        account_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account_btnActionPerformed(evt);
            }
        });

        employee_btn.setBackground(new java.awt.Color(153, 255, 153));
        employee_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employee_btn.setText("Employee");
        employee_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_btnActionPerformed(evt);
            }
        });

        out_btn.setBackground(new java.awt.Color(153, 255, 153));
        out_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        out_btn.setText("Logout");
        out_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        out_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                out_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sales_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(product_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purchase_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(account_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employee_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(out_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sales_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customers_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(account_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employee_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(out_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchase_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, 1822, Short.MAX_VALUE))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_load, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setFullScreen() {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        if (gd.isFullScreenSupported()) {
            this.setUndecorated(true);  
            gd.setFullScreenWindow(this); 
        } else {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);  
        }
    }

    private void configureAccess(int userID) {
        if (userID == 1) {
            sales_btn.setVisible(false);
            customers_btn.setVisible(true);
            account_btn.setVisible(true);
            product_btn.setVisible(true);
            employee_btn.setVisible(true);
            purchase_btn.setVisible(true);
        } else {
            sales_btn.setVisible(false);
            account_btn.setVisible(false);
            employee_btn.setVisible(false);

            product_btn.setVisible(true);
            purchase_btn.setVisible(true);
            customers_btn.setVisible(true);
        }
    }
    
    private void sales_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_btnActionPerformed
        // TODO add your handling code here:
        sales sales  = new sales();
        jpload.jPanelLoader(panel_load, sales);
    }//GEN-LAST:event_sales_btnActionPerformed

    private void customers_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_btnActionPerformed
        // TODO add your handling code here:
        customer cus = new customer();
        jpload.jPanelLoader(panel_load, cus);
    }//GEN-LAST:event_customers_btnActionPerformed

    private void product_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_btnActionPerformed
        // TODO add your handling code here:
        product pro = new product();
        jpload.jPanelLoader(panel_load, pro);
    }//GEN-LAST:event_product_btnActionPerformed

    private void employee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_btnActionPerformed
        // TODO add your handling code here:
        employee emp = new employee();
        jpload.jPanelLoader(panel_load, emp);
        emp.loadLoginHistory();
    }//GEN-LAST:event_employee_btnActionPerformed

    private void purchase_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_btnActionPerformed
        // TODO add your handling code here:
        purchase pur = new purchase();
        jpload.jPanelLoader(panel_load, pur);
    }//GEN-LAST:event_purchase_btnActionPerformed

    private void account_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account_btnActionPerformed
        // TODO add your handling code here:
        Register reg = new Register();
        jpload.jPanelLoader(panel_load, reg);
    }//GEN-LAST:event_account_btnActionPerformed

    private void out_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_out_btnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "")) {
                String updateLogoutTime = "UPDATE login_history SET logout_time = NOW() WHERE username = ? ORDER BY login_time DESC LIMIT 1";
                PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(updateLogoutTime);
                
                pstmt.setString(1, currentUsername);
                pstmt.executeUpdate();
            }
            this.dispose();  

            JFrame loginFrame = new JFrame();
            loginFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            loginFrame.setLayout(new java.awt.GridBagLayout());

            Login loginPanel = new Login();  

            java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
            gbc.gridx = 0; 
            gbc.gridy = 0; 
            gbc.anchor = java.awt.GridBagConstraints.CENTER; 
            gbc.fill = java.awt.GridBagConstraints.NONE; 
            gbc.insets = new java.awt.Insets(50, 50, 50, 50);

            loginFrame.add(loginPanel, gbc);
            loginFrame.pack();
            loginFrame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            loginFrame.setVisible(true);  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_out_btnActionPerformed

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
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame();
                frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                frame.setLayout(new java.awt.GridBagLayout());
                Login loginPanel = new Login();
                frame.add(loginPanel);
                frame.pack();
                frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton account_btn;
    private javax.swing.JToggleButton customers_btn;
    private javax.swing.JToggleButton employee_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton out_btn;
    private javax.swing.JPanel panel_load;
    private javax.swing.JToggleButton product_btn;
    private javax.swing.JToggleButton purchase_btn;
    private javax.swing.JToggleButton sales_btn;
    // End of variables declaration//GEN-END:variables
}
