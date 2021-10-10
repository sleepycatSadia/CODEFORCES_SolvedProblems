import java.util.*;
import java.util.HashMap;
public class Main{ 
  public static void main(String[] args){ 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
     HashMap<String,Integer> h = new HashMap<String,Integer>();
     for (int j = 1; j <=t; j++) { 
      String n=sc.nextLine();
      if(h.containsKey(n)){
        String s=n+(h.get(n)+1);
        h.put(n,h.get(n)+1);
        System.out.println(s);
      }else{
         h.put(n,0);
        System.out.println("OK");
      }
    }
  }
}