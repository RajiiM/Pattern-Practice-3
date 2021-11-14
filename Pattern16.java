//OUTPUT
1 2 3 4 5 6 7 
  2 3 4 5 6 7 
    3 4 5 6 7 
      4 5 6 7 
        5 6 7 
          6 7 
            7 
          6 7 
        5 6 7 
      4 5 6 7 
    3 4 5 6 7 
  2 3 4 5 6 7 
1 2 3 4 5 6 7 

//

public class Pattern16 {
	
	public static void main(String[] args) 
	{	

		for(int row=1; row<7; row++)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(" " + " ");
			}
			for(int col = row; col<=7; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		for(int row=7; row>=1; row--)
		{
			for(int col = 1; col<row; col++)
			{
				System.out.print(" " + " ");
			}
			for(int col = row; col<=7; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
	}
}