
import cit360teamproject.Badgereqs;
import cit360teamproject.HibernateUtil;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hiattech
 */
public class BadgeRequirements extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form BadgeReqs
     */
    public BadgeRequirements() {
        initComponents();
        // listener to open this window
        JButton open = new JButton("New Window");
        open.addActionListener(this);
        add(open);
        setVisible(true);
    }
    

    
    
    private void runQueryBasedOnMeritBadge(){
        
        executeHQLQuery (QUERY_BASED_ON_MERIT_BADGE + SelectMeritBadgeBox.getSelectedItem());
        
    }
    private String QUERY_BASED_ON_MERIT_BADGE="from Badgereqs where meritbadge = ";
    
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
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
        CompleteBtn = new javax.swing.JButton();
        SelectMeritBadgeBox = new javax.swing.JComboBox<>();

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
        BadgeReqLbl.setText("Merit Badge Requirements");
        BadgeReqLbl.setToolTipText("Merit Badge Requirements");
        BadgeReqLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        BadgeReqLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BadgeReqLbl.setName("BadgeReqLbl"); // NOI18N

        resultTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Complete", "Requirement Details", "Completed Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setToolTipText("Merit Badge Requirements");
        resultTable.setColumnSelectionAllowed(true);
        resultTable.setName("resultTable"); // NOI18N
        resultTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(resultTable);
        resultTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(8);
            resultTable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }
        resultTable.getAccessibleContext().setAccessibleName("Merit Badge Requirements");

        BackBtn.setText("Back");
        BackBtn.setToolTipText("Back");
        BackBtn.setMaximumSize(new java.awt.Dimension(103, 23));
        BackBtn.setMinimumSize(new java.awt.Dimension(103, 23));
        BackBtn.setPreferredSize(new java.awt.Dimension(103, 23));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        CompleteBtn.setText("Mark Complete");
        CompleteBtn.setToolTipText("Mark Complete");
        CompleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteBtnActionPerformed(evt);
            }
        });

        SelectMeritBadgeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select --", "'Citizenship in the Community'", "Merit Badge 2", "Merit Badge 3", "Merit Badge 4", "Merit Badge 5", "Merit Badge 6", "Merit Badge 7", "Merit Badge 8", "Merit Badge 9", "Merit Badge 10", "" }));
        SelectMeritBadgeBox.setToolTipText("Select a Merit Badge to Display");
        SelectMeritBadgeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectMeritBadgeBoxActionPerformed(evt);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CompleteBtn)
                        .addGap(100, 100, 100)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(SelectMeritBadgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eagleScoutReqsLbl1)
                .addGap(18, 18, 18)
                .addComponent(BadgeReqLbl)
                .addGap(18, 18, 18)
                .addComponent(SelectMeritBadgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompleteBtn))
                .addGap(21, 21, 21))
        );

        SelectMeritBadgeBox.getAccessibleContext().setAccessibleName("Select a Merit Badge to Display");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        if (evt.getSource() == BackBtn) {
            this.dispose();
            BadgeOrEagleReqs badgeOrEagleReqs = new BadgeOrEagleReqs();
        }
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SelectMeritBadgeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectMeritBadgeBoxActionPerformed
    Object selectedItem = SelectMeritBadgeBox.getSelectedItem();
    if (selectedItem != null)
{
    String selectedItemStr = selectedItem.toString();
    runQueryBasedOnMeritBadge();
}
    
    }//GEN-LAST:event_SelectMeritBadgeBoxActionPerformed

    private void CompleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteBtnActionPerformed
        try {
            // insert statement to mark badge complete and set the date in DB
            Socket s = new Socket("localhost", 9090);
            BufferedReader input =
                    new BufferedReader(new InputStreamReader(s.getInputStream()));
            String answer = input.readLine();
            JOptionPane.showMessageDialog(null, 
                    "The requirement has been marked complete with date: \n" + answer);
            
        } catch (IOException ex) {
            Logger.getLogger(BadgeRequirements.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CompleteBtnActionPerformed

    
    private void executeHQLQuery(String hql) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
        List resultList = q.list();
        displayResult(resultList);
        session.getTransaction().commit();
    } catch (HibernateException he) {
        he.printStackTrace();
    }
}
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
            java.util.logging.Logger.getLogger(BadgeRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BadgeRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BadgeRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BadgeRequirements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BadgeRequirements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BadgeReqLbl;
    private javax.swing.JButton CompleteBtn;
    private javax.swing.JComboBox<String> SelectMeritBadgeBox;
    private javax.swing.JLabel eagleScoutReqsLbl1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayResult(List resultList) {
    Vector<String> tableHeaders = new Vector<String>();
    Vector tableData = new Vector();
    tableHeaders.add("Requirement Number"); 
    tableHeaders.add("Requirement Details");
    tableHeaders.add("Requirement Completion Date");
   

    for(Object o : resultList) {
        Badgereqs badgereqs = (Badgereqs)o;
        Vector<Object> oneRow = new Vector<Object>();
        oneRow.add(badgereqs.getReqnumber());
        oneRow.add(badgereqs.getReqdetails());
        oneRow.add(badgereqs.getReqcompleteddate());
        tableData.add(oneRow);
    }
    resultTable.setModel(new DefaultTableModel(tableData, tableHeaders));
}
}
