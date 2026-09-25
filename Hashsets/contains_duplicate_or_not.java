
import java.util.*;

public class contains_duplicate_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,4}; 
        HashSet<Integer> set = new HashSet<>();
        boolean bool = false;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
               bool = true;
               break;
            }
            set.add(arr[i]);
        }

        System.out.print(bool);

    }
}
