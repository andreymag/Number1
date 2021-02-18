package task.nine.am;


import java.util.Arrays;
import java.util.Scanner;

public class CycleThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        double[] array = new double[size];
        System.out.println("Введите данные в массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = Double.parseDouble(in.next());
        }
        double average = 0;
        int size2 = array.length;
        for (double v : array) {
            average += v;
        }
        average = average / size2;
        for(int s = 0 ; s < array.length ; s++)
        {
            array[s] *= average;
        }
        System.out.println(Arrays.toString(array));
    }
}
