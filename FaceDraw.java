import java.util.ArrayList;
/**
 * @author    Bryan Gabe
 * @version   1.0
**/
public class FaceDraw
{
  public static void main(String[] args)
  {
    ArrayList<Face> list = new ArrayList<Face>();
    FaceDrawFrame faceFrame = new FaceDrawFrame(list);
    faceFrame.setVisible(true);

    
  }
}
