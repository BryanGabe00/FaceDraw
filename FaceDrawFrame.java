import javax.swing.JFrame;
import java.awt.Color;
import java.util.ArrayList;

public class FaceDrawFrame extends JFrame
{
  public FaceDrawFrame(ArrayList<Face> list)
  {
    super("Face Draw Lite");
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    add(new FacePanel(list));
  }
}
