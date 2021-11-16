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

    private static final int width = 600;
    private static final int height = 600;

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

        Circle[] pointList = new Circle[] {};

        mainFrame.add(new Circle(50,100,5,5));


        mainFrame.setVisible(true);
    }
}
