package module4activity3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle
 */
public class Notification {
    private String date;
    private boolean soundAlert;
    private boolean popUpAlert;
    
    public Notification(String newDate, boolean newSoundAlert, boolean newPopUpAlert){
        date = newDate;
        soundAlert = newSoundAlert;
        popUpAlert = newPopUpAlert;
        
    }
    
    public boolean isPopUp()
    {
        if(popUpAlert == true){
            return true;
        } else {
            return false;
        }
    }
    public boolean isSoundAlert()
    {
        if(soundAlert == true){
            return true;
        } else {
            return false;
        }
    }
}
