/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.BurritosGUI;

/**
 *
 * @author Jason
 */
public class BurritosController implements ActionListener{

    private BurritosGUI burritosGUI;

    public BurritosController() {
    this.burritosGUI= new BurritosGUI();
    this.burritosGUI.setVisible(true);
    this.burritosGUI.listen(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "X":
                this.burritosGUI.dispose();
            break;
            case "Add":
                this.burritosGUI.dispose();
            break;
            case ">":
                this.burritosGUI.nextBurrito();
            break;
            case "<":
                this.burritosGUI.previousBurrito();
            break;
        }
    }
    
}
