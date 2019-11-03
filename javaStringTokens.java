/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.(" ","!","?",".","_","'","@",-20);
 */
import java.io.*;
import java.util.*;

/**
 *
 * @author USER
 */
public class javaStringTokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        
        
        /* Check special cases */
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        
        /* Split on all non-alphabetic characters */
        String[] words = s.split("[^a-zA-Z]+");
        
        /* Print output */
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String removeLeadingNonLetters(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                break;
            }
        }
        return str.substring(i);
    }
}