/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.DessertsGUI;

/**
 *
 * @author Jason
 */
public class DessertsController implements ActionListener {
    private DessertsGUI dessertsGUI;

    public DessertsController() {
        this.dessertsGUI= new DessertsGUI();
        this.dessertsGUI.setVisible(true);
        this.dessertsGUI.listen(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Exit":
                this.dessertsGUI.dispose();
            break;
            case "Next":
                this.dessertsGUI.nextDessert();
            break;
        }
    }
    
}
