/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darts;

/**
 *
 * @author s524878
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Darts {

    public static void main(String[] args) {
        //scanner to input
        Scanner input = new Scanner(System.in);
        Integer Output = 0;
        //takes the input T
        int T = input.nextInt();
        double x = 0;
        double y = 0;
        //while T is greater than or equals to 1
        while (T >= 1) {
            int n = input.nextInt();
            for (int i = 0; i < n; i++) {
                x = input.nextInt();
                y = input.nextInt();
                double ans = Math.sqrt((x * x) + (y * y)); //calculated the distance
              
                Integer ans2 = (int) (long) Math.ceil(ans/20); //takes the ceil after dividing by 20
                ans2 = 11 - ans2;
                //Integer ans2 = (int) (long) Math.floor(ans);
           
                Output += ans2;
            }

            T--;
        }
        System.out.print(Math.floor(Output));// prints the output
    } 

}
