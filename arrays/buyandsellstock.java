//This is a  prog to find the max profit that can be obtained from give set of prices 
import java.util.*;
public class buyandsellstock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0;i<size;i++){
            if(buyprice<arr[i]){
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = arr[i];
            }
        }
        System.out.print("Max profit can be obtained is:"+maxprofit);

    }

}