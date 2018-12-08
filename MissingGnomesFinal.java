/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missinggnomesfinal;

/**
 *
 * @author s524878
 */
public class MissingGnomesFinal {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        //initializing indexes for arrayofgnmoes
        int i = 0;
        int j = 0, k = 0; //indexes for array1 and array2
        int size = scan.nextInt(); //taking the size
        //Number of known gnomes
        int gnome = scan.nextInt(); 
    
        boolean mark[] = new boolean[size];
        int array1[] = new int[size];
        int array2[] = new int[gnome];

        int arrayofgnmoes[] = new int[size - gnome];
        //Places gnown gnomes into gnomes[] and marks their number in mark[]
        for(int m = 0; m < array2.length; m++)
        {
            gnome = scan.nextInt();
            mark[gnome - 1] = true;
            array2[m] = gnome;
        }
        //Locates missing gnomes and places them inside arrayofgnmoes[] in numerical order
        for(int m = 0; m < size; m++)
        {
            if(!mark[m])
            {
                arrayofgnmoes[i] = m + 1;
                i++;
            }
        }
        for(i = 0, j = 0; i < arrayofgnmoes.length && j < array2.length; k++)
        {
            if(arrayofgnmoes[i] < array2[j])
            {
                array1[k] = arrayofgnmoes[i];
                i++;
            }
            else
            {
                array1[k] = array2[j];
                j++;
            }
        }

        //Adding the reamining of the numbers to answere[], it adds the remainder of gnomes[] to answer[]
        if(j >= array2.length)
        {
            for( ; i < arrayofgnmoes.length; i++, k++)
            {
                array1[k] = arrayofgnmoes[i];
            }
        }
        else
        {
            for( ; j < array2.length; j++, k++)
            {
                array1[k] = array2[j];
            }
        }
        for(k = 0; k < array1.length; k++)
        {
            System.out.println(array1[k]); //answer
        }
    }
    
}
