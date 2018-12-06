/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 *
 * @author s524878
 */
public class Check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num = 210;
int count =0;

        //while loop until it is equal to 1
        while(num != 1){
                if(num  % 2 == 0){//if the number is even
                        num = num / 2; //number is divided by 2
                        count = count + 1; //count added
                }else{ //else if the number is odd
                        num = num*3 + 1; //number is multiplied by 3 and added 1
                        count = count + 1; //count added
                }
        }
        //print the times of iteration to the window
        System.out.println(count);
       
    }
    
}
