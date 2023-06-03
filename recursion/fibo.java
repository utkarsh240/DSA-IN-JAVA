public class fibo {

    static int fibonum( int n){

        if(n<2){
            return n;
        }

        return fibonum(n-1)+ fibonum(n-2);
    }

    public static void main(String[] args) {

        int n = 6;


        System.out.println(fibonum(n));

    }
}
