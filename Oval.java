import java.awt.Color;

public class Oval extends Shape
{
  //constructors
  public Oval() { super(); }

  public Oval(int x, int y, int width, int height)
  {
    super(x, y, width, height);
  }
  public Oval(int x, int y, int width, int height, Color color)
  {
    super(x, y, width, height, color);
  }

  public double calcArea()
  {
    return Math.PI * (getWidth()/2) * (getHeight()/2);
  }
  public double calcPerimeter()
  {
    double a = getWidth() / 2.0;
    double b = getHeight() / 2.0;
    double perimeter =2*Math.PI*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
    return perimeter;
  }
}
