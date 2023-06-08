
public class reverse {

    public static void reverse_array(int numbers[]) {

        int start = 0;
        int last = numbers.length - 1;
        while (start < last) {

            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }

        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int numbers[]={ 5,8,4,7};
        reverse_array(numbers);
    }

}
