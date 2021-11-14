//OUTPUT
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
1 0 1 0 1 0 
1 0 1 0 1 0 1 
//

public class Pattern17 {
	
	public static void main(String[] args) 
	{	

		for(int row=1; row<=7; row++)
		{
			for(int col = 1; col<=row; col++)
			{
				if(col%2==0)
				{
				System.out.print("0 ");
				}
				else
				{
				System.out.print("1 ");
				}
			}
			System.out.println();
		}		
	}
}