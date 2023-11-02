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
      ChessBoard board = new ChessBoard();
    
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
}
