
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hiattech
 */
public class NewOrExistingScout extends javax.swing.JFrame implements ActionListener {
    /**
     * Creates new form NewOrExistingScout
     */
    public NewOrExistingScout() {
        initComponents();
        // listener to open this window
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eagleScoutReqsLbl = new javax.swing.JLabel();
        eagleScoutReqsLbl1 = new javax.swing.JLabel();
        NewOrExistLbl = new javax.swing.JLabel();
        ExistingScoutBtn = new javax.swing.JButton();
        NewScoutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        eagleScoutReqsLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eagleScoutReqsLbl.setForeground(new java.awt.Color(0, 0, 204));
        eagleScoutReqsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl.setText("Eagle Scout Requirements");
        eagleScoutReqsLbl.setToolTipText("Eagle Scout Requirements");
        eagleScoutReqsLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        eagleScoutReqsLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl.setInheritsPopupMenu(false);
        eagleScoutReqsLbl.setName("eagleScoutReqsLbl"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NewOrExistingScout");

        eagleScoutReqsLbl1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eagleScoutReqsLbl1.setForeground(new java.awt.Color(0, 0, 204));
        eagleScoutReqsLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl1.setText("Eagle Scout Requirements");
        eagleScoutReqsLbl1.setToolTipText("Eagle Scout Requirements");
        eagleScoutReqsLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        eagleScoutReqsLbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl1.setInheritsPopupMenu(false);
        eagleScoutReqsLbl1.setName("eagleScoutReqsLbl"); // NOI18N

        NewOrExistLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NewOrExistLbl.setForeground(new java.awt.Color(0, 0, 255));
        NewOrExistLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrExistLbl.setText("Select an Existing Scout or Create a New Scout");
        NewOrExistLbl.setToolTipText("Select an Existing Scout or Create a New Scout");
        NewOrExistLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        NewOrExistLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NewOrExistLbl.setName("NewOrExistLbl"); // NOI18N

        ExistingScoutBtn.setText("Select Existing Scout");
        ExistingScoutBtn.setToolTipText("Select Existing Scout");
        ExistingScoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistingScoutBtnActionPerformed(evt);
            }
        });

        NewScoutBtn.setText("Create New Scout");
        NewScoutBtn.setToolTipText("Create New Scout");
        NewScoutBtn.setPreferredSize(new java.awt.Dimension(131, 23));
        NewScoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewScoutBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.setToolTipText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eagleScoutReqsLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(NewOrExistLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(ExistingScoutBtn)
                                .addGap(101, 101, 101)
                                .addComponent(NewScoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(BackBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eagleScoutReqsLbl1)
                .addGap(18, 18, 18)
                .addComponent(NewOrExistLbl)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExistingScoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewScoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BackBtn)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExistingScoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExistingScoutBtnActionPerformed
        if (evt.getSource() == ExistingScoutBtn){
            this.dispose();
            ExistingScout existingScout = new ExistingScout();            
        }
    }//GEN-LAST:event_ExistingScoutBtnActionPerformed

    private void NewScoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewScoutBtnActionPerformed
        if (evt.getSource() == NewScoutBtn){
               this.dispose();
               NewScout newScout = new NewScout();
           }
    }//GEN-LAST:event_NewScoutBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        if (evt.getSource() == BackBtn){
            this.dispose();
            UserLogin userLogin = new UserLogin();
        }
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrExistingScout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ExistingScoutBtn;
    private javax.swing.JLabel NewOrExistLbl;
    private javax.swing.JButton NewScoutBtn;
    private javax.swing.JLabel eagleScoutReqsLbl;
    private javax.swing.JLabel eagleScoutReqsLbl1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
