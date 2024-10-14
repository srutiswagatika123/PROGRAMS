interface Driver  //java 
{
    
    void connect();
}

class Oracle implements Driver
{
    public void connect()
    {
        System.out.println("oracle connection ");
    }

}
class Mysql implements Driver
{
    public void connect()
    {
        System.out.println("mysql connection");
    }

}

class Test
{
    public static void main(String arg[])
    {
      Driver ob=new Oracle();
      ob.connect();
      ob=new Mysql();
      ob.connect();
    }
}