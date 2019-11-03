/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author USER
 */
public class javadatatypes {
public static long  pow1(int n){
       long  ans=1;
        for(int i=1;i<=n;i++){
               ans*=2;
        }return ans;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767){System.out.println("* short");}
                long z=pow1(31);
                if(x>=-z&&x<=z-1){System.out.println("* int");}
                z=pow1(63);
                if(x>=-z&&x<=z-1){System.out.println("* long");}
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}




    
    

