/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class StdiandStdout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        if(n%2!=0)
          System.out.println("Weird");
        else if((n%2)==0 && 2<=n && n<=5)
             System.out.println("Not Weird");
        else if(n%2==0 && 6<=n && n<=20)
             System.out.println("Weird");
        else if(n%2==0 && n>20)
        System.out.println("Not Weird");
    }
    
}
