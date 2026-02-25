package javahw;

public class SumofEven {

    public static void main(String args[]) {
        int i = 2;
        int sum = 0;

        while (i <= 100) {
            sum = sum + i;
            i = i + 2;

        }
        System.out.println("sum of even number between 0 and 100 is:" + sum);

    }

}
