/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raggedright;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s524878
 */
public class RaggedRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> para = new ArrayList<>();
        int count = 0;
        int sum = 0;
        int longer_index = 0;
        int long_length = 0;
        String temp = null;
        while (sc.hasNextLine()) {
            
            temp = sc.nextLine();
            //System.out.println(temp);
                long_length = temp.length();
                longer_index = count;
          
            para.add(temp);

            count++;
        }

        if (longer_index == para.size() - 1) {

            para.remove(para.size() - 1);
        } else {

            para.remove(longer_index);
            para.remove(para.size() - 1);
        }

        for (int i = 0; i < para.size(); i++) {

            sum += (long_length - para.get(i).length()) * (long_length - para.get(i).length());
        }

        System.out.println(sum);
    }

}
