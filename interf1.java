interface A
{
    int x=10;
    void show();
}
interface B
{
    int x=20;
    void disp();
}
 class C implements A,B
{
    public void show()
    {
        System.out.println("show method ");
    }
    public void disp()
    {
        System.out.println("disp method " );
        //System.out.println(x); // reference to x is ambiguou
        System.out.println(A.x);
        System.out.println(B.x);
    }
}
class Test
{
    public static void main(String arg[])
    {
        C ob=new C();
        ob.show();
        ob.disp();
        A obj=new C();
        obj.show();
        B obj1=new C();
        obj1.disp();
    }
}