
public class decreasingorder {

    public static void dec(int num){

        if (num==1){
            System.out.println(1);
            return;
        }

        System.out.println(num +"");
        dec(num-1);


    }



    public static void main(String[] args) {

        int num =10;
        dec(num);
        
    }
    
}
