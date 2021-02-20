package task.twelve.am;

import java.util.Locale;
import java.util.Scanner;

public class DataWorkTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String i = in.nextLine();
        boolean check1 = i.contains("Java");
        boolean check2 = i.startsWith("I like");
        boolean check3 = i.endsWith("!!!");
        if (check1 && check2 && check3){
            System.out.println(i.toUpperCase(Locale.ROOT));
            String jovo = i.replace("a",  "o");
            System.out.println(jovo.substring(7, 11));
        }
    }
}
