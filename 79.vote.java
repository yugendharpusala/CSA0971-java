import java.util.*;
class vote
{
public static void main(String args[])
{
int age,diff;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the age");
age=Sc.nextInt();
if(age>=18)
{
System.out.println("eligible for vote");
}
else
{
diff=(18-age);
{
System.out.println("sorry you can vote after:"+diff+ "years");
}
}
}
}

 