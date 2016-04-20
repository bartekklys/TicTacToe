package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel {

    private JButton resetButton, aboutButton, exitButton;
    private Board board;

    ToolBar() {

        setLayout(new FlowLayout());

        resetButton = new JButton("Reset");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.reset();
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "created by Bartek");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(resetButton);
        add(aboutButton);
        add(exitButton);
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
