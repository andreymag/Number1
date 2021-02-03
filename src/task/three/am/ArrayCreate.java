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
        int sumFirstNumThirdNum = num[num.length - 3] + num[num.length - 5];
        System.out.println(sumFirstNumThirdNum);
    }
}
