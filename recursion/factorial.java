public class factorial {



        public static int facto(int n){

            if( n==1){
                return 1;
            }

            int m = n*facto(n-1);
            return m;

        }
        

        public static void main(String[] args) {

            int n=5;
            facto(n);
            System.out.println(facto(n));
            
        }
    }
    
