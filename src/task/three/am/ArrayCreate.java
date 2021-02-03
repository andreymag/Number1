package task.three.am;




public class ArrayCreate {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 5;
        num[1] = 4;
        num[2] = 3;
        num[3] = 2;
        num[4] = 1;
        int change = num[0];
        num[0] = num[4];
        num[4] = change;
        System.out.println(num[num.length - 5]+num[num.length - 3]);
    }
}
