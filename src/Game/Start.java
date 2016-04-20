package Game;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Start extends JFrame {

    private Board gameBoard;
    private ToolBar toolBar;
    private static final int DEFAULT_WIDTH = 350;
    private static final int DEFAULT_HEIGHT = 350;

    Start() {

        setLayout(new BorderLayout());

        try {
            gameBoard = new Board();
        } catch (IOException e) {
            e.printStackTrace();
        }
        toolBar = new ToolBar();

        toolBar.setBoard(gameBoard);

        add(gameBoard, BorderLayout.CENTER);
        add(toolBar, BorderLayout.NORTH);

        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(false);
    }
}
