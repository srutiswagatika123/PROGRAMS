abstract class Shape
{
	abstract void area();

}
 class Rectangle extends Shape
{
	  int L,B;
	  Rectangle(int L,int B)
	  {
	  	this.L=L;
	  	this.B=B;
	  }
       void area()
       {
       	System.out.println("arae of rectangle= "+L*B);
       }
}
 class Square extends Shape
{
	  int S;
	  Square(int L)
	  {
	  	this.S=L;
	  }
       void area()
       {
       	System.out.println("arae of square= "+S*S);
       }
}
class Test
{
	public static void main(String arg[])
	{
	   Shape s=new Rectangle(10,20);
	   s.area();
	   s=new Square(6);
	   s.area();
	}
}