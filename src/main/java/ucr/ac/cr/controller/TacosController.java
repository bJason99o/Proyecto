/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.TacosGUI;
import ucr.ac.cr.model.List;
/**
 *
 * @author Jason
 */
public class TacosController implements ActionListener{
    private TacosGUI tacosGUI;
    private List list;
    
    public TacosController(List list) {
        this.list=list;
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
                
                String dato= tacosGUI.getTipo();
                list.insertarPrincipio(dato);
                this.tacosGUI.dispose();
                
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
