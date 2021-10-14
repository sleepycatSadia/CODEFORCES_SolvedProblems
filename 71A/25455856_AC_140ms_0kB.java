import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int x=1;x<=t;x++){
      String s=sc.nextLine();
      String b;
      if(s.length()>10){
      b=s.substring(0,1);
      b+=(s.length()-2);
      b+=s.substring(s.length()-1);
      }else
        b=s;
      System.out.println(b);
    }
  }
}
