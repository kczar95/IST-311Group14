package module4activity3;


import javax.swing.*;

/**
 *
 * @author jrimland
 */
public class NavViewSplashPanel extends JPanel{
    private JButton splashButton;
    private JLabel optionsLabel;
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("src/images/Chess.png"));            
            add(splashButton);
            
            
    }    
}
