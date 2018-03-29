package core;

public class Calculation {

	public int findMax(int arr[])
	{
		if(arr.length>0)
		{					
			int max=0;
			for(int i=1;i<arr.length;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			return max;
		}
		return -1;
	}
	public int findMin(int arr[])
	{
		if(arr.length>0)
		{					
			int min=100000;
			for(int i=1;i<arr.length;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
			
			return min;
		}
		return -1;
	}
	
	public int getSum(int arr[])
	{
		int sum=0;
		if(arr.length>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
			}
			return sum;
		}
		return -1;
	}
	public int[] reverseArray(int arr[])
	{
		  if(arr.length>0)
		  {
			  for (int i = 0; i < arr.length / 2; i++) 
			  {
			         int temp = arr[i];
			         arr[i] = arr[arr.length - 1 - i];
			         arr[arr.length - 1 - i] = temp;
			  }
		  return arr;
		  }
		  return null;
	}
	public int cube(int n)
	{
		return n*n*n;		
	}
	
	public boolean searchValue(int arr[],int num)
	{
		  boolean found=false;
		  if(arr.length>0)
		  {
			  for (int i = 0; i < arr.length; i++) 
			  {
				  if(arr[i] == num)
				  {
					  found=true;
					  break;
				  }
				  else
				  {
					  found=false;
				  }
			  }
		  }
		  
		  return found;
	}
	public String reverseString(String value)
	{
		if(value.equals(""))
		{
			return "";
		}
		else
		{
			StringBuilder sb=new StringBuilder(value);  
		    sb.reverse();  
		    return sb.toString();	
		}
	}
	
	public boolean isTriangle(int l1,int l2,int l3)
    {
        System.out.println("\nIn Triangle Function\n\n");
        if ((l1 + l2) > l3)
        {
            if((l1 + l3) > l2)
            {
                if(l2 + l3 > l1)
                {
                    System.out.println("\nThe Triangle is a Valid Triangle\n\n");
                    return true;
                }
                else
                {
                    System.out.println("\nThe Triangle is Not a Valid Triangle\n\n");
                    return false;
                }
            }
            else
            {
                System.out.println("\nThe Triangle is Not a Valid Triangle\n\n");
                return false;
            }
        }
        else
        {
            System.out.println("\nThe Triangle is Not a Valid Triangle\n\n");
            return false;
        }	    
    }
}
