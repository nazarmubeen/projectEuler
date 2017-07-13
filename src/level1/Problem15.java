package level1;

public class Problem15 {

	public static void main(String[] args)
	{
		int gridSize = 20;
		long paths = 1;
		 
		for (int i = 0; i < gridSize; i++) {
		    paths =paths* ((2 * gridSize) - i);
		    paths =paths/( i + 1);
		}
	System.out.println("PATHS ="+paths);
	printPathMatrix();
	}
	
	
	static void printPathMatrix()
	{
		long[][] matrix=new long[21][21];
		
		for(int i=0;i<21;i++)
		{
			for(int j=0;j<21;j++)
			{
				//System.out.println("i "+i+" j "+j);
				if(i==0 || j==0)
				{
					
					matrix[i][j]=1;
				}
				else{
					if(j<21 && i<21)
					matrix[i][j]=matrix[i][j-1]+matrix[i-1][j];
				}
				
			}
		}
		
		System.out.println(" ");
		for(int i=0;i<21;i++)
		{
			for(int j=0;j<21;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}


}
