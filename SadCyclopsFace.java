import java.awt.Graphics;
import java.awt.Color;
public class SadCyclopsFace extends OvalDraw {
    private OvalDraw eye;

    public SadCyclopsFace () {
        super(0,0,0,0, Color.red);
        eye = new OvalDraw(0,0,0,0, Color.red);
    }

    public SadCyclopsFace(int x, int y, int width, int height, Color color, boolean isEyeRed) {
        super(x, y, width, height, color);

        int eyeHeight = height / 7;
        int eyeWidth = eyeHeight * 2;
        int eyeX = x + (width / 2) - (eyeWidth / 2);
        int eyeY = y + (height / 3) - (eyeHeight / 2);

        eye = new OvalDraw(eyeX, eyeY, eyeWidth, eyeHeight, color);
        eye.setIsEyeRed(isEyeRed);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        eye.paintComponent(g);
        g.drawArc(getX(), getY()+(getHeight()/2), getWidth()-10, getHeight()-10, 45, 90);
    }
}
