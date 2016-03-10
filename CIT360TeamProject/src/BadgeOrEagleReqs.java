
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
public class BadgeOrEagleReqs extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form BadgeOrEagleReqs
     */
    public BadgeOrEagleReqs() {
        initComponents();
        // listener to open this window
        JButton open = new JButton("New Window");
        open.addActionListener(this);
        add(open);
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

        eagleScoutReqsLbl1 = new javax.swing.JLabel();
        BadgeReqLbl = new javax.swing.JLabel();
        MeritBadgeBtn = new javax.swing.JButton();
        EagleReqsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eagleScoutReqsLbl1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eagleScoutReqsLbl1.setForeground(new java.awt.Color(0, 0, 204));
        eagleScoutReqsLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl1.setText("Eagle Scout Requirements");
        eagleScoutReqsLbl1.setToolTipText("Eagle Scout Requirements");
        eagleScoutReqsLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        eagleScoutReqsLbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl1.setInheritsPopupMenu(false);
        eagleScoutReqsLbl1.setName("eagleScoutReqsLbl"); // NOI18N

        BadgeReqLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BadgeReqLbl.setForeground(new java.awt.Color(0, 0, 255));
        BadgeReqLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BadgeReqLbl.setText("View Eagle Scout or Merit Badge Requirements");
        BadgeReqLbl.setToolTipText("View Eagle Scout or Merit Badge Requirements");
        BadgeReqLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        BadgeReqLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BadgeReqLbl.setName("ScoutOrBadgeReqLbl"); // NOI18N

        MeritBadgeBtn.setText("View Required Merit Badges");
        MeritBadgeBtn.setToolTipText("View Required Merit Badges");
        MeritBadgeBtn.setMaximumSize(new java.awt.Dimension(183, 23));
        MeritBadgeBtn.setMinimumSize(new java.awt.Dimension(183, 23));
        MeritBadgeBtn.setPreferredSize(new java.awt.Dimension(183, 23));
        MeritBadgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeritBadgeBtnActionPerformed(evt);
            }
        });

        EagleReqsBtn.setText("View Eagle Scout Requirements");
        EagleReqsBtn.setToolTipText("View Eagle Scout Requirements");
        EagleReqsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EagleReqsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eagleScoutReqsLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BadgeReqLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(EagleReqsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MeritBadgeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eagleScoutReqsLbl1)
                .addGap(18, 18, 18)
                .addComponent(BadgeReqLbl)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EagleReqsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MeritBadgeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        EagleReqsBtn.getAccessibleContext().setAccessibleDescription("View Eagle Scout Requirements");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MeritBadgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeritBadgeBtnActionPerformed
        if (evt.getSource() == MeritBadgeBtn){
            this.dispose();
            NewScout newScout = new NewScout();
        }
    }//GEN-LAST:event_MeritBadgeBtnActionPerformed

    private void EagleReqsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EagleReqsBtnActionPerformed
        if (evt.getSource() == EagleReqsBtn){
            this.dispose();
            ExistingScout existingScout = new ExistingScout();
        }
    }//GEN-LAST:event_EagleReqsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BadgeOrEagleReqs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BadgeOrEagleReqs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BadgeOrEagleReqs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BadgeOrEagleReqs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BadgeOrEagleReqs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BadgeReqLbl;
    private javax.swing.JButton EagleReqsBtn;
    private javax.swing.JButton MeritBadgeBtn;
    private javax.swing.JLabel eagleScoutReqsLbl1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
