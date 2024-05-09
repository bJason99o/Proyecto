/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.view;

import java.awt.event.ActionListener;

/**
 *
 * @author Jason
 */
public class DessertsGUI extends javax.swing.JFrame {

    private int dessert;
    /**        
     * Creates new form DessertsGUI
     */
    public DessertsGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        dessert=1;
        inicio();
    }

    public void listen(ActionListener controller)
    {
        this.btnExit.addActionListener(controller);
        this.btnNext.addActionListener(controller);
    }
     
     public void nextDessert(){
         dessert++;
         
         if(dessert==1){
            inicio();
         }
         if(dessert==2){
             lbNameDesserts.setText("Napoleon");
             lbChesscurds.setVisible(false);
             lbNapoleon.setVisible(true);
         }
         if(dessert==3){
             inicio();
             dessert=1;
         }
         
     }
     
     public void inicio(){
          lbNameDesserts.setText("Chesscurds");
             lbChesscurds.setVisible(true);
             lbNapoleon.setVisible(false);
             
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNameDesserts = new javax.swing.JLabel();
        lbBackgroundRed1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbChesscurds = new javax.swing.JLabel();
        lbNapoleon = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNameDesserts.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameDesserts.setForeground(new java.awt.Color(238, 236, 208));
        lbNameDesserts.setText("Desserts");
        getContentPane().add(lbNameDesserts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 440, 40));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        btnExit.setBackground(new java.awt.Color(149, 38, 36));
        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(238, 236, 208));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setOpaque(true);
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 60, 40));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText("Next");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        btnNext.setOpaque(true);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 70, 40));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 560, 60));

        lbChesscurds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chesscurds.jpg"))); // NOI18N
        getContentPane().add(lbChesscurds, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        lbNapoleon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Napoleón.jpg"))); // NOI18N
        getContentPane().add(lbNapoleon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbChesscurds;
    private javax.swing.JLabel lbNameDesserts;
    private javax.swing.JLabel lbNapoleon;
    // End of variables declaration//GEN-END:variables
}
