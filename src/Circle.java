/**
 * Klasse:Circle
 *
 * @author: Tobias Sauter
 * @version:12.11.2021
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.color.*;

public class Circle extends JPanel{

    private int x;
    private int y;
    private int width;
    private int height;

    public Circle( int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }




    public void paint (Graphics g){
        //super.paint(g);
        setSize(1000, 1000);
        //setBackground(Color.black);

        g.drawOval(x, y, width, height);
        g.fillOval(x, y, width, height);
        //  g.setColor(Color.white);

    }


}
