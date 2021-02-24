package task.finalTwo.am;

import java.util.Arrays;
import java.util.Scanner;

public class FinalTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввод: ");
        String vvod = in.nextLine();
        char [] mas = vvod.toCharArray();
        if (check(mas)) {
            int total = 0;
            System.out.println("Уравнение введено верно");
            if(mas[0] == 'x' && mas[1] == '+') {
                total = (int) mas[4] - (int) mas[2];
            }
            else if(mas[2] == 'x' && mas[1] == '+') {
                total = (int) mas[4] - (int) mas[0];
            }
            else if(mas[4] == 'x' && mas[1] == '+') {
                System.out.println(Arrays.toString(mas));
                total = (int) mas[0] + (int) mas[2];
            }
            else if(mas[0] == 'x' && mas[1] == '-') {
                System.out.println(Arrays.toString(mas));
                total = (int) mas[2] + (int) mas[4];
            }
            else if(mas[2] == 'x' && mas[1] == '-') {
                total = (int) mas[0] - (int) mas[4];
            }
            else if(mas[4] == 'x' && mas[1] == '-') {
                total = (int) mas[0] - (int) mas[2];
            }
            System.out.println("Вывод: " + total);
        } else {
            System.out.println("Уравнение введено не верно");
        }
    }

    public static boolean check (char [] mas) {
        if (mas[3] == '=' && (mas[1] == '+' || mas[1] == '-') && (mas[0] == 'x' || mas[2] == 'x' || mas[4] == 'x')
                && mas.length == 5 ) {
            if (mas[0] == 'x' && Character.isDigit(mas[2]) && Character.isDigit(mas[4])) {
                return true;
            }
            else if (mas[2] == 'x' && Character.isDigit(mas[0]) && Character.isDigit(mas[4])) {
                return true;
            }
            else if (mas[4] == 'x' && Character.isDigit(mas[2]) && Character.isDigit(mas[0])) {
                return true;
            }
            else
                return false;
        }
        else
           return false;
    }
}
