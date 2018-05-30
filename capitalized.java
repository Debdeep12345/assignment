import java.io.*;            //Submitted by Debdeep dutta(CSE),6th sem,150103016
class Test
{
	String S,S1;
	int i,j;
	void input()
	{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the string:");
			S=sc.readLine();
			S1=S.toLowerCase();
		}
		catch (Exception e){}
	}
	void capital()	
	{
		int p,c;
		p=S1.length();
		char Arr[]=new char[100];
		for(i=0;i<p;i++)
		{
			Arr[i]=S1.charAt(i);
		}
		for(i=0;i<p;i++)
		{
			if((i%2) == 0)    //Checking for even position
			{
				if(Arr[i]>=97 && Arr[i]<=122)      //Checking whether even position is in lowercase
				{
					c=Arr[i];
					Arr[i]=(char)(c-32);        //Making even position Uppercase
				}
			}
		}
		System.out.println("After applying capitalization to alternate place:");
		for(i=0;i<p;i++)
		{
			System.out.print(Arr[i]);
		}
	}
}
class capitalized
{
	public static void main(String args[])
	{
		Test obj=new Test();
		obj.input();
		obj.capital();
	}
}
