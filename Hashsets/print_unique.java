// print all unique elements in a array
import java.util.*;

public class print_unique {
    public static void main(String[] args){
        int arr[] = {1,2,2,4,4,5,6,7};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int x:set){
            System.out.print(x);
        }
    }
}
