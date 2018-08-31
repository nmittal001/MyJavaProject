import java.io.IOException;
import java.io.*;
import java.util.*;

class Main
{
	public static void main(String Args[])
	{
		try
		{
			int c,count1=0,k=0,j;
                        int[] ar=new int[26];
			int i=0;
			File f=new File("nitesh.txt");
                        DataOutputStream fos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
			System.out.println("ENter the string");
			Scanner sc =new Scanner(System.in);
			char r;int count=0;
			/*while(count<10)
			{
				r = sc.next().charAt(0);
				fos.write(r);
				count++;
			}*/
			String word=sc.nextLine();
			fos.writeUTF(word);
			int l=word.length();
			if(l<10)
			{

			}
			else
			{
				System.out.println("More");
				System.exit(0);
			}
			fos.close();
			//FileInputStream fis = new FileInputStream(f);
			DataInputStream fis=new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
			while( (c = fis.read())!= -1)
			{
				c=(char)c;
				//for (int i=0; c!='\0'; i++)
				{
				//	System.out.println("check");
					if (c >= 97 && c <= 122)
					{
						k=1;
						for(j=0;ar[j]!='\0';j++)
						{
							if(ar[j]==c)
							{
								k=0;
							}

						}
						if(k==1)
						{
							ar[j]=c;
							count1++;
						}
					}
				i++;
				}

				//System.out.print((char)c);

			}
			System.out.println("count-->>"+count1);
			//DataOutputStream dos=new DataOutputStream(fos);
			//fos.writeFile(sc.next());
			//fos.writeUTF("HI");
			fos.close();
		}
		catch(IOException e)
		{
			System.out.println("catch");
		}
	}
}
