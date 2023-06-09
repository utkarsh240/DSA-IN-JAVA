public class prefixSum {
    public static void maxsubarraysum(int numbers[]){

        int current=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];

        prefix[0] = numbers[0];
        // calc prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for (int j=i+1; j<numbers.length;j++){
                int last=j;
                current= start== 0? prefix[last] :  prefix[last] - prefix[start-1];
               
                   

                    if(maxSum<current){
                        maxSum=current;
                        
                    }
                

            }
        }

        System.out.println(maxSum);



    }
    public static void main(String[] args) {
        int numbers[] ={-2,-3,4,-1,-2,1,5,-3};
        maxsubarraysum(numbers);
    }
    
}

    

