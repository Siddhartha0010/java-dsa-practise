import java.util.*;
public class hollow_rect{
    public static void hollow(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==row-1||j==0||j==col-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int r = sc.nextInt();
        System.out.print("Enter cols:");
        int c = sc.nextInt();
        hollow(r,c);
    }
}