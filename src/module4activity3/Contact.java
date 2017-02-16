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
    private String group;
    private String relationship;
    private String email;
    private String birthday;
    private String personalNote;
    private String name;
    private boolean isTrue;
    
    public Contact(String newName, String newGroup, String newEmail, String newRelationship, String newBirthday, String newPersonalNote){
        group = newGroup;
        relationship = newRelationship;
        email = newEmail;
        birthday = newBirthday;
        name = newName;
        personalNote = newPersonalNote;
    }

    public String getFullContact()
    {
        return name + ", " + group + ", " + relationship + ", " + email + ", " + birthday + ", " + personalNote;

    }
    
    public boolean isRelated()
    {
        if(relationship == "Brother"){
            return true;
        } else if(relationship == "Sister"){
            return true;
        } else if(relationship == "Mother"){
            return true;
        } else if(relationship == "Father"){
            return true;
        } else if(relationship == "Grandparent"){
            return true;
        } else if(relationship == "Cousin"){
            return true;
        } else {
            return false;
        }
    }
}
