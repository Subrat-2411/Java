package arrayPrograms;

import java.util.Arrays;

public class TwodimensionalArray {

	
	public static void main(String[] args) 
    {
        
        int arr[][]={{1,6,7,8},{2,0,9,4},{5,8,9,5},{2,1,6,7}};
        
        
        // System.out.println(Arrays.toString(arr));
        
        for(int i=0;i<arr.length;i++)
        {
            // for(int j=0;j<arr[i].length;j++)
            // {
                System.out.print(Arrays.toString(arr[i]));
            // }
            
            System.out.println();
        }
        
        System.out.println("---------------------------------------------------");
        
        int temp[][]=new int[arr.length][];
        
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i].clone();
        }
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    for(int k=0;k<arr[i].length;k++)
                    {
                        temp[i][k]=0;
                        temp[k][j]=0;
                    }
                    // break;
                }
            }
        }
        
        for(int i=0;i<temp.length;i++)
        {
//            for(int j=0;j<temp[i].length;j++)
//            {
                System.out.println(Arrays.toString(temp[i]));
//            }
            
//            System.out.println();
        }
    }
}
