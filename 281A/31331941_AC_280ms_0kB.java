import java.util.Scanner;
public class Main{
public static void main (String[]args){
 Scanner sc=new Scanner (System.in);
 	String w=sc.nextLine();
    System.out.println((w.substring(0, 1)).toUpperCase() + w.substring(1));
   }
}