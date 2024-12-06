package practice;

public class maxinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] numbers = {45, 67, 89, 23, 90, 12}; // Example array

        // Initialize the max variable with the first element
        int max = numbers[0] ;

        // Iterate through the array to find the largest number
			for (int i=0;i<numbers.length;i++)
			{
				if(numbers[i]< max)
				{
					max = numbers[i];
				}
        }
        System.out.println(max);


	}

}
