import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

/**
 * Klasse:
 *
 * @author: Tobias Sauter
 * @version:
 */
public class Application {

    private static final int width = 700;
    private static final int height = 700;

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Kreis berechnen");
        mainFrame.setPreferredSize(new Dimension(width,height));
        mainFrame.setMaximumSize(new Dimension(width,height));
        mainFrame.setMinimumSize(new Dimension(width,height));
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        //mainFrame.setSize(600, 600);
        //mainFrame.add(new Circle(50,200,5,5));

        /*Circle[] pointList = new Circle[] {
                new Circle(100,100,5, 5),
                new Circle(50,50,5,5),
                new Circle(100, 200,5,5)
        };*/

        mainFrame.add(new Circle());


        mainFrame.setVisible(true);
    }
}
