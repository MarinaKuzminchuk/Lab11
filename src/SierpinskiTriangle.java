import javax.swing.*;
import java.awt.*;

public class SierpinskiTriangle {
    static JFrame frame;

    public static void main(String[] args) {
        frameSetup();
        drawTriangles();
    }

    private static void frameSetup() {
        JFrame.setDefaultLookAndFeelDecorated(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame = new JFrame("SierpinskiTriangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.black);
        frame.setSize(screenSize.width, screenSize.height);
    }

    private static void drawTriangles() {
        frame.add(new SierpinskiPanel());
        frame.setVisible(true);
    }
}
