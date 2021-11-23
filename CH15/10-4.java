import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Main extends JFrame {
  public Main(){
    setTitle("Lab10-1");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    JLabel label = new JLabel("Love JAVA");
    c.add(label);

    label.addKeyListener( new KeyAdapter(){
      @Override
      public void keyPressed(KeyEvent e){
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
          JLabel la = (JLabel)e.getSource();
          String text = la.getText();
          String firstChar = text.substring(0, 1); // 첫 번째 문자를 가져온다.
          String remainStr = text.substring(1); // 첫 번째 문자를 제외한 나머지 문자열
          la.setText(remainStr + firstChar );

        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
          JLabel la = (JLabel)e.getSource();
          String text = la.getText();
          String lastChar = text.substring(text.length()-1); // 마지막 문자를 가져온다.
          String remainStr = text.substring(0, text.length()-1); // 마지막 문자를 제외한 나머지 문자열
          la.setText(lastChar + remainStr );
        }
        //System.out.print(e.getKeyCode());
        
        else if(e.getKeyChar() == '+'){
          JLabel la = (JLabel)e.getSource();
          Font f = la.getFont();
          int size = f.getSize();
          la.setFont(new Font("Arial", Font.PLAIN, size+5));
          
        }

        else if(e.getKeyChar() == '-'){
          JLabel la = (JLabel)e.getSource();
          Font f = la.getFont();
          int size = f.getSize();
          if(size - 5 > 5)
            la.setFont(new Font("Arial", Font.PLAIN, size-5));
        }
      }
    } );

    label.addMouseWheelListener( new MouseWheelListener(){
      @Override
      public void mouseWheelMoved(MouseWheelEvent e){
        int dir = e.getWheelRotation();
        if(dir > 0){
          JLabel la = (JLabel)e.getSource();
          Font f = la.getFont();
          int size = f.getSize();
          
          la.setFont(new Font("Arial", Font.PLAIN, size+5));
        } else if (dir<0){
          JLabel la = (JLabel)e.getSource();
          Font f = la.getFont();
          int size = f.getSize();
          if(size - 5 > 5)
            la.setFont(new Font("Arial", Font.PLAIN, size-5));
        }
      }
    } );

    setSize(250, 100);
    setVisible(true);
    label.setFocusable(true); //포커스가 레이블에 가 있게
    label.requestFocus();
  }

  public static void main(String[] args) {
    new Main();
  }
}
