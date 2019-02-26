import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;

public class FacePanel extends JPanel
{
  private ArrayList<Face> faces;
  private Face face;
  private Random r;
  private Random randomFace;
  private Random randomColor;

  private int random;
  private int randomX, randomY, randomWidth, randomHeight, randomR, randomG, randomB;

  public FacePanel(ArrayList<Face> faces)
  {
    this.faces = faces;
    r = new Random();
    randomFace = new Random();
    randomColor = new Random();

    random = r.nextInt(10 - 3 + 1) + 3;

    for(int i = 0; i < random; i++)
    {
      randomX = r.nextInt(800);
      randomY = randomFace.nextInt(600);
      randomWidth = randomFace.nextInt(350 - 150 + 1) + 150;
      randomHeight = randomFace.nextInt(300 - 50 + 1) + 50;

      randomR = randomColor.nextInt(255);
      randomG = randomColor.nextInt(255);
      randomB = randomColor.nextInt(255);

      face = new Face(randomX, randomY, randomWidth, randomHeight, new Color(randomR, randomG, randomB));
      faces.add(face);
      System.out.println(face);
    }
  }

  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);

      for(Face face : faces)
      face.paintComponent(g);
  }

  //getters
  public ArrayList<Face> getFaces() { return faces; }
}
