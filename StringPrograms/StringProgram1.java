import java.util.Scanner;
class StringReverseProgram
{	
	String name;
	char[] revstr;
	public char[] getName()
	{
		return this.revstr;
	}
	public void setName(String name)
	{
		revstr=new char[name.length()];
		int j=0;
		for(int i=name.length()-1;i>=0;i--)
		{
			revstr[j]=name.charAt(i);
			++j;
		}
		this.revstr=revstr;
	}
	public void method()
	{
		System.out.println("The Reverse String is :");
		for(char a:revstr)
		{
			System.out.print(a);
		}
	}
}
class StringProgram1
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Any String to Convert into Reverse:");
		String s=scan.nextLine();
		StringReverseProgram obj=new StringReverseProgram();
						  obj.setName(s);
						  obj.method();
	}
}