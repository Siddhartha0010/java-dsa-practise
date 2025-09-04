import java.util.*;
public class bubblesort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,6,1,-5,-10};
        for(int i=0;i<arr.length-1;i++){
            int count = 0;    // we are using count to check if the array is already sorted, then no swaps will happen in the first pass. 
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
                if(count == 0){
                    break;                 // so here the TIME COMPLEXITY is --> O(n)    (without this count its O(n^2))
                }
                
            

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}