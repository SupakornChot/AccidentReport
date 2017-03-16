/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Supakorn
 */
public class StatusJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StatusJFrame
     */
    public StatusJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        accidentName = new javax.swing.JLabel();
        statusBar = new javax.swing.JProgressBar();
        wait = new javax.swing.JLabel();
        recieved = new javax.swing.JLabel();
        operate = new javax.swing.JLabel();
        sendDepartment = new javax.swing.JLabel();
        statusBackHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        accidentName.setText("ชื่ออุบัติเหตุ");

        statusBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                statusBarStateChanged(evt);
            }
        });

        wait.setText("รอรับเรื่อง");

        recieved.setText("รับเรื่องแล้ว");

        operate.setText("ลงพื้นที่");

        sendDepartment.setText("นำส่งหน่วยงาน");

        statusBackHome.setText("กลับหน้าแรก");
        statusBackHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBackHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(wait)
                                .addGap(49, 49, 49)
                                .addComponent(recieved)
                                .addGap(48, 48, 48)
                                .addComponent(operate))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sendDepartment)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(accidentName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusBackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(accidentName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wait)
                    .addComponent(sendDepartment)
                    .addComponent(operate)
                    .addComponent(recieved))
                .addGap(47, 47, 47)
                .addComponent(statusBackHome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusBackHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBackHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBackHomeActionPerformed

    private void statusBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_statusBarStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_statusBarStateChanged

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
            java.util.logging.Logger.getLogger(StatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accidentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel operate;
    private javax.swing.JLabel recieved;
    private javax.swing.JLabel sendDepartment;
    private javax.swing.JButton statusBackHome;
    private javax.swing.JProgressBar statusBar;
    private javax.swing.JLabel wait;
    // End of variables declaration//GEN-END:variables
}
