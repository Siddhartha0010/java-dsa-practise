import java.util.*;
public class selectionsort{
    public static void select(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,1,9,3};
        select(arr);

    }
}