/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalapp;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chamuditha Jayaweera
 */
public class viewHistory extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs,rs1;
    PreparedStatement pst,pst1;
    
    public viewHistory() {
        initComponents();
        conn = connection.ConnectDb();        
    }
    
    public ArrayList<Record> recordList()
    {
        ArrayList<Record> recordList = new ArrayList<>();
        
        String sql = "select * from report where Student_id = ?";
        
        
        try{
           pst = conn.prepareStatement(sql);
           pst.setString(1, txtStudentID.getText());
           //pst.setInt(1, Integer.parseInt(txtStudentID.getText()));
           rs = pst.executeQuery();
            Record record;
            while(rs.next())
            {
                record = new Record(rs.getInt("Student_id"),rs.getString("symptoms"),rs.getString("medicines"),rs.getString("special_notes"),rs.getString("ref_doc"),rs.getString("date"));
                recordList.add(record);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e); //"hello there!"
        }
        return recordList;
        
    }
    
    public void show_records()
    {
        ArrayList<Record> list = recordList();
        DefaultTableModel model = (DefaultTableModel) tblRecords.getModel();
        Object[] row = new Object[5];
        for(int i=0;i<list.size();i++)
        {
            //row[0] = list.get(i).getStudent_id();
            row[0] = list.get(i).getSymptoms();
            row[1] = list.get(i).getMedicines();
            row[2] = list.get(i).getSpecial_notes();
            row[3] = list.get(i).getRef_doc();
            row[4] = list.get(i).getDate();
            model.addRow(row);
        }
                
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNewRec = new javax.swing.JButton();
        txtStudentID = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch);
        btnSearch.setBounds(940, 70, 200, 50);

        tblRecords.setBackground(new java.awt.Color(255, 255, 255));
        tblRecords.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Symtomps", "Medicines", "Special Notes", "Reffered Doctor", "Date"
            }
        ));
        tblRecords.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblRecords);
        tblRecords.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 170, 1130, 359);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 90, 20);

        btnNewRec.setBackground(new java.awt.Color(255, 255, 255));
        btnNewRec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNewRec.setForeground(new java.awt.Color(0, 0, 0));
        btnNewRec.setText("Add New Record");
        btnNewRec.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null, java.awt.Color.lightGray, java.awt.Color.lightGray));
        btnNewRec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewRecActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewRec);
        btnNewRec.setBounds(846, 558, 180, 40);

        txtStudentID.setBackground(new java.awt.Color(255, 255, 255));
        txtStudentID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtStudentID.setForeground(new java.awt.Color(0, 0, 0));
        txtStudentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        getContentPane().add(txtStudentID);
        txtStudentID.setBounds(190, 40, 270, 40);

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Back");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, null, java.awt.Color.lightGray, java.awt.Color.lightGray));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(1039, 558, 120, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 110, 110, 20);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        getContentPane().add(txtName);
        txtName.setBounds(190, 100, 270, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Student age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 110, 100, 20);

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(0, 0, 0));
        txtAge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        getContentPane().add(txtAge);
        txtAge.setBounds(670, 100, 220, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Last record Added");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 50, 140, 20);

        txtLastDate.setEditable(false);
        txtLastDate.setBackground(new java.awt.Color(255, 255, 255));
        txtLastDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLastDate.setForeground(new java.awt.Color(0, 0, 0));
        txtLastDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        getContentPane().add(txtLastDate);
        txtLastDate.setBounds(670, 40, 220, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalapp/image/nsbmzz.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1260, 630);

        setSize(new java.awt.Dimension(1262, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewRecActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddRecord a = new AddRecord();
        a.setVisible(true);      
    }//GEN-LAST:event_btnNewRecActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DoctorMain d = new DoctorMain();
        d.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        if(txtStudentID.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter student Number to search records");
        }
        else{
            
        String sql = "select * from student where student_id = ?";
        String sql1 = "select * from report where student_id = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtStudentID.getText());
            rs = pst.executeQuery();
            
            pst1 = conn.prepareStatement(sql1);
            pst1.setString(1, txtStudentID.getText());
            rs1 = pst1.executeQuery();            
            
            if(rs.next()&& rs1.last()){
                String a1 = rs.getString("name");
                txtName.setText(a1);
                String a2 = rs.getString("age");
                txtAge.setText(a2);
                String a3 = rs1.getString("date");
                txtLastDate.setText(a3);
                DefaultTableModel model = (DefaultTableModel)tblRecords.getModel();
                model.setRowCount(0);
                show_records();
                rs.close(); rs1.close();
                pst.close(); pst1.close();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Student Id is incorrect");
            }

        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                rs.close();rs1.close();
                pst.close(); pst1.close();
            }catch(Exception e)
            {

            }
        }
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(viewHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNewRec;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRecords;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtLastDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
