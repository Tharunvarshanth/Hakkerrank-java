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
public class java2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        int[][] a=new int[6][6];
        for(int j=0;j<6;j++){
            for(int i=0;i<6;i++){
            a[j][i]=input.nextInt();
                    }
    }int max=0; int tot=0;
        for(int j=0;j<4;j++){
            for(int i=0;i<4;i++){
                 tot=a[j][i]+a[j][i+1]+a[j][i+2]+
                        a[j+1][i+1]+
                         a[j+2][i]+a[j+2][i+1]+a[j+2][i+2];
                 if(max<tot) max=tot;
            }
    
} System.out.println(max);
    }
}