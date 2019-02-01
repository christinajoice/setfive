import java.io.*;
import java.util.*;
public class NumCount
{
public static void main(String args[])
{
int i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
while(n!=0)
{
n=n/10;
i++;
}
System.out.println(i+"digits");
}
}
