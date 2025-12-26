import java.util.*;
public class nextgreatest{
    public static int[] nextGreaterElement(int input1, int[] input2)
    {
        int max[] = new int[input1];
        for(int i=0;i<input1;i++){
            max[i] = -1;
            for(int j=i+1;j<input1;j++){
             if(input2[i]<input2[j]){
                max[i] = input2[j];
                break;
             }
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = nextGreaterElement(n, arr);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}