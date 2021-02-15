package task.four.am;




import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double average;
        average = (x + y + z) / 3;
        System.out.println(average);
        int result = (int)Math.floor(average / 2);
        //проверка округления среднего арифметического делённого на 2
        System.out.println(result);
        if (result > 3){
            System.out.println("Программа выполнена корректно");
        }


    }
}
