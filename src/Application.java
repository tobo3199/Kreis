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

        mainFrame.add(new Circle());

        mainFrame.setVisible(true);
    }
}
