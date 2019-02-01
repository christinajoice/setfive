import java.io.*;
import java.util.*;
public class RangeN
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
if(n>=1 && n<=10)
{
System.out.println("yes it is in the range");
}
else
{
System.out.println("not in range");
}
}
}
