package module4activity3;


import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake
 */
public class CreditsView extends JPanel {
    private JLabel welcomeLabel;
    
    CreditsView(){
       welcomeLabel = new JLabel("Yuuup");
       
       add(welcomeLabel);
}
            
}
