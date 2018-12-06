/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumkindofproblem;

/**
 *
 * @author s524878
 */
import java.util.Scanner;
import java.util.ArrayList;
public class SumKindOfProblem {

    /**
     * @param args the command line arguments
     */


    public static double formula(double a, double n, double d) {
        double sum = (n / 2) * ((2 * a) + ((n - 1) * d));
        return sum;
    }

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        ArrayList<Double> cou = new ArrayList<Double>();
        ArrayList<Double> sum1 = new ArrayList<Double>();
        ArrayList<Double> sum2 = new ArrayList<Double>();
        ArrayList<Double> sum3 = new ArrayList<Double>();
        double count;
        double n;
        double loop = o.nextDouble();
        for (int i = 0; i < loop; i++) {
            count = o.nextDouble();
            cou.add(count);
            n = o.nextInt();
            sum1.add(formula(1, n, 1));
            sum2.add(formula(1, n, 2));
            sum3.add(formula(2, n, 2));
        }
        for (int i = 0; i < cou.size(); i++) {
            System.out.println(cou.get(i).intValue()+" "+sum1.get(i).intValue()+" "+sum2.get(i).intValue()+" "+sum3.get(i).intValue());
        }
    }

}
