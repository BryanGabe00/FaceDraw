import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class SadCyclopsPanel extends JPanel
{
  private SadCyclopsFace mySadCyclopsFace;
  private SadCyclopsFace mySadCyclopsFace2;

  public SadCyclopsPanel()
  {
      mySadCyclopsFace = new SadCyclopsFace(100,100,80,160, Color.red, true);
      mySadCyclopsFace2 = new SadCyclopsFace(250,150,100,260, Color.blue, false);
  }

  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      mySadCyclopsFace.paintComponent(g);
      mySadCyclopsFace2.paintComponent(g);
  }
}
