//OUTPUT
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
1 0 1 0 1 0 1 
//

public class Pattern18 {
	
	public static void main(String[] args) 
	{	

		for(int row=7; row>=1; row--)
		{
			for(int col = row; col<=7; col++)
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