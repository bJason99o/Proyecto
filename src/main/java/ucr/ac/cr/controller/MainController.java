/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ucr.ac.cr.view.MainGUI;

//Ale no hace nada
/**
 *
 * @author Jason
 */
public class MainController implements ActionListener{

    private MainGUI mainGUI;
    private BurritosController burritosController;
    private TacosController tacosController;
    private BeveragesController beveragesController;
    private DessertsController dessertsController;
    private CombosController combosController;

    public MainController() {
    this.mainGUI= new MainGUI();
    this.mainGUI.setVisible(true);
    this.mainGUI.listen(this);
    }
    
    
   
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Burritos":
                this.burritosController=new BurritosController();
            break;
            case "Tacos":
                this.tacosController=new TacosController();
            break;
            case "Beverages":
                this.beveragesController= new BeveragesController();
            break;
            case "Desserts":
                this.dessertsController= new DessertsController();
            break;
            case "Combos":
                this.combosController= new CombosController();
            break;
            case "Exit":
                System.exit(0);
            break;
            
        }
    }
    
    
}
