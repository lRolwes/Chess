package ChessGame; 
import ChessGame.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ChessSquare extends JButton implements ActionListener{
    public char myPiece = 'e';
    public char team = 'w';
    private ChessBoard myBoard;
    private int row;
    private int col;

    public ChessSquare(ChessBoard board, int row, int col){
        this.setPreferredSize(new Dimension(50,50));
        this.myBoard = board;
        this.addActionListener(this);
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public void setVal(char piece){
        this.myPiece = piece;
        if(piece!='e')
            this.setText(String.valueOf(this.myPiece));
        else
            this.setText(" ");
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

    public char getTeam(){
        return team;
    }

    public char getVal(){
        return myPiece;
    }


    @Override
    public void actionPerformed(ActionEvent event)
    {   
        System.out.println("performing action");
        //event is moving away from this square
        if(this.myBoard.getPhase()==1){
            System.out.println("phase is 1");
            this.myBoard.move(this);
         }
         //event is moving to this square
         else if(this.myBoard.getPhase()==2){
           this.myBoard.moveTo(this);
         }
    }
}