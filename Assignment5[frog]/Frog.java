import java.util.Scanner;

public class Frog
{
static int tmp;
static int c;
//method for Time calculation from Distance
public static void frogDistance(int d)
{

	if(c==3 && d>0)
	{
		d=d-5;
		tmp=tmp+1;
		--c;

		

	}
	else if(c==2 && d>0)
	{
		d=d-3;
		tmp=tmp+2;
		--c;
		
		
	}
	else if(c==1 && d>0)
	{
		tmp=tmp+5;
		--c;
	}
	

	if(d>0)
		{
			frogDistance(d);
		}
		

}
//method for Distance calculation from Time
public static void frogTime(int t) 
{

	if(c==3 && t>0)
	{
		t=t-1;
		tmp=tmp+5;
		--c;

	}
	else if(c==2 && t>0)
	{
		t=t-2;
		tmp=tmp+3;
		--c;
	
	}
	else if(c==1 && t>0)
	{
		t=t-5;
		tmp=tmp+1;
		--c;

	}
	
	if(t>0)
	{
		frogTime(t);
	}
}
	
	

public static void main(String[] args)
{


int uservalue=0;
String useroption;
Scanner s1=new Scanner(System.in);
System.out.println("Please Enter the letter below\n1).\tD\t-\tDistance in Meters\n2).\tT\t-\tTime in seconds\n3).\tE\t-\tTo Exit ");
useroption=s1.nextLine();
if(!useroption.trim().toUpperCase().equals("E"))
{
	tmp=0;
	c=3;
	
//option for Distance input
	if(useroption.trim().toUpperCase().equals("D"))
	{
		System.out.println("Enter the Distance\n");
		uservalue=s1.nextInt();
		frogDistance((uservalue%9));
		tmp=tmp+(((uservalue/9)*8));
		System.out.println("John has taken "+tmp+" seconds");

	}//option for Time input
	else if(useroption.trim().toUpperCase().equals("T"))
	{
		System.out.println("Enter the Time");
		uservalue=s1.nextInt();
		frogTime((uservalue%8));
		tmp=tmp+(((uservalue/8)*9));
		System.out.println("John has gone "+tmp+" Meters");
	}


}








}

}