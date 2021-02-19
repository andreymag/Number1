package task.ten.am;

import java.util.Arrays;
import java.util.Scanner;

public class CycleFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        int[][] array = new int[size1][size2];
        System.out.println("Введите данные в матрицу: ");
        for (int i = 0; i < size1; i++) {
            for(int j=0; j<array[i].length;j++){
                array[i][j] = in.nextInt();
            }
        }
        int[] row = array [0];
        for(int s = 0 ; s < row.length ; s++) {
            row[s] *= 3;
        }
        System.out.println("Первоя строка матрицы умноженная на 3: " + Arrays.toString(row));

    }
}
