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
public class gradingstudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] grades=new int[n];
        for(int i=0;i<n;i++){
            grades[i]=input.nextInt();
        }
        
        for(int i=0;i<n;i++){
            
            
                if(grades[i]<37){
                System.out.printf("%d\n",grades[i]);            
                        }
                else if(grades[i]%10==3||grades[i]%10==4||grades[i]%10==8||grades[i]%10==9)
                switch(grades[i]%10){
                    case 3:
                      System.out.printf("%d\n",grades[i]+2);     
                break;
                case 4:  System.out.printf("%d\n",grades[i]+1); 
                break;
                case 8:  System.out.printf("%d\n",grades[i]+2); break;
                case 9:  System.out.printf("%d\n",grades[i]+1); break;
            }
                else 
                    {
                        System.out.printf("%d\n",grades[i]);
                    }
        }
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
