import java.util.*;
public class third
{
	public static void main(String args[])
	{
		int arr[],  num;
                Scanner s=new Scanner(System.in);
  		System.out.println("Enter the size of an Array");
	        num = s.nextInt();		
		System.out.println("Enter the Element "+num+" of an Array");
		arr = new int[num];
System.out.println("Please enter number");

        for (int i = 0; i < arr.length; i++)
        {
//            System.out.println("Please enter number");
            arr[i] = s.nextInt();
        }
fun(arr);
}
	public static void fun(int[] arr)
	{
	int c=1;
	int span=0;
	for(int i=0;i<arr.length;i++)
	{    
		c=0;
		for(int j=i+1;j<arr.length;j++)
		{    
			if(arr[i] == arr[j])
			c=j-i+1;
		}
		if(c>span)
			span=c;
	
	}
	System.out.println("\n Max Span-->> "+span);
	}


}
