import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char []c=s.toCharArray();
    int r1=0;
    int r2=0;
    if(s.length()>7){
      for(int x=0;x<=s.length()-7;x++){
        if(c[x]=='0'&&c[x+1]=='0'&&c[x+2]=='0'&&c[x+3]=='0'&&c[x+4]=='0'&&c[x+5]=='0'&&c[x+6]=='0')
        { r1=1;break;}
        if(c[x]=='1'&&c[x+1]=='1'&&c[x+2]=='1'&&c[x+3]=='1'&&c[x+4]=='1'&&c[x+5]=='1'&&c[x+6]=='1')
        { r2=1;break;}
      }
      if(r1==1 || r2==1)
        System.out.println("YES");
      else
        System.out.println("NO");
    }else
      System.out.println("NO");
  }
}
