import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private Color colors[] ={Color.WHITE, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
    public Board (Game game){

        setPreferredSize(new Dimension(800, 600));

        setBackground(Color.WHITE);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
