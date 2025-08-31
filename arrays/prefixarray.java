//1)Construct the prefix sum array of a given array.
//Example: Input [2, 4, 6] → Output [2, 6, 12].

// import java.util.*;
// public class prefixarray{
//     public static void prefixsum(int arr[]){
//         int sum = 0;
//         int prefixarr[] = new int[arr.length];
//         prefixarr[0] = arr[0];
//         for(int i=1;i<prefixarr.length;i++){
//           prefixarr[i] = prefixarr[i-1]+arr[i];
//         }
//         for(int i=0;i<prefixarr.length;i++){
//             System.out.print("["+prefixarr[i]+"]");
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of original array:");
//         int size = sc.nextInt();
//         int arr[] = new int[size]; 
//         for(int i = 0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         prefixsum(arr);
//     }
// }




//2)Question: Given an array and multiple queries [L, R], find the sum of elements from index L to R using prefix sums in O(1) per query.
// Eg: Array = [2, 4, 6, 8, 10], Queries = (0,2), (1,3), (2,4) → Output = 12, 18, 24.


import java.util.*;
public class prefixarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int prearr[] = new int[size];
        prearr[0] = arr[0];
        for(int i=1;i<size;i++){
            prearr[i] = prearr[i-1]+arr[i];
        }
        int q = sc.nextInt();
        while(q-- > 0){
         int l = sc.nextInt();
         int r = sc.nextInt();
         int sum;
         if(l==0){
           sum = prearr[r];
         }
         else{
            sum = prearr[r] - prearr[l-1];
         }
         System.out.println(sum);
        }
    }
}