import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		//int[] vec = {6,2,1,4,3,5};
		int[] vec=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		vec[i]=sc.nextInt();
		sort(vec);
		for (int i : vec)
		System.out.printf("%d%n", i);
	}
	private static void sort(int[] v)
	{	int K=1,j;
		for(j=0;j<v.length;j++)
		{
		for(int i=j;i>0;i--)
		{
			if(v[i-1]>v[i])
				K=0;
			if(K==0)
			{
				v[i]=v[i]+v[i-1];
				v[i-1]=v[i]-v[i-1];
				v[i]=v[i]-v[i-1];
			}
			K=1;
		}
		for (int i : v)
                System.out.printf("%d%n", i);
                System.out.println("---------");
		}
	}
}
