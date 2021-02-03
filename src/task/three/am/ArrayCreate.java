package task.three.am;




public class ArrayCreate {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 5;
        num[1] = 4;
        num[2] = 3;
        num[3] = 2;
        num[4] = 1;
        int change = num[num.length - 5];
        num[num.length - 5] = num[4];
        num[4] = change;
        System.out.println("Cумма первого и среднего элемента массива равна " + (num[num.length - 3] + num[num.length - 5]));
        /*
        или сделать вывод так:
        int sumFirstNumThirdNum = num[num.length - 3] + num[num.length - 5];
        System.out.println("Cумма первого и среднего элемента массива равна " + sumFirstNumThirdNum);
         */
    }
}
