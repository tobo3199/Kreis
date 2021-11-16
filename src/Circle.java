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
import java.util.concurrent.ThreadLocalRandom;

public class Circle extends JPanel{

    /*private int x;
    private int y;
    private int width;
    private int height;*/

    /*public Circle( int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }*/




    public void paint (Graphics g){
        //super.paint(g);
        setSize(1000, 1000);
        //g.drawOval(50, 500, 5, 5);
        //g.fillOval(50, 500, 5, 5);

        int circleCount = 3;
        int max = 650;
        int min = 50;
        int x;
        int y;

        //for(int  a= 0; a < 4; a++) {
            for (int i = 0; i < 3; i++) {

                x = (int) Math.floor(Math.random() * (max - min + 1) + min);
                y = (int) Math.floor(Math.random() * (max - min + 1) + min);
                System.out.println(x);
                System.out.println(y);
                g.drawOval(x, y, 5, 5);
                g.fillOval(x, y, 5, 5);
            }
        //}
    }


}
