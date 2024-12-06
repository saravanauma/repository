package practice;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World";
		String str2 = "";
		char ch;
		for (int i=0 ; i< str.length() ;i ++)
		{
		ch = str.charAt(i);
		str2 = ch + str2;
		
		}
		System.out.println(str2);

	}

}
