/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;

import java.util.*;

/**
 *
 * @author USER
 */
public class timeconversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);

        int h=input.nextInt(); int m=input.nextInt(); int s=input.nextInt();
        String str=input.next();
      
 String s1="PM";
       if( str.equals(s1))        
        System.out.printf("%02d:%02d:%02d",h+12,m,s);
        else{       
        System.out.printf("%02d:%02d:%02d",h,m,s);}
        
    


    }
    }
