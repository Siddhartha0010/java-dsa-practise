import java.util.*;
public class selectionsort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,4,1,3,2};
        for(int i=0;i<=arr.length-2;i++){
            int min = i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            // swapping after finding the min value from unsorted part
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}