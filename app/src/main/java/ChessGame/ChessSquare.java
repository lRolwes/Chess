package ChessGame; 
public class ChessSquare extend JButton{
    public ChessPiece myPiece = new ChessPiece("e");
    public setPiece(ChessPiece piece){
        this.myPiece = piece;
    }
    public hasPiece(){
        if(this.myPiece.getVal() == 'e'){
            return false;
        }
        else return true;
    }
}