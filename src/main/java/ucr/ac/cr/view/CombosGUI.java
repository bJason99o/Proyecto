/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.view;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.model.Meals;

/**
 *
 * @author Jason
 */
public class CombosGUI extends javax.swing.JFrame {

    private int combo;

    /**
     * Creates new form CombosGUI
     */
    public CombosGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        combo = 1;
        inicio();
        disableTxt();
    }

    public int getCantidad() {

        int cantidad = (int) jsQuantity.getValue();
        return cantidad;

    }

    public void listen(ActionListener controller) {
        this.btnExit.addActionListener(controller);
        this.btnNext.addActionListener(controller);
        this.btnPrevious.addActionListener(controller);
        this.btnAdd.addActionListener(controller);
    }

    public void nextCombo() {
        combo++;

        if (combo == 1) {
            inicio();
        }
        if (combo == 2) {
            lbNameCombos.setText("Combo 2");
            lbCombo1.setVisible(false);
            lbCombo2.setVisible(true);
            lbCombo3.setVisible(false);
            lbCombos.setVisible(false);
            btnAdd.setVisible(false);
            cbSelectCombos.setVisible(false);
            jsQuantity.setVisible(false);
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
        }
        if (combo == 3) {
            lbNameCombos.setText("Combo 3");
            lbCombo1.setVisible(false);
            lbCombo2.setVisible(false);
            lbCombo3.setVisible(true);
            lbCombos.setVisible(false);
            btnAdd.setVisible(false);
            cbSelectCombos.setVisible(false);
            jsQuantity.setVisible(false);
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
        }
        if (combo == 4) {
            lbNameCombos.setText("Select Combo");
            lbCombo1.setVisible(false);
            lbCombo2.setVisible(false);
            lbCombo3.setVisible(false);
            lbCombos.setVisible(true);
            btnAdd.setVisible(true);
            cbSelectCombos.setVisible(true);
            jsQuantity.setVisible(true);
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
        }
        if (combo == 5) {
            inicio();
            combo = 1;
        }

    }

    public void previousCombo() {
        combo--;

        if (combo == 0) {
            combo = 4;
        }

        if (combo == 1) {
            inicio();
        }
        if (combo == 2) {
            lbNameCombos.setText("Combo 2");
            lbCombo1.setVisible(false);
            lbCombo2.setVisible(true);
            lbCombo3.setVisible(false);
            lbCombos.setVisible(false);
            btnAdd.setVisible(false);
            cbSelectCombos.setVisible(false);
            jsQuantity.setVisible(false);
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
        }
        if (combo == 3) {
            lbNameCombos.setText("Combo 3");
            lbCombo1.setVisible(false);
            lbCombo2.setVisible(false);
            lbCombo3.setVisible(true);
            lbCombos.setVisible(false);
            btnAdd.setVisible(false);
            cbSelectCombos.setVisible(false);
            jsQuantity.setVisible(false);
             lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
        }
        if (combo == 4) {
            lbNameCombos.setText("Select Combo");
            lbCombo1.setVisible(false);
            lbCombo2.setVisible(false);
            lbCombo3.setVisible(false);
            lbCombos.setVisible(true);
            btnAdd.setVisible(true);
            cbSelectCombos.setVisible(true);
            jsQuantity.setVisible(true);
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
        }
        if (combo == 5) {
            inicio();
            combo = 1;
        }
    }

    public void inicio() {
        lbNameCombos.setText("Combo 1");
        lbCombo1.setVisible(true);
        lbCombo2.setVisible(false);
        lbCombo3.setVisible(false);
        lbCombos.setVisible(false);
        btnAdd.setVisible(false);
        cbSelectCombos.setVisible(false);
        jsQuantity.setVisible(false);
        lbId.setVisible(true);
        lbPrice.setVisible(true);
        txtIdMeal.setVisible(true);
        txtIdMeal1.setVisible(false);
        txtIdMeal2.setVisible(false);
        txtPrice.setVisible(true);
        txtPrice1.setVisible(false);
        txtPrice2.setVisible(false);
    }
    public void clean(){
        cbSelectCombos.setSelectedIndex(0);
        jsQuantity.setValue(0);
    }

    public String getTipo() {
        return this.cbSelectCombos.getSelectedItem().toString();
    }
    
      public void disableTxt() {
        this.txtIdMeal.setEnabled(false);
        this.txtIdMeal1.setEnabled(false);
        this.txtIdMeal2.setEnabled(false);
      
        this.txtPrice.setEnabled(false);
        this.txtPrice1.setEnabled(false);
        this.txtPrice2.setEnabled(false);
       
    }

    public Meals getProduct() {
        Meals meal = null;
        String selectedItem = cbSelectCombos.getSelectedItem() != null ? cbSelectCombos.getSelectedItem().toString() : "";

        if ("Combo 1".equals(selectedItem)) {
            try {
                String id = txtIdMeal.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice.getText());

                meal = new Meals(id, name, quantity, price);
            } catch (NumberFormatException e) {
                // Manejar la excepción si ocurre un error al convertir a números
                e.printStackTrace(); // Otra acción según sea necesario
            }
        } else if ("Combo 2".equals(selectedItem)) {
            try {
                String id = txtIdMeal1.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice1.getText());

                meal = new Meals(id, name, quantity, price);
            } catch (NumberFormatException e) {
                // Manejar la excepción si ocurre un error al convertir a números
                e.printStackTrace(); // Otra acción según sea necesario
            }
        } else if ("Combo 3".equals(selectedItem)) {
            try {
                String id = txtIdMeal2.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice2.getText());

                meal = new Meals(id, name, quantity, price);
            } catch (NumberFormatException e) {
                // Manejar la excepción si ocurre un error al convertir a números
                e.printStackTrace(); // Otra acción según sea necesario
            }
        } else {
            // Lógica para otros tipos de burritos o cuando no se selecciona "Burrito bowl"
            // Por ejemplo, podrías mostrar un mensaje de error o simplemente crear un objeto Meals vacío
            JOptionPane.showMessageDialog(null, "Seleccione un burrito válido.");
            // Crear un objeto Meals vacío
            meal = new Meals("", "", 0, 0.0);
        }

        return meal;
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
        lbNameCombos = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lbId = new javax.swing.JLabel();
        txtIdMeal2 = new javax.swing.JFormattedTextField();
        txtPrice2 = new javax.swing.JFormattedTextField();
        txtIdMeal1 = new javax.swing.JFormattedTextField();
        txtPrice1 = new javax.swing.JFormattedTextField();
        txtIdMeal = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        lbPrice = new javax.swing.JLabel();
        cbSelectCombos = new javax.swing.JComboBox<>();
        jsQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        lbBackgroundRed1 = new javax.swing.JLabel();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbCombo1 = new javax.swing.JLabel();
        lbCombo2 = new javax.swing.JLabel();
        lbCombo3 = new javax.swing.JLabel();
        lbCombos = new javax.swing.JLabel();
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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 60, 40));

        lbNameCombos.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameCombos.setForeground(new java.awt.Color(238, 236, 208));
        lbNameCombos.setText("Combos");
        getContentPane().add(lbNameCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 450, 40));

        btnPrevious.setBackground(new java.awt.Color(149, 38, 36));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(238, 236, 208));
        btnPrevious.setText("<");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setFocusPainted(false);
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 50, -1));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText(">");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 50, -1));

        lbId.setBackground(new java.awt.Color(255, 255, 255));
        lbId.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbId.setForeground(new java.awt.Color(238, 236, 208));
        lbId.setText("ID:");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 30, 30));

        txtIdMeal2.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal2.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal2.setText("5-03");
        txtIdMeal2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 30));

        txtPrice2.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice2.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice2.setText("21.50");
        txtPrice2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 30));

        txtIdMeal1.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal1.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal1.setText("5-02");
        txtIdMeal1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 30));

        txtPrice1.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice1.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice1.setText("21.00");
        txtPrice1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 30));

        txtIdMeal.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal.setText("5-01");
        txtIdMeal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, 30));

        txtPrice.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice.setText("20.50");
        txtPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 30));

        lbPrice.setBackground(new java.awt.Color(255, 255, 255));
        lbPrice.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(238, 236, 208));
        lbPrice.setText("Price:");
        getContentPane().add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 70, 30));

        cbSelectCombos.setBackground(new java.awt.Color(102, 38, 36));
        cbSelectCombos.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbSelectCombos.setForeground(new java.awt.Color(238, 236, 208));
        cbSelectCombos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Combo", "Combo 1", "Combo 2", "Combo 3" }));
        cbSelectCombos.setBorder(null);
        cbSelectCombos.setFocusable(false);
        cbSelectCombos.setRequestFocusEnabled(false);
        getContentPane().add(cbSelectCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 210, 30));

        jsQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jsQuantity.setFocusable(false);
        jsQuantity.setOpaque(true);
        getContentPane().add(jsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 60, 30));

        btnAdd.setBackground(new java.awt.Color(149, 38, 36));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(238, 236, 208));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 60, 30));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 550, 60));

        lbCombo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 1.jpg"))); // NOI18N
        getContentPane().add(lbCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 450));

        lbCombo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 2.jpg"))); // NOI18N
        getContentPane().add(lbCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 450));

        lbCombo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 3.jpg"))); // NOI18N
        getContentPane().add(lbCombo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lbCombos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Combos.png"))); // NOI18N
        getContentPane().add(lbCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice1ActionPerformed

    private void txtPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> cbSelectCombos;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbCombo1;
    private javax.swing.JLabel lbCombo2;
    private javax.swing.JLabel lbCombo3;
    private javax.swing.JLabel lbCombos;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNameCombos;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JFormattedTextField txtIdMeal;
    private javax.swing.JFormattedTextField txtIdMeal1;
    private javax.swing.JFormattedTextField txtIdMeal2;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtPrice1;
    private javax.swing.JFormattedTextField txtPrice2;
    // End of variables declaration//GEN-END:variables
}
