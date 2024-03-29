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
import java.sql.Timestamp;

/**
 *
 * @author Natalia
 */
public class SignUpFrame extends javax.swing.JFrame {

    private User user;
    private UserService userService;

    /**
     * Creates new form RegistrationScreen
     */
    public SignUpFrame() {
        initComponents();
        try {
            userService = new UserService();
        } catch (SQLException ex) {
            Logger.getLogger(SignUpFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jPasswordRepeat = new javax.swing.JPasswordField();
        jLabelPasswordRepeat = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabelTitle.setText("Sign up");
        jLabelTitle.setPreferredSize(new java.awt.Dimension(75, 40));

        jLabelSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelSubtitle.setText("Please sign up to continue:");

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUsername.setText("username:");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPassword.setText("password:");

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPasswordRepeat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelPasswordRepeat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPasswordRepeat.setText("repeat password:");

        jButtonSignUp.setBackground(new java.awt.Color(175, 197, 220));
        jButtonSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSignUp.setText("Sign Up");
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });

        jTextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelName.setText("name:");

        jTextFieldName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jPasswordRepeat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSignUp)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSubtitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPasswordRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSignUp)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
        try {
            String username = jTextFieldUsername.getText();
            String name = jTextFieldName.getText();
            String password = Arrays.toString(jPasswordField.getPassword());
            String passwordRepeat = Arrays.toString(jPasswordRepeat.getPassword());
            if (!password.equals(passwordRepeat)) {
                JOptionPane.showMessageDialog(this,
                        "Повторете правилно паролата си.",
                        "Грешка!",
                        JOptionPane.WARNING_MESSAGE);

    }//GEN-LAST:event_jButtonSignUpActionPerformed
            user = new User();
            user.setUsername(username);
            user.setName(name);
            user.setPassword(userService.encode(password));
            user.setTimestamp(new Timestamp(System.currentTimeMillis()));
            user.setActive(true);
            user.setImage("no_photo.jpg");
            userService.saveUser(user);
            this.setVisible(false);
            MyProfileFrame mpf = new MyProfileFrame(user);
            mpf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SignUpFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPasswordRepeat;
    private javax.swing.JLabel jLabelSubtitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordRepeat;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
