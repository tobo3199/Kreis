import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.color.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Circle extends JPanel{

    public void paint (Graphics g){
        setSize(1000, 1000);

        int circleCount = 3;
        int max = 650;
        int min = 50;
        int x;
        int y;
        Random rand = new Random();

        ArrayList <Integer> xList = new ArrayList<Integer>();
        ArrayList <Integer> yList = new ArrayList<Integer>();

        for (int i = 0; i < 2; i++) {

            x = rand.nextInt((max - min) + 1) + min;
            y = rand.nextInt((max - min) + 1) + min;
            //x = (int) Math.floor(Math.random() * (max - min + 1) + min);
            //y = (int) Math.floor(Math.random() * (max - min + 1) + min);
           // System.out.println("x: " + x);
            //System.out.println("y: " + y);
            //System.out.println("---------");
            g.drawOval(x, y, 5, 5);
            g.fillOval(x, y, 5, 5);

            xList.add(x);
            yList.add(y);
        }
        int xKordi = 0;
        int yKordi = 0;

        if(xList.get(0) > xList.get(1)){
            xKordi = xList.get(0) - xList.get(1);
            System.out.println("xKordi: " + xKordi +
                    "xList: " + xList.get(0) +
                    "xList: " + xList.get(1));
        } else if (xList.get(0) < xList.get(1)){
            xKordi = xList.get(1) - xList.get(0);
        }

        if(yList.get(0) > yList.get(1)){
            yKordi = yList.get(0) - yList.get(1);
        } else if (yList.get(0) < yList.get(1)){
            yKordi = yList.get(1) - yList.get(0);
        }

        System.out.println(xList);

        g.drawOval(xKordi,yKordi,xKordi,yKordi);

    }


}
