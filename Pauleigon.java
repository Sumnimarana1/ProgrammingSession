/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pauleigon;

import java.util.Scanner;

public class Pauleigon {

    public static void main(String[] args) {
        //Scanner input
        Scanner input = new Scanner(System.in);

        //takes the value from the user
        int N = input.nextInt();
        int P = input.nextInt();
        int Q = input.nextInt();
        int somenum = P + Q; //sum of P and Q
        int num2 = somenum % N;
        //checks for the condition
        if (num2 == 0) {
            //if sum of P and Q mod 2 is 0
            if ((somenum/ N) % 2 == 0) {
                System.out.println("paul"); //print the paul
            }
            else{
                System.out.println("opponent"); // prints opponent
            }
        }
        else{
            //let the other num be(Sumnum/N) +1
            num2 = (somenum/N) + 1;
            if(num2 % 2 == 0){
                System.out.println("opponent");
            }
            else{
                System.out.println("paul");
            }
        }

    }

}
