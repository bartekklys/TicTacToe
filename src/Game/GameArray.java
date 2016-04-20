package Game;

public class GameArray {

    private Board board;
    private int gameArray[];

    GameArray(Board board){

        gameArray = new int [9];

        this.board = board;

        for (int i = 0 ; i < 9 ; i++){
            gameArray[i] = 0;
        }
    }

    private void winCheck(int marker) {
    }
}
