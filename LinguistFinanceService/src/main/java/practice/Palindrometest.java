package practice;

public class Palindrometest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String in = "RararaS";
        in = in.toLowerCase(); // Convert to lowercase for consistent comparison
        char[] har = in.toCharArray();
        String reverse = "";
        
        for (int i = in.length() - 1; i >= 0; i--) { // Loop from last index to first
            reverse += har[i];
        }
        
        System.out.println("Original: " + in);
        System.out.println("Reversed: " + reverse);
        
        // Check if it's a palindrome
        if (in.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }


}
