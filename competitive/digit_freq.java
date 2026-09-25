// Combined Variation Problem — Digit Frequency Analysis
// Problem Statement

// Given a positive integer N, analyze the frequency of all its digits and determine:

// The most frequent digit.
// The least frequent digit among the digits that actually occur.
// If multiple digits have the same frequency:
// For the most frequent digit, return the largest digit.
// For the least frequent digit, return the smallest digit.

// Print the results in the following format:

// Most Frequent: X
// Least Frequent: Y
// Test Case 1
// Input
// 11223333345

// Frequencies:

// 1 → 2
// 2 → 2
// 3 → 5
// 4 → 1
// 5 → 1

// Therefore:

// Most Frequent → 3
// Least Frequent → 4

// Because 4 and 5 both occur once, and we want the smallest digit.

// Output
// Most Frequent: 3
// Least Frequent: 4
// Test Case 2 — Tie for Most Frequent
// Input
// 112233

// Frequencies:

// 1 → 2
// 2 → 2
// 3 → 2

// All three have the maximum frequency.

// Since the rule says largest digit wins:

// Most Frequent → 3

// The minimum frequency is also 2, and the rule says smallest digit wins:

// Least Frequent → 1
// Output
// Most Frequent: 3
// Least Frequent: 1
// Test Case 3 — Different Frequencies
// Input
// 12234522

// Frequencies:

// 1 → 1
// 2 → 4
// 3 → 1
// 4 → 1
// 5 → 1

// Most frequent:

// 2 → 4 occurrences

// Least frequent:

// 1, 3, 4, 5 → 1 occurrence

// Smallest among them:

// 1
// Output
// Most Frequent: 2
// Least Frequent: 1



import java.util.*;
public class digit_freq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();   //12234
        int arr[] = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index=0;
        int i2=0;     
        while(n>0){
            long r = n%10;
            arr[(int)r]++;
            n=n/10;

        }
        for(int i=0;i<10;i++){
            if(arr[i]>=max){
                max = arr[i];
                index=i;
            }
            if(arr[i]<min && arr[i]!=0){
                   min = arr[i];
                   i2=i;
            }
        }
        System.out.print("Max:"+index +"  "+ "Min:"+ i2);
    }
}