/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bg.smg.frame;

import bg.smg.model.Restaurant;
import bg.smg.model.User;
import bg.smg.services.RestaurantService;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;

/**
 *
 * @author Natalia
 */
public class RestaurantsMenu extends javax.swing.JFrame {
    
    private RestaurantService restaurantService;
    private User user;
    
    /**
     * Creates new form ResaurantsMenu
     */
    public RestaurantsMenu(User user) throws SQLException{
        this.user = user;
        initComponents();
        try {
            restaurantService = new RestaurantService();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        showRestaurants(restaurantService.getAll());
    }

    private RestaurantsMenu() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneMenu = new javax.swing.JScrollPane();
        jPanelRestaurants = new javax.swing.JPanel();
        jPanelNavBar2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonMyProfile2 = new javax.swing.JButton();
        jButtonRestaurants2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPaneMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneMenu.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        javax.swing.GroupLayout jPanelRestaurantsLayout = new javax.swing.GroupLayout(jPanelRestaurants);
        jPanelRestaurants.setLayout(jPanelRestaurantsLayout);
        jPanelRestaurantsLayout.setHorizontalGroup(
            jPanelRestaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        jPanelRestaurantsLayout.setVerticalGroup(
            jPanelRestaurantsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        jPanelRestaurants.setLayout(new BoxLayout(jPanelRestaurants, BoxLayout.Y_AXIS));

        jScrollPaneMenu.setViewportView(jPanelRestaurants);

        jPanelNavBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Restaurants");

        jButtonMyProfile2.setBackground(new java.awt.Color(242, 242, 242));
        jButtonMyProfile2.setText("MyProfile");
        jButtonMyProfile2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMyProfile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyProfile2ActionPerformed(evt);
            }
        });

        jButtonRestaurants2.setBackground(new java.awt.Color(242, 242, 242));
        jButtonRestaurants2.setText("Restaurants");
        jButtonRestaurants2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelNavBar2Layout = new javax.swing.GroupLayout(jPanelNavBar2);
        jPanelNavBar2.setLayout(jPanelNavBar2Layout);
        jPanelNavBar2Layout.setHorizontalGroup(
            jPanelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                .addComponent(jButtonRestaurants2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMyProfile2)
                .addContainerGap())
        );
        jPanelNavBar2Layout.setVerticalGroup(
            jPanelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNavBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNavBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRestaurants2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButtonMyProfile2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNavBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNavBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMyProfile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyProfile2ActionPerformed
        try {
            this.setVisible(false);
            MyProfileFrame mpf = new MyProfileFrame(user);
            mpf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantsMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonMyProfile2ActionPerformed

    private void showRestaurants(ArrayList<Restaurant> restaurants) throws SQLException {
        jPanelRestaurants.removeAll();
        for (int i = 0; i < restaurants.size(); i++) {
            Restaurant rest = restaurants.get(i);
            RestaurantPanel restPanel = new RestaurantPanel(rest, user);
            restPanel.setRestaurantPanel();
            jPanelRestaurants.add(restPanel);
        }
        int panelHeight = (restaurants.size() * (176 + 5)) + 5;
        jPanelRestaurants.setPreferredSize(new Dimension(jPanelRestaurants.getWidth(), panelHeight));
        jPanelRestaurants.revalidate();
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
            java.util.logging.Logger.getLogger(RestaurantsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMyProfile2;
    private javax.swing.JButton jButtonRestaurants2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelNavBar2;
    private javax.swing.JPanel jPanelRestaurants;
    private javax.swing.JScrollPane jScrollPaneMenu;
    // End of variables declaration//GEN-END:variables
}