import java.awt.*;
import java.util.Map;

public class SierpinskiPanel extends Panel {
    private static int maxDepth = 9;
    private static Color[] colors = {new Color(0x172A3A), new Color(0x004346), new Color(0x508991), new Color(0x74B3CE), new Color(0x09BC8A), new Color(0x1FF4FF)};
    private void drawRecursively(Graphics g, int[] x, int[] y, int level){

    }
    private Map<Integer, int[][]> getNewTriangle(int[] x, int[] y){
        return null;
    }
    private void drawTriangle(Graphics g, int[] x, int[] y, int level){

    }
    public void paint(Graphics g){
        Graphics2D graphic2d = (Graphics2D) g;
        graphic2d.setColor(Color.BLACK);
        graphic2d.setStroke(new BasicStroke(3));
        Polygon triangle1 = new Polygon();
        int length = (int) (getHeight() / Math.cos(Math.toRadians(30)));
        triangle1.addPoint(length / 2, 0);
        triangle1.addPoint(0, getHeight());
        triangle1.addPoint(length, getHeight());
        graphic2d.drawPolygon(triangle1);

//        Polygon triangle2 = new Polygon();
//        triangle2.addPoint(middle(x1, x2), middle(y1, y2));
//        triangle2.addPoint(middle(x2, x3), middle(y2, y3));
//        triangle2.addPoint(middle(x1, x3), middle(y1, y3));
//        graphic2d.drawPolygon(triangle2);
    }
}
