package module4activity3;


import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jrimland
 */
public class NavViewPanel extends JPanel{

    NavViewBottomMenuPanel menu;
    NavViewSplashPanel splash;
    
    private OptionsView o_view;
    private MainView m_view;
    private InstructionsView i_view;
    //private MovePanel movePanel;
    private CreditsView c_view;
   // private GameBoard gameBoard;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavViewSplashPanel();
        //movePanel = new MovePanel();
        //gameBoard = new GameBoard(movePanel);
        

        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);     
        
    }
    
    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    
    public void addInstructions(InstructionsView i_view)
    {
        this.i_view = i_view;
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addOptions(OptionsView o_view)
    {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addCredits(CreditsView c_view)
    {
        this.c_view = c_view;
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    public void addMain(MainView m_view)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        //this.movePanel = movePanel;
        //this.gameBoard = gameBoard;
        
        add(m_view, BorderLayout.NORTH);
        //add(gameBoard, BorderLayout.CENTER); 
        //add(movePanel, BorderLayout.EAST); 
        revalidate();
        repaint();
    }    
    
    public void addSplash(NavView n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    public void removeOptions()
    {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
            //remove(this.movePanel);
            //remove(this.gameBoard);
    }    
    
    public void removeSplash()
    {
        remove(splash);
    }
    
    public void removeInstructions()
    {
            if (this.i_view != null)
                remove(this.i_view);
    }
         
    public void removeCredits()
    {
        if (this.c_view != null)
               remove(this.c_view);
    }
}
