
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class password_recovery extends javax.swing.JFrame {

    /**
     * Creates new form password_recovery
     */
    public password_recovery() {
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
        jLabel2 = new javax.swing.JLabel();
        ta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        p3 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("change password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 0, 767, 60));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Enter your Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 358, 60));
        getContentPane().add(ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 753, 38));

        jButton2.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 620, -1, -1));

        l4.setFont(new java.awt.Font("Book Antiqua", 1, 30)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 0));
        l4.setText("Enter new Password");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 412, 320, 42));

        l5.setFont(new java.awt.Font("Book Antiqua", 1, 30)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 0));
        l5.setText("Confirm new Password");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 472, 330, 41));
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 354, 340, 40));
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 433, 340, 40));

        jButton3.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jButton3.setText("Back ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 613, 190, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cryptographic-hash-algorithms.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 810));
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 507, 350, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       
        String user = ta.getText();
        String oldpass = p1.getText();
        String newpass = p2.getText();
        String conpass = p3.getText();
          try
            {
                Class.forName("java.sql.DriverManager");
                Connection con = (Connection)              
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/pst","root","iamarapperA");
                Statement stmt = (Statement) con.createStatement();
                String query="SELECT * from signup;";
                ResultSet rs=stmt.executeQuery(query);
                if(rs.next())
                {
                    String email= rs.getString("emailid");
                    String password= rs.getString("password");
                  if(email.equals(user)&&password.equals(p1))
                  {if(newpass.equals(conpass)){JOptionPane.showMessageDialog(this, "password match");
                  Class.forName("java.sql.DriverManager");
                 con = (Connection)              
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/pst","root","iamarapperA");
                 stmt = (Statement) con.createStatement();
                String update="update signup set pasword="+newpass+"where emailid="+user+";";
          stmt.executeQuery(update);
          new home_page().setVisible(true);
                  }
                  else{JOptionPane.showMessageDialog(this, "password do not match");}
                  }
                    
                }
                          
            }catch(Exception e)
            {
        JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new login().setVisible(true);this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(password_recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(password_recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(password_recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(password_recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new password_recovery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JPasswordField p3;
    private javax.swing.JTextField ta;
    // End of variables declaration//GEN-END:variables
}
