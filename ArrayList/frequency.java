import java.util.*;
public class frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
           list.add(sc.nextInt());
        }
        System.out.print("Enter key");
        int key = sc.nextInt();
        int maxcount = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=i+1;j<n;j++){
                if(list.get(i)== key){
                    count++;
                }
                if(count>maxcount){
                    maxcount = count;
                    
                }
            }
        }
        System.out.print(maxcount);
    }
}