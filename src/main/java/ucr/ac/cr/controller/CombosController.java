/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.model.JsonClass;
import ucr.ac.cr.view.CombosGUI;
import ucr.ac.cr.model.List;
import ucr.ac.cr.model.Meals;

/**
 *
 * @author Jason
 */
public class CombosController implements ActionListener{
    private CombosGUI combosGUI;
      private List list;
private JsonClass jsonClass;
    public CombosController(List list) {
        this.list=list;
        this.combosGUI= new CombosGUI();
        this.jsonClass= new JsonClass();
        this.combosGUI.setVisible(true);
        this.combosGUI.listen(this);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "X":
                this.combosGUI.dispose();
            break;
            case "Add":
                 
                String dato = combosGUI.getTipo();
                Meals nuevaComida = combosGUI.getProduct();
                list.insertarPrincipio(dato, nuevaComida);
                jsonClass.saveLinkedListToJson(list);
                combosGUI.clean();
                System.out.println(list);
                System.out.println(jsonClass.loadMealsFromJson());;
            break;
            case ">":
                this.combosGUI.nextCombo();
            break;
            case "<":
                this.combosGUI.previousCombo();
            break;
        }
    }
    
    
    
}
