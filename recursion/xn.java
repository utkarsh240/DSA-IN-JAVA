public class xn {

    public static int powerx(int x , int n){

        if(n==0){
            return -1;
        }

        int pow= x*powerx(x, n-1);
        return powerx(x, n);
    }

    public static void main(String[] args) {
        int x=3;
        int n=4;

        powerx(x, n);
        System.out.println(powerx(x, n));

    }
    
}
