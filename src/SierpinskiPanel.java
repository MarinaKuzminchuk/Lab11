import java.awt.*;

public class SierpinskiPanel extends Panel {
    private static int maxDepth = 9;
    private static Color[] colors = {new Color(0x172A3A), new Color(0x004346), new Color(0x508991), new Color(0x74B3CE), new Color(0x09BC8A), new Color(0x1FF4FF)};

    private void drawRecursively(Graphics g, int[] x, int[] y, int level) {
        if (level > maxDepth) {
            return;
        }
        drawTriangle(g, x, y, level);
        int[] xMid = {getMiddle(x[0], x[1]), getMiddle(x[1], x[2]), getMiddle(x[0], x[2])};
        int[] yMid = {getMiddle(y[0], y[1]), getMiddle(y[1], y[2]), getMiddle(y[0], y[2])};
        drawTriangle(g, xMid, yMid, level + 1);
        int[] xTop = {getMiddle(x[0], x[1]), x[1], getMiddle(x[1], x[2])};
        int[] yTop = {getMiddle(y[0], y[1]), y[1], getMiddle(y[1], y[2])};
        drawRecursively(g, xTop, yTop, level + 1);
        int[] xRight = {getMiddle(x[0], x[2]), getMiddle(x[1], x[2]), x[2]};
        int[] yRight = {getMiddle(y[0], y[2]), getMiddle(y[1], y[2]), y[2]};
        drawRecursively(g, xRight, yRight, level + 1);
        int[] xLeft = {x[0], getMiddle(x[0], x[1]), getMiddle(x[0], x[2])};
        int[] yLeft = {y[0], getMiddle(y[0], y[1]), getMiddle(y[0], y[2])};
        drawRecursively(g, xLeft, yLeft, level + 1);
    }

    private void drawTriangle(Graphics g, int[] x, int[] y, int level) {
        Polygon triangle = new Polygon(x, y, 3);
        g.setColor(colors[level % colors.length]);
        g.fillPolygon(triangle);
    }

    public void paint(Graphics g) {
        int length = (int) (getHeight() / Math.cos(Math.toRadians(30)));
        int[] x = {0, length / 2, length};
        int[] y = {getHeight(), 0, getHeight()};
        drawRecursively(g, x, y, 0);
    }

    private int getMiddle(int coordinate1, int coordinate2) {
        return (coordinate2 - coordinate1) / 2 + coordinate1;
    }
}
