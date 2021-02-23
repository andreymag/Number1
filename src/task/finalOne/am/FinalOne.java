package task.finalOne.am;

import java.util.Scanner;

public class FinalOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        double kurs = in.nextDouble();
        System.out.println("Количество рублей: ");
        double quantity = in.nextDouble();
        String total = String.format("%.2f", quantity / kurs);
        System.out.println("Итого: " + total + " долларов");
    }
}
