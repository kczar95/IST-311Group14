package module4activity3;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavController {
    
    private NavModel n_model;
    private NavView n_view;
    private OptionsModel o_model;
    private OptionsView o_view;
    private OptionsController o_Controller;
    private MainView m_view;
    private CreditsView c_view;
    private InstructionsView i_view;
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        o_model = new OptionsModel();        
        o_view = new OptionsView();
        m_view = new MainView();
        o_Controller = new OptionsController(o_model, o_view, m_view); 
        
       
        c_view = new CreditsView();
        i_view = new InstructionsView();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addInstructionsButtonListener(new InstructionsButtonListener());
        n_view.addCreditsButtonListener(new CreditsButtonListener());
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToMainPanel(m_view);
        }
    }
    class InstructionsButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToInstructionsPanel(i_view);
        }
    }
    
    class CreditsButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToCreditsPanel(c_view);
        }
    }
    
    
}
