public class Sumofn {
    public static int totalsum(int n){
        if (n==1){
            return 1;
        }
        int sn1 = totalsum(n-1);
        int Sn = n + sn1;
        return Sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(totalsum(n));

    }
}
