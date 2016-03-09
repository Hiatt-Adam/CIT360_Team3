/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cit360teamproject.CIT360TeamProject.*;

/**
 *
 * @author hiattech
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form EagleReqs
     */
    public UserLogin() {
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

        eagleScoutReqsLbl = new javax.swing.JLabel();
        nameAndPassLbl = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JFormattedTextField();
        UserPassFld = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        CreateUser = new javax.swing.JButton();
        EmailLbl = new javax.swing.JLabel();
        LoginPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EAGLE SCOUT REQUIREMENTS");
        setName("Eagle Scout Requirements"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        eagleScoutReqsLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eagleScoutReqsLbl.setForeground(new java.awt.Color(0, 0, 204));
        eagleScoutReqsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl.setText("Eagle Scout Requirements");
        eagleScoutReqsLbl.setToolTipText("Eagle Scout Requirements");
        eagleScoutReqsLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        eagleScoutReqsLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl.setInheritsPopupMenu(false);
        eagleScoutReqsLbl.setName("eagleScoutReqsLbl"); // NOI18N
        eagleScoutReqsLbl.setNextFocusableComponent(nameAndPassLbl);

        nameAndPassLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameAndPassLbl.setForeground(new java.awt.Color(0, 0, 255));
        nameAndPassLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameAndPassLbl.setText("Enter Username and Password");
        nameAndPassLbl.setToolTipText("Enter Username and Password");
        nameAndPassLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        nameAndPassLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nameAndPassLbl.setName("nameAndPassLbl"); // NOI18N

        UserNameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameTxt.setToolTipText("Enter Username");
        UserNameTxt.setName("userNameTxt"); // NOI18N

        UserPassFld.setToolTipText("Enter Password");
        UserPassFld.setName("UserPassFld"); // NOI18N
        UserPassFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPassFldActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.setToolTipText("Login");
        LoginButton.setMaximumSize(new java.awt.Dimension(91, 23));
        LoginButton.setMinimumSize(new java.awt.Dimension(91, 23));
        LoginButton.setName("loginBtn"); // NOI18N
        LoginButton.setPreferredSize(new java.awt.Dimension(91, 23));
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        CreateUser.setText("Create User");
        CreateUser.setToolTipText("Create New User");
        CreateUser.setName("loginBtn"); // NOI18N
        CreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserActionPerformed(evt);
            }
        });

        EmailLbl.setForeground(new java.awt.Color(0, 51, 204));
        EmailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLbl.setText("Email Address");
        EmailLbl.setToolTipText("Enter Email Address");
        EmailLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LoginPassword.setForeground(new java.awt.Color(0, 51, 204));
        LoginPassword.setText("Password");
        LoginPassword.setToolTipText("LoginPassword");
        LoginPassword.setName("LoginPassword"); // NOI18N
        LoginPassword.setNextFocusableComponent(UserPassFld);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameAndPassLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eagleScoutReqsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserPassFld, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(UserNameTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(CreateUser))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(EmailLbl)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(LoginPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eagleScoutReqsLbl)
                .addGap(18, 18, 18)
                .addComponent(nameAndPassLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(EmailLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserNameTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserPassFld)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateUser))
                .addGap(53, 53, 53))
        );

        UserNameTxt.getAccessibleContext().setAccessibleName("Username");
        UserNameTxt.getAccessibleContext().setAccessibleDescription("Enter Username");
        UserPassFld.getAccessibleContext().setAccessibleName("Password");
        UserPassFld.getAccessibleContext().setAccessibleDescription("Enter Password");
        LoginPassword.getAccessibleContext().setAccessibleDescription("Login Password");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (evt.getSource() == LoginButton) {
            this.dispose();
            NewOrExistingScout newOrExistingScout = new NewOrExistingScout();
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserActionPerformed
        if (evt.getSource() == CreateUser) {
            this.dispose();
            NewOrExistingScout newOrExistingScout = new NewOrExistingScout();            
        }
    }//GEN-LAST:event_CreateUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void UserPassFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPassFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPassFldActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateUser;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginPassword;
    private javax.swing.JFormattedTextField UserNameTxt;
    private javax.swing.JPasswordField UserPassFld;
    private javax.swing.JLabel eagleScoutReqsLbl;
    private javax.swing.JLabel nameAndPassLbl;
    // End of variables declaration//GEN-END:variables
}
