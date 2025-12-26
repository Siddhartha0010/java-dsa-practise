import java.util.*;
public class insertndprint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            map.put(key,val);
        }
        for(int num:map.keySet()){
           System.out.print(num+" "+map.get(num)+" ");
        }
    }
}
