
import cit360teamproject.HibernateUtil;
import cit360teamproject.Scoutinfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
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
public class ExistingScout extends javax.swing.JFrame implements ActionListener {
    
 
    /**
     * Creates new form ExistingScout
     */
    public ExistingScout() {
        initComponents();
        // listener to open this window
        JButton open = new JButton("New Window");
        open.addActionListener(this);
        add(open);
        setVisible(true);
        runQueryScouts();
    }
    
    private static String QUERY_SCOUT="from Scoutinfo";
    private void runQueryScouts(){
        executeHQLQuery(QUERY_SCOUT);
    }
    private void executeHQLQuery(String hql){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            displayResult(resultList);
            session.getTransaction().commit();
        }catch (HibernateException he){
            he.printStackTrace();
    }
    }
        
        private void displayResult(List resultList){
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("First Name");
        tableHeaders.add("Last Name");
        tableHeaders.add("Date of Birth");

        for(Object o : resultList){
            Scoutinfo scoutInfo = (Scoutinfo) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(scoutInfo.getScoutfirstname());
            oneRow.add(scoutInfo.getScoutlastname());
            oneRow.add(scoutInfo.getScoutdob());
            tableData.add(oneRow);
}
        ExistingScoutTable.setModel(new DefaultTableModel(tableData,tableHeaders));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ExistingScoutTable = new javax.swing.JTable();
        ExistingScoutLbl = new javax.swing.JLabel();
        SelectScoutBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Select Existing Scout");

        eagleScoutReqsLbl1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eagleScoutReqsLbl1.setForeground(new java.awt.Color(0, 0, 204));
        eagleScoutReqsLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl1.setText("Eagle Scout Requirements");
        eagleScoutReqsLbl1.setToolTipText("Eagle Scout Requirements");
        eagleScoutReqsLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        eagleScoutReqsLbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eagleScoutReqsLbl1.setInheritsPopupMenu(false);
        eagleScoutReqsLbl1.setName("eagleScoutReqsLbl"); // NOI18N

        ExistingScoutTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "First Name", "Last Name", "Date of Birth"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ExistingScoutTable.setToolTipText("");
        ExistingScoutTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(ExistingScoutTable);
        ExistingScoutTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        ExistingScoutLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExistingScoutLbl.setForeground(new java.awt.Color(0, 0, 255));
        ExistingScoutLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExistingScoutLbl.setText("Select an Existing Scout");
        ExistingScoutLbl.setToolTipText("Select an Existing Scout");
        ExistingScoutLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        ExistingScoutLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExistingScoutLbl.setName("ExistingScoutLbl"); // NOI18N

        SelectScoutBtn.setText("Select Scout");
        SelectScoutBtn.setToolTipText("Select Scout");
        SelectScoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectScoutBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.setToolTipText("Previous Menu");
        BackBtn.setMaximumSize(new java.awt.Dimension(91, 23));
        BackBtn.setMinimumSize(new java.awt.Dimension(91, 23));
        BackBtn.setPreferredSize(new java.awt.Dimension(91, 23));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eagleScoutReqsLbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExistingScoutLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(SelectScoutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eagleScoutReqsLbl1)
                .addGap(18, 18, 18)
                .addComponent(ExistingScoutLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectScoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        BackBtn.getAccessibleContext().setAccessibleName("Previous Menu");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        if (evt.getSource() == BackBtn) {
            this.dispose();
            NewOrExistingScout newOrExistingScout = new NewOrExistingScout();
            
            
        }
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SelectScoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectScoutBtnActionPerformed
        // insert statement to select scout from DB
        int row = ExistingScoutTable.getSelectedRow();

        
        if (evt.getSource() == SelectScoutBtn) {
            this.dispose();
            BadgeOrEagleReqs badgeOrEagleReqs = new BadgeOrEagleReqs();
        }
    }//GEN-LAST:event_SelectScoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExistingScout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExistingScout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel ExistingScoutLbl;
    private javax.swing.JTable ExistingScoutTable;
    private javax.swing.JButton SelectScoutBtn;
    private javax.swing.JLabel eagleScoutReqsLbl1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}