
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        int []ar=new int[3];
        while(c< t) {
           ar[c%3]+=sc.nextInt();
           c++;
        }
        if((ar[0]>=ar[1]) && (ar[0]>=ar[2]))
           System.out.println("chest");
        else if((ar[1]>=ar[0]) && (ar[1]>=ar[2]))
           System.out.println("biceps");
        else
           System.out.println("back");
	}
}