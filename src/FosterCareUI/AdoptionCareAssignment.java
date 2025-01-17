/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FosterCareUI;

import CWSUtilities.DatabaseConnection;
import CWSUtilities.Email;
import CWSUtilities.Validate;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import trials.ComplaineeSignUp;

/**
 *
 * @author anirudhajoshi
 */
public class AdoptionCareAssignment extends javax.swing.JFrame {

    /**
     * Creates new form AdoptionCareAssignment
     */
    String txtComplaintID;
    String adoptionParentName;
    public AdoptionCareAssignment() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComplaint = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnApprove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("ADOPTION CARE ASSIGNMENT");

        backBtn.setBackground(new java.awt.Color(255, 226, 249));
        backBtn.setText("Back");
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tableComplaint.setBackground(new java.awt.Color(255, 226, 249));
        tableComplaint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ComplaintID", "Name of Child", "Case Description", "AdoptionParent", "Mobile"
            }
        ));
        tableComplaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableComplaintMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableComplaint);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        btnApprove.setBackground(new java.awt.Color(255, 226, 249));
        btnApprove.setText("Approve Adoption Request");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnApprove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(btnApprove))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        AdoptionCareOfficerConsole adoc = new AdoptionCareOfficerConsole();
        adoc.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
       Integer complaintID = Validate.ConvertIntoNumeric(txtComplaintID);
       String toEmail = "";
       String subject = "Hello";
       String text = "There is an update on you ComplaintId = "+complaintID+" Open the portal to see the status";
       boolean result = false;

	if (txtComplaintID.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select a Complain", "Try Again",JOptionPane.ERROR_MESSAGE);
        }else{
                try{
                    DatabaseConnection.updForwardTo(complaintID);
                }catch(Exception e){
                    System.out.println("Error while Connecting");
                    e.printStackTrace();
                }
                
                DatabaseConnection.updateSetStatus(Integer.toString(complaintID), "The Child has been Adopted Successfully by "+adoptionParentName);
		    
		try{
                    ResultSet newSet1 = null;
                    newSet1 = DatabaseConnection.getComplaineeEmail(Integer.toString(complaintID));

                    while (newSet1.next()){
			  toEmail = newSet1.getString(1);
                    }
                }catch(Exception e){
                	System.out.println("Error while Connecting2");
                	e.printStackTrace();
                }

        
        	try {
                    result = Email.sendEmail(toEmail, subject, text);
        	} catch (Exception ex) {
                    java.util.logging.Logger.getLogger(ComplaineeSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}
                
                
            txtComplaintID="";
            adoptionParentName = "";

                
            DefaultTableModel complaintTable = (DefaultTableModel) tableComplaint.getModel();
	    complaintTable.setRowCount(0);	
            ResultSet resultSet = null;
            try{
            
            resultSet = DatabaseConnection.getAdoptionAssign();
            
            while (resultSet.next()){
                String complainID = resultSet.getString(1);
                String childName = resultSet.getString(2);
                String description = resultSet.getString(3);
                String parentName = resultSet.getString(4) +" "+resultSet.getString(5);
                String mobile = resultSet.getString(6);
      
                complaintTable.addRow(new Object[]{complainID,childName,description,parentName,mobile});
                
                }
            }catch(Exception e){
                System.out.println("Error while Connecting");
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "Adoption request approved Succesfully");
        
	}
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel complaintTable = (DefaultTableModel) tableComplaint.getModel();
        ResultSet resultSet = null;
        try{
            
            resultSet = DatabaseConnection.getAdoptionAssign();
            
            while (resultSet.next()){
                String complainID = resultSet.getString(1);
                String childName = resultSet.getString(2);
                String description = resultSet.getString(3);
                String parentName = resultSet.getString(4) +" "+resultSet.getString(5);
                String mobile = resultSet.getString(6);
      
                complaintTable.addRow(new Object[]{complainID,childName,description,parentName,mobile});
                
                }
            }catch(Exception e){
                System.out.println("Error while Connecting");
                e.printStackTrace();
            }
    }//GEN-LAST:event_formWindowOpened

    private void tableComplaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableComplaintMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tableComplaint.getModel();
        int selectedRow = tableComplaint.getSelectedRow();
        //Set data to text fields
        
        txtComplaintID = tblModel.getValueAt(tableComplaint.getSelectedRow(), 0).toString();
        adoptionParentName = tblModel.getValueAt(tableComplaint.getSelectedRow(), 3).toString();
    }//GEN-LAST:event_tableComplaintMouseClicked

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
            java.util.logging.Logger.getLogger(AdoptionCareAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdoptionCareAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdoptionCareAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdoptionCareAssignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdoptionCareAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnApprove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableComplaint;
    // End of variables declaration//GEN-END:variables
}
