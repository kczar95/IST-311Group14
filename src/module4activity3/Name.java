/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module4activity3;

/**
 *
 * @author lap5508
 */
public class Name {
    
    private String firstName;
    private String lastName;
    private String namePrefix;
    private String nameSuffix;
    
    public Name(String newNamePrefix, String newFirstName, String newLastName, String newNameSuffix){       
        firstName = newFirstName;
        lastName = newLastName;
        namePrefix = newNamePrefix;
        nameSuffix = newNameSuffix;
    }
    
    public String getFullName(){  
        return getNamePrefix() + " " + getFirstName() + " " + getLastName() + " " + getNameSuffix();
    }
    
    public String getTitle(){
        return getNamePrefix();
    }

    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getNamePrefix() {
        return namePrefix;
    }


    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }


    public String getNameSuffix() {
        return nameSuffix;
    }


    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }
}
