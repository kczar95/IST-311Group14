package module4activity3;


import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainView extends JPanel{
    private JLabel outputLabel;
    
    MainView()
    {
        outputLabel = new JLabel("No options selected");
        add(outputLabel);
    }
    public void setOutputLabelMain(String player1Name, String player2Name)
    {
        outputLabel.setText("Player 1 Name: " + player1Name + " Player 2 Name: " + player2Name);
    }
}
