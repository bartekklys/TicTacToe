package Game;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {

    private JPanel board;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;
    JButton button1 = new JButton("");
    JButton button2 = new JButton("");
    JButton button3 = new JButton("");
    JButton button4 = new JButton("");
    JButton button5 = new JButton("");
    JButton button6 = new JButton("");
    JButton button7 = new JButton("");
    JButton button8 = new JButton("");
    JButton button9 = new JButton("");

    public Board(){
        setLayout(new GridLayout(3,3));
        setTitle("TicTacToe");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
    }
}
