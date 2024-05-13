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
        disableTxt();
        beverage = 1;
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

    public void disableTxt() {
        this.txtIdMeal.setEnabled(false);
        this.txtIdMeal1.setEnabled(false);
        this.txtIdMeal2.setEnabled(false);
        this.txtIdMeal3.setEnabled(false);
        this.txtIdMeal4.setEnabled(false);
        this.txtIdMeal5.setEnabled(false);
        this.txtIdMeal6.setEnabled(false);
        this.txtIdMeal7.setEnabled(false);
        this.txtPrice.setEnabled(false);
        this.txtPrice1.setEnabled(false);
        this.txtPrice2.setEnabled(false);
        this.txtPrice3.setEnabled(false);
        this.txtPrice4.setEnabled(false);
        this.txtPrice5.setEnabled(false);
        this.txtPrice6.setEnabled(false);
        this.txtPrice7.setEnabled(false);
    }

    public void clean() {
        cbSelectBeverage.setSelectedIndex(0);
        jsQuantity.setValue(0);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(true);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(true);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(true);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(true);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(true);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(true);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(true);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(true);
            txtPrice7.setVisible(false);

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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(true);

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
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(true);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(true);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(true);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(true);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(true);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(true);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(true);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(true);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(true);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(true);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(true);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(true);
            txtPrice7.setVisible(false);
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
            lbId.setVisible(true);
            lbPrice.setVisible(true);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(true);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(true);
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
            lbId.setVisible(false);
            lbPrice.setVisible(false);
            txtIdMeal.setVisible(false);
            txtIdMeal1.setVisible(false);
            txtIdMeal2.setVisible(false);
            txtIdMeal3.setVisible(false);
            txtIdMeal4.setVisible(false);
            txtIdMeal5.setVisible(false);
            txtIdMeal6.setVisible(false);
            txtIdMeal7.setVisible(false);
            txtPrice.setVisible(false);
            txtPrice1.setVisible(false);
            txtPrice2.setVisible(false);
            txtPrice3.setVisible(false);
            txtPrice4.setVisible(false);
            txtPrice5.setVisible(false);
            txtPrice6.setVisible(false);
            txtPrice7.setVisible(false);
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
        lbId.setVisible(true);
        lbPrice.setVisible(true);
        txtIdMeal.setVisible(true);
        txtIdMeal1.setVisible(false);
        txtIdMeal2.setVisible(false);
        txtIdMeal3.setVisible(false);
        txtIdMeal4.setVisible(false);
        txtIdMeal5.setVisible(false);
        txtIdMeal6.setVisible(false);
        txtIdMeal7.setVisible(false);
        txtPrice.setVisible(true);
        txtPrice1.setVisible(false);
        txtPrice2.setVisible(false);
        txtPrice3.setVisible(false);
        txtPrice4.setVisible(false);
        txtPrice5.setVisible(false);
        txtPrice6.setVisible(false);
        txtPrice7.setVisible(false);
    }

    public String getTipo() {
        return this.cbSelectBeverage.getSelectedItem().toString();
    }

    public Meals getProduct() {
        Meals meal = null;
        String selectedItem = cbSelectBeverage.getSelectedItem() != null ? cbSelectBeverage.getSelectedItem().toString() : "";

        if ("Coca Cola".equals(selectedItem)) {
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
        } else if ("Jarritos Guayaba".equals(selectedItem)) {
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
        } else if ("Jarritos Tamarind".equals(selectedItem)) {
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
        } else if ("Jarritos Mandarin".equals(selectedItem)) {
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
        } else if ("Sparkling Lemonade".equals(selectedItem)) {
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
        } else if ("Creamy Red Birch Beer".equals(selectedItem)) {
            try {
                String id = txtIdMeal5.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice5.getText());

                meal = new Meals(id, name, quantity, price);
            } catch (NumberFormatException e) {
                // Manejar la excepción si ocurre un error al convertir a números
                e.printStackTrace(); // Otra acción según sea necesario
            }
        } else if ("Root Beer".equals(selectedItem)) {
            try {
                String id = txtIdMeal6.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice6.getText());

                meal = new Meals(id, name, quantity, price);
            } catch (NumberFormatException e) {
                // Manejar la excepción si ocurre un error al convertir a números
                e.printStackTrace(); // Otra acción según sea necesario
            }
        } else if ("BlackCherry".equals(selectedItem)) {
            try {
                String id = txtIdMeal7.getText();
                String name = selectedItem;
                int quantity = (int) jsQuantity.getValue();
                double price = Double.parseDouble(txtPrice7.getText());

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
        txtIdMeal7 = new javax.swing.JFormattedTextField();
        txtPrice7 = new javax.swing.JFormattedTextField();
        txtIdMeal6 = new javax.swing.JFormattedTextField();
        txtPrice6 = new javax.swing.JFormattedTextField();
        txtPrice5 = new javax.swing.JFormattedTextField();
        txtIdMeal5 = new javax.swing.JFormattedTextField();
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
        lbId = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
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

        txtIdMeal7.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal7.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal7.setText("3-08");
        txtIdMeal7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtPrice7.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice7.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice7.setText("11.50");
        txtPrice7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtIdMeal6.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal6.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal6.setText("3-07");
        txtIdMeal6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtPrice6.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice6.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice6.setText("11.00");
        txtPrice6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtPrice5.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice5.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice5.setText("11.00");
        txtPrice5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtIdMeal5.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal5.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal5.setText("3-06");
        txtIdMeal5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtIdMeal4.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal4.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal4.setText("3-05");
        txtIdMeal4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtPrice4.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice4.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice4.setText("11.00");
        txtPrice4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtIdMeal3.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal3.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal3.setText("3-04");
        txtIdMeal3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtPrice3.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice3.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice3.setText("10.00");
        txtPrice3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtIdMeal2.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal2.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal2.setText("3-03");
        txtIdMeal2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtPrice2.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice2.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice2.setText("10.00");
        txtPrice2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtIdMeal1.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal1.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal1.setText("3-02");
        txtIdMeal1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        txtPrice1.setBackground(new java.awt.Color(149, 38, 36));
        txtPrice1.setForeground(new java.awt.Color(238, 236, 208));
        txtPrice1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPrice1.setText("10.00");
        txtPrice1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

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
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, -1, 30));

        txtIdMeal.setBackground(new java.awt.Color(149, 38, 36));
        txtIdMeal.setForeground(new java.awt.Color(238, 236, 208));
        try {
            txtIdMeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtIdMeal.setText("3-01");
        txtIdMeal.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        getContentPane().add(txtIdMeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, 30));

        lbId.setBackground(new java.awt.Color(255, 255, 255));
        lbId.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbId.setForeground(new java.awt.Color(238, 236, 208));
        lbId.setText("ID:");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 30, 30));

        lbPrice.setBackground(new java.awt.Color(255, 255, 255));
        lbPrice.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(238, 236, 208));
        lbPrice.setText("Price:");
        getContentPane().add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 70, 30));

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

    private void txtPrice5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice5ActionPerformed

    private void txtPrice6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice6ActionPerformed

    private void txtPrice7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice7ActionPerformed

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
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbJarritosGuayaba;
    private javax.swing.JLabel lbJarritosMandarin;
    private javax.swing.JLabel lbJarritosTamarind;
    private javax.swing.JLabel lbNameBeverages;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbRootBeer;
    private javax.swing.JLabel lbSparklingLemonade;
    private javax.swing.JFormattedTextField txtIdMeal;
    private javax.swing.JFormattedTextField txtIdMeal1;
    private javax.swing.JFormattedTextField txtIdMeal2;
    private javax.swing.JFormattedTextField txtIdMeal3;
    private javax.swing.JFormattedTextField txtIdMeal4;
    private javax.swing.JFormattedTextField txtIdMeal5;
    private javax.swing.JFormattedTextField txtIdMeal6;
    private javax.swing.JFormattedTextField txtIdMeal7;
    private javax.swing.JFormattedTextField txtPrice;
    private javax.swing.JFormattedTextField txtPrice1;
    private javax.swing.JFormattedTextField txtPrice2;
    private javax.swing.JFormattedTextField txtPrice3;
    private javax.swing.JFormattedTextField txtPrice4;
    private javax.swing.JFormattedTextField txtPrice5;
    private javax.swing.JFormattedTextField txtPrice6;
    private javax.swing.JFormattedTextField txtPrice7;
    // End of variables declaration//GEN-END:variables
}
