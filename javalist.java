/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.LinkedList;

/**
 *
 * @author USER
 */
public class javalist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
       
        int n=in.nextInt();
         LinkedList<Integer> list=new LinkedList<>();
         
        for(int i=0;i<n;i++){
           int value=in.nextInt();
           list.add(value);
        }
        int test=in.nextInt();
        
        for(int z=0;z<test;z++){
        String str1=in.next();         
         
        if(str1.equals("Insert")){
            
            int j=in.nextInt();
             int value=in.nextInt();
               list.add(j,value); }
        
        else if(str1.equals("Delete")){ 
            int j=in.nextInt();
            list.remove(j);      
             }        
    }in.close();
        
        for(int num:list){
            System.out.println(num+" ");
        }
        
        
    }
    
}
