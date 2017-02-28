package module4activity3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kkc5141
 */
public class InstructionsView extends JPanel{
    private JLabel Pawn;
    private JLabel King;
    private JLabel Knight;
    
    InstructionsView()
    {
        ArrayList<String> rules = fileReading();
        String str = "";
        Pawn = new JLabel("<html><span><h1> PAWN </h1> <br> Pawns can move two spaces on their first move. <br> Pawns can only move one space forward after the first move. <br> Pawns can only attack on a diagonal. </span><html>");
        King = new JLabel("<html><span><h1> King </h1> <br> A king can move in one space in any direction. <br> A king can take a piece in any direction. <br> Once the king is taken the game is over.</span><html>");
        Knight = new JLabel("<html><span><h1> Knight </h1> <br> A knight may move in any direction. <br> A knights movement is restricted to an L shape, two moves forward and one to a side. <br> Knights can attack in any direction </span><html>");
        add(Pawn);
        add(Knight);
        add(King);
    }
    public static ArrayList<String>  fileReading(){
        ArrayList<String> array2 = new ArrayList();
        String filename = "SimpleChessRules.txt";
        File filetoWrite = new File(filename);
        String str ="";
        Scanner scnr = null;
        String nextLine = "";
        
        try{
            scnr = new Scanner(filetoWrite);
            while(scnr.hasNextLine()){
                nextLine = scnr.nextLine();
                array2.add(nextLine);
                
            }
        } catch(FileNotFoundException fne){
            String errorMessage = fne.getMessage();
            System.out.println(errorMessage);
        } finally{
            if(scnr != null){
                scnr.close();
            }
        }
        return array2;
    }
    public static String ruleReader(ArrayList array2){
        String str = "";
        for(int i=0; i<array2.size();i++)
        {
            str += array2.get(i) + "\n";
        }
        return str;
    }
}
