import java.util.*;
class reversenum
{
  public static void main(String[] args) 
{
 int n;
 Scanner Sc=new Scanner(System.in);
 System.out.println("Enter the number to reverse:");
 int n=Sc.nextInt();
 int reverse= 0;
 while(n!= 0) 
{
 int remainder = n % 10;
reverse = reverse * 10 + remainder;
 n /= 10;
}
 System.out.println("The reverse of the number is:"+reverse);
}
}