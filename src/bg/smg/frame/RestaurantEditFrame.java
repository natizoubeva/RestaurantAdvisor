/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bg.smg.frame;

import bg.smg.model.PricePoint;
import bg.smg.model.Restaurant;
import bg.smg.model.User;
import bg.smg.services.RestaurantService;
import bg.smg.services.UserService;
import bg.smg.util.ImageFilter;
import java.awt.Image;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

/**
 *
 * @author Natalia
 */
public class RestaurantEditFrame extends javax.swing.JFrame {

    private User user;
    private Restaurant restaurant;
    private RestaurantService restaurantService;
    
    private String imagePath;
    /**
     * Creates new form RestaurantEditFrame
     */
    public RestaurantEditFrame(User user, Restaurant restaurant) throws SQLException {
        this.user = user;
        this.restaurant = restaurant;
        restaurantService = new RestaurantService();
        initComponents();
        jTextFieldName.setText(restaurant.getName());
        jTextFieldAddress.setText(restaurant.getAddress());
        imagePath = "/resources/restaurant_images/" + restaurant.getImage();
        URL imageUrl = getClass().getResource(imagePath);
        ImageIcon imageIcon = new ImageIcon(imageUrl);
        SwingUtilities.invokeLater(() -> {
            Image image = imageIcon.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
            imageIcon.setImage(image);
            jLabelImage.setIcon(imageIcon);
        });
        jComboBoxPricePoint.setSelectedItem(restaurant.getPricePoint());
    }

    private RestaurantEditFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImage = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jLabelInstructions = new javax.swing.JLabel();
        jLabelPricePoint = new javax.swing.JLabel();
        jComboBoxPricePoint = new javax.swing.JComboBox<>();
        jButtonSaveChanges = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setToolTipText("");
        jLabelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelImageMousePressed(evt);
            }
        });

        jTextFieldName.setText("jTextField1");

        jTextFieldAddress.setText("jTextField1");

        jLabelInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInstructions.setText("Click on the image to change it");

        jLabelPricePoint.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelPricePoint.setText("Choose the price point:");

        jComboBoxPricePoint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxPricePoint.setModel(new DefaultComboBoxModel(bg.smg.model.PricePoint.values()));

        jButtonSaveChanges.setBackground(new java.awt.Color(204, 255, 204));
        jButtonSaveChanges.setText("Save Changes");
        jButtonSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabelPricePoint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPricePoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPricePoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxPricePoint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstructions)
                .addGap(18, 18, 18)
                .addComponent(jButtonSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageMousePressed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new ImageFilter());
        fileChooser.setAcceptAllFileFilterUsed(false);

        int result = fileChooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(),
                Image.SCALE_SMOOTH);
            imageIcon.setImage(image);
            jLabelImage.setIcon(imageIcon);
            jLabelImage.setText("");
        }
    }//GEN-LAST:event_jLabelImageMousePressed

    private void jButtonSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveChangesActionPerformed
        String name = jTextFieldName.getText();
        String address = jTextFieldAddress.getText();
        imagePath = jLabelImage.getIcon().toString();
        String image = (imagePath != null) ? imagePath.substring(imagePath.indexOf("resources\\restaurant_images\\") + 28) : null;
        PricePoint pricePoint = (PricePoint)jComboBoxPricePoint.getSelectedItem();
        restaurant.setName(name);
        restaurant.setAddress(address);
        restaurant.setImage(image);
        restaurant.setPricePoint(pricePoint);
        restaurantService.updateRestaurant(restaurant, user);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSaveChangesActionPerformed

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
            java.util.logging.Logger.getLogger(RestaurantEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantEditFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantEditFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSaveChanges;
    private javax.swing.JComboBox<String> jComboBoxPricePoint;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelInstructions;
    private javax.swing.JLabel jLabelPricePoint;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
