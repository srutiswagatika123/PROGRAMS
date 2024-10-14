interface A
{
    
    void show();
}
interface B 
{
   
    void disp();
}
class C 
{
    void look()
    {
        System.out.println("look method ");
    }

}
class D  extends C  implements A,B

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
       D ob=new D();
       ob.show();
       ob.disp();
       ob.look();
    }
}