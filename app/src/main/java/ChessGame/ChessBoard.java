package ChessGame;
public class ChessBoard extends JPanel{
    ChessSquare[][] board = new ChessSquare[8][8];
    public ChessBoard(){
        int row = 0;
        int col = 0;
        for(int i = 0; i<64; i++){
            board[row][col] = new ChessSquare();
            board[row][col].setPreferredSize(new Dimension(50,50));
            if((row+col)%2==1){
                board[row][col].setBackground(new Color(210, 125, 45));
            }
            else{
               board[row][col].setBackground(new Color(193, 154, 107));
            }
            if(row==1 || row==6){
                board[row][col].setText("P");
            }
            if(row==0||row==7){
                if(col==0||col==7){
                    board[row][col].setText("R");
                }
                else if(col==1||col==6){
                    board[row][col].setText("K");
                }
                else if(col==2||col==5){
                    board[row][col].setText("B");
                }
                else{
                    if((row+col)%2==1){
                        board[row][col].setText("K");
                    }
                    else{
                        board[row][col].setText("Q");
                    }
                }
            }
            if(row>4){
                board[row][col].setForeground(Color.WHITE);
            }
            else{
                board[row][col].setForeground(Color.BLACK);
            }
            if(col ==7){
                col = 0;
                row++;
            }
            else{
                col++;
            }
         }
    }
    public ChessSquare getSquare(int row, int col){
        return board[row][col];
    }
}