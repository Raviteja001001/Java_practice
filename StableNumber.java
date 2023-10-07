public class StableNumber {

    public static void main(String[] args) {
 
       int number = 2277; // Replace with your number

   
     boolean isStable = checkStability(number);

 
       if (isStable) {
  
          System.out.println("The number is stable.");
 
       }
 else {
   
         System.out.println("The number is unstable.");
        }
 
   }

   
 public static boolean checkStability(int number)
 {
    
    // Convert the number to a string
   
     String numStr = String.valueOf(number);

 
       // Initialize an array to store the count of each digit (0-9)

        int[] digitCount = new int[10];

    
    // Count the occurrences of each digit

        for (char digit : numStr.toCharArray())
 {
 
           int numericDigit = Character.getNumericValue(digit);
 

           digitCount[numericDigit]++;
    
    }

        // Find the first non-zero digit count
 
       int firstDigitCount = 0;
   
     for (int count : digitCount) {
  
          if (count != 0) {
        
        firstDigitCount = count;
     
           break;
         
   }
        }

   
     // Check if all non-zero digit counts are the same
  
      for (int count : digitCount) {
        
    if (count != 0 && count != firstDigitCount)
 {
                return false; // Not stable
    
        }
        }

        return true; // Stable
 
   }
}