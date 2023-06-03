import java.util.Scanner;

public class decreasingorder {

    public static void dec(int num) {

        if (num == 1) {
            System.out.println(num);
            return;
        }

        System.out.println(num + "");
        dec(num - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        dec(num);

    }

}
