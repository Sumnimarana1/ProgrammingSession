/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rationalratio1;

import java.util.*;

/**
 *
 * @author s524878
 */
public class RationalRatio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tominus = 1;
        //Scanner to input
        Scanner input = new Scanner(System.in);

        //takes the value 
        String s = input.next();
        int n = input.nextInt(); //takes the input n as the number of repeating digits
        List<String> l1 = new ArrayList<>(Arrays.asList(s.split("\\."))); //makes the list as it splits at .

        if (n == l1.get(1).length()) {
            //calculates the 10 ^ power to minus
            for (int i = 0; i < n; i++) {
                tominus *= 10;
            }

            int afterminus = Math.abs(1 - tominus);
            s = s.substring(s.length() - n); //take the substring of the list
            int afterdecimal = Integer.parseInt(s);
            String value = l1.get(1);
            String toadd = "";
            for (int i = 0; i < n; i++) {
                toadd += value.charAt(i);
            }
            String newtoadd = l1.get(0) + toadd; //creates a new string

            afterdecimal = Math.abs(Integer.parseInt(l1.get(0)) - Integer.parseInt(newtoadd));
            int commondivisor = EUCLID(afterdecimal, afterminus); //gets the common divisor
            System.out.println((afterdecimal / commondivisor) + "/" + (afterminus / commondivisor)); //printing answer
        } else {
            s = l1.get(1).substring(0, l1.get(1).length() - n);
            //calculates the first 10 ^ power to minus
            for (int i = 0; i < s.length(); i++) {
                tominus *= 10;
            }
            String anothers = l1.get(1).substring(l1.get(1).length() - n);
            s = l1.get(0) + s;
            anothers = s + anothers;

            int toanotherminus = 1;
            int lengthofnaother = l1.get(1).length();
            //for loop to calulate the next 10^ power to minus
            for (int i = 0; i < lengthofnaother; i++) {
                toanotherminus *= 10;
            }
            int value1 = Integer.parseInt(s) - Integer.parseInt(anothers);
            int value2 = tominus - toanotherminus;
            int commondivisor = EUCLID(value1, value2); //gets the common divisor
            System.out.println(value1 / commondivisor + "/" + value2 / commondivisor);
        }
    }

    public static int EUCLID(int a, int b) { //EUCLID to take calculate the common divisor
        if (b == 0) {
            return a;
        }
        return EUCLID(b, a % b);
    }
}
