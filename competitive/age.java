import java.util.*;
public class age{
    public static int[] youngerBehindCount(int input1, int[] input2) {
      int res[] = new int[input1];
        for(int i=0;i<input1;i++){
          res[i] = 0;
          int count = 0;
          for(int j=i+1;j<input1;j++){
            if(input2[i]>input2[j]){
              count = count+1;
              res[i] = count;
            }
            
          }
        }
        return res;
    }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
          }
          int res[] = youngerBehindCount(n,arr);
          for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
          }

    }
}