public class kadanes_algo {

    public static void kadane(int num[]) {


        int ms = Integer.MIN_VALUE;
        int cs =0;

        for(int i=0;i<num.length;i++){
            cs = cs+ num[i];
            
            if(cs<0){
                cs =0;
            }
            
            ms = Math.max(cs,ms);
            
        }
        System.out.println(ms);


        
    }
    
        public static void main(String[] args) {
            int num[]= {-3,-1,-8,-7,-4};
            kadane(num);
            
        }
    
}
