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
            if(i>=3)
            {
              continue;  
            }
            System.out.print("C");
             
          }
        System.out.print("D");
        System.out.print(i);
          
    }
}