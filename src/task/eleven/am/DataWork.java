package task.eleven.am;

import java.util.Scanner;

public class DataWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String i = in.next();
        int x1 = Integer.parseInt(i);
        System.out.println("Введите второе число:");
        int j = in.nextInt();
        int result = Math.max(j, x1);
        System.out.println("Большее из введенных чисел: " + result);
        int result2 = Math.min(j, x1);
        Double x2 = Double.valueOf(result2);
        //Double x2 = (double) result2;
        System.out.println("Меньшее из введенных чисел: " + x2);
    }
}
