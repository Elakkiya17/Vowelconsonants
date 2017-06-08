import java.io.*;
import java.util.*;
class Vowel {
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s;
	 s=sc.next();
	 char ch[]=s.toCharArray();
	 for(int i=0;i<ch.length;i++)
	 {
	  char c=s.charAt(i);
	  System.out.println(ch[i]);
	 
	switch(c)
	 {
	     case'a':
	     case 'A':
	     case 'e':
	     case 'E':
	     case 'i':
	     case 'I':
	     case 'o':
	     case 'O':
	     case 'u':
	     case'U':
	         System.out.println("vowel");
	         break;
	   default:
	        System.out.println("consonant");
	       break;  
	         
	 }
	 }
	}
}
