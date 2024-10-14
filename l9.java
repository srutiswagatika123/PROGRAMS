class Test
{
    public static void main(String arg[])
    {
         int i;
         i=1;
         System.out.print("A");
         while(i<4)
         {
            System.out.print("B");
            i++;
             System.out.print("C");
             continue; //by default

          }
           System.out.print("D");
            System.out.print(i);
          
    }
}