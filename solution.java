import java.util.Scanner;

public class solution{

    public class hello{
      
       public void sum(int n , int m){

            Scanner sc = new Scanner(System.in);

            n=sc.nextInt();
            m=sc.nextInt();

            System.out.println(n+m);
        }

    }

    public static void main(String[] args) {

        
        hello obj = new hello();
        obj.sum(2,3);
    }
}