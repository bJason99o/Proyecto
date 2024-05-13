/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.model.List;
import ucr.ac.cr.view.MainGUI;


/**
 *
 * @author Jason
 */
public class MainController implements ActionListener{
    private List list;
    private MainGUI mainGUI;
    private BurritosController burritosController;
    private TacosController tacosController;
    private BeveragesController beveragesController;
    private DessertsController dessertsController;
    private CombosController combosController;
    private MyOrderController myOrderController;

    public MainController() {
    list= new List();
    this.mainGUI= new MainGUI();
    this.mainGUI.setVisible(true);
    this.mainGUI.listen(this);
    }
    
    
   
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Burritos":
                this.burritosController=new BurritosController(list);
            break;
            case "Tacos":
                this.tacosController=new TacosController(list);
            break;
            case "Beverages":
                this.beveragesController= new BeveragesController(list);
            break;
            case "Desserts":
                this.dessertsController= new DessertsController(list);
            break;
            case "Combos":
                this.combosController= new CombosController(list);
            break;
            case "My Order":
                this.myOrderController=new MyOrderController(list);
            break;
            case "Exit":
                System.exit(0);
            break;
            
        }
    }
    
    
}
