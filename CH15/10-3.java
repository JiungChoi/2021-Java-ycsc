import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Main extends JFrame {
  public Main(){
    setTitle("Lab10-3");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(null);

    JLabel label = new JLabel("O");
    c.add(label);

    label.setSize(20, 20);
    label.setLocation(100, 100);

    label.addMouseListener( new MouseAdapter(){
      @Override
      public void mousePressed(MouseEvent e){
        JLabel la = (JLabel)e.getSource();
        Container c = la.getParent();
        
        int xBound = c.getWidth() - la.getWidth();
        int yBound = c.getHeight() - la.getHeight();
        
        int x = (int) (Math.random() * xBound);
        int y = (int) (Math.random() * yBound);

        la.setLocation(x, y);
      }
    } );

    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Main();
  }
}
