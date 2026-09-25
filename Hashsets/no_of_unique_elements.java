// n=5  arr= 1,4,5,6,6        o/p = 4          which is the count of unique elements 
import java.util.*;
public class no_of_unique_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        System.out.print(set.size());

    }
}
