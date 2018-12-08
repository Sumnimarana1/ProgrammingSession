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
        //initializing variable
        int N;
        int M;
        //scanner for input
        Scanner input = new Scanner(System.in);
        //takes the input M and N
        N= input.nextInt();
        M =input.nextInt();
        
       
        
        int uppervalue =0 ;
        int lowervalue =0;

        //if M is less than N
        if(M < N){
            uppervalue = N +1;
            lowervalue = M+1;
        }
        //else if both are equal
        else if( M == N){
        uppervalue = M +1;
        lowervalue = M +1;
    
        }
            else{
            uppervalue = M +1;
           lowervalue = N +1;
           
        }
        //goes until the lower value
        for (int i = lowervalue; i <= uppervalue; i++){
            System.out.println(i);
        }
    }
    
}
