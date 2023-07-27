public class occurance1st {

    public static int occurancee(int arr[], int key, int i){

        if(i==arr.length-1){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }

     return occurancee(arr,key, i+1 );



    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 5, 5, 7, 5 };
        int key = 5;
        System.out.println(occurancee(arr, 5,0));
    }

}
