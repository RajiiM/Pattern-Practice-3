//OUTPUT
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 5 6 5 4 3 2 1 
1 2 3 4 5 6 7 6 5 4 3 2 1 
//

public class Pattern15 {
	
	public static void main(String[] args) 
	{	

		for(int row=1; row<=7; row++)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(col + " ");
			}
			for(int col = row; col>=1; col--)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}
}