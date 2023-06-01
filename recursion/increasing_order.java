
public class increasing_order {
    public static void inc(int n) {

        if (n == 10) {

            System.out.println(10);
            return;
        }

        System.out.println(n);
        inc(n + 1);

    }

    public static void main(String[] args) {
        int n = 1;
        inc(n);
    }

}
