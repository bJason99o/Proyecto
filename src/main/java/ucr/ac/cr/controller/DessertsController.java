/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.DessertsGUI;
import ucr.ac.cr.model.List;

/**
 *
 * @author Jason
 */
public class DessertsController implements ActionListener {
    private DessertsGUI dessertsGUI;
    private List list;
    
    public DessertsController(List list) {
        this.list=list;
        this.dessertsGUI= new DessertsGUI();
        this.dessertsGUI.setVisible(true);
        this.dessertsGUI.listen(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "X":
                this.dessertsGUI.dispose();
            break;
            case "Add":
//                String dato= dessertsGUI.getTipo();
//                list.insertarPrincipio(dato);
//                this.dessertsGUI.dispose();
            break;
            case ">":
                this.dessertsGUI.nextDessert();
            break;
            case "<":
                this.dessertsGUI.previousDessert();
            break;
        }
    }
    
}
