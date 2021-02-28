package task.thirteen.am;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataWorkThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String slova1 = in.nextLine();
        String[] s1 = slova1.split(" ");
        if (slova1.equals("") || s1.length == 0){
            System.out.println("Вы не ввели слов");
        }
        else if (s1.length == 1){
            System.out.println("Вы ввели одно слово");
        }
        else {
            Pattern latin = Pattern.compile("\\b[A-Za-z]+\\b");
            Matcher m = latin.matcher(slova1);
            StringBuilder slova2 = new StringBuilder();
            while (m.find()) {
                slova2.append(m.group()).append(" ");
            }
            System.out.println(slova2);
            int count = 0;
            for (int i = 0; i < slova2.length(); i++) {
                if(slova2.charAt(i) == ' '){
                    count++;
                }
            }
            System.out.println("Кол-во слов с латинецей: " + count);
        }
    }
}
