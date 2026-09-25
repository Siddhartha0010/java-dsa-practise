// Given a positive integer n and an integer k, rotate the digits of n to the right by k positions.

// Example 1
// Input:
// n = 12345
// k = 2

// Output:
// 45123

import java.util.*;
public class rotate_digits_of_a_num{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int temp =num;
        int count=0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        k = k%count;            
        
        int lastpart = num % (int)Math.pow(10,k);
        int firstpart = num/ (int)Math.pow(10,k);
        int p = count-k;
        System.out.print(lastpart*(int)Math.pow(10,p)+firstpart);
        


    }
}