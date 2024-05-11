/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.model.List;
import ucr.ac.cr.model.Meals;
import ucr.ac.cr.view.MyOrderGUI;
/**
 *
 * @author alehe
 */
public class MyOrderController implements ActionListener{
    private MyOrderGUI myOrderGUI;
    private List list;
    

    public MyOrderController() {
    this.myOrderGUI= new MyOrderGUI();
    this.myOrderGUI.setTable(Meals.HEADER_MEALS, this.list.getMatrixMeals());
    this.myOrderGUI.setVisible(true);
    this.myOrderGUI.listen(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myOrderGUI.setVisible(true);
        
        switch (e.getActionCommand()) {
            case "Eliminar":
                
            break;
            case "Add":
                
            break;
            case ">":
                
            break;
           case "<":
                
            break;
        }
    }
}
