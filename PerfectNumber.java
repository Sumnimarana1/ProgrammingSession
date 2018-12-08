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
        //Scanner to take the input
        Scanner input = new Scanner(System.in);
        double sum = 0;

        TreeSet<Long> arr1 = new TreeSet<>();

        //takes the input value
        long num = input.nextLong();
        long constant = (long) Math.sqrt(num);

        for (long i = 1; i <= (long) Math.floor(constant); i++) {
            if (num % i == 0) { // if num mod i is 0
                //checks for the condition
                if(num/i != 6){ 
                arr1.add(num / i); //true adds to the array
                }
              
                arr1.add(i); // adds to the array
            }

        }
        Iterator value = arr1.iterator(); 
  
        // Displaying the values after iterating through the set 
        while (value.hasNext()) { 
           sum += (long)value.next(); 
        } 
     
     //checks if the sum == num and prints if it perfect or not.
        if (sum == num) {
            System.out.println(
                    (long) num + " perfect");
        } else {
            System.out.println((long) num + " not perfect");
        }
    }

}
