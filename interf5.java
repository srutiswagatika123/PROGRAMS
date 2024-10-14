interface Rbi
{
    
    void interset();
}

class Sbi implements Rbi
{
    public void interset()
    {
        System.out.println("10% ");
    }

}
class Pnb implements Rbi
{
    public void interset()
    {
        System.out.println("9.5% ");
    }
   

}

class Test
{
    public static void main(String arg[])
    {
       Rbi r=new Sbi();
       r.interset();
       r=new Pnb();
       r.interset();
    }
}