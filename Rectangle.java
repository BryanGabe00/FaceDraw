import java.awt.Color;

public class Rectangle extends Shape
{
  //constructors
  public Rectangle() { super(); }

  public Rectangle(int x, int y, int width, int height)
  {
    super(x, y, width, height);
  }
  public Rectangle(int x, int y, int width, int height, Color color)
  {
    super(x, y, width, height, color);
  }

  public double calcArea()
  {
    return (double)(getWidth() * getHeight());
  }
  public double calcPerimeter()
  {
    return (double)(getWidth() * 2) + (getHeight() * 2);
  }
}
