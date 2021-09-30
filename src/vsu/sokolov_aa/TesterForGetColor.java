package vsu.sokolov_aa;

public class TesterForGetColor {
    private static final int SIZE_OF_POINT_COLORS_ARRAY = 10;
    private static PointColor[] pointColors = new PointColor[SIZE_OF_POINT_COLORS_ARRAY];

    private static class PointColor {
        double x;
        double y;
        SimpleColor color;

        public PointColor(double x, double y, SimpleColor color) {
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }

    public static boolean testGetColor() {
        pointColors[0] = new PointColor(4, -1, SimpleColor.BLUE);
        pointColors[1] = new PointColor(0, 0, SimpleColor.GRAY);
        pointColors[2] = new PointColor(-3, -4, SimpleColor.ORANGE);
        pointColors[3] = new PointColor(-1, -4, SimpleColor.WHITE);
        pointColors[4] = new PointColor(6, -3, SimpleColor.GRAY);
        pointColors[5] = new PointColor(-1, 2, SimpleColor.GRAY);
        pointColors[6] = new PointColor(-4, -2, SimpleColor.WHITE);
        pointColors[7] = new PointColor(-2, -2, SimpleColor.GRAY);
        pointColors[8] = new PointColor(-2, -4, SimpleColor.WHITE);
        pointColors[9] = new PointColor(3, 0, SimpleColor.BLUE);

        for(int i = 0; i <SIZE_OF_POINT_COLORS_ARRAY; i++) {
            if (Main.getColor(pointColors[i].x, pointColors[i].y) != pointColors[i].color) {
                return false;
            }
        }
        return true;
    }

}
