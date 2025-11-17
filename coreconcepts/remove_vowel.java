import java.util.*;

public class remove_vowel {
    public static String vowel(String s) {
        char arr[] = s.toCharArray();  
        String result = "";             

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'a' && arr[i] != 'A' && arr[i] != 'e' && arr[i] != 'E' &&
                arr[i] != 'i' && arr[i] != 'I' && arr[i] != 'o' && arr[i] != 'O' &&
                arr[i] != 'u' && arr[i] != 'U') {
                result = result + arr[i];  
            }
        }

        return result;  
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.print(vowel(str));  
    }
}
