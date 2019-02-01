import java.io.*;
import java.util.*;
public class Average
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
int sum=0,avg;
System.out.println("Enter a number");
int n=s.nextInt();
System.out.println("Enter array values");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
avg=sum/n;
System.out.println(avg);
}
}
