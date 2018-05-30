import javax.swing.*;

public class Game extends JFrame{

    private Board board;
    private Dice dice;

    public Game () {
        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Final Project");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board(this);
        add(board);
        dice = new Dice();
        setLocationRelativeTo(null);

    }

    public static void main (String[] args){

       Game game = new Game();

    }

}

