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
public class JavaStaticInitializerBlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int B=input.nextInt();
        int H=input.nextInt();
        if(B>=0 &&H>=0)
            System.out.println(B*H);
        else 
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
}
