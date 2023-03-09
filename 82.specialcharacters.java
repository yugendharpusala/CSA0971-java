import java.util.*;
class specialcharacters
{
public static void main(String[]args)
{
Scanner Sc=new Scanner(System.in);
System.out.print("Enter the string:");
String S= Sc.nextLine();
String SpecialCharacters=" ";
for (int i = 0; i < S.length(); i++) 
{
char c = S.charAt(i);
if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) 
{
SpecialCharacters += c;
}
}
System.out.println("Special Characters: " + SpecialCharacters);
}
}




