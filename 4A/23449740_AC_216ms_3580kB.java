    import java.util.Scanner;
    public class task
    {public static void main (String[]args)
    {
     Scanner sc=new Scanner (System.in);
     int weight=sc.nextInt();
       int c=0;
       for(int a=2;a<=weight;a+=2)
       {if(weight%a==0)
         {c++;}
       }
       if((c==0)||(c==1))
       {System.out.println("no");}
      else
     {System.out.println("yes");}
    }
    }