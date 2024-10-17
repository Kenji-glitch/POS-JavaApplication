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


public class Register extends javax.swing.JPanel {

    public Register() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        s_search_tbl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contactNo_fld = new javax.swing.JTextField();
        name_fld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        birthday_fld = new javax.swing.JTextField();
        s_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        username_fld = new javax.swing.JTextField();
        maleButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        password_fld = new javax.swing.JPasswordField();
        femaleButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Search Name : ");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/update.png"))); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        s_search_tbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        s_search_tbl.setText("0");
        s_search_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_search_tblActionPerformed(evt);
            }
        });
        s_search_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                s_search_tblKeyReleased(evt);
            }
        });

        jLabel4.setText("username:");

        jLabel6.setText("cp number:");

        jLabel5.setText("password:");

        contactNo_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNo_fldActionPerformed(evt);
            }
        });

        name_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Search ID : ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "staff_id", "name", "gender", "birthday", "username", "password", "contact_no"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        s_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        s_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_searchActionPerformed(evt);
            }
        });

        jLabel1.setText("name:");

        search_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/search x30.png"))); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/delete.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        username_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fldActionPerformed(evt);
            }
        });

        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("gender:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/clear.png"))); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        password_fld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fldActionPerformed(evt);
            }
        });

        femaleButton.setText("Female");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/higopproject/higopproject/save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("birthday (y/m/d) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s_search_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(name_fld)
                                    .addComponent(birthday_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(maleButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(femaleButton)))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(contactNo_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(password_fld, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(username_fld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5))
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(s_search, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(search_btn))))))))
                .addGap(461, 461, 461))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(username_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(maleButton)
                                .addComponent(femaleButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(birthday_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contactNo_fld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s_search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_btn))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(s_search_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private String selectedGender = "";
    
    private void loadTable() {
        try {
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
        Statement s = con.createStatement();
        
        ResultSet rs = s.executeQuery("SELECT * FROM regform");

        while (rs.next()) {
            Vector<String> rowData = new Vector<>();
            rowData.add(rs.getString("staff_id")); 
            rowData.add(rs.getString("name"));     
            rowData.add(rs.getString("gender"));  
            rowData.add(rs.getString("birthday")); 
            rowData.add(rs.getString("username")); 
            rowData.add(rs.getString("password")); 
            rowData.add(rs.getString("contact_no")); 
            dt.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    private void username_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fldActionPerformed

    private void name_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // insert or save button
        try {
        String birthdate = birthday_fld.getText(); 
        String regex = "\\d{4}-\\d{2}-\\d{2}"; 

            if (birthdate.matches(regex)) {
                if (contactNo_fld.getText().length() <= 12 && contactNo_fld.getText().length() >= 7) {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
                    Statement st = con.createStatement();
                    st.executeUpdate("INSERT INTO regform (name, gender, birthday, username, password, contact_no) VALUES ('" 
                        + name_fld.getText() + "', '"
                        + selectedGender + "', '"
                        + birthdate + "', '"
                        + username_fld.getText() + "', '"
                        + password_fld.getText() + "', '"
                        + contactNo_fld.getText() + "')");
                    JOptionPane.showMessageDialog(this, "Saved!");
                    loadTable(); 
                } else {
                    JOptionPane.showMessageDialog(this, "Contact number must be between 7 to 12 characters.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid birthdate format! Please use the format yyyy-mm-dd.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void password_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //delete button
        int id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
            Statement st = con.createStatement();
            st.executeUpdate("DELETE FROM regform WHERE staff_id=" + id);
            JOptionPane.showMessageDialog(this, "Deleted!");
            loadTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // clear text
        clearTextFields();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow(); 

        if (r != -1) {
            String id = jTable1.getValueAt(r, 0).toString(); 
            String name = jTable1.getValueAt(r, 1).toString(); 
            String gender = jTable1.getValueAt(r, 2).toString(); 
            String birthday = jTable1.getValueAt(r, 3).toString(); 
            String username = jTable1.getValueAt(r, 4).toString(); 
            String password = jTable1.getValueAt(r, 5).toString(); 
            String contactNo = jTable1.getValueAt(r, 6).toString();

            name_fld.setText(name);
            contactNo_fld.setText(contactNo); 
            birthday_fld.setText(birthday); 
            username_fld.setText(username); 
            password_fld.setText(password);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
        selectedGender = "Male";
    }//GEN-LAST:event_maleButtonActionPerformed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        // TODO add your handling code here:
         selectedGender = "Female";
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Update Function
        int id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()); 
        String birthdate = birthday_fld.getText(); 
        String regex = "\\d{4}-\\d{2}-\\d{2}"; 

            if (birthdate.matches(regex)) {
                if (contactNo_fld.getText().length() <= 12 && contactNo_fld.getText().length() >= 7) { 
                    String name = name_fld.getText();
                    String gender = selectedGender; 
                    String username = username_fld.getText();
                    String password = password_fld.getText();
                    String contactNo = contactNo_fld.getText();

                    try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
                        Statement st = con.createStatement();

                        String updateQuery = "UPDATE regform SET name = '" + name + "', gender = '" + gender + "', birthday = '" + birthdate 
                                            + "', username = '" + username + "', password = '" + password + "', contact_no = '" + contactNo 
                                            + "' WHERE staff_id = " + id;
                        st.executeUpdate(updateQuery); 
                        JOptionPane.showMessageDialog(this, "Data Updated Successfully!"); 
                        loadTable();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Contact number must be between 7 to 12 characters.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid birthdate format! Please use the format yyyy-mm-dd.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void s_search_tblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s_search_tblKeyReleased
        // search by name
       String name = s_search_tbl.getText();

        try {
            DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
            dt.setRowCount(0);

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM regform WHERE name LIKE '%" + name + "%'");

            while (rs.next()) {
                Vector<String> v = new Vector<>();
                v.add(rs.getString(1)); 
                v.add(rs.getString(2));
                v.add(rs.getString(3)); 
                v.add(rs.getString(4)); 
                v.add(rs.getString(5)); 
                v.add(rs.getString(6)); 
                dt.addRow(v); 
            }
        } catch (Exception e) {
            loadTable(); 
            e.printStackTrace();
        }

    }//GEN-LAST:event_s_search_tblKeyReleased

    private void s_search_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_search_tblActionPerformed
        //search name function
        String search = s_search.getText();
        
    
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?useSSL=false", "root", "");
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM regform WHERE staff_id = '" + search + "'");

                if (rs.next()) {
                    name_fld.setText(rs.getString("name"));
                    contactNo_fld.setText(rs.getString("contact_no")); 
                    selectedGender = rs.getString("gender"); 

                    if (selectedGender.equalsIgnoreCase("Male")) {
                        maleButton.setSelected(true);
                    } else if (selectedGender.equalsIgnoreCase("Female")) {
                        femaleButton.setSelected(true);
                    }

                    birthday_fld.setText(rs.getString("birthday"));
                    username_fld.setText(rs.getString("username"));
                    password_fld.setText(rs.getString("password"));
                } else {
                    JOptionPane.showMessageDialog(this, "Staff not found.");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    
    }//GEN-LAST:event_s_search_tblActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // search btn by its ID

        String search = s_search.getText(); 

            try {
                java.sql.Connection con = database.mycon();
                java.sql.Statement s = con.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM regform WHERE staff_id = '" + search + "'");

                if (rs.next()) {
                    name_fld.setText(rs.getString("name"));
                    contactNo_fld.setText(rs.getString("contact_no"));
                    selectedGender = rs.getString("gender"); 

                    if (selectedGender.equalsIgnoreCase("Male")) {
                        maleButton.setSelected(true);
                    } else if (selectedGender.equalsIgnoreCase("Female")) {
                        femaleButton.setSelected(true);
                    }

                    birthday_fld.setText(rs.getString("birthday"));
                    username_fld.setText(rs.getString("username"));
                    password_fld.setText(rs.getString("password"));
                } else {
                    JOptionPane.showMessageDialog(this, "Customer not found.");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_search_btnActionPerformed

    private void contactNo_fldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNo_fldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNo_fldActionPerformed

    private void s_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_searchActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthday_fld;
    private javax.swing.JTextField contactNo_fld;
    private javax.swing.JButton femaleButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton maleButton;
    private javax.swing.JTextField name_fld;
    private javax.swing.JPasswordField password_fld;
    private javax.swing.JTextField s_search;
    private javax.swing.JTextField s_search_tbl;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField username_fld;
    // End of variables declaration//GEN-END:variables

    private void formWindowOpened(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void clearTextFields() {
        name_fld.setText("");
        birthday_fld.setText("");
        username_fld.setText("");
        password_fld.setText("");
        selectedGender = "";
        contactNo_fld.setText ("");
        s_search.setText("");
    }
}