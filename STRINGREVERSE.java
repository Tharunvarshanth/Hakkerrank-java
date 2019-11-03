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
public class STRINGREVERSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        System.out.println("Enter string to reverse:");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse ="";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
    if(str.equals(reverse) )
        System.out.println("Yes");
    else 
        System.out.println("No");
    }
}


    
    

