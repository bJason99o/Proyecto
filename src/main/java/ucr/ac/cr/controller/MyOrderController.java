/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.MyOrderGUI;
/**
 *
 * @author alehe
 */
public class MyOrderController implements ActionListener{
    private MyOrderGUI myOrderGUI;

    public MyOrderController() {
    this.myOrderGUI= new MyOrderGUI();
    this.myOrderGUI.setVisible(true);
    this.myOrderGUI.listen(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myOrderGUI.setVisible(true);
        
        /*switch (e.getActionCommand()) {
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
        }*/
    }
}
