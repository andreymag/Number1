package task.thirteen.am;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DataWorkThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        List<String> list = new ArrayList<>();
        Pattern latin = Pattern.compile("\\b[A-Za-z]+\\b");
        for (String s2 : s1){
            if (latin.matcher(s2).matches()){
                list.add(s2);
            }
        }
        System.out.println(String.join(" ", list));
        if (list.size() > 1){
            System.out.println("Кол-во слов с латинецей: " + list.size());
        }
        else if (list.size() == 1){
            System.out.println("Вы ввели одно слово");
        }
        else {
            System.out.println("Вы не ввели слов");
        }
    }
}
