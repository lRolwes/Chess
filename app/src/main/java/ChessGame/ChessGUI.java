
package ChessGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ChessGame.ChessBoard;

public class ChessGUI implements GraveObserver
{
   JFrame mainFrame;
   JPanel mainPanel;
   JPanel graveYard;
   JLabel instructions;

 
   public ChessGUI(ChessBoard newBoard) 
   {
      ChessBoard board = newBoard;
      board.registerGraveYard(this);
      this.mainFrame = new JFrame("Chess");
      this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.mainPanel = new JPanel();
      this.graveYard = new JPanel();
      this.graveYard.setBorder(BorderFactory.createLineBorder(Color.black));
      this.graveYard.setPreferredSize(new Dimension(100,50));
      JLabel graveYardTitle = new JLabel("Graveyard: ");
      this.graveYard.add(graveYardTitle);
      this.graveYard.setBackground(new Color(229, 170, 112));


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
      this.mainPanel.add(this.graveYard);
      this.mainFrame.add(mainPanel);
      this.mainFrame.pack();
      this.mainFrame.setVisible(true);
   }
   public void addToGrave(char piece, char team){
    JLabel grave = new JLabel(String.valueOf(piece));
    if(team=='w')
        grave.setForeground(Color.WHITE);
    else
        grave.setForeground(Color.BLACK);
    this.graveYard.add(grave);

   }
}
