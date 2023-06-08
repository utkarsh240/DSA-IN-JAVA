

public class pairs_in_array {
    public static void pairs(int numbers[]){

        int tp=0;

        for(int i=0 ;i<numbers.length; i++ ){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("["+curr+ ","+ numbers[j] +"]" );
                tp++;
            } 
            System.out.println();
        }
        System.out.println("total pairs ="+ tp);


    }

    public static void main(String[] args) {
        int numbers[]= {4,8,2,9,1};
        pairs(numbers);
    }
    
}
