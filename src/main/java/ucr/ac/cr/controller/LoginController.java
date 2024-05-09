/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.view.LoginGUI;

/**
 *
 * @author Jeikol
 */
public class LoginController implements ActionListener {
private LoginGUI loginGUI;

   public LoginController() {
        this.loginGUI = new LoginGUI();
        this.loginGUI.setVisible(true);
         this.loginGUI.addJoinButtonListener(this);
    }

  public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Join")) {
            String user = "tacos";
            String password = "hungry";

            String enteredUser = loginGUI.getUsername();
            String enteredPassword = loginGUI.getPassword();

            if (enteredUser.equals(user) && enteredPassword.equals(password)) {
                MainController mainController = new MainController();
                loginGUI.dispose();
            } else {
                JOptionPane.showMessageDialog(loginGUI, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

