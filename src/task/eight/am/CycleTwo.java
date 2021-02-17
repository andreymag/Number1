package task.eight.am;

import java.util.Scanner;

public class CycleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число : ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}



