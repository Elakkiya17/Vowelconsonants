import java.io.*;
import java.util.*;
class leapyear {
	public static void main (String arg[]) {
	    int yr;
	    Scanner sc=new Scanner(System.in);
	    yr=sc.nextInt();
	    if((yr%400==0)||((yr%4==0)&&(yr%100!=0)))
	    {
	        System.out.println("leap year");
	    }
	    else
	    System.out.println("not a leap year");
	 
	 }
}
