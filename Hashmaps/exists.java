//Check whether a given key exists in the HashMap.
import java.util.*;
public class exists{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            map.put(key,val);
        }
        int k = sc.nextInt();
        if(map.containsKey(k)){
            System.out.print("Found");
        }
        else{
            System.out.print("Not found");
        }
    }
}