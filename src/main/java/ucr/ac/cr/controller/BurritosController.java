/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.view.BurritosGUI;
import ucr.ac.cr.model.List;
/**
 *
 * @author Jason
 */
public class BurritosController implements ActionListener{

    private BurritosGUI burritosGUI;
    private List list;

    public BurritosController(List list) {
    this.list=list;
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
                
//                String dato= burritosGUI.getTipo();
//                list.insertarPrincipio(dato);                
//                this.burritosGUI.dispose();
        
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
