/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;
//hola, prueba
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.BeveragesGUI;

/**
 *
 * @author Jason
 */
public class BeveragesController implements ActionListener{
    
    private BeveragesGUI beveragesGUI;

    public BeveragesController() {
        this.beveragesGUI= new BeveragesGUI();
        this.beveragesGUI.setVisible(true);
        this.beveragesGUI.listen(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Exit":
                this.beveragesGUI.dispose();
            break;
            case "Next":
                this.beveragesGUI.dispose();
            break;
            
        }
    }
    
}
