    import java.util.Scanner;
    public class Main{
      public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
          String s=sc.next();
          char []arr=s.toCharArray();
          if(arr.length>10){
            System.out.print(arr[0]);
            System.out.print(arr.length-2);
            System.out.println(arr[arr.length-1]);      
          }else
            System.out.println(s);   
          i++;
        }
      }
    }
