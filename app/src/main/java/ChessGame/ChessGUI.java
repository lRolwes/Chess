import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessGUI 
{
   JFrame mainFrame;
   JPanel mainPanel;
   JLabel instructions;
 
   public ChessGUI()
   {
    JButton[] squares = new JButton[64];
    ChessBoard board = new ChessBoard();
    int row = 0;
    int col = 0;
    for(int i = 0; i<64; i++){
        board.getSquare(row, col) = new JButton();
        board.getSquare(row, col).setPreferredSize(new Dimension(50,50));
        if((row+col)%2==1){
            board.getSquare(row, col).setBackground(new Color(210, 125, 45));
        }
        else{
            board.getSquare(row, col).setBackground(new Color(193, 154, 107));
        }
        if(row==1 || row==6){
            board.getSquare(row, col).setText("P");
        }
        if(row==0||row==7){
            if(col==0||col==7){
                board.getSquare(row, col).setText("R");
            }
            else if(col==1||col==6){
                board.getSquare(row, col).setText("K");
            }
            else if(col==2||col==5){
                board.getSquare(row, col).setText("B");
            }
            else{
                if((row+col)%2==1){
                    board.getSquare(row, col).setText("K");
                }
                else{
                    board.getSquare(row, col).setText("Q");
                }
            }
        }
        if(row>4){
            board.getSquare(row, col).setForeground(Color.WHITE);
        }
        else{
            board.getSquare(row, col).setForeground(Color.BLACK);
        }
        if(col ==7){
            col = 0;
            row++;
        }
        else{
            col++;
        }
    }
    board.setLayout(new GridLayout(8, 8));

      this.mainFrame = new JFrame("Chess");
      this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.mainPanel = new JPanel();
      JPanel secPanel = new JPanel();
      secPanel.setBorder(BorderFactory.createLineBorder(Color.black));
      secPanel.setPreferredSize(new Dimension(100,300));
      JLabel deadPieces = new JLabel("Graveyard");
      secPanel.add(deadPieces);


      // set the background color of the panel that contains everything
      this.mainPanel.setBackground(new Color(194, 178, 128));
      // align the components of the main panel vertically
      this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      // add some padding to the edges of the main panel
      this.mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

      this.instructions = new JLabel("Welcome to ChessMaster!");
      this.instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
      this.mainPanel.add(instructions);
      this.mainPanel.add(board);
      this.mainPanel.add(secPanel);
      this.mainFrame.add(mainPanel);
      this.mainFrame.pack();
      this.mainFrame.setVisible(true);
   }
    public static void main(String[] args){
        ChessGUI chess = new ChessGUI();
    }



}
