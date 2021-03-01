package task.finalFour.am;

import java.util.Scanner;

public class FinalFour {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку, у вас есть 3 попытки, и право на подсказку при первой попытке, если вы воспользовались подсказкой, то 2 и 3 попытки станут недоступны.");
        System.out.println("Загадка: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\".");
        String trueAnswer = "Заархивированный вирус";
        String podskazka = "Подсказка";
        String noPodskazka = "Подсказка уже недоступна!";
        String pravilno = "Правильно!";
        String noPravilno ="Обидно, приходи в другой раз!";
        String falseAnswer = "Подумай еще!";
        Scanner in = new Scanner(System.in);
        System.out.print("Попытка № 1, если вы хотите воспользоваться подсказкой введите \"Подсказка\": ");
        String answer1 = in.nextLine();
        if (answer1.equals(trueAnswer)){
            System.out.println(pravilno);
        }
        else if (answer1.equalsIgnoreCase(podskazka)){
            System.out.println("Подсказка: \"WINRAR + KASPERSKY\"");
            System.out.print("Вы воспользовались подсказкой, ваш ответ: ");
            answer1 = in.nextLine();
            if (answer1.equalsIgnoreCase(trueAnswer)){
                System.out.println(pravilno);
            }
            else {
                System.out.println(noPravilno);
            }
        }
        else {
            System.out.println(falseAnswer);
            System.out.print("Попытка № 2: ");
            answer1 = in.nextLine();
            if(answer1.equalsIgnoreCase(podskazka)){
                System.out.println(noPodskazka);
                System.out.print("Попытка № 2: ");
                answer1 = in.nextLine();
                if (answer1.equalsIgnoreCase(trueAnswer)){
                    System.out.println(pravilno);
                }
                else if(!answer1.equalsIgnoreCase(trueAnswer)) {
                    System.out.println(falseAnswer);
                    System.out.print("Попытка № 3: ");
                    answer1 = in.nextLine();
                    if (answer1.equalsIgnoreCase(podskazka)) {
                        System.out.println(noPodskazka);
                        System.out.print("Попытка № 3: ");
                        answer1 = in.nextLine();
                        if (answer1.equalsIgnoreCase(trueAnswer)) {
                            System.out.println(pravilno);
                        } else {
                            System.out.println(noPravilno);
                        }
                    } else if (answer1.equalsIgnoreCase(trueAnswer)) {
                        System.out.println(pravilno);
                    } else {
                        System.out.println(noPravilno);
                    }
                }
                else {
                    System.out.println(noPravilno);
                }
            }
            else if (answer1.equalsIgnoreCase(trueAnswer)){
                System.out.println(pravilno);
            }
            else{
                System.out.println(falseAnswer);
                System.out.print("Попытка № 3: ");
                answer1 = in.nextLine();
                if(answer1.equalsIgnoreCase(podskazka)){
                    System.out.println(noPodskazka);
                    System.out.print("Попытка № 3: ");
                    answer1 = in.nextLine();
                    if (answer1.equalsIgnoreCase(trueAnswer)){
                        System.out.println(pravilno);
                    }
                    else {
                        System.out.println(noPravilno);
                    }
                }
                else if (answer1.equalsIgnoreCase(trueAnswer)){
                    System.out.println(pravilno);
                }
                else{
                    System.out.println(noPravilno);
                }
            }
        }
    }
}
