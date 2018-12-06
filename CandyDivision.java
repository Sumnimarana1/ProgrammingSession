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
        Scanner input = new Scanner(System.in);
        TreeSet<Long> arr1 = new TreeSet<>();

        long num = input.nextLong();
        long constant = (long) Math.sqrt(num);

        for (long i = 1; i <= (long) Math.floor(constant); i++) {
            if (num % i == 0) {

                arr1.add(num / i);
                arr1.add(i);
            }

        }
        Set<Long> listwithoutDuplicates = new LinkedHashSet<Long>(arr1);
        arr1.clear();
        arr1.addAll(listwithoutDuplicates);

        Iterator<Long> itr = arr1.iterator();
        while (itr.hasNext()) {
            System.out.print((itr.next() - 1) + " ");
        }
    }

}
