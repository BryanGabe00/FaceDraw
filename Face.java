import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class Face extends OvalDraw
{
  private OvalDraw head;
  private OvalDraw eye1;
  private OvalDraw eye2;

  private int random;
  private Random r = new Random();

  //constructors
  public Face(int x, int y, int width, int height, Color color)
  {
    random = r.nextInt(3);
    int eye1Height = height /  7;
    int eye1Width = eye1Height * 2;
    int eye1X = x + (width  / 3) - (eye1Width / 3);
    int eye1Y = y + (height / 3) - (eye1Height / 3);

    int eye2Height = height /  7;
    int eye2Width = eye2Height * 2;
    int eye2X = x + (width  / 3) + (eye2Width / 2) + 10;
    int eye2Y = y + (height / 3) - (eye2Height / 3);

    head = new OvalDraw(x, y, width, height, color);
    eye1 = new OvalDraw(eye1X, eye1Y, eye1Width, eye1Height, color);
    eye2 = new OvalDraw(eye2X, eye2Y, eye2Width, eye2Height, color);
  }
  public Face() { this(0, 0, 150, 50, Color.red); }

  @Override
  public String toString()
  {
    return "X: " + head.getX() + "\n" +
           "Y: " + head.getY() + "\n" +
           "Width: " + head.getWidth() + "\n" +
           "Height: " + head.getHeight() + "\n";
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    head.paintComponent(g);
    eye1.paintComponent(g);
    eye2.paintComponent(g);
    switch(random)
    {
      case 0:
      //sad Face
      g.drawArc(head.getX(), head.getY() + (head.getHeight() / 2), head.getWidth() - 10, head.getHeight() - 10, 45, 90);
      break;

      case 1:
      //happy face
      g.drawArc(head.getX() + 10, head.getY() - (head.getHeight() / 7), head.getWidth() - 10, head.getHeight(), 0, -180);
      break;

      case 2:
      //nuetral
      g.drawLine(eye1.getX(), head.getY() + (head.getHeight() / 2), eye2.getX() + eye2.getWidth(), head.getY() + (head.getHeight() / 2));
      break;

      default:
      System.out.println("Fatal Error you done goofed up.");
      break;
    }
  }
}
