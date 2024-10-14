import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da,hra,total;
         if(sal>=8000)
         {
            da=sal*0.5;
            hra=sal*0.4;
         }
         else if(sal>=5000)
         {
               da=sal*0.4;
               hra=sal*0.3;
         }
         else if(sal>=3000)
         {
                 da=sal*0.3;
                 hra=sal*0.2;
         }
         else
         {
              da=sal*0.2;
              hra=sal*0.1;
         }
         total=sal+da+hra;
         System.out.println("basic sal="+sal);
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);

     }
}