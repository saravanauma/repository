package practice;

import java.util.HashMap;
import java.util.Map;


public class countthechracters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String input = "hello world"; // Example input string
        countCharacterOccurrence(input);
    }

    public static void countCharacterOccurrence(String input) {
        // Convert string to lowercase to make counting case-insensitive
        input = input.toLowerCase();

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string
        for (char c : input.toCharArray()) {
            // Skip spaces or other characters (optional)
            if (c == ' ') continue;

            // Update the character count in the map
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character occurrences
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }
}