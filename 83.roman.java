import java.util.*;
class roman
{
 public static void main(String[] args) 
{
 try
{
   
 String romanNumeral;
 int result = 0;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a Roman Number(In Capital leter)=");
 romanNumeral=sc.nextLine();
Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
 romanMap.put('I', 1);
 romanMap.put('V', 5);
 romanMap.put('X', 10);
 romanMap.put('L', 50);
 romanMap.put('C', 100);
 romanMap.put('D', 500);
 romanMap.put('M', 1000);
for (int i = 0; i < romanNumeral.length(); i++) 
{
char c = romanNumeral.charAt(i);
 int value = romanMap.get(c);
if (i < romanNumeral.length() - 1) 
{
char next = romanNumeral.charAt(i + 1);
int nextValue = romanMap.get(next);
if (nextValue > value)
{ 
value = -value;
}
}
result += value;
}
System.out.println("Roman numeral " + romanNumeral + " is " + result + " in decimal.");
}
catch(Exception e)
{ 
     System.out.println("Invalid! Enter a valid input");
}
}
}




