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
        this.board.register(this);
        this.myGUI = new ChessGUI(board);
        this.turn = 'b';
        takeTurn();
    }

    
    private void takeTurn(){
        if(turn == 'w'){
                turn = 'b';
            }
            else{
                turn = 'w';
            }
        this.board.enableTeam(turn);
    }
}