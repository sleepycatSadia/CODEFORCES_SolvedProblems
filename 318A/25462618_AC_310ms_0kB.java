import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long k=sc.nextLong();
    long x=(n+1)/2;
    if(k<=x)
       System.out.println(2*k-1);
    else
      System.out.println((k-x)*2);
  }
}