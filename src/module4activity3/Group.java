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
public class Group {
    
    private String name;
    private String type;
    private String members;
    
    public Group(String name, String type, String members)
    {
    this.name = name;
    this.type = type;
    this.members = members;
    }
    
    public String getGroupInfo()
    {
    return "Group Name: " + name + " Group Type: " + type;
    }
    
    public String getGroupMembers()
    {
        return "Group Members: " + members;
    }
}
