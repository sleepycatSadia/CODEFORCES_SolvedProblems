import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String r;
    String s=sc.nextLine();
    char []c=s.toCharArray();
    int upCnt=0;
    int cnt=0;
    for(int i=0;i<c.length;i++){
      if(Character.isUpperCase(c[i])){
        upCnt++;
      }
      if(i!=0){
        if(Character.isUpperCase(c[i])){
          cnt++;
        }
      }
    }
    if(upCnt==c.length){
      r=s.toLowerCase();
    }else if((Character.isLowerCase(c[0]) && (cnt==c.length-1))){
      String s1=s.substring(0,1);
      String s2=s.substring(1,s.length());
      r=s1.toUpperCase()+s2.toLowerCase();
    }else
      r=s;
   System.out.println(r);
  }
}
           