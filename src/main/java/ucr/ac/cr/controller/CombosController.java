/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.CombosGUI;

/**
 *
 * @author Jason
 */
public class CombosController implements ActionListener{
    private CombosGUI combosGUI;

    public CombosController() {
    this.combosGUI= new CombosGUI();
    this.combosGUI.setVisible(true);
    this.combosGUI.listen(this);
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "jButton1":
                this.combosGUI.dispose();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    
}
