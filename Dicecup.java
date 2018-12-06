/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicecup;

import java.util.Scanner;

/**
 *
 * @author s524878
 */
public class Dicecup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        int M;
        Scanner input = new Scanner(System.in);
        N= input.nextInt();
        M =input.nextInt();
        
       
        
        int uppervalue =0 ;
        int lowervalue =0;
        if(M < N){
            uppervalue = N +1;
            lowervalue = M+1;
        }
        else if( M == N){
        uppervalue = M +1;
        lowervalue = M +1;
    
        }
            else{
            uppervalue = M +1;
           lowervalue = N +1;
           
        }
        for (int i = lowervalue; i <= uppervalue; i++){
            System.out.println(i);
        }
    }
    
}
