package module4activity3;


import java.awt.Color;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jrimland-air
 */
public class OptionsController extends JFrame implements ActionListener {

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
        o_view.submitColor.addActionListener(this);
        o_view.submitNames.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickSource = (JButton) e.getSource();
        if (clickSource == o_view.getSubmitNamesButton()) {
            o_model.setPlayer1Name(o_view.getPlayer1Name());
            o_model.setPlayer2Name(o_view.getPlayer2Name());
            m_view.setOutputLabelMain(o_model.getPlayer1Name(), o_model.getPlayer2Name());
        }
        if (clickSource == o_view.getSubmitColorButton()) {
            colorSelectionCode = o_view.getColorSelection();
            if (colorSelectionCode == 1) {
                m_view.setBackground(Color.red);
            } else if (colorSelectionCode == 2) {
                m_view.setBackground(Color.yellow);
            } else if (colorSelectionCode == 3) {
                m_view.setBackground(Color.pink);
            } else {
                m_view.setBackground(Color.green);
            }
        }
       
    }
     
}
