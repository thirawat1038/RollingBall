package Lib;

import java.awt.*;
import javax.swing.*;
public class RollingBall extends JFrame {
public RollingBall(){
getContentPane().setLayout(new BorderLayout());
Draw2 b = new Draw2();
getContentPane().add(b,BorderLayout.CENTER);
setSize(300, 300);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}
}

class Draw2 extends JPanel {
    private static final int Ballsize = 100;

    public Draw2(){

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x = (getWidth() - Ballsize) / 2;
        int y = (getHeight() - Ballsize) / 2;

        g.setColor(Color.BLACK);
        g.fillArc(x, y, Ballsize, Ballsize, 0, 180);

        g.setColor(Color.BLACK);
        g.drawOval(x, y, Ballsize, Ballsize);
    }
}
