import java.awt.Color;

public class Circle extends Oval
{
  //constructors
  public Circle() { super(); }

  public Circle(int x, int y, int height)
  {
    super(x, y, height, height);
  }
  public Circle(int x, int y, int height, Color color)
  {
    super(x, y, height, height, color);
  }

  public double calcPerimeter()
  {
    double a = getHeight() / 2.0;
    double b = getHeight() / 2.0;
    double perimeter =2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
    return perimeter;
  }
}
