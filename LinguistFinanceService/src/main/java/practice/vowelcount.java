package practice;

public class vowelcount {
    int vowelCount = 0;
    int consonantCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "india";
int vowelCount = 0;
int consonantCount = 0;

        str = str.toLowerCase();

        // Define vowels
        String vowels = "aeiou";

        // Initialize counters

        // Iterate through the string
        for (char c : str.toCharArray()) {
        	
            if (Character.isLetter(c)) { // Check if the character is a letter
                if (vowels.indexOf(c) != -1) { // Check if the character is a vowel
                    vowelCount++;
                } else { // If not a vowel, it's a consonant
                    consonantCount++;
                }
            }
        }

	}

}
