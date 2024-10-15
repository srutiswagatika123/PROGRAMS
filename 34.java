interface A
{
    
    void show();
}
interface B
{
   
    void show();
}
 class C implements A,B
{
    public void show()
    {
        System.out.println("show method ");
    }
  
}
class Test
{
    public static void main(String arg[])
    {
        C ob=new C();
        ob.show();
        A obj=new C();
        obj.show();
        B obj1=new C();
        obj1.show();
    }
}
