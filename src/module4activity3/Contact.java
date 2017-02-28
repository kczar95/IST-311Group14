/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

/**
 *
 * @author kkc5141
 */
public class Contact {
    private String contactType;
    private String group;
    private String relationship;
    private String email;
    private String birthday;
    private String personalNote;
    private String name;
    
    
    public Contact(String newName, String newContactType, String newGroup, String newEmail, String newRelationship, String newBirthday, String newPersonalNote){
        contactType = newContactType;
        group = newGroup;
        relationship = newRelationship;
        email = newEmail;
        birthday = newBirthday;
        name = newName;
        personalNote = newPersonalNote;
    }

    public String getFullContact()
    {
        return name + ", " + contactType + ", " + group + ", " + relationship + ", " + email + ", " + birthday + ", " + personalNote;

    }
    
    public boolean isRelated()
    {
        if(relationship == "")
    }
}
