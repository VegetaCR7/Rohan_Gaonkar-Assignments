
public class Prgm5 {

	public static void main(String[] args) {
		Shape l=new Line();
		l.draw();
		System.out.println("--------------------------------------------");
		Shape r=new Rectangle();
		r.draw();
		System.out.println("--------------------------------------------");
		Shape c=new Cube();
		c.draw();
	}

}

abstract class Shape{
	abstract public void draw();
}

class Line extends Shape{
	public void draw()
	{
		System.out.println("Line is drawn");
	}
}

class Rectangle extends Shape{
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
}

class Cube extends Shape{
	public void draw()
	{
		System.out.println("Cube is drawn");
	}
}