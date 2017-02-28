package module4activity3;


import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class OptionsView extends JPanel{
        private JButton retButton;
        private JTextField playerName;
        private JTextField player2Name;
        JButton submitNames;
        JButton submitColor;
        private JSlider colorSelectionSlider;
        private Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
        
        OptionsView()
        {            
            playerName = new JTextField("--Enter Player 1 Name --");
            player2Name = new JTextField("--Enter Player 2 Name--");

            colorSelectionSlider = new JSlider(JSlider.HORIZONTAL, 1, 4, 4);
            colorSelectionSlider.setPaintLabels(true);
            colorSelectionSlider.setPaintTicks(true);
            colorSelectionSlider.setMajorTickSpacing(1);    
            table.put (new Integer(1), new JLabel("Red"));
            table.put (new Integer(2), new JLabel("Yellow"));
            table.put (new Integer(3), new JLabel("Pink"));
            table.put (new Integer(4), new JLabel("Green"));
            colorSelectionSlider.setLabelTable (table);
            add(colorSelectionSlider);
            
            submitNames = new JButton ("Submit Names");
            submitColor = new JButton ("Submit Color");

            add(submitColor);
            add(playerName);
            add(player2Name);
            add(submitNames);
            GridLayout grid = new GridLayout(9,1);
            setLayout(grid);
                         
        }
        public JButton getSubmitNamesButton () {
            return this.submitNames;
        }
        
        public JButton getSubmitColorButton () {
            return this.submitColor;
        }

        public void addSubmitButtonListener(ActionListener al) 
        {    
            submitNames.addActionListener(al);
            submitColor.addActionListener(al);
        }

        public String getPlayer1Name() {
            return playerName.getText();
        }

        public String getPlayer2Name() {
            return player2Name.getText();
        }
        
        public Integer getColorSelection() {
            return colorSelectionSlider.getValue();
        }
   
}
