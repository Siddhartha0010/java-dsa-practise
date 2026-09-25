// Given a positive integer n, count how many times each digit from 0 to 9 appears in the number.

// Example
// Input:
// 1223334500

// Output:

// 0 → 2
// 1 → 1
// 2 → 2
// 3 → 3
// 4 → 1
// 5 → 1
// 6 → 0
// 7 → 0
// 8 → 0
// 9 → 0

import java.util.*;
public class freq_of_every_digit{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int freq[] = new int[10];
          while(num>0){
            int dig = num%10;
            freq[dig]++;
            num = num/10;
         }
         for(int i=0;i<10;i++){
            System.out.println(i+"  -> " + freq[i]);
         }
         
    }
}