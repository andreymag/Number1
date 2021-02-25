package task.five.am;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = in.nextDouble();
        System.out.println("Введите второе число: ");
        double y = in.nextDouble();
        System.out.println("Введите один из символов '+', '-', '*' или '/'");
        String z = in.next();
        if (y == 0 && z.equals("/")){
            System.out.println("Делить на ноль нельзя");
        }
        else {
            switch (z) {
                case "+":
                    System.out.println("Равно: " + (x + y));
                    break;
                case "-":
                    System.out.println("Равно: " + (x - y));
                    break;
                case "*":
                    System.out.println("Равно: " + (x * y));
                    break;
                default:
                    System.out.println("Равно: " + (x / y));
                    break;
            }
        }
    }
}