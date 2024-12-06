package practice;

public class ExerciseProgram {

	public static void main(String[] args) {
		String name = "dasdas123213";
		checkcharacter(name);

	}
	// TODO Auto-generated method stub

	public static void checkcharacter(String name) {

		for (char c : name.toCharArray()) {
			if (Character.isLetter(c)) {
				System.out.println("true");
			} else {
				System.out.println("false");

			}
		}

	}

}
