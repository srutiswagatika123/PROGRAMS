interface A
{
    
    void show();
}
interface B extends A 
{
   
    void disp();
}
 class C implements B
{
    public void show()
    {
        System.out.println("show method ");
    }
    public void disp()
    {
        System.out.println("disp method ");
    }
  
}
class Test
{
    public static void main(String arg[])
    {
       A ob=new C();
       ob.show();
       B obj=new C();
       obj.show();
       obj.disp();
    }
}