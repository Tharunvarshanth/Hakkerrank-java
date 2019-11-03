/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author USER
 */
public class JavaStdinandStdoutII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int num1; double num2;   String word;
        num1=scan.nextInt();
        num2=scan.nextDouble();
        
        Scanner one=new Scanner(System.in);
        word=one.nextLine();
        int n=word.length();
        System.out.println("String: " + word);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
    }
    
}
