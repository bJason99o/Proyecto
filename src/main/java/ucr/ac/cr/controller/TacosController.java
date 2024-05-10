/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.TacosGUI;

/**
 *
 * @author Jason
 */
public class TacosController implements ActionListener{
    private TacosGUI tacosGUI;

    public TacosController() {
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
