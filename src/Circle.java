import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.color.*;
import java.util.concurrent.ThreadLocalRandom;

public class Circle extends JPanel{

    public void paint (Graphics g){
        setSize(1000, 1000);

        int circleCount = 3;
        int max = 650;
        int min = 50;
        int x;
        int y;

        for (int i = 0; i < 3; i++) {

                x = (int) Math.floor(Math.random() * (max - min + 1) + min);
                y = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println(x);
                System.out.println(y);
                g.drawOval(x, y, 5, 5);
                g.fillOval(x, y, 5, 5);
        }
    }


}
