/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.*;

public class javaarraylist {
   
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in=new Scanner(System.in);
       int test=in.nextInt();
       ArrayList<Integer> list=new ArrayList<Integer>();
       ArrayList<ArrayList<Integer>> lines=new ArrayList<ArrayList<Integer>>();
       
       for(int i=0;i<test;i++){
           int n=in.nextInt();
           for(int j=0;j<n;j++){
               list.add(in.nextInt());
           }
           lines.add(list);
       }
       int z=in.nextInt();
       for(int x=0;x<z;x++){
           int ch1=in.nextInt();
           int ch2=in.nextInt();
           
           if(ch2>lines.get(ch1).get(ch2-1))
               System.out.println("ERROR");
           else
               System.out.println(lines.get(ch1-1).get(ch2-1));
       }
        
       
      
        
        
        
    }}