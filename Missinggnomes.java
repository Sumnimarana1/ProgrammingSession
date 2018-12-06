/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missinggnomes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missinggnomes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int range = input.nextInt();
        int num = input.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list1.add(input.nextInt());
        }
       
        int breakpoint = 0;
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> merged = new ArrayList<>();;
        for (int i = 1; i < range + 1; i++) {
            if (new ArrayList<>(list1).contains(i)) {
                continue;
            } else {
                list3.add(i);
            }
        }  
        
         int i = 0;
        int j = 0;
        while(i < list1.size() && j < list3.size())
        {
            if(list1.get(i) < list3.get(j))
            {
                merged.add(list1.get(i));
                i++;
            }
            else
            {
                merged.add(list3.get(j));
                j++;
            }
        }
        if(j >= list3.size())
        {
            merged.addAll(list1.subList(i, list1.size()));
        }
        else
        {
            merged.addAll(list3.subList(j, list3.size()));
        }
        
        for(int k = 0; k < merged.size(); k++)
        {
            System.out.println(merged.get(k));
        }
     
    }
}
