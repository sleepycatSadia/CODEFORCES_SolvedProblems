import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int x=1;x<=t;x++){
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=0;
      if(a%b!=0){
        if(a>b){
          c=(b*(a/b)+b)-a;
        }else
          c=b-a;
      }
      System.out.println(c);
    }
  }
}