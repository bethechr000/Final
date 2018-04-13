import javax.swing.*;

public class Game extends JFrame{

    public Game () {
        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Final Project");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main (String[] args){

        new Game();
    }

}

