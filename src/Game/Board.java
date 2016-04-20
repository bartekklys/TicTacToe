package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private GameArray gameArray;
    private int player = 1;

    public Board() {

        setLayout(new GridLayout(3, 3));

        button1 = new JButton("");
        button2 = new JButton("");
        button3 = new JButton("");
        button4 = new JButton("");
        button5 = new JButton("");
        button6 = new JButton("");
        button7 = new JButton("");
        button8 = new JButton("");
        button9 = new JButton("");

        setGame();

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

    }

    private void setGame() {

        gameArray = new GameArray(this);
        defaultText();
    }

    private void defaultText() {
        button1.setIcon(null);
        button2.setIcon(null);
        button3.setIcon(null);
        button4.setIcon(null);
        button5.setIcon(null);
        button6.setIcon(null);
        button7.setIcon(null);
        button8.setIcon(null);
        button9.setIcon(null);
    }

    public void setMark(JButton button, int player) {

            if (player == 1) {
                button.setIcon(new ImageIcon("/home/bartek/IdeaProjects/TicTacToe/src/resources/X.png"));
                switchTurn();
            } else {
                button.setIcon(new ImageIcon("/home/bartek/IdeaProjects/TicTacToe/src/resources/O.png"));
                switchTurn();
            }
    }

    private void switchTurn() {
        if (player == 1)
            player = 2;
        else
            player =1;
    }

    public void actionPerformed(ActionEvent e) {

        JButton pressed = (JButton) e.getSource();

        setMark(pressed, player);

    }

    public void reset() {
        setGame();
    }
}