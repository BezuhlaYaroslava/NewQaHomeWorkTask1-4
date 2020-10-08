package lesson1;

import java.util.Arrays;
import java.util.Random;

public class TestTaskOneAndTaskTwo {

    public static void testArraysRandomAndEvenNumbers(int[] a){ //Заполнение массива рандомными числами и подсчет четных
        int j = 0;
        for(int i = 0; i<a.length; i++){
            Random random = new Random();
            a[i] = random.nextInt(9);
            if(a[i] % 2 == 0){
                j++;
            }
        }
        System.out.print(Arrays.toString(a));
        System.out.println("\nКоличество четных чисел: " + j);
    }

    public static void testArraysSort(int[] b) { //Сортировка вставками
        testArraysRandomAndEvenNumbers(b);

        int max = 0;
        int i = 0;
        int j = 1;
        while(j<b.length){
            max = b[j];
            i = j-1;
            while(i>=0 && b[i]>max){
                b[i+1] = b[i];
                i = i-1;
                b[i+1]=max;
            }
            j++;
        }System.out.print(Arrays.toString(b));
        }
}
