/*
 * Class: 44-499 Programming Challenges
 * Author: Sumnima Rana
 * Description: Problem 1.6.8 ( Australian Voting)
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
*/
package popularity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author s524878
 */
public class Popularity {

    public static void main(String[] args) {
        int count;
        int numcan;
        int index = 0;
        int num1 = 0, num2 = 0, num3 = 0;
        int minIndex = 0;
        int maxIndex = 0;

        int countingdigit = 0;

        List<List<Integer>> arraylist1 = new ArrayList<List<Integer>>();
        List<Integer> arraylist2 = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        List<Integer> newsublist = new ArrayList<>();
        ArrayList<Integer> newlist = new ArrayList<>();
        ArrayList<Integer> newlist2 = new ArrayList<>();
        ArrayList<Integer> minindexlist = new ArrayList<>();
        String[] candi;
        String somename;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
        System.out.println();
        do {
            numcan = input.nextInt();
            candi = new String[numcan];
            //input.next();
            input.nextLine();

            somename = input.nextLine();
            candi[0] = somename;
            for (int k = 1; k < numcan; k++) {
                somename = input.nextLine();
                candi[k] = somename;
            }
            Integer valnum = 0;
            int counting = 1;
            //while (!(line = input.nextLine()).isEmpty()) {
            //do {
            while (counting <= 5) {

                for (int i = 0; i < numcan; i++) {
                    arraylist2.add(input.nextInt());
                }
                sublist = new ArrayList<>(arraylist2);
                if (sublist.size() <= numcan) {
                    arraylist1.add(index, sublist);

                    index++;
                }
                arraylist2.clear();

                counting++;

            }

            newlist = makinglist(numcan, arraylist1);
            while (arraylist1.get(0).size() != 2) {
                //System.out.println(arraylist1.get(0));
                //System.out.println(arraylist1);
                newlist = makinglist(numcan, arraylist1);
                //System.out.println("newlist is" + newlist);

                minIndex = newlist.indexOf(Collections.min(newlist));
                minindexlist.add(minIndex);
                System.out.println(minindexlist);
                int[] newlist22 = new int[newlist.size()];
                for (int i = 0; i < newlist.size(); i++) {
                    newlist22[i] = newlist.get(i);
                }
                for (int i = 0; i < newlist22.length; i++) {
                    System.out.println(newlist22[i]);
                }
                if (minindexlist.size() > 1) {
                    for (int i = 0; i < minindexlist.size(); i++) {
                        if (minIndex == minindexlist.get(i)) {
                            minIndex = getSecondSmallest(newlist22, newlist22.
                                    length);
                            minindexlist.add(minIndex);
                        }
                    }
                }

                for (int row = 0; row < arraylist1.size(); row++) {
                    newsublist = arraylist1.get(row);

                    Integer num = minIndex + 1;

                    newsublist.remove(num);

                }

            }
            count = count - 1;

        } while (count >= 1);

        for (int i = 1; i < numcan + 1; i++) {
            for (int row = 0; row < arraylist1.size(); row++) {
                int numberlist = (arraylist1.get(row).get(0));
                if (numberlist == i) {
                    countingdigit++;
                }
            }
            newlist2.add(countingdigit);
            countingdigit = 0;
        }
        maxIndex = newlist2.indexOf(Collections.max(newlist2));
        //System.out.println("maxindex is: " + maxIndex);

        /*for (int i = 0; i < newlist2.size(); i++) {
            System.out.println(newlist2.get(i));
        }

        for (int i = 0; i < candi.length; i++) {
            System.out.println("candi is " + candi[i]);
        }

        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println(arraylist1.get(i));
        }*/

        //System.out.println(candi[maxIndex]);

    }

    public static ArrayList<Integer> makinglist(int numcan, List<List<Integer>> 
            arraylist1) {
        int countingdigit = 0;
        ArrayList<Integer> newlist = new ArrayList<>();
        for (int i = 1; i < numcan + 1; i++) {
            for (int row = 0; row < arraylist1.size(); row++) {
                int numberlist = (arraylist1.get(row).get(0));
                if (numberlist == i) {
                    countingdigit++;
                }

            }
            newlist.add(countingdigit);
            countingdigit = 0;
        }
        return newlist;
    }

    public static int getSecondSmallest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0  
    }
}
