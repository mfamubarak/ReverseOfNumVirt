import java.util.Scanner;

public class Reverse
{

public static void ReverseNum(int no)
{

if(no>0)
{
System.out.print(no%10);
no=no/10;

ReverseNum(no);
}

}

public static void main(String[] args)
{
int num=100;
Scanner s1=new Scanner(System.in);
num=Integer.parseInt(s1.nextLine());

System.out.println("---------------------");

ReverseNum(num);
}


}