import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private Color colors[] ={Color.WHITE, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
    public Board(Game game) {
        setPreferredSize(new Dimension(600,600));
        setBackground(Color.WHITE);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int dy = getHeight()/15;
        int dx = getWidth()/15;

        g.setColor(Color.BLUE);
        g.fillRect(0,0,(width * 2)/5, (height * 2)/5 );

        g.setColor(Color.RED);
        g.fillRect((width * 3)/5, 0, width, (height * 2)/5 );

        g.setColor(Color.YELLOW);
        g.fillRect(0, (height * 3)/5, (width * 2)/5, height);

        g.setColor(Color.GREEN);
        g.fillRect((width * 3)/5, (height * 3)/5, width, height);

        g.setColor(Color.WHITE);
        g.fillRect((width/15)  , (height/15) ,(width/15)  * 4 , (height/15) * 4);

        g.setColor(Color.WHITE);
        g.fillRect((width/15), (height/15) * 10, (width/15) * 4, (height/15) * 4);

        g.setColor(Color.WHITE);
        g.fillRect((width/15) * 10, (height/15), (width/15) * 4, (height/15) * 4);

        g.setColor(Color.WHITE);
        g.fillRect((width/15) * 10, (height/15), (width/15) * 4, (height/15) * 4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
