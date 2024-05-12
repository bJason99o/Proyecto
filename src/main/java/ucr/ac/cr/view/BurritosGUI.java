/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jason
 */
public class BurritosGUI extends javax.swing.JFrame {

    private int burrito;

    /**
     * Creates new form BurritosGUI
     */
    public BurritosGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        burrito = 1;
        inicio();
    }

    public void listen(ActionListener controller) {
        this.btnExit.addActionListener(controller);
        this.btnNext.addActionListener(controller);
        this.btnPrevious.addActionListener(controller);
        this.btnAdd.addActionListener(controller);
    }

    public void nextBurrito() {
        burrito++;

        if (burrito == 1) {
            inicio();
        }
        if (burrito == 2) {
            lbNameBurritos.setText("Burrito Chimichanga");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(true);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 3) {
            lbNameBurritos.setText("Pork Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(true);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 4) {
            lbNameBurritos.setText("Big Cheddar Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(true);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 5) {
            lbNameBurritos.setText("Chicken Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(true);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 6) {
            lbNameBurritos.setText("Select Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(true);
            cbSelectBurrito.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
        }
        if (burrito == 7) {
            inicio();
            burrito = 1;
        }

    }

    public void previousBurrito() {
        burrito--;

        if (burrito == 0) {
            burrito = 6; // Si burrito llega a 0, lo reiniciamos a 6 para retroceder desde el principio
        }

        if (burrito == 1) {
            inicio();
        }
        if (burrito == 2) {
            lbNameBurritos.setText("Burrito Chimichanga");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(true);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 3) {
            lbNameBurritos.setText("Pork Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(true);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 4) {
            lbNameBurritos.setText("Big Cheddar Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(true);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 5) {
            lbNameBurritos.setText("Chicken Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(true);
            lbBurritos.setVisible(false);
            cbSelectBurrito.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (burrito == 6) {
            lbNameBurritos.setText("Select Burrito");
            lbBurritoBowl.setVisible(false);
            lbBurritoChimichanga.setVisible(false);
            lbPorkBurrito.setVisible(false);
            lbBigCheddarBurrito.setVisible(false);
            lbChickenBurrito.setVisible(false);
            lbBurritos.setVisible(true);
            cbSelectBurrito.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
        }
        if (burrito == 7) {
            inicio();
            burrito = 1;
        }
    }

    public void inicio() {
        lbNameBurritos.setText("Burrito bowl");
        lbBurritoBowl.setVisible(true);
        lbBurritoChimichanga.setVisible(false);
        lbPorkBurrito.setVisible(false);
        lbBigCheddarBurrito.setVisible(false);
        lbChickenBurrito.setVisible(false);
        lbBurritos.setVisible(false);
        cbSelectBurrito.setVisible(false);
        jsQuantity.setVisible(false);
        btnAdd.setVisible(false);
    }
    public JButton getBtnAdd() {
        return this.btnAdd;
    }

    public JComboBox<String> getCbSelectBurrito() {
        JComboBox<String> cbSelectBurrito = null;
        return cbSelectBurrito;
    }
    public String getTipo(){
        return this.cbSelectBurrito.getSelectedItem().toString();
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
        lbNameBurritos = new javax.swing.JLabel();
        lbBackgroundRed1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cbSelectBurrito = new javax.swing.JComboBox<>();
        jsQuantity = new javax.swing.JSpinner();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbBurritoBowl = new javax.swing.JLabel();
        lbBurritoChimichanga = new javax.swing.JLabel();
        lbPorkBurrito = new javax.swing.JLabel();
        lbBigCheddarBurrito = new javax.swing.JLabel();
        lbChickenBurrito = new javax.swing.JLabel();
        lbBurritos = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(149, 38, 36));
        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(238, 236, 208));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 60, 40));

        lbNameBurritos.setBackground(new java.awt.Color(255, 255, 255));
        lbNameBurritos.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameBurritos.setForeground(new java.awt.Color(238, 236, 208));
        lbNameBurritos.setText("Burritos");
        getContentPane().add(lbNameBurritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 510, 39));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText(">");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 50, -1));

        btnPrevious.setBackground(new java.awt.Color(149, 38, 36));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(238, 236, 208));
        btnPrevious.setText("<");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setFocusPainted(false);
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, -1));

        btnAdd.setBackground(new java.awt.Color(149, 38, 36));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(238, 236, 208));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 60, 30));

        cbSelectBurrito.setBackground(new java.awt.Color(102, 38, 36));
        cbSelectBurrito.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbSelectBurrito.setForeground(new java.awt.Color(238, 236, 208));
        cbSelectBurrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Burrito", "Burrito Bowl", "Burrito Chimichanga", "Pork Burrito", "Big Cheddar Burrito", "Chicken Burrito" }));
        cbSelectBurrito.setBorder(null);
        cbSelectBurrito.setFocusable(false);
        cbSelectBurrito.setRequestFocusEnabled(false);
        getContentPane().add(cbSelectBurrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 210, 30));

        jsQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jsQuantity.setFocusable(false);
        jsQuantity.setOpaque(true);
        getContentPane().add(jsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, 30));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 560, 60));

        lbBurritoBowl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Burrito bowl.jpg"))); // NOI18N
        getContentPane().add(lbBurritoBowl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 400));

        lbBurritoChimichanga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Burrito chimichanga.jpg"))); // NOI18N
        getContentPane().add(lbBurritoChimichanga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 400));

        lbPorkBurrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pork burrito.jpg"))); // NOI18N
        getContentPane().add(lbPorkBurrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 400));

        lbBigCheddarBurrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/big cheddar.jpg"))); // NOI18N
        getContentPane().add(lbBigCheddarBurrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 400));

        lbChickenBurrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chicken burrito.jpg"))); // NOI18N
        getContentPane().add(lbChickenBurrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 400));

        lbBurritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Burritos.png"))); // NOI18N
        getContentPane().add(lbBurritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

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
    private javax.swing.JComboBox<String> cbSelectBurrito;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbBigCheddarBurrito;
    private javax.swing.JLabel lbBurritoBowl;
    private javax.swing.JLabel lbBurritoChimichanga;
    private javax.swing.JLabel lbBurritos;
    private javax.swing.JLabel lbChickenBurrito;
    private javax.swing.JLabel lbNameBurritos;
    private javax.swing.JLabel lbPorkBurrito;
    // End of variables declaration//GEN-END:variables
}
