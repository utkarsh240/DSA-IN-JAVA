
// by using brute force
public class Max_sub_array_sum {
    public static void maxsubarraysum(int numbers[]){

        int current=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i+1; j<numbers.length;j++){
                int last=j;
                current=0;
                for(int k=start;k<=last;k++){
                    current += numbers[k];
                }
                    System.out.print(current+ " ");

                    if(maxSum<current){
                        maxSum=current;
                        
                    }
                

            }
        }
        System.out.println();

        System.out.println(maxSum);



    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        maxsubarraysum(numbers);
    }
    
}
