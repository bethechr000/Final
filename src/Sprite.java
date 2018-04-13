import java.awt.*;

public class Sprite implements Paint, Move {

    Color color;
    int x, y, width, height;

    double dx, dy;

    final int SPEED = 7;

    public Sprite(Color color, int x, int y, int width, int height){

        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void Move(int boardHeight, int boardWidth) {



    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)(x),(int)(y), width, height);
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void setPosition(int x, int y) {

        this.x = x;
        this.y = y;

    }
}
