/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author USER
 */
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class javacomparater {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
          ArrayList<String> list=new ArrayList<String>();
          ArrayList listnum=new ArrayList();
          
        for(int i=0;i<n;i++){
            list.add(scan.next());
            listnum.add(scan.nextInt());            
        }
         for(int i=0;i<n-1;i++){
             
         }
    }
    
}
