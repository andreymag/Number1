package task.six.am;


import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int[] a = {1, 2};
        int b = in.nextInt();
        int m1 = a[0];
        int m2 = a[1];
        if (b == m1 || b == m2) {
            if (b == m2) {
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int[] c = {1, 2, 3, 4};
                int d = in.nextInt();
                int m3 = c[0];
                int m4 = c[1];
                int m5 = c[2];
                int m6 = c[3];
                if (d == m3 || d == m4 || d == m5 || d == m6){
                    if (d == m3) {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double meter = 1 * num;
                        double mile = meter * 0.000621371;
                        double yard = meter * 1.09361;
                        double foot = meter * 3.28084;
                        String firstResult = String.format("%.0f", meter);
                        String secondResult = String.format("%.3f", mile);
                        String thirdResult = String.format("%.2f", yard);
                        String fourthResult = String.format("%.2f", foot);
                        System.out.println("Метры: " + firstResult);
                        System.out.println("Мили: " + secondResult);
                        System.out.println("Ярды: " + thirdResult);
                        System.out.println("Футы: " + fourthResult);
                        return;
                    } else if (d == m4) {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double mile = 1 * num;
                        double meter = mile * 1609.34;
                        double yard = mile * 1760;
                        double foot = mile * 5280;
                        String firstResult = String.format("%.3f", meter);
                        String secondResult = String.format("%.0f", mile);
                        String thirdResult = String.format("%.0f", yard);
                        String fourthResult = String.format("%.0f", foot);
                        System.out.println("Метры: " + firstResult);
                        System.out.println("Мили: " + secondResult);
                        System.out.println("Ярды: " + thirdResult);
                        System.out.println("Футы: " + fourthResult);
                        return;
                    } else if (d == m5) {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double yard = 1 * num;
                        double meter = yard * 0.9144;
                        double mile = yard * 0.000568182;
                        double foot = yard * 3;
                        String firstResult = String.format("%.3f", meter);
                        String secondResult = String.format("%.4f", mile);
                        String thirdResult = String.format("%.0f", yard);
                        String fourthResult = String.format("%.0f", foot);
                        System.out.println("Метры: " + firstResult);
                        System.out.println("Мили: " + secondResult);
                        System.out.println("Ярды: " + thirdResult);
                        System.out.println("Футы: " + fourthResult);
                        return;
                    } else {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double foot = 1 * num;
                        double meter = foot * 0.3048;
                        double mile = foot * 0.000189394;
                        double yard = foot * 0.333333;
                        String firstResult = String.format("%.3f", meter);
                        String secondResult = String.format("%.4f", mile);
                        String thirdResult = String.format("%.2f", yard);
                        String fourthResult = String.format("%.0f", foot);
                        System.out.println("Метры: " + firstResult);
                        System.out.println("Мили: " + secondResult);
                        System.out.println("Ярды: " + thirdResult);
                        System.out.println("Футы: " + fourthResult);
                        return;
                    }
                }
                return;
            } else
                System.out.println("Выберите единицу измерения: 1 - миллиграм, 2 - грамм, 3 - киллограмм, 4 - тонна");
                int[] f = {1, 2, 3, 4};
                int g = in.nextInt();
                int m7 = f[0];
                int m8 = f[1];
                int m9 = f[2];
                int m10 = f[3];
                if (g == m7 || g == m8 || g == m9 || g == m10) {
                    if (g == m7) {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double milligram = 1 * num;
                        double gram = milligram * 0.001;
                        double kilogram = milligram * 1e-6;
                        double ton = milligram * 1e-9;
                        String firstResult = String.format("%.3f", milligram);
                        String secondResult = String.format("%.3f", gram);
                        String thirdResult = String.format("%.3f", kilogram);
                        String fourthResult = String.format("%.3f", ton);
                        System.out.println("Миллиграммы: " + firstResult);
                        System.out.println("Граммы: " + secondResult);
                        System.out.println("Киллограммы: " + thirdResult);
                        System.out.println("Тонны: " + fourthResult);
                    } else if (g == m8) {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double gram = 1 * num;
                        double milligram = gram * 1000;
                        double kilogram = gram * 0.001;
                        double ton = gram * 1e-6;
                        String firstResult = String.format("%.3f", milligram);
                        String secondResult = String.format("%.3f", gram);
                        String thirdResult = String.format("%.3f", kilogram);
                        String fourthResult = String.format("%.3f", ton);
                        System.out.println("Миллиграммы: " + firstResult);
                        System.out.println("Граммы: " + secondResult);
                        System.out.println("Киллограммы: " + thirdResult);
                        System.out.println("Тонны: " + fourthResult);
                    } else if (g == m9) {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double kilogram = 1 * num;
                        double milligram = kilogram * 1e+6;
                        double gram = kilogram * 1000;
                        double ton = kilogram * 0.001;
                        String firstResult = String.format("%.3f", milligram);
                        String secondResult = String.format("%.3f", gram);
                        String thirdResult = String.format("%.3f", kilogram);
                        String fourthResult = String.format("%.3f", ton);
                        System.out.println("Миллиграммы: " + firstResult);
                        System.out.println("Граммы: " + secondResult);
                        System.out.println("Киллограммы: " + thirdResult);
                        System.out.println("Тонны: " + fourthResult);
                    } else {
                        System.out.println("Введите число:");
                        double num = in.nextDouble();
                        double ton = 1 * num;
                        double milligram = ton * 1e+9;
                        double gram = ton * 1e+6;
                        double kilogram = ton * 1000;
                        String firstResult = String.format("%.3f", milligram);
                        String secondResult = String.format("%.3f", gram);
                        String thirdResult = String.format("%.3f", kilogram);
                        String fourthResult = String.format("%.3f", ton);
                        System.out.println("Миллиграммы: " + firstResult);
                        System.out.println("Граммы: " + secondResult);
                        System.out.println("Киллограммы: " + thirdResult);
                        System.out.println("Тонны: " + fourthResult);
                    }
                }

        }
    }
}
