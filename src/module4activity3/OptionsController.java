package module4activity3;


import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;


public class OptionsController extends JFrame {

    private OptionsModel o_model;
    private OptionsView o_view;
    private MainView m_view;
    private NavView n_view;
    private NavViewBottomMenuPanel navViewBottomMenuPanel;
    private Integer colorSelectionCode;


    OptionsController(OptionsModel o_model, OptionsView o_view, MainView m_view) {
        this.o_model = o_model;
        this.o_view = o_view;
        this.m_view = m_view;
        this.n_view = n_view;
       
        
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        JButton clickSource = (JButton) e.getSource();
//        if (clickSource == ) {
//            
//            
//        }
//        if (clickSource == ) {
//            
//        }
//       
//    }
//     
}
