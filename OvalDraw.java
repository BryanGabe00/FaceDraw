import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class OvalDraw extends Oval
{
  private boolean isEyeRed = false;

  //constructors
  public OvalDraw() { super(0, 0, 1, 1, Color.red); }

  public OvalDraw(int x, int y, int width, int height, Color color)
  {
    super(x, y, width, height, color);
  }

  @Override
  public String toString()
  {
    return "X: " + getX() + "\n" +
           "Y: " + getY() + "\n" +
           "Width: " + getWidth() + "\n" +
           "Height: " + getHeight() + "\n";
  }
  //setters
  public void setIsEyeRed(boolean b)
  {
    isEyeRed = b;
  }
  public void paintComponent(Graphics g)
  {
    if(isEyeRed)
    {
      g.setColor(Color.red);
      g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
    g.setColor(getColor());
    g.drawOval(getX(), getY(), getWidth(), getHeight());
  }
}
