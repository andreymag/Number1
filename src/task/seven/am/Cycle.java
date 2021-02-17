package task.seven.am;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        int x, y, z;
        x = 5;
        y = 7;
        z = 9;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите данные в массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        for (int j : array)
            if (j == x || j == y || j == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
    }
}
