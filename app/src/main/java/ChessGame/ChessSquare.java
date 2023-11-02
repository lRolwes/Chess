package ChessGame; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessSquare extends JButton{
    public char myPiece = 'e';
    public char team = 'w';

    public ChessSquare(){
        this.setPreferredSize(new Dimension(50,50));
    }

    public void setVal(char piece){
        this.myPiece = piece;
        this.setText(String.valueOf(this.myPiece));
    }
    public void setTeam(char newTeam){
        this.team = newTeam;
        if(this.team=='w'){
            this.setForeground(Color.WHITE);
        }
        else{
            this.setForeground(Color.BLACK);
        }
    }
    public boolean hasPiece(){
        if(this.myPiece == 'e'){
            return false;
        }
        else return true;
    }
}