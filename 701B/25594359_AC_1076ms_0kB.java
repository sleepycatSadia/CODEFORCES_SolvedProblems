import java.util.*;


public class Main{ 
  
  public static void main(String[] args){ 
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int []r = new int [n]; 
    
    int []c = new int [n]; 
    
    long rf=0;    
    long cf=0;
    
    long p=0;
    
    long t=(long)n;
    
    int m=sc.nextInt();
    
    for (int j = 1; j <=m; j++) { 
      
      int x=sc.nextInt();      
      int y=sc.nextInt();
      
      x=x-1;      
      y=y-1;
      
      if(r[x]==0){        
        p+=(t-cf);        
      }
      
      if(c[y]==0){          
        p+=(t-rf);
      }
      if(r[x]==0 && c[y]==0){
        p--;
      }
      if(r[x]==0){
        r[x]++;
        rf++;
      }
      
      if(c[y]==0){
        c[y]++;
        cf++;
      }
      
      
      System.out.println((t*t)-p); 
      
    }
    
  }
  
}
