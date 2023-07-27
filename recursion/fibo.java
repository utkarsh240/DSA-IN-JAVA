public class fibo {

    public static int fiboo(int n){

        if (n==0){
            return 0;
        }

        if (n==1){
            return 1;
        }

        int fib = fiboo(n-1) + fiboo(n-2);
        return fib;
    }




    public static void main(String[] args) {
        int n=50;
        System.out.println(fiboo(n));

    }
    
}
