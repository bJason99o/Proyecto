/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import ucr.ac.cr.model.Meals;

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
        disableTxt();
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(true);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(true);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(true);
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
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(true);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(true);
            txtPrice4.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(true);
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
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
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
        lbId.setVisible(true);
        lbPrice.setVisible(true);
        txtIdMeal.setVisible(true);
        txtIdMeal1.setVisible(false);
        txtIdMeal2.setVisible(false);
        txtIdMeal3.setVisible(false);
        txtIdMeal4.setVisible(false);
        txtPrice.setVisible(true);
        txtPrice1.setVisible(false);
        txtPrice2.setVisible(false);
        txtPrice3.setVisible(false);
        txtPrice4.setVisible(false);
    }

    public JButton getBtnAdd() {
        return this.btnAdd;
    }

    public JComboBox<String> getCbSelectBurrito() {
        JComboBox<String> cbSelectBurrito = null;
        return cbSelectBurrito;
    }

    public String getTipo() {
        return this.cbSelectBurrito.getSelectedItem().toString();
    }

    public void disableTxt() {
        this.txtIdMeal.setEnabled(false);
        this.txtIdMeal1.setEnabled(false);
        this.txtIdMeal2.setEnabled(false);
        this.txtIdMeal3.setEnabled(false);
        this.txtIdMeal4.setEnabled(false);
        this.txtPrice.setEnabled(false);
        this.txtPrice1.setEnabled(false);
        this.txtPrice2.setEnabled(false);
        this.txtPrice3.setEnabled(false);
        this.txtPrice4.setEnabled(false);
    }
    
    public void clean(){
        cbSelectBurrito.setSelectedIndex(0);
        jsQuantity.setValue(0);
    }

    public Meals getProduct() {
        Meals meal = null;
        String selectedItem = cbSelectBurrito.getSelectedItem() != null ? cbSelectBurrito.getSelectedItem().toString() : "";

        if ("Burrito Bowl".equals(selectedItem)) {
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
        }else if ("Burrito Chimichanga".equals(selectedItem)) {
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
        }else if ("Pork Burrito".equals(selectedItem)) {
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
        }else if ("Big Cheddar Burrito".equals(selectedItem)) {
            try {
                String id = txtIdMeal3.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice3.getText());

                meal = new Meals(id, name, quantity, price);
            } catch (NumberFormatException e) {
                // Manejar la excepción si ocurre un error al convertir a números
                e.printStackTrace(); // Otra acción según sea necesario
            }
        }else if ("Chicken Burrito".equals(selectedItem)) {
            try {
                String id = txtIdMeal4.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice4.getText());

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
        lbPrice = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbNameBurritos = new javax.swing.JLabel();
        lbBackgroundRed1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtIdMeal4 = new javax.swing.JFormattedTextField();
        txtPrice4 = new javax.swing.JFormattedTextField();
        txtIdMeal3 = new javax.swing.JFormattedTextField();
        txtPrice3 = new javax.swing.JFormattedTextField();
        txtIdMeal2 = new javax.swing.JFormattedTextField();
        txtPrice2 = new javax.swing.JFormattedTextField();
        txtIdMeal1 = new javax.swing.JFormattedTextField();
        txtPrice1 = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        txtIdMeal = new javax.swing.JFormattedTextField();
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

        lbPrice.setBackground(new java.awt.Color(255, 255, 255));
        lbPrice.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(238, 236, 208));
        lbPrice.setText("Price:");
        getContentPane().add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 70, 30));

        lbId.setBackground(new java.awt.Color(255, 255, 255));
        lbId.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbId.setForeground(new java.awt.Color(238, 236, 208));
        lbId.setText("ID:");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 30, 30));

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

        txtIdMeal4.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal4.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal4.setText("1-05");
        txtIdMeal4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

        txtPrice4.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice4.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice4.setText("13.00");
        txtPrice4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 30));

        txtIdMeal3.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal3.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal3.setText("1-04");
        txtIdMeal3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

        txtPrice3.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice3.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice3.setText("12.00");
        txtPrice3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 30));

        txtIdMeal2.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal2.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal2.setText("1-03");
        txtIdMeal2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

        txtPrice2.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice2.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice2.setText("11.50");
        txtPrice2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 30));

        txtIdMeal1.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal1.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal1.setText("1-02");
        txtIdMeal1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

        txtPrice1.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice1.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice1.setText("11.00");
        txtPrice1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 30));

        txtPrice.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice.setText("10.50");
        txtPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, 30));

        txtIdMeal.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal.setText("1-01");
        txtIdMeal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

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

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice1ActionPerformed

    private void txtPrice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice2ActionPerformed

    private void txtPrice3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice3ActionPerformed

    private void txtPrice4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice4ActionPerformed

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
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNameBurritos;
    private javax.swing.JLabel lbPorkBurrito;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JFormattedTextField txtIdMeal;
    private javax.swing.JFormattedTextField txtIdMeal1;
    private javax.swing.JFormattedTextField txtIdMeal2;
    private javax.swing.JFormattedTextField txtIdMeal3;
    private javax.swing.JFormattedTextField txtIdMeal4;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtPrice1;
    private javax.swing.JFormattedTextField txtPrice2;
    private javax.swing.JFormattedTextField txtPrice3;
    private javax.swing.JFormattedTextField txtPrice4;
    // End of variables declaration//GEN-END:variables
}
