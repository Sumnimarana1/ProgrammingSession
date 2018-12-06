/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boosbattle;

/**
 *
 * @author s524878
 */
import java.util.*;
public class BoosBAttle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if( n <= 2){
            System.out.println(1);
        }else{
            System.out.println(n-2);
        }
	
    }
}
