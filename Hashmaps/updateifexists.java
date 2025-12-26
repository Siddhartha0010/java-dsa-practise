//If a key exists, update its value to value + 10, else insert value as is.
import java.util.*;

public class updateifexists {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
           map.put(sc.nextInt(),sc.nextInt());
        }
        int k = sc.nextInt();
        int v = sc.nextInt();
        if(map.containsKey(k)){
            map.put(k,v+10);
        }
        else{
            map.put(k,v);
        }
        for(int key:map.keySet()){
            System.out.print(key+" "+map.get(key)+" ");
        }
    }
}
