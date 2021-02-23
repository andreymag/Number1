package task.fourteen.am;

import java.util.Arrays;

public class DataWorkFour {
    public static void main(String[] args) {
        int [] array = new int[15];
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 41) - 20);
            if(max <= array[i]){
                max = array[i];
            }
            else if (min >= array[i]){
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальное число из массива: " + max);
        System.out.println("Минимальное число из массива: " + min);
        int max1 = Math.abs(max);
        int min1 = Math.abs(min);
        int result = Math.max(max1, min1);
        System.out.println("Наибольшее по модулю число из максимального и минимального значения массива: " + result);
    }
}
