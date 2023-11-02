package ChessGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ChessGame.ChessSquare;

public class ChessBoard extends JPanel{
    ChessSquare[][] board = new ChessSquare[8][8];
    public ChessBoard(){
        int row = 0;
        int col = 0;
        for(int i = 0; i<64; i++){
            this.board[row][col] = new ChessSquare();
            if((row+col)%2==1){
                this.board[row][col].setBackground(new Color(210, 125, 45));
            }
            else{
               this.board[row][col].setBackground(new Color(193, 154, 107));
            }
            if(row==1 || row==6){
                this.board[row][col].setVal('P');
            }
            if(row==0||row==7){
                if(col==0||col==7){
                    this.board[row][col].setVal('R');
                }
                else if(col==1||col==6){
                    this.board[row][col].setVal('K');
                }
                else if(col==2||col==5){
                    this.board[row][col].setVal('B');
                }
                else{
                    if((row+col)%2==1){
                        this.board[row][col].setVal('K');
                    }
                    else{
                        this.board[row][col].setText("Q");
                    }
                }
            }
            if(row<=1){
                this.board[row][col].setTeam('w');
            }
            else if(row>5){
                this.board[row][col].setTeam('b');
            }
            this.add(this.board[row][col]);
            if(col == 7){
                col = 0;
                row++;
            }
            else{
                col++;
            }
            
         }
         setLayout(new GridLayout(8, 8));
    }
    public ChessSquare getSquare(int row, int col){
        return board[row][col];
    }
}