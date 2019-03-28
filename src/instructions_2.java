
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class instructions_2 extends javax.swing.JFrame {

    /**
     * Creates new form instructions_2
     */
    public instructions_2() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        r1 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setText("WELCOME TO PST");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Total duration of examination is 180 minutes.\nThe clock will be set at the server. \nThe countdown timer in the top right corner of screen will display the remaining time available for you to complete the examination. \nWhen the timer reaches zero, the examination will end by itself. You will not be required to end or submit your examination.\nThe Question Palette displayed on the right side of screen will show the status of each question using one of the following symbols:\n1\tYou have not visited the question yet.\n3\tYou have not answered the question.\n5\tYou have answered the question.\n7\tYou have NOT answered the question, but have marked the question for review.\n9\tYou have answered the question, but marked it for review.\n\nThe Marked for Review status for a question simply indicates that you would like to look at that question again.\nYou can click on the \">\" arrow which appears to the left of question palette to collapse the question palette thereby maximizing the question window. \nTo view the question palette again, you can click on \"<\" which appears on the right side of question window.\n\nNavigating to a Question:\nTo answer a question, do the following:\nClick on the question number in the Question Palette at the right of your screen to go to that numbered question directly.\nNote that using this option does NOT save your answer to the current question.\nClick on Save & Next to save your answer for the current question and then go to the next question.\nClick on Mark for Review & Next to save your answer for the current question, mark it for review, and then go to the next question.\n\nAnswering a Question :\n\nProcedure for answering a multiple choice type question:\nTo select your answer, click on the button of one of the options\nTo deselect your chosen answer, click on the button of the chosen option again or click on the Clear Response button\nTo change your chosen answer, click on the button of another option\nTo save your answer, you MUST click on the Save & Next button\nTo mark the question for review, click on the Mark for Review & Next button.\nTo change your answer to a question that has already been answered, first select that question for answering and then follow the procedure for answering that type of question.\n\nNavigating through sections:\n\nSections in this question paper are displayed on the top bar of the screen. Questions in a section can be viewed by clicking on the section name.\nThe section you are currently viewing is highlighted.\nAfter clicking the Save & Next button on the last question for a section, you will automatically be taken to the first question of the next section.\nYou can shuffle between sections and questions anytime during the examination as per your convenience only during the time stipulated.\nCandidate can view the corresponding section summary as part of the legend that appears in every section above the question palette.");
        jScrollPane1.setViewportView(jTextArea1);

        r1.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        r1.setText("I accept all the terms and conditions");
        r1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                r1StateChanged(evt);
            }
        });
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        b1.setText("Start");
        b1.setEnabled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r1)
                        .addGap(65, 65, 65)
                        .addComponent(b1)
                        .addGap(218, 218, 218)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1)
                    .addComponent(r1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_r1StateChanged
        if(r1.isSelected())
        {  b1.setEnabled(true); }
        else{
            b1.setEnabled(false);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_r1StateChanged

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        new progress().setVisible(true);
        this.dispose();  // add your handling code here:
        }
        public void func(){

            // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x=JOptionPane.showConfirmDialog(this,"Do you want to exit","Confirm",JOptionPane.YES_NO_OPTION);
        if(x==0)
        {
            System.exit(0);}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(instructions_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(instructions_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(instructions_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(instructions_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instructions_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton r1;
    // End of variables declaration//GEN-END:variables
}
