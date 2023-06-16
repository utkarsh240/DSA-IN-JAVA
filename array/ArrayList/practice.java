import java.util.*;

public class practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(76);
        list.add(54);

        for(int i= list.size()-1 ;i>=0; i--){
            System.out.println(list.get(i));
        }

    }

}
