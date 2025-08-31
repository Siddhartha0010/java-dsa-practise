//Here we need to print the max sum of all sub arrays.
import java.util.*;
public class maxsubarray{
    
    public static void subarray(int num[]){
         int maxsum = Integer.MIN_VALUE;
       
        for(int i =0;i<num.length;i++){
            for(int j = i;j<num.length;j++){
                int currsum = 0;
                for(int k = i;k<=j;k++){
                    currsum = currsum+num[k];
                }
            if(currsum>maxsum){
                maxsum = currsum;
            }
            }
            
        }
        System.out.print(maxsum);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i = 0;i<size;i++){
           num[i] = sc.nextInt();
        }
        subarray(num);
    }
}