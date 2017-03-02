package module4activity3;


import java.awt.LayoutManager;
import java.awt.BorderLayout;
import javax.swing.*;

public class NavViewSplashPanel extends JPanel{
    private JButton splashButton;
    private JLabel optionsLabel;
    private JTextField userLogIn;
    private JTextField userPwlog;
    NavViewSplashPanel()
    {
            userLogIn = new JTextField("Enter UserName");
            add(userLogIn, BorderLayout.CENTER);
            splashButton = new JButton("Enter");            
            add(splashButton, BorderLayout.CENTER);
            
            
            
    }    
}
