package module4activity3;

import java.util.ArrayList;

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
    public ArrayList<String> members = new ArrayList<>();
    
    public Group(String name, String type)
    {
    this.name = name;
    this.type = type;
    }
    
    public void addMember(String mem)
    {
        members.add(mem);
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
