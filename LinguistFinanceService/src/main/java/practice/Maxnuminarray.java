package practice;

public class Maxnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int abc[][]= {{1,4,2},{5,6,7},{8,0,3}};
		int max = abc[0][0];		
		for (int i=0;i<3;i++)			
		{
			for (int j=0;j<3;j++)
			{
				if(abc[i][j]> max)
				{
					max = abc[i][j];
				}
			}
		}
System.out.println(max);
	}
}
