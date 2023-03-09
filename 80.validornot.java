import java.util.*;
class validornot
{
public static void main(String args[])
{
String S1,S2;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the string1");
S1=Sc.nextLine();
System.out.println("Enter the string2");
S2=Sc.nextLine();
if(S1.equals(S2))
System.out.println("valid");
else 
System.out.println("invalid");
}
}

