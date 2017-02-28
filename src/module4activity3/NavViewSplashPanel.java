package module4activity3;


import javax.swing.*;

/**
 *
 * @author jrimland
 */
public class NavViewSplashPanel extends JPanel{
    private JButton splashButton;
    private JLabel optionsLabel;
    private JTextField userLogIn;
    private JTextField userPwlog;
    NavViewSplashPanel()
    {
            userLogIn = new JTextField("Enter UserName");
            add(userLogIn);
            userPwlog = new JTextField("Enter Password");
            add(userPwlog);
            splashButton = new JButton("Enter");            
            add(splashButton);
            
            
    }    
}
