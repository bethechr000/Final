import javax.swing.*;

public class Game extends JFrame{

    private Board board;

    public Game () {
        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Final Project");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board(this);
        add(board);
        setLocationRelativeTo(null);

    }

    public static void main (String[] args){

       Game game = new Game();
    }

}

