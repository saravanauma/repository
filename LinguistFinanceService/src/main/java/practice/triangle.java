package practice;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n = 5;
		for (int i=1;i<n;i++)		
		{		
			
            for(int j=2*(n-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            
            

			for (j=0;j<=i;j++)
			{		
					System.out.print("*");
			     	System.out.print("\t");
			     	
			}				
			System.out.println();
			}	
			}
		}
}

