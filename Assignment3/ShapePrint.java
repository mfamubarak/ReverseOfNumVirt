import java.util.Scanner;
public class ShapePrint{

	public static void main(String args[]){
		
		Scanner s1=new Scanner(System.in);
		
		int l=1,m=0,in=10,t=0;
		//Get the Number of lines
		System.out.println("Enter Shape Size ");
		in=s1.nextInt();
		System.out.println("------------------------------------------------------------------------------------------------ ");
		
		//loop for Rows
		for(int i=1;i<=(in*2);++i)
			{
		//printing blank spaces
			if(i>in)
				t=in-(i-in);
			else
				t=i;

			for(int j=in;j>=t;--j)
				{
				System.out.print(" ");
				}
		//printing the shape
			if(i>in)
				l=(in-(i-in))*2-1;
			else
			{
				l=(i*2)-1;
			}
			for(int k=1;k<=l;++k)
			{
				System.out.print("*");
			}
		System.out.println("");
			}


		System.out.println("------------------------------------------------------------------------------------------------ ");

	}

}