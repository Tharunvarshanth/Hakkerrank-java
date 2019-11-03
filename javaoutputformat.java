/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @

aut



hor USER
 */
public class javaoutputformat {
  
    public static int pr(int x){
        int digit=0;
        for(;x>0;){
            x/=10;
            digit++;
        }
            return digit;
            
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=inp.next();
            int x=inp.nextInt();
            int len=s1.length();
            
           
            System.out.printf("%s",s1);
            for(int a=0;a<15-len;a++){
            System.out.printf(" ");}
            if(pr(x)==3)
             System.out.printf("%d\n",x);
            else if(pr(x)==2)
                System.out.printf("0%d\n",x);
                else  System.out.printf("00%d\n",x);
    }
    System.out.println("================================");
}
}
