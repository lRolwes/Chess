package ChessGame; 
public class ChessSquare extend JButton{
    public char myPiece = 'e';
    public char team = 'w';
    public ChessSquare(){
        this.setPreferredSize(new Dimension(50,50));

    }

    public setPiece(char piece){
        this.myPiece = piece;
        this.setText(this.myPiece);
    }
    public setTeam(char newTeam){
        this.team = newTeam;
        if(this.team=='w'){
            this.setForeground(Color.WHITE);
        }
        else{
            this.setForeground(Color.BLACK);
        }
    }
    public hasPiece(){
        if(this.myPiece == 'e'){
            return false;
        }
        else return true;
    }
}