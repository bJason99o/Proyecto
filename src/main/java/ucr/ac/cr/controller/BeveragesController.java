/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.BeveragesGUI;
import ucr.ac.cr.model.List;
/**
 *
 * @author Jason
 */
public class BeveragesController implements ActionListener{
    private BeveragesGUI beveragesGUI;
  private List list;
  
    public BeveragesController() {
        this.beveragesGUI= new BeveragesGUI();
        this.beveragesGUI.setVisible(true);
        this.beveragesGUI.listen(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "X":
                this.beveragesGUI.dispose();
            break;
            case "Add":
                List list=new List();
                this.beveragesGUI.dispose();
                String dato= beveragesGUI.getTipo();
                list.insertarPrincipio(dato);  
                
            break;
            case ">":
                this.beveragesGUI.nextBeverage();
            break;
            case "<":
                this.beveragesGUI.previousBeverage();
            break;
            
        }
    }
    
}
