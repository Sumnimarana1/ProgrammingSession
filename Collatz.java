/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatz;

  import java.util.ArrayList;
import java.util.Scanner;
public class Collatz {



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //while scanner has something to read
        while(input.hasNext())
        {
            int first = scan.nextInt();
            int second = scan.nextInt();
            if(first == 0 && second == 0)
            {
                break;
            }
            int meet = 0, stepOne = 0, stepTwo = 0;
            ArrayList<Integer> arrayOne = construct(first);
            ArrayList<Integer> arrayTwo = construct(second);
            for(int i = 0; i < arrayOne.size(); i++)
            {
                if(arrayTwo.contains(arrayOne.get(i)))
                {
                    meet = arrayOne.get(i);
                    stepOne = i;
                    stepTwo = arrayTwo.indexOf(meet);
                    break;
                }
            }
            System.out.println(first + " needs " + stepOne + " steps, " + second + " needs " + stepTwo + " steps, " + "they meet at " + meet);
        }
    }
    private static ArrayList construct(int i)
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(i);
        while(i != 1)
        {
            if(i % 2 == 0)
            {
                i /= 2;
            }
            else
            {
                i = (3 * i) + 1;
            }
            array.add(i);
        }
        return array;
    }
}

