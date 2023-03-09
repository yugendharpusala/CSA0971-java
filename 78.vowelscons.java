import java.util.*;
 class vowelscons
{
  public static void main(String[] args) 
  {
  String s="Saveeths School of Engineering";
String s10=s.toLowerCase();
  String s1=s10.replaceAll("[aeiou]","");
  String s2=s10.replaceAll("[bcdfghjklmnpqrstvwxyz]","");
  //String s2=s.replaceAll("[bcdfghjklmnpqrstuvwxyz]","");
  System.out.println("The consonants are :\n" +s1);
   System.out.println("The Vowels are:\n" +s2);
  }

}
