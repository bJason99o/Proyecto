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
        disableTxt();
    }

    public int getCantidad() {

        int cantidad = (int) jsQuantity.getValue();
        return cantidad;

    }

    public void clean() {
        cbSelectTaco.setSelectedIndex(0);
        jsQuantity.setValue(0);
    }

    public void disableTxt() {
        this.txtIdMeal.setEnabled(false);
        this.txtIdMeal1.setEnabled(false);
        this.txtIdMeal2.setEnabled(false);
        this.txtIdMeal3.setEnabled(false);

        this.txtPrice.setEnabled(false);
        this.txtPrice1.setEnabled(false);
        this.txtPrice2.setEnabled(false);
        this.txtPrice3.setEnabled(false);

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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtIdMeal3.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
            txtPrice3.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(true);
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
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtIdMeal3.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
            txtPrice3.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(true);
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
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
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
        lbId.setVisible(true);
        lbPrice.setVisible(true);
        txtIdMeal.setVisible(true);
        txtIdMeal1.setVisible(false);
        txtIdMeal2.setVisible(false);
        txtIdMeal3.setVisible(false);
        txtPrice.setVisible(true);
        txtPrice1.setVisible(false);
        txtPrice2.setVisible(false);
        txtPrice3.setVisible(false);
    }

    public String getTipo() {
        return this.cbSelectTaco.getSelectedItem().toString();
    }

    public Meals getProduct() {
        Meals meal = null;
        String selectedItem = cbSelectTaco.getSelectedItem() != null ? cbSelectTaco.getSelectedItem().toString() : "";

        if ("Potato Taco".equals(selectedItem)) {
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
        } else if ("Space Rancher".equals(selectedItem)) {
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
        } else if ("Blue Berry Filds".equals(selectedItem)) {
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
        } else if ("Pig Taco".equals(selectedItem)) {
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
        lbNameTaco = new javax.swing.JLabel();
        txtPrice3 = new javax.swing.JFormattedTextField();
        txtIdMeal3 = new javax.swing.JFormattedTextField();
        txtIdMeal2 = new javax.swing.JFormattedTextField();
        txtPrice2 = new javax.swing.JFormattedTextField();
        txtIdMeal1 = new javax.swing.JFormattedTextField();
        txtPrice1 = new javax.swing.JFormattedTextField();
        txtPrice = new javax.swing.JFormattedTextField();
        txtIdMeal = new javax.swing.JFormattedTextField();
        lbId = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        cbSelectTaco = new javax.swing.JComboBox<>();
        jsQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        lbBackgroundRed1 = new javax.swing.JLabel();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbPotatoTaco = new javax.swing.JLabel();
        lbSpaceRancher = new javax.swing.JLabel();
        lbBlueBerryFilds = new javax.swing.JLabel();
        lbPigTaco = new javax.swing.JLabel();
        lbTacos = new javax.swing.JLabel();
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

        txtPrice3.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice3.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice3.setText("9.50");
        txtPrice3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 30));

        txtIdMeal3.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal3.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal3.setText("2-04");
        txtIdMeal3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 30));

        txtIdMeal2.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal2.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal2.setText("2-03");
        txtIdMeal2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 30));

        txtPrice2.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice2.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice2.setText("9.00");
        txtPrice2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 30));

        txtIdMeal1.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal1.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal1.setText("2-02");
        txtIdMeal1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 30));

        txtPrice1.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice1.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice1.setText("7.00");
        txtPrice1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 30));

        txtPrice.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice.setText("7.00");
        txtPrice.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, 30));

        txtIdMeal.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal.setText("2-01");
        txtIdMeal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, 30));

        lbId.setBackground(new java.awt.Color(255, 255, 255));
        lbId.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbId.setForeground(new java.awt.Color(238, 236, 208));
        lbId.setText("ID:");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 30, 30));

        lbPrice.setBackground(new java.awt.Color(255, 255, 255));
        lbPrice.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(238, 236, 208));
        lbPrice.setText("Price:");
        getContentPane().add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 70, 30));

        btnPrevious.setBackground(new java.awt.Color(149, 38, 36));
        btnPrevious.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(238, 236, 208));
        btnPrevious.setText("<");
        btnPrevious.setBorder(null);
        btnPrevious.setBorderPainted(false);
        btnPrevious.setFocusPainted(false);
        getContentPane().add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 50, -1));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText(">");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 50, -1));

        cbSelectTaco.setBackground(new java.awt.Color(102, 38, 36));
        cbSelectTaco.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cbSelectTaco.setForeground(new java.awt.Color(238, 236, 208));
        cbSelectTaco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Taco", "Potato Taco", "Space Rancher", "Blue Berry Filds", "Pig Taco" }));
        cbSelectTaco.setBorder(null);
        cbSelectTaco.setFocusable(false);
        cbSelectTaco.setRequestFocusEnabled(false);
        getContentPane().add(cbSelectTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 210, 30));

        jsQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jsQuantity.setFocusable(false);
        jsQuantity.setOpaque(true);
        getContentPane().add(jsQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 60, 30));

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
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 550, 70));

        lbPotatoTaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/potatoTaco.jpeg"))); // NOI18N
        getContentPane().add(lbPotatoTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbSpaceRancher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Space Rancher_taco.jpg"))); // NOI18N
        getContentPane().add(lbSpaceRancher, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbBlueBerryFilds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Blueberryfilds_taco.jpg"))); // NOI18N
        getContentPane().add(lbBlueBerryFilds, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbPigTaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pig taco.jpg"))); // NOI18N
        getContentPane().add(lbPigTaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbTacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tacos.png"))); // NOI18N
        getContentPane().add(lbTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 390));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 540));

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
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNameTaco;
    private javax.swing.JLabel lbPigTaco;
    private javax.swing.JLabel lbPotatoTaco;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbSpaceRancher;
    private javax.swing.JLabel lbTacos;
    private javax.swing.JFormattedTextField txtIdMeal;
    private javax.swing.JFormattedTextField txtIdMeal1;
    private javax.swing.JFormattedTextField txtIdMeal2;
    private javax.swing.JFormattedTextField txtIdMeal3;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtPrice1;
    private javax.swing.JFormattedTextField txtPrice2;
    private javax.swing.JFormattedTextField txtPrice3;
    // End of variables declaration//GEN-END:variables
}
