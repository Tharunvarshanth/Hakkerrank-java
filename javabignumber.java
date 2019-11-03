/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
 import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.math.*;
/**
 *
 * @author USER
 */
public class javabignumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        
        BigInteger num1=new BigInteger(in.next());
        BigInteger num2=new BigInteger(in.next());
        BigInteger  bi3, bi4;
        bi3 = num1.add(num2);
        bi4 = num1.multiply(num2);
        System.out.println(bi3);
        System.out.println(bi4);
    }
    
    
}

