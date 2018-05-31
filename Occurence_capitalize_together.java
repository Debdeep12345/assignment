// Submitted by Debdeep Dutta(CSE),6th sem,150103016
import java.io.*;                 
class Test
{
	int i,j;
	String S,S1;
	
	void input()
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));	
		try
		{
			System.out.println("Enter the string:");
			S=sc.readLine();
			S1=S.toLowerCase();                                   //Converting string to lower case
		}
		catch(Exception e){}
	}
	
	void occur()
	{
		int c=0;
		char newstring[]=new char[100];
		char A[]=new char[100];
		for(i=0;i<S1.length();i++)
		{
			newstring[i]=S1.charAt(i);
		}
	
		int p=S1.length();
		int s=0,count=0,flag=0;
		//p--;
		//System.out.println(p);
		//A[s]=S1.charAt(0)
		for(i=0;i<p;i++)
		System.out.print(S1.charAt(i));
		for(i=1;i<p;i++)
		{
			if(S1.charAt(0)!=S1.charAt(i))
			{
				flag=0;
				count=1;
				for(j=i-1;j>=0;j--)
				{
					if(S1.charAt(i)==S1.charAt(j))
					{
						flag=1;
						break;		
					}
					
				}
				
				
			}
			if(flag==0 && count==1)
				{
					s++;
					A[s]=S1.charAt(i);
					count=0;	
				}
				
		}
		A[0]=S1.charAt(0);
		System.out.println("");
		System.out.println("Unique caharcters:");
		for(i=0;i<=s;i++)
		System.out.print(A[i]);                            //printing unique characters
		System.out.println("");
		System.out.println("OCCURENCES are shown:");
		for(i=0;i<=s;i++)
		{
			c=0;
			for(j=0;j<p;j++)
			{
				if(A[i]==S1.charAt(j))                       //Matching unique charcters with the string and counting occurences
				{
					c++;
				}
			}
			if(A[i]==' ')
			{
				if(c==1)
				{
					System.out.println("The character space has occured "+c+" time");
				}
				else
				{
					System.out.println("The character space has occured "+c+" times");
				}
			}
			else
			{
				if(c==1)
				{
					System.out.println("The character "+A[i]+" has occured "+c+" time");
				}
				else
				{
					System.out.println("The character "+A[i]+" has occured "+c+" times");
				}
			}
		}
			
	}
	void capital()	
	{
		int y,t;
		y=S1.length();
		char Arr[]=new char[100];
		for(i=0;i<y;i++)
		{
			Arr[i]=S1.charAt(i);
		}
		for(i=0;i<y;i++)
		{
			if((i%2) == 0)    //Checking for even position
			{
				if(Arr[i]>=97 && Arr[i]<=122)      //Checking whether even position is in lowercase
				{
					t=Arr[i];
					Arr[i]=(char)(t-32);        //Making even position Uppercase
				}
			}
		}
		System.out.println("After applying capitalization to alternate place:");
		for(i=0;i<y;i++)
		{
			System.out.print(Arr[i]);
		}
	}
}
class Occurence_capitalize_together
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.input();
		obj.occur();
		obj.capital();
	}
}
