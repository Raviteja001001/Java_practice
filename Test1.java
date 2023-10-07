import java.util.*;
public class Test1 {
    public static String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        String vowels = "AEIOUaeiou"; 
        
        while (left < right) {
           
            while (left < right && vowels.indexOf(charArray[left]) == -1) {
                left++;
            }
            
            
            while (left < right && vowels.indexOf(charArray[right]) == -1) {
                right--;
            }
            
            
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            
            left++;
            right--;
        }
        
       
        return new String(charArray);
    }
    
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        String inputString =sc.nextLine();
        String result = reverseVowels(inputString);
        System.out.println(result);  // Output: "holle werld"
    }
}
