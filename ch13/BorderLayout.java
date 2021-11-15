import javax.swing.*;
import java.awt.*;

class Main extends JFrame{
  public Main(){
    setTitle("BorderLayout Ex");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container c = getContentPane();
    c.setLayout(new BorderLayout(20, 20));

    c.add(new JButton("add"), BorderLayout.EAST);
    c.add(new JButton("sub"), BorderLayout.CENTER);
    c.add(new JButton("mul"), BorderLayout.NORTH);
    c.add(new JButton("div"), BorderLayout.SOUTH);
    c.add(new JButton("Calculate"), BorderLayout.WEST);

    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Main();
  }
}

