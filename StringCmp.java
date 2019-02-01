import java.io.*;
import java.util.*;
public class StringCmp
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter two strings");
String str1=s.nextLine();
String str2=s.nextLine();
boolean res=str1==str2;
if(res==0)
{
System.out.println(str1);
}
else if(res>0)
{
System.out.println(str1);
}
else
{
System.out.println(str2);
}
}
}
