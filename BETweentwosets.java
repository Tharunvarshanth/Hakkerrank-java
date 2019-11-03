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
public class BETweentwosets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);   
        
        int n=input.nextInt();  int m=input.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=input.nextInt();
        }
        int cnt=0;
        for (int k=1; k<=100; k++)
    {
        int flag = 1;
        for (int i=0; i<n; i++)
            if (k % a[i] != 0)
                flag = 0;
        for (int i=0; i<m; i++)
            if (b[i] % k != 0)
                flag = 0;
        if (flag == 1)
            cnt ++;
    }
    
        
        
        
        
        
        
        
        
        
    }
    
}
