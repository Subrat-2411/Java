package arrayPrograms;

public class Zero2DArray {

	
	public static void main(String[] args) {
		
		int a[][]= {{1,0,0,1},{1,1,1,1},{1,1,1,0},{1,1,1,1}};
		
		boolean rows[]=new boolean[a.length];
		
		boolean columns[]=new boolean[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]==0)
				{
					rows[i]=true;
					
					columns[j]=true;
					
				}
				    
				
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(rows[i]||columns[j])
				{
					a[i][j]=0;
				}
			}
		}
		
		System.out.println("After reinitialization");
		
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			
			System.out.println();
		}
	}
}
