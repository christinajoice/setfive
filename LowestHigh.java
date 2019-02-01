import java.io.*;
import java.util.*;
public class LowestHigh
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
System.out.println("Enter a number");
int n=s.nextInt();
System.out.println("Enter the values");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]+" "+a[n-1]);
}
}
