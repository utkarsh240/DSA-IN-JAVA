
public class increasing_order {
    public static void inc(int n) {

        if (n == 1) {

            System.out.println(n);
            return;
        }
        inc(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        int n = 10;
        inc(n);
    }

}
