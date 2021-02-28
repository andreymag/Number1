package task.finalThree.am;

import java.util.*;

public class FinalThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int size = in.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            array[i] = in.next();
        }
        String maxChar = array[0];
        for (String s : array) {
            if (Chars(s) > Chars(maxChar))
                maxChar = s;
        }
        System.out.println("Ответ: " + maxChar);
    }

    private static int Chars(String line){
        StringBuilder uniqChar = new StringBuilder();
        String currChar;
        for (int i=0;i<line.length();i++) {
            currChar = String.valueOf(line.charAt(i));
            if (uniqChar.indexOf(currChar)==-1){
                uniqChar.append(currChar);
            }
        }
        return uniqChar.length();
    }
}

