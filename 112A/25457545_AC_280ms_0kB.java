import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.nextLine(); 
    String B=sc.nextLine(); 
    int d=A.compareToIgnoreCase(B);
    int f=0;
    if(d>0)
      f=1;
    else if(d<0)
      f=-1;
    System.out.println(f);
  }
}
