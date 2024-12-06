package practice;



	import java.util.Scanner;

	public class palindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.println("Enter a string to check if it is a palindrome:");
	        String input = scanner.nextLine();

	        // Call the method to check for palindrome
	        if (isPalindrome(input)) {
	            System.out.println("The string \"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("The string \"" + input + "\" is not a palindrome.");
	        }

	        scanner.close();
	    }

	    
	   
	 
	    public static boolean isPalindrome(String str) {
	        // Remove non-alphanumeric characters and convert to lowercase
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = str.length() - 1;

	        // Check characters from both ends
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
	}
