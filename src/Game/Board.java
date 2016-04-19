package Game;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {

    private JPanel board, menu;
    private JMenuBar menuBar;
    private JMenu gameMenu, helpMenu;
    private JMenuItem restartItem, exitItem, aboutItem;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;

    public Board(){

        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        menu = new JPanel();
        menu.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        gameMenu = new JMenu("Game");
        helpMenu = new JMenu("Help");

        menuBar.add(gameMenu);
        menuBar.add(helpMenu);

        restartItem = new JMenuItem("Restart");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(null, "created by Bartek"));

        gameMenu.add(restartItem);
        gameMenu.add(exitItem);
        helpMenu.add(aboutItem);

        setJMenuBar(menuBar);

        //game-board

        JButton button1 = new JButton("");
        JButton button2 = new JButton("");
        JButton button3 = new JButton("");
        JButton button4 = new JButton("");
        JButton button5 = new JButton("");
        JButton button6 = new JButton("");
        JButton button7 = new JButton("");
        JButton button8 = new JButton("");
        JButton button9 = new JButton("");

        board = new JPanel();
        board.setLayout(new GridLayout(3, 3));

        board.add(button1);
        board.add(button2);
        board.add(button3);
        board.add(button4);
        board.add(button5);
        board.add(button6);
        board.add(button7);
        board.add(button8);
        board.add(button9);

        add(menu, BorderLayout.NORTH);
        add(board);
    }
}
