// Variation 2 — Rotate Left by K ⭐

// Instead of moving the last K digits to the front, move the first K digits to the end.

// Input:
// 12345
// K = 2

// Output:
// 34512

// Think:

// 12345
// ^^
// 12 | 345
// ↓
// 345 | 12

// Key model: same rotation concept, but opposite direction

import java.util.*;
public class rotate_digits_to_left{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        long temp = n;
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        k = k%count;
        int firstpart = (int)n/(int)Math.pow(10,count-k);
        int lastpart = (int)n%(int)Math.pow(10,count-k);
        int res = lastpart*((int)Math.pow(10,k))+firstpart;
        System.out.print(res);
    }
}