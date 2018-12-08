/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mirrorimages;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;*/
import java.util.*;

public class MirrorImages {

    public static void main(String[] args) {
        //List to keep track of the lines
        List<String> list1 = new ArrayList<>();
        //Scanner to take the value
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int count =1;

        //runs till the user value input
        while (a != 0) {
            int row = input.nextInt();
            int col = input.nextInt();
            input.nextLine();

            String d = "";
            for (int i = 0; i < row; i++) {
                d = input.nextLine();
                d = new StringBuffer(d).reverse().toString(); //Stringbuffer to reverse
                list1.add(d);
            }
            Collections.reverse(list1); //reverse the list again
            System.out.println("Test " + (count));
              for (int i = 0; i < list1.size(); i++) {
                  
                  System.out.println(list1.get(i)); //printing list
            
              }
            list1.clear();
            count ++;
            a--;
        }
    

    }
}
