package practice;

public class maxnumberinarray {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		
		int[] numbers = {1,20,3,4,5};
		int max = numbers[0];
		for (int i = 0 ; i <numbers.length ; i++)
		if (numbers[i]>max) {
		max= numbers[i];
		}
		
		System.out.println(max);
	}

}