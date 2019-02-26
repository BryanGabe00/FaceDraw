import java.awt.Color;

public abstract class Shape
{
  int x, y, width, height;
  Color color;

  //constructors
  public Shape(){ this(0, 0, 1, 1); }

  public Shape(int x, int y, int width, int height)
  {
    setX(x);
    setY(y);
    setWidth(width);
    setHeight(height);
    setColor(Color.red);
  }
  public Shape(int x, int y, int width, int height, Color color)
  {
    this(x, y, width, height);
    setColor(color);
  }
  //getters
  public final int getX() { return x; }
  public final int getY() { return y; }
  public final int getWidth() { return width; }
  public final int getHeight() { return height; }
  public final Color getColor() { return color; }

  //abstract methods
  public abstract double calcArea();
  public abstract double calcPerimeter();

  //setters
  public final void setX(int x)
  {
    if (x < 0) throw new IllegalArgumentException("x can't be negative!");
    this.x = x;
  }
  public final void setY(int y)
  {
    if (y < 0) throw new IllegalArgumentException("y can't be negative!");
    this.y = y;
  }
  public final void setWidth(int width)
  {
    if (width < 0) throw new IllegalArgumentException("width can't be negative!");
    this.width = width;
  }
  public final void setHeight(int height)
  {
    if (height < 0) throw new IllegalArgumentException("height can't be negative!");
    this.height = height;
  }
  public final void setColor(Color color)
  {
    this.color = color;
  }
}
