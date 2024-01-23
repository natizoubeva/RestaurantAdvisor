/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bg.smg.frame;

import bg.smg.model.User;
import bg.smg.services.UserService;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class ForgottenPasswordScreen extends javax.swing.JFrame {

    private UserService userService;

    /**
     * Creates new form ForgottenPasswordScreen
     */
    public ForgottenPasswordScreen() {
        initComponents();
        try {
            userService = new UserService();
        } catch (SQLException ex) {
            Logger.getLogger(ForgottenPasswordScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelSubtitle = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPasswordNew = new javax.swing.JLabel();
        jPasswordNew = new javax.swing.JPasswordField();
        jLabelPasswordRepeat = new javax.swing.JLabel();
        jPasswordRepeatNew = new javax.swing.JPasswordField();
        jButtonChangePassword = new javax.swing.JButton();
        jTextFieldUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabelTitle.setText("Forgot your password?");
        jLabelTitle.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabelSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSubtitle.setText("Please change it to continue:");

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUsername.setText("username:");

        jLabelPasswordNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPasswordNew.setText("new password:");

        jPasswordNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelPasswordRepeat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPasswordRepeat.setText("repeat new password:");

        jPasswordRepeatNew.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButtonChangePassword.setBackground(new java.awt.Color(175, 197, 220));
        jButtonChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonChangePassword.setText("Change Password");
        jButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePasswordActionPerformed(evt);
            }
        });

        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonChangePassword)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPasswordRepeat)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(jPasswordRepeatNew, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordNew, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSubtitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabelPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordRepeatNew, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChangePassword)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePasswordActionPerformed
        try {
            String username = jTextFieldUsername.getText();
            String password = userService.encode(Arrays.toString(jPasswordNew.getPassword()));
            String passwordRepeat = userService.encode(Arrays.toString(jPasswordRepeatNew.getPassword()));
            if (!password.equals(passwordRepeat)) {
                JOptionPane.showMessageDialog(this,
                        "Повторете правилно паролата си.",
                        "Грешка!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                User user = userService.getUserByUsername(username);
                user.setPassword(password);
                userService.updateForgottenPassword(user);
                this.setVisible(false);
                LoginScreen ls = new LoginScreen();
                ls.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgottenPasswordScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonChangePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ForgottenPasswordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgottenPasswordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgottenPasswordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgottenPasswordScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgottenPasswordScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangePassword;
    private javax.swing.JLabel jLabelPasswordNew;
    private javax.swing.JLabel jLabelPasswordRepeat;
    private javax.swing.JLabel jLabelSubtitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordNew;
    private javax.swing.JPasswordField jPasswordRepeatNew;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
