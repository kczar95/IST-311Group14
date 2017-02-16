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
    
    private String phoneNumber;
    private String phoneType;
    private String faxNumber;
    
    public Phone(String phoneNumber, String phoneType, String faxNumber)
    {
    this.phoneNumber = phoneNumber;
    this.phoneType = phoneType;
    this.faxNumber = faxNumber;
    }
    
    public String getPhoneInfo()
    {
    return phoneType + ": " + phoneNumber;
    }
    
    public String getFaxNumber()
    {
    return "Fax Number: " + faxNumber;
    }
}
