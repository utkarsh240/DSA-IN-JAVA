import java.util.*;

public class bubblesort{

    public static void bubblesorrt(int arr[]){
        for(int turns =0;turns<arr.length-1; turns++){
            
            for(int j=0; j<arr.length-1-turns; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        }
    

    public static void printarr(int arr[]){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args) {
        int arr[] = {4,7,3,1,92};
        bubblesorrt(arr);
        
        printarr(arr);
    }
}