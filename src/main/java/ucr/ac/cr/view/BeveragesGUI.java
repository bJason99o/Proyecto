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
public class BeveragesGUI extends javax.swing.JFrame {

    /**
     * Creates new form BeveragesGUI
     */
    private int beverage;

    public BeveragesGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        inicio();
        beverage = 1;
    }

    public void listen(ActionListener controller) {
        this.btnExit.addActionListener(controller);
        this.btnNext.addActionListener(controller);
        this.btnPrevious.addActionListener(controller);
        this.btnAdd.addActionListener(controller);
    }

    public void nextBeverage() {
        beverage++;

        if (beverage == 1) {
            inicio();
        }
        if (beverage == 2) {
            lbNameBeverages.setText("Jarritos Guayaba");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(true);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 3) {
            lbNameBeverages.setText("Jarritos Tamarind");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(true);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);

        }
        if (beverage == 4) {
            lbNameBeverages.setText("Jarritos Mandarin");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(true);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);

        }
        if (beverage == 5) {
            lbNameBeverages.setText("Sparkling Lemonade");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(true);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);

        }
        if (beverage == 6) {
            lbNameBeverages.setText("Creamy Red Birch Beer");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(true);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);

        }
        if (beverage == 7) {
            lbNameBeverages.setText("Root Beer");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(true);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);

        }

        if (beverage == 8) {
            lbNameBeverages.setText("Black Cherry");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(true);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);

        }
        if (beverage == 9) {
            lbNameBeverages.setText("Select Beverage");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(true);
            lbBeveragesTwo.setVisible(true);
            cbSelectBeverage.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
        }
        if (beverage == 10) {
            inicio();
            beverage = 1;
        }

    }

    public void previousBeverage() {
        beverage--;

        if (beverage == 0) {
            beverage = 9; // Si beverage llega a 0, lo reiniciamos a 9 para retroceder desde el principio
        }

        if (beverage == 1) {
            inicio();
        }
        if (beverage == 2) {
            lbNameBeverages.setText("Jarritos Guayaba");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(true);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 3) {
            lbNameBeverages.setText("Jarritos Tamarind");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(true);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 4) {
            lbNameBeverages.setText("Jarritos Mandarin");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(true);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 5) {
            lbNameBeverages.setText("Sparkling Lemonade");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(true);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 6) {
            lbNameBeverages.setText("Creamy Red Birch Beer");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(true);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 7) {
            lbNameBeverages.setText("Root Beer");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(true);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
        if (beverage == 8) {
            lbNameBeverages.setText("Black Cherry");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(true);
            lbBeveragesOne.setVisible(false);
            lbBeveragesTwo.setVisible(false);
            cbSelectBeverage.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
        }
         if (beverage == 9) {
            lbNameBeverages.setText("Select Beverage");
            lbCocaCola.setVisible(false);
            lbJarritosGuayaba.setVisible(false);
            lbJarritosTamarind.setVisible(false);
            lbJarritosMandarin.setVisible(false);
            lbSparklingLemonade.setVisible(false);
            lbCreamyRedBirchBeer.setVisible(false);
            lbRootBeer.setVisible(false);
            lbBlackCherry.setVisible(false);
            lbBeveragesOne.setVisible(true);
            lbBeveragesTwo.setVisible(true);
            cbSelectBeverage.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
        }
        if (beverage == 10) {
            inicio();
            beverage = 1;
        }
    }

    public void inicio() {
        lbNameBeverages.setText("Coca Cola");
        lbCocaCola.setVisible(true);
        lbJarritosGuayaba.setVisible(false);
        lbJarritosTamarind.setVisible(false);
        lbJarritosMandarin.setVisible(false);
        lbSparklingLemonade.setVisible(false);
        lbCreamyRedBirchBeer.setVisible(false);
        lbRootBeer.setVisible(false);
        lbBlackCherry.setVisible(false);
        lbBeveragesOne.setVisible(false);
        lbBeveragesTwo.setVisible(false);
        cbSelectBeverage.setVisible(false);
        jsQuantity.setVisible(false);
        btnAdd.setVisible(false);
    }
    public String getTipo(){
        return this.cbSelectBeverage.getSelectedItem().toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBeveragesOne = new javax.swing.JLabel();
        lbBeveragesTwo = new javax.swing.JLabel();
        lbCocaCola = new javax.swing.JLabel();
        lbJarritosGuayaba = new javax.swing.JLabel();
        lbJarritosTamarind = new javax.swing.JLabel();
        lbJarritosMandarin = new javax.swing.JLabel();
        lbSparklingLemonade = new javax.swing.JLabel();
        lbCreamyRedBirchBeer = new javax.swing.JLabel();
        lbRootBeer = new javax.swing.JLabel();
        lbBlackCherry = new javax.swing.JLabel();
        lbNameBeverages = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cbSelectBeverage = new javax.swing.JComboBox<>();
        jsQuantity = new javax.swing.JSpinner();
        lbBackgroundRed1 = new javax.swing.JLabel();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBeveragesOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BeveragesOne.png"))); // NOI18N
        getContentPane().add(lbBeveragesOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 66, 280, 270));

        lbBeveragesTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BeveragesTwo.png"))); // NOI18N
        getContentPane().add(lbBeveragesTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 260));

        lbCocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fotografia(1).jpg"))); // NOI18N
        getContentPane().add(lbCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 490));

        lbJarritosGuayaba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/f3d8d4674cd1499e9d6a0a351282f1ec(1).jpg"))); // NOI18N
        getContentPane().add(lbJarritosGuayaba, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 490));

        lbJarritosTamarind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3d59249743492da426a23202f5203a9f_2(1).jpg"))); // NOI18N
        lbJarritosTamarind.setText("jLabel1");
        getContentPane().add(lbJarritosTamarind, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, 490));

        lbJarritosMandarin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/65a1c646-7aa5-48df-967f-1a7175348623(2).png"))); // NOI18N
        getContentPane().add(lbJarritosMandarin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, 490));

        lbSparklingLemonade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boylan-lemonade-banner(2).png"))); // NOI18N
        getContentPane().add(lbSparklingLemonade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 280, 490));

        lbCreamyRedBirchBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boylan-red-birth-banner(1).png"))); // NOI18N
        getContentPane().add(lbCreamyRedBirchBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 280, 490));

        lbRootBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boylan-root-beer.png"))); // NOI18N
        getContentPane().add(lbRootBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 280, 490));

        lbBlackCherry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/black-cherry-boylan_1.png"))); // NOI18N
        getContentPane().add(lbBlackCherry, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 280, 490));

        lbNameBeverages.setBackground(new java.awt.Color(255, 255, 255));
        lbNameBeverages.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameBeverages.setForeground(new java.awt.Color(238, 236, 208));
        lbNameBeverages.setText("Beverages");
        getContentPane().add(lbNameBeverages, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 410, 39));

        btnPrevious.setBackground(new java.awt.Color(149, 38, 36));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(238, 236, 208));
        btnPrevious.setText("<");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setFocusPainted(false);
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 50, -1));

        btnExit.setBackground(new java.awt.Color(149, 38, 36));
        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(238, 236, 208));
        btnExit.setText("X");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 60, 40));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText(">");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 50, -1));

        btnAdd.setBackground(new java.awt.Color(149, 38, 36));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(238, 236, 208));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, 60, 30));

        cbSelectBeverage.setBackground(new java.awt.Color(102, 38, 36));
        cbSelectBeverage.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbSelectBeverage.setForeground(new java.awt.Color(238, 236, 208));
        cbSelectBeverage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Beverage", "Coca Cola", "Jarritos Guayaba", "Jarritos Tamarind", "Jarritos Mandarin", "Sparkling Lemonade", "Creamy Red Birch Beer", "Root Beer", "BlackCherry" }));
        cbSelectBeverage.setBorder(null);
        cbSelectBeverage.setFocusable(false);
        cbSelectBeverage.setRequestFocusEnabled(false);
        getContentPane().add(cbSelectBeverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 230, 30));

        jsQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jsQuantity.setFocusable(false);
        jsQuantity.setOpaque(true);
        getContentPane().add(jsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 60, 30));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 520, 60));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 60));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 520, 550));

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
    private javax.swing.JComboBox<String> cbSelectBeverage;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbBeveragesOne;
    private javax.swing.JLabel lbBeveragesTwo;
    private javax.swing.JLabel lbBlackCherry;
    private javax.swing.JLabel lbCocaCola;
    private javax.swing.JLabel lbCreamyRedBirchBeer;
    private javax.swing.JLabel lbJarritosGuayaba;
    private javax.swing.JLabel lbJarritosMandarin;
    private javax.swing.JLabel lbJarritosTamarind;
    private javax.swing.JLabel lbNameBeverages;
    private javax.swing.JLabel lbRootBeer;
    private javax.swing.JLabel lbSparklingLemonade;
    // End of variables declaration//GEN-END:variables
}
