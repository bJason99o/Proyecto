/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.model.JsonClass;
import ucr.ac.cr.view.TacosGUI;
import ucr.ac.cr.model.List;
import ucr.ac.cr.model.Meals;
/**
 *
 * @author Jason
 */
public class TacosController implements ActionListener{
    private TacosGUI tacosGUI;
    private List list;
    private JsonClass jsonClass;
    
    public TacosController(List list) {
        this.list=list;
        this.jsonClass= new JsonClass();
        this.tacosGUI= new TacosGUI();
        this.tacosGUI.setVisible(true);
        this.tacosGUI.listen(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "X":
                this.tacosGUI.dispose();
            break;
            case "Add":
               String dato = tacosGUI.getTipo();
                Meals nuevaComida = tacosGUI.getProduct();
                list.insertarPrincipio(dato, nuevaComida);
                jsonClass.saveLinkedListToJson(list);
                tacosGUI.clean();
                System.out.println(list);
                System.out.println(jsonClass.loadMealsFromJson());   
            break;
            case ">":
                this.tacosGUI.nextTaco();
            break;
           case "<":
                this.tacosGUI.previousTaco();
            break;
        }
    }
    
    
}
