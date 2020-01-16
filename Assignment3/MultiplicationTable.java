import java.util.Scanner;
public class MultiplicationTable{

	public static void main(String args[]){
		
		Scanner s1=new Scanner(System.in);
		int in=10;
		//get the size of the table
		System.out.println("Enter Max Number ");
		in=s1.nextInt();
		//print the outer border
		System.out.print("\n");
		for(int j=1;j<=in;++j)
			System.out.print("------------");
			System.out.print("\n");
		//Print the title column
		System.out.print("|\t\t|\t");	
		for(int i=1;i<=in;++i)
			System.out.print(i+"\t");
			System.out.print("\n");
		// print the line below the title column
		for(int j=1;j<=in;++j)
			System.out.print("------------");
			System.out.print("\n");
		//print the val;use in a table
		for(int rows=1;rows<=in;++rows)
			{
			
			System.out.print("|\t"+rows+"\t|\t");
			for(int columns=1;columns<=in;++columns)
				{
				System.out.print(columns*rows+"\t");
				}
			System.out.println("");

			}
		//print the outer border
		System.out.print("\n");
		for(int k=1;k<=in;++k)
			System.out.print("------------");

	}

}