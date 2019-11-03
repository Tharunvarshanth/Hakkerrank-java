/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author USER
 */
public class javastringdsintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum=A.length()+B.length();
        int alph=A.compareTo(B);
        System.out.println(alph);
        System.out.println(sum);
        
        if(alph>0)
        System.out.println("Yes");
        else  if(alph<1) 
        System.out.println("No");

         String s1=A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
         
        String s2=B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        
        System.out.println(s1+" "+s2);
    }
    
}
