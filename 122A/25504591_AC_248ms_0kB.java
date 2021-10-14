import java.util.Scanner;
public class Main {
  static boolean isLucky(String num){
    String []c=num.split("");
    boolean flag=true;
    for(int i=0;i<c.length;i++){
      if(c[i].equals("4")||c[i].equals("7")){
      }else {
        return false;
        }
    }
    
    if(flag==true)
      return true;
    else 
      return false;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    boolean cat=false;
    for(int i=s;i>=4;i--){
      if(s%i==0){
        if(isLucky(Integer.toString(i))){
           System.out.println("YES");
           cat=true;
           break;
        }
      }
    }
    if(cat!=true)
     System.out.println("NO");
  }
  
}