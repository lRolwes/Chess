package ChessGame; 
public class ChessSquare extend JButton{
    public char myPiece = 'e';
    public char team = 'w';

    public setPiece(char piece){
        this.myPiece = piece;
    }
    public setTeam(char newTeam){
        team = newTeam;
    }
    public hasPiece(){
        if(this.myPiece == 'e'){
            return false;
        }
        else return true;
    }
}