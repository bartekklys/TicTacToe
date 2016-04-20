package Game;

import javax.swing.*;

public class GameArray {

    private Board board;
    private int gameArray[];

    GameArray(Board board) {

        this.board = board;
        gameArray = new int[9];

        for (int i = 0; i < 9; i++) {
            gameArray[i] = 0;
        }
    }

    public void arrayInitialize(int i, int player) {
        gameArray[i] = player;
        winCheck();
    }

    private void winCheck() {
        if(gameArray[0] != 0 && gameArray[1] != 0 && gameArray[2] != 0 && gameArray[3] != 0 && gameArray[4] != 0 && gameArray[5] != 0 && gameArray[6] != 0 && gameArray[7] != 0 && gameArray[8] != 0){
            JOptionPane.showMessageDialog(null, "Draw!");
            board.disableButtons();
        }
        else if ((gameArray[0] == 1 && gameArray[1] == 1 && gameArray[2] == 1) ||
                (gameArray[3] == 1 && gameArray[4] == 1 && gameArray[5] == 1) ||
                (gameArray[6] == 1 && gameArray[7] == 1 && gameArray[8] == 1) ||
                (gameArray[0] == 1 && gameArray[3] == 1 && gameArray[6] == 1) ||
                (gameArray[1] == 1 && gameArray[4] == 1 && gameArray[7] == 1) ||
                (gameArray[2] == 1 && gameArray[5] == 1 && gameArray[8] == 1) ||
                (gameArray[0] == 1 && gameArray[4] == 1 && gameArray[8] == 1) ||
                (gameArray[2] == 1 && gameArray[4] == 1 && gameArray[6] == 1)) {
            JOptionPane.showMessageDialog(null, "Player X is a winner!");
            board.disableButtons();
        } else if ((gameArray[0] == 2 && gameArray[1] == 2 && gameArray[2] == 2) ||
                (gameArray[3] == 2 && gameArray[4] == 2 && gameArray[5] == 2) ||
                (gameArray[6] == 2 && gameArray[7] == 2 && gameArray[8] == 2) ||
                (gameArray[0] == 2 && gameArray[3] == 2 && gameArray[6] == 2) ||
                (gameArray[1] == 2 && gameArray[4] == 2 && gameArray[7] == 2) ||
                (gameArray[2] == 2 && gameArray[5] == 2 && gameArray[8] == 2) ||
                (gameArray[0] == 2 && gameArray[4] == 2 && gameArray[8] == 2) ||
                (gameArray[2] == 2 && gameArray[4] == 2 && gameArray[6] == 2)) {
            JOptionPane.showMessageDialog(null, "Player O is a winner!");
            board.disableButtons();
        }
    }
}
