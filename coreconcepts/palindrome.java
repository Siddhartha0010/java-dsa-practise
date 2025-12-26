// import java.util.*;
// public class palindrome{
//     public static int palindrome(int n){
//         int y = n;
//         int temp =0;
//         while(n>0){
//             int r = n%10;
//             temp = temp*10+r;
//             n = n/10;
//         }
//         if(temp==y){
//             return temp;
//         }
//         else{
//             return 0;
//         }
//     }
//     public static void main(String[] args){
//           int num = 121;
//           System.out.print(palindrome(num));
//     }
// }





import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;
        boolean bool = true;

        while(i < j){
            if(arr[i] == arr[j]){
                i++;
                j--;
            } else {
                bool = false;
                break;
            }
        }

        if(bool){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
