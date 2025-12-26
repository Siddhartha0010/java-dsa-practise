import java.util.*;
public class impactsum
{
    public static int[] impactSum(int input1, int[] input2, int input3)
    {
        int total = 0;
        for(int i=0;i<input1;i++){
            total = total + input2[i];
        }
        int res[] = new int[input1];
        for(int i=0;i<input1;i++){
            int rem = total - input2[i];
            if(rem<=input3){
            res[i] = rem;
            }
            else{
                res[i] = input3;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2[] = new int[input1];
        for(int i=0;i<input1;i++){
            input2[i] = sc.nextInt();
        }
        int input3 = sc.nextInt();
        int res[] = impactSum(input1,input2,input3);
        for(int i=0;i<input1;i++){
            System.out.print(res[i]+" ");
        }
    }
}
