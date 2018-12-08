/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candydivision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class CandyDivision {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //SCanner for input
        TreeSet<Long> arr1 = new TreeSet<>(); //initializing a TreeSet, as it ignores the reapeating value

        long num = input.nextLong(); //input the num
        long constant = (long) Math.sqrt(num); //makes a square root to run it till half and ignores half of the value

        for (long i = 1; i <= (long) Math.floor(constant); i++) { //runs till the half of the number
            if (num % i == 0) { //gets the common divisor

                arr1.add(num / i);
                arr1.add(i);
            }

        } 
        //creating set to ignore the repating value
        Set<Long> listwithoutDuplicates = new LinkedHashSet<Long>(arr1);
        arr1.clear();
        arr1.addAll(listwithoutDuplicates);

        Iterator<Long> itr = arr1.iterator();
        while (itr.hasNext()) {
            System.out.print((itr.next() - 1) + " "); //prints from the list (element -1)
        }
    }

}
