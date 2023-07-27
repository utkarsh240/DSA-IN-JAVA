public class sumof1stn{

    public static int firn(int n){

        if(n==1){

            return 1;
        }

        int sn1= firn(n-1);
        int sn = n + sn1;
        return sn;

    }



    public static void main(String[] args) {

        int n=3;
        System.out.println(firn(n));
        
    }
}