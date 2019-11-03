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
public class validusernamepassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = null;int count=0;
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        
        for(int j=0;j<n;j++){
          str=my.nextLine();
        if(('A'<=str.charAt(0)&&'Z'>=str.charAt(0))||('a'<=str.charAt(0)&&'z'>=str.charAt(0))){
                count++;                      
            }
        if(str.length()>=8 && str.length()<=30){
            count++;
        }
        
            if(str.matches("[a-zA-Z0-9]+"))
       count++;
            
            if(count==3)
                System.out.println("valid");
            else
                System.out.println("Invalid");
       
        }   
            
    }
}
