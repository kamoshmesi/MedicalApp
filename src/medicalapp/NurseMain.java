/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamuditha Jayaweera
 */
public class NurseMain extends javax.swing.JFrame {

    
    Connection Conn;
    ResultSet rs;
    Statement st;
    
    public NurseMain() {
        initComponents();Conn = connection.ConnectDb();
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_name = new javax.swing.JLabel();
        tbnAvailability = new javax.swing.JButton();
        btn_AddMedicine = new javax.swing.JButton();
        btn_MediUpdate = new javax.swing.JButton();
        btn_logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(lbl_name);
        lbl_name.setBounds(705, 29, 178, 52);

        tbnAvailability.setBackground(new java.awt.Color(255, 255, 255));
        tbnAvailability.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tbnAvailability.setForeground(new java.awt.Color(0, 0, 0));
        tbnAvailability.setText("Check Availablity");
        tbnAvailability.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        tbnAvailability.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbnAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnAvailabilityActionPerformed(evt);
            }
        });
        getContentPane().add(tbnAvailability);
        tbnAvailability.setBounds(90, 240, 290, 120);

        btn_AddMedicine.setBackground(new java.awt.Color(255, 255, 255));
        btn_AddMedicine.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_AddMedicine.setForeground(new java.awt.Color(0, 0, 0));
        btn_AddMedicine.setText("Add Drugs Details");
        btn_AddMedicine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btn_AddMedicine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddMedicine);
        btn_AddMedicine.setBounds(450, 240, 300, 120);

        btn_MediUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btn_MediUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_MediUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btn_MediUpdate.setText("Update Drugs Availability");
        btn_MediUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        btn_MediUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MediUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MediUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MediUpdate);
        btn_MediUpdate.setBounds(810, 240, 300, 120);

        btn_logOut.setBackground(new java.awt.Color(255, 255, 255));
        btn_logOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_logOut.setForeground(new java.awt.Color(0, 0, 0));
        btn_logOut.setText("Logout");
        btn_logOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        btn_logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logOut);
        btn_logOut.setBounds(1010, 539, 157, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalapp/image/nsbmzz.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, -3, 1200, 600);

        setSize(new java.awt.Dimension(1226, 661));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        loginForm lf = new loginForm();
        lf.setVisible(true);
        JOptionPane.showMessageDialog(null,"Successfully Logout" );
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_AddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddMedicineActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddMedicines ad = new AddMedicines();
        ad.setVisible(true);
    }//GEN-LAST:event_btn_AddMedicineActionPerformed

    private void tbnAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnAvailabilityActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SearchMedicine().setVisible(true);
    }//GEN-LAST:event_tbnAvailabilityActionPerformed

    private void btn_MediUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MediUpdateActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UpdateMedicines().setVisible(true);
    }//GEN-LAST:event_btn_MediUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String sql = "select `Display_name` from `tbl_login_history`";
        
        try
        {
            st = Conn.createStatement();
            rs = st.executeQuery(sql);
            rs.last();            
            
            this.lbl_name.setText(rs.getString("Display_name"));           
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(NurseMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NurseMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NurseMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NurseMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NurseMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddMedicine;
    private javax.swing.JButton btn_MediUpdate;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JButton tbnAvailability;
    // End of variables declaration//GEN-END:variables
}
