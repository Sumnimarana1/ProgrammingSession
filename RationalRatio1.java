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
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int n = input.nextInt();
        List<String> l1 = new ArrayList<>(Arrays.asList(s.split("\\.")));

        if (n == l1.get(1).length()) {
            for (int i = 0; i < n; i++) {
                tominus *= 10;
            }

            int afterminus = Math.abs(1 - tominus);
            s = s.substring(s.length() - n);
            int afterdecimal = Integer.parseInt(s);
            String value = l1.get(1);
            String toadd = "";
            for (int i = 0; i < n; i++) {
                toadd += value.charAt(i);
            }
            String newtoadd = l1.get(0) + toadd;

            afterdecimal = Math.abs(Integer.parseInt(l1.get(0)) - Integer.parseInt(newtoadd));
            int commondivisor = EUCLID(afterdecimal, afterminus);
            System.out.println((afterdecimal / commondivisor) + "/" + (afterminus / commondivisor));
        } else {
            s = l1.get(1).substring(0, l1.get(1).length() - n);

            for (int i = 0; i < s.length(); i++) {
                tominus *= 10;
            }
            String anothers = l1.get(1).substring(l1.get(1).length() - n);
            s = l1.get(0) + s;
            anothers = s + anothers;

            int toanotherminus = 1;
            int lengthofnaother = l1.get(1).length();
            for (int i = 0; i < lengthofnaother; i++) {
                toanotherminus *= 10;
            }
            int value1 = Integer.parseInt(s) - Integer.parseInt(anothers);
            int value2 = tominus - toanotherminus;
            int commondivisor = EUCLID(value1, value2);
            System.out.println(value1 / commondivisor + "/" + value2 / commondivisor);
        }
    }

    public static int EUCLID(int a, int b) {
        if (b == 0) {
            return a;
        }
        return EUCLID(b, a % b);
    }
}
