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
public class TacosGUI extends javax.swing.JFrame {

    /**
     * Creates new form TacosGUI
     */
    private int taco;

    public TacosGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        taco = 1;
        inicio();
    }

    public void listen(ActionListener controller) {
        this.btnNext.addActionListener(controller);
        this.btnExit.addActionListener(controller);
        this.btnPrevious.addActionListener(controller);
        this.btnAdd.addActionListener(controller);
    }

    public void nextTaco() {
        taco++;

        if (taco == 1) {
            inicio();
        }
        if (taco == 2) {
            lbNameTaco.setText("Space Rancher");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(true);
            lbBlueBerryFilds.setVisible(false);
            lbPigTaco.setVisible(false);
            lbTacos.setVisible(false);
            cbSelectTaco.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (taco == 3) {
            lbNameTaco.setText("Blue Berry Filds");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(false);
            lbBlueBerryFilds.setVisible(true);
            lbPigTaco.setVisible(false);
            lbTacos.setVisible(false);
            cbSelectTaco.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (taco == 4) {
            lbNameTaco.setText("Pig Taco");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(false);
            lbBlueBerryFilds.setVisible(false);
            lbPigTaco.setVisible(true);
            lbTacos.setVisible(false);
            cbSelectTaco.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (taco == 5) {
            lbNameTaco.setText("Select Taco");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(false);
            lbBlueBerryFilds.setVisible(false);
            lbPigTaco.setVisible(false);
            lbTacos.setVisible(true);
            cbSelectTaco.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
        }
        if (taco == 6) {
            inicio();
            taco = 1;
        }

    }

    public void previousTaco() {
        taco--;

        if (taco == 0) {
            taco = 5; // Si taco llega a 0, lo reiniciamos a 4 para retroceder desde el principio
        }

        if (taco == 1) {
            inicio();
        }
        if (taco == 2) {
            lbNameTaco.setText("Space Rancher");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(true);
            lbBlueBerryFilds.setVisible(false);
            lbPigTaco.setVisible(false);
            lbTacos.setVisible(false);
            cbSelectTaco.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (taco == 3) {
            lbNameTaco.setText("Blue Berry Filds");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(false);
            lbBlueBerryFilds.setVisible(true);
            lbPigTaco.setVisible(false);
            lbTacos.setVisible(false);
            cbSelectTaco.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (taco == 4) {
            lbNameTaco.setText("Pig Taco");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(false);
            lbBlueBerryFilds.setVisible(false);
            lbPigTaco.setVisible(true);
            lbTacos.setVisible(false);
            cbSelectTaco.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (taco == 5) {
            lbNameTaco.setText("Select Taco");
            lbPotatoTaco.setVisible(false);
            lbSpaceRancher.setVisible(false);
            lbBlueBerryFilds.setVisible(false);
            lbPigTaco.setVisible(false);
            lbTacos.setVisible(true);
            cbSelectTaco.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
        }
        if (taco == 6) {
            inicio();
            taco = 1;
        }
    }

    public void inicio() {
        lbNameTaco.setText("Potato Taco");
        lbPotatoTaco.setVisible(true);
        lbSpaceRancher.setVisible(false);
        lbBlueBerryFilds.setVisible(false);
        lbPigTaco.setVisible(false);
        lbTacos.setVisible(false);
        cbSelectTaco.setVisible(false);
        jsQuantity.setVisible(false);
        btnAdd.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        lbNameTaco = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        cbSelectTaco = new javax.swing.JComboBox<>();
        jsQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        lbBackgroundRed1 = new javax.swing.JLabel();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbTacos = new javax.swing.JLabel();
        lbPotatoTaco = new javax.swing.JLabel();
        lbSpaceRancher = new javax.swing.JLabel();
        lbBlueBerryFilds = new javax.swing.JLabel();
        lbPigTaco = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(149, 38, 36));
        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(238, 236, 208));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setFocusPainted(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 60, 40));

        lbNameTaco.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameTaco.setForeground(new java.awt.Color(238, 236, 208));
        lbNameTaco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNameTaco.setText("Tacos");
        getContentPane().add(lbNameTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 440, 40));

        btnPrevious.setBackground(new java.awt.Color(149, 38, 36));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(238, 236, 208));
        btnPrevious.setText("<");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setFocusPainted(false);
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 50, -1));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText(">");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 50, -1));

        cbSelectTaco.setBackground(new java.awt.Color(102, 38, 36));
        cbSelectTaco.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbSelectTaco.setForeground(new java.awt.Color(238, 236, 208));
        cbSelectTaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Taco", "Potato Taco", "Space Rancher", "Blue Berry Filds", "Pig Taco" }));
        cbSelectTaco.setBorder(null);
        cbSelectTaco.setFocusable(false);
        cbSelectTaco.setRequestFocusEnabled(false);
        getContentPane().add(cbSelectTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 210, 30));

        jsQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jsQuantity.setFocusable(false);
        jsQuantity.setOpaque(true);
        getContentPane().add(jsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 60, 30));

        btnAdd.setBackground(new java.awt.Color(149, 38, 36));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(238, 236, 208));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 60, 30));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 550, 70));

        lbTacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tacos.png"))); // NOI18N
        getContentPane().add(lbTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbPotatoTaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/potatoTaco.jpeg"))); // NOI18N
        getContentPane().add(lbPotatoTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbSpaceRancher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Space Rancher_taco.jpg"))); // NOI18N
        getContentPane().add(lbSpaceRancher, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbBlueBerryFilds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Blueberryfilds_taco.jpg"))); // NOI18N
        getContentPane().add(lbBlueBerryFilds, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbPigTaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pig taco.jpg"))); // NOI18N
        getContentPane().add(lbPigTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> cbSelectTaco;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbBlueBerryFilds;
    private javax.swing.JLabel lbNameTaco;
    private javax.swing.JLabel lbPigTaco;
    private javax.swing.JLabel lbPotatoTaco;
    private javax.swing.JLabel lbSpaceRancher;
    private javax.swing.JLabel lbTacos;
    // End of variables declaration//GEN-END:variables
}
