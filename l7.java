class Test
{
    public static void main(String arg[])
    {
         int i;
         i=1;
         System.out.print("A");
         while(i<5)
         {
                System.out.print("B");
                i++;
                 System.out.print("C");
                 if(i==3)
                 {
                    break;
                 }
                 System.out.print("D");
          }
           System.out.print("E");
            System.out.print(i);
          
    }
}