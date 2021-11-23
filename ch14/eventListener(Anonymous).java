class Main{
  public static void main(String[] args) {
    new AnonymousClassListener();
  }
}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class AnonymousClassListener extends JFrame{
  public AnonymousClassListener(){
   setTitle("Action 이벤트 리스터 예제");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Container c = getContentPane();
   c.setLayout(new FlowLayout());
   JButton btn = new JButton("Action");
   btn.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
      JButton b = (JButton)e.getSource();
      if(b.getText().equals("Action")) b.setText("액션");
      else b.setText("Action");
      setTitle(b.getText());
    }
  });
   c.add(btn);

   setSize(350, 150);
   setVisible(true);
  
  }  
}

