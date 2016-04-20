package Game;

public class GameArray {

    private Board board;
    private int gameArray[];

    GameArray(Board board){

        this.board = board;
        gameArray = new int [9];

        for (int i = 0 ; i < 9 ; i++){
            gameArray[i] = 0;
        }
    }

    public void arrayInitialize(int i, int player) {
        gameArray[i] = player;
    }

    private void winCheck() {
        // soon....
    }
}
