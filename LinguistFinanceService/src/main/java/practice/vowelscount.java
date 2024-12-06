package practice;

public class vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 0;
		int c = 0;
		String str = "Saravanakumar";
		String vowels = "aeiou";
		char[] name = str.toCharArray();
		char[] vowelscha = vowels.toCharArray();
		
for (int i = 0; i < name.length ; i++ )		
{
	for (int j = 0;  j < vowelscha.length ; j++ )	
	{
	if (name[i]==vowelscha[j])
	{
		v++;	
	}
	}		
}
System.out.println(v);
System.out.println(name.length-v);
}
	}

