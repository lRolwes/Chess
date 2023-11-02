package ChessGame;
import ChessGame.*;
public class ChessController implements Observer{
    protected ChessGUI myGUI;
    protected boolean over = false;
    protected char turn;
    protected ChessBoard board;

    public void update(){
        takeTurn();
    }

    public ChessController(ChessBoard newBoard){
        this.board = newBoard;
        this.myGUI = new ChessGUI(board);
        this.turn = 'w';
        takeTurn();
    }

    
    private void takeTurn(){
        this.board.enableTeam(turn);
        if(turn == 'w'){
                turn = 'b';
            }
            else{
                turn = 'w';
            }
    }
}