package module4activity3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rfd5085
 */
public class Phone {
    
    private String cellNumber;
    private String workNumber;
    private String homeNumber;
    private String faxNumber;
    
    public Phone(String cellNumber, String workNumber, String homeNumber, String faxNumber)
    {
    this.cellNumber = cellNumber;
    this.workNumber = workNumber;
    this.homeNumber = homeNumber;
    this.faxNumber = faxNumber;
    }
  
    
    public String getCellNumber()
    {
    return "Cell Phone Number: " + cellNumber;
    }
    
    public void editCellNumber(String newNum)
    {
    cellNumber = newNum;
    }
    
    public String getworkNumber()
    {
    return "Work Phone Number: " + workNumber;
    }
    
    public void editWorkNumber(String newNum)
    {
    workNumber = newNum;
    }
    public String getHomeNumber()
    {
    return "Home Phone Number: " + homeNumber;
    }
    
    public void editHomeNumber(String newNum)
    {
    homeNumber = newNum;
    }
    
    public String getFaxNumber()
    {
    return "Fax Number: " + faxNumber;
    }
    
    public void editFaxNumber(String newNum)
    {
    faxNumber = newNum;
    }
}
