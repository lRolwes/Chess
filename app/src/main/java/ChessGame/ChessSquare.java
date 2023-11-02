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
    private ArrayList<Observer> observers= new ArrayList<Observer>();

    public ChessSquare(ChessBoard board){
        this.setPreferredSize(new Dimension(50,50));
        this.myBoard = board;
        this.addActionListener(this);
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

    public char getTeam(){
        return team;
    }

    public void alertObservers(){
        for(Observer obs : observers){
            obs.update();
        }
    }

    public void register(Observer obs){
        observers.add(obs);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {   
        //event is moving away from this square
        if(this.myBoard.getPhase()==1){
            this.myBoard.disableAll();
            //enable possible target squares based on this ones value
            //set the phase of the board to 2
            this.myBoard.setPhase();
            //store the value of this square in the cache 
            this.myBoard.setCache(this.myPiece);
         }
         //event is moving to this square
         else if(this.myBoard.getPhase()==2){
            //if a piece was killed add it to the graveyard
            if(hasPiece()){
                //add this piece to the graveyard
            }
            //swap this piece for piece of square that took turn
            this.setVal(this.myBoard.getCacheVal());
            //set phase of the board to 1
            this.myBoard.setPhase();
            alertObservers();
         }
    }
}