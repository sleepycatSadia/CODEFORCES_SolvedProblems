import java.util.*;
public class Main{ 
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    sc.nextLine();
    ArrayList<String>p = new ArrayList<String>();
    ArrayList<String> e = new ArrayList<String>();
    for (int i = 1; i <=n; i++) { 
      String x=sc.nextLine(); 
      p.add(x);
    }
    for (int j = 1; j <=m; j++) { 
      String y=sc.nextLine();
      e.add(y);
    }
    int count=0;
    if(n>m)
      System.out.println("YES");
    else if(n<m)
      System.out.println("NO");
    else{
      for (int a = 0; a <e.size();a++) { 
        if(p.contains(e.get(a))){
          count++;
        }
      }
      if(count%2==0)
        System.out.println("NO");
      else
        System.out.println("YES");
    }
  }
}