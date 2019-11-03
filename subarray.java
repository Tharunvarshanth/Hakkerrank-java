/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author USER
 */
public class subarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=my.nextInt();
            if(a[i]<0){
                count++;}
        }
        
        
        
        for(int j=0;j<a.length-1;j++){
            
            int tot=a[j];
            for(int z=j+1;z<a.length;z++){
                tot+=a[z];
                if(tot<0){
                    count++;
                }
                
            }
        }
        System.out.println(count);
    
    
    
    
    
    
    
    }
    
}
