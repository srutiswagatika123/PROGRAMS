class Test
{
    public static void main(String arg[])
    {
         int i;
         i=1;
         while(i<5)
         {
            i++;
            if(i>=3)
            {
              continue;  
            }
            System.out.print(i);
             
          }
       System.out.print(i);
    }
}