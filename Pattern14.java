//OUTPUT
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
//

public class Pattern {
	
	public static void main(String[] args) 
	{	

		for (int row = 1; row <= 5; row++) 
        {
            int num = row;
            for (int col = 1; col <= row; col++) 
            {
                System.out.print(num+" ");                 
                num = num+5-col;
            }             
            System.out.println();
        }
		
	}
}