/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


/**
 *
 * @author USER
 */
public class javasubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        char w[];
        int st=in.nextInt();
        int en=in.nextInt();
        char word[]=s1.toCharArray();
        for(int i=st;i<en;i++){
            System.out.printf("%c",word[i]);
        }
        
    }
    
}
