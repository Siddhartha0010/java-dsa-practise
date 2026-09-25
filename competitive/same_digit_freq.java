// Variation 5 — Same Digit Frequencies

// Given two numbers:

// 112233
// 223311

// Their frequencies are:

// Number 1:
// 1 → 2
// 2 → 2
// 3 → 2

// Number 2:
// 1 → 2
// 2 → 2
// 3 → 2

// Therefore:

// Same digit frequencies → YES



import java.util.*;
public class same_digit_freq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        boolean v = true;
        int a1[] = new int[10];
        int a2[] = new int[10];
        while(n1>0){
            int r = n1%10;
            a1[r]++;
            n1=n1/10;
        }
        while(n2>0){
            int b = n2%10;
            a2[b]++;
            n2=n2/10;
        }
        for(int i=0;i<10;i++){
            if(a1[i]!=a2[i]){
                v=false;
                break;
            }
        }
        if(v){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}