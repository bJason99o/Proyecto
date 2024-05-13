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
public class DessertsGUI extends javax.swing.JFrame {

    private int dessert;

    /**
     * Creates new form DessertsGUI
     */
    public DessertsGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        dessert = 1;
        inicio();
        disableTxt();
    }

    public int getCantidad() {

        int cantidad = (int) jsQuantity.getValue();
        return cantidad;

    }

    public void listen(ActionListener controller) {
        this.btnExit.addActionListener(controller);
        this.btnAdd.addActionListener(controller);
        this.btnNext.addActionListener(controller);
        this.btnPrevious.addActionListener(controller);
    }

    public void nextDessert() {
        dessert++;

        if (dessert == 1) {
            inicio();
        }
        if (dessert == 2) {
            lbNameDesserts.setText("Napoleon");
            lbChesscurds.setVisible(false);
            lbNapoleon.setVisible(true);
            lbDesserts.setVisible(false);
            cbSelectDesserts.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
        }
        if (dessert == 3) {
            lbNameDesserts.setText("Select Dessert");
            lbChesscurds.setVisible(false);
            lbNapoleon.setVisible(false);
            lbDesserts.setVisible(true);
            cbSelectDesserts.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
        }
        if (dessert == 4) {
            inicio();
            dessert = 1;
        }

    }

    public void previousDessert() {
        dessert--;

        if (dessert == 0) {
            dessert = 3;
        }

        if (dessert == 1) {
            inicio();
        }
        if (dessert == 2) {
            lbNameDesserts.setText("Napoleon");
            lbChesscurds.setVisible(false);
            lbNapoleon.setVisible(true);
            lbDesserts.setVisible(false);
            cbSelectDesserts.setVisible(false);
            jsQuantity.setVisible(false);
            btnAdd.setVisible(false);
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
        }
        if (dessert == 3) {
            lbNameDesserts.setText("Select Dessert");
            lbChesscurds.setVisible(false);
            lbNapoleon.setVisible(false);
            lbDesserts.setVisible(true);
            cbSelectDesserts.setVisible(true);
            jsQuantity.setVisible(true);
            btnAdd.setVisible(true);
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
        }
        if (dessert == 4) {
            inicio();
            dessert = 1;
        }
    }

    public void inicio() {
        lbNameDesserts.setText("Chesscurds");
        lbChesscurds.setVisible(true);
        lbNapoleon.setVisible(false);
        lbDesserts.setVisible(false);
        cbSelectDesserts.setVisible(false);
        jsQuantity.setVisible(false);
        btnAdd.setVisible(false);
        lbId.setVisible(true);
        lbPrice.setVisible(true);
        txtIdMeal.setVisible(true);
        txtIdMeal1.setVisible(false);
        txtPrice.setVisible(true);
        txtPrice1.setVisible(false);
    }

    public void clean() {
        cbSelectDesserts.setSelectedIndex(0);
        jsQuantity.setValue(0);
    }

    public void disableTxt() {
        this.txtIdMeal.setEnabled(false);
        this.txtIdMeal1.setEnabled(false);

        this.txtPrice.setEnabled(false);
        this.txtPrice1.setEnabled(false);

    }

    public String getTipo() {
        return this.cbSelectDesserts.getSelectedItem().toString();
    }

    public Meals getProduct() {
        Meals meal = null;
        String selectedItem = cbSelectDesserts.getSelectedItem() != null ? cbSelectDesserts.getSelectedItem().toString() : "";

        if ("Chesscurds".equals(selectedItem)) {
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
        } else if ("Napoleon".equals(selectedItem)) {
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
        lbNameDesserts = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lbId = new javax.swing.JLabel();
        txtIdMeal1 = new javax.swing.JFormattedTextField();
        txtPrice1 = new javax.swing.JFormattedTextField();
        txtIdMeal = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        lbPrice = new javax.swing.JLabel();
        cbSelectDesserts = new javax.swing.JComboBox<>();
        jsQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        lbBackgroundRed1 = new javax.swing.JLabel();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbChesscurds = new javax.swing.JLabel();
        lbNapoleon = new javax.swing.JLabel();
        lbDesserts = new javax.swing.JLabel();
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

        lbNameDesserts.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameDesserts.setForeground(new java.awt.Color(238, 236, 208));
        lbNameDesserts.setText("Desserts");
        getContentPane().add(lbNameDesserts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 440, 40));

        btnPrevious.setBackground(new java.awt.Color(149, 38, 36));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(238, 236, 208));
        btnPrevious.setText("<");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setFocusPainted(false);
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 50, -1));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText(">");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 50, -1));

        lbId.setBackground(new java.awt.Color(255, 255, 255));
        lbId.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbId.setForeground(new java.awt.Color(238, 236, 208));
        lbId.setText("ID:");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 30, 30));

        txtIdMeal1.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal1.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal1.setText("4-02");
        txtIdMeal1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 30));

        txtPrice1.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice1.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice1.setText("6.00");
        txtPrice1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 30));

        txtIdMeal.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal.setText("4-01");
        txtIdMeal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 30));

        txtPrice.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice.setText("5.00");
        txtPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 30));

        lbPrice.setBackground(new java.awt.Color(255, 255, 255));
        lbPrice.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(238, 236, 208));
        lbPrice.setText("Price:");
        getContentPane().add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 70, 30));

        cbSelectDesserts.setBackground(new java.awt.Color(102, 38, 36));
        cbSelectDesserts.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbSelectDesserts.setForeground(new java.awt.Color(238, 236, 208));
        cbSelectDesserts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Dessert", "Chesscurds", "Napoleon" }));
        cbSelectDesserts.setBorder(null);
        cbSelectDesserts.setFocusable(false);
        cbSelectDesserts.setRequestFocusEnabled(false);
        getContentPane().add(cbSelectDesserts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 210, 30));

        jsQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jsQuantity.setFocusable(false);
        jsQuantity.setOpaque(true);
        getContentPane().add(jsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 60, 30));

        btnAdd.setBackground(new java.awt.Color(149, 38, 36));
        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(238, 236, 208));
        btnAdd.setText("Add");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 60, 30));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 60));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 560, 60));

        lbChesscurds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chesscurds.jpg"))); // NOI18N
        getContentPane().add(lbChesscurds, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        lbNapoleon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Napoleón.jpg"))); // NOI18N
        getContentPane().add(lbNapoleon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        lbDesserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Desserts.png"))); // NOI18N
        getContentPane().add(lbDesserts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> cbSelectDesserts;
    private javax.swing.JSpinner jsQuantity;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbChesscurds;
    private javax.swing.JLabel lbDesserts;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNameDesserts;
    private javax.swing.JLabel lbNapoleon;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JFormattedTextField txtIdMeal;
    private javax.swing.JFormattedTextField txtIdMeal1;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtPrice1;
    // End of variables declaration//GEN-END:variables
}
