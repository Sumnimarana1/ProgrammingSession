/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectnumber;

/**
 *
 * @author s524878
 */
import java.util.*;

public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        TreeSet<Long> arr1 = new TreeSet<>();

        long num = input.nextLong();
        long constant = (long) Math.sqrt(num);

        for (long i = 1; i <= (long) Math.floor(constant); i++) {
            if (num % i == 0) {
                if(num/i != 6){
                arr1.add(num / i);
                }
              
                arr1.add(i);
            }

        }
        Iterator value = arr1.iterator(); 
  
        // Displaying the values after iterating through the set 
        while (value.hasNext()) { 
           sum += (long)value.next(); 
        } 
     
        if (sum == num) {
            System.out.println(
                    (long) num + " perfect");
        } else {
            System.out.println((long) num + " not perfect");
        }
    }

}
