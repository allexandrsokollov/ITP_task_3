package vsu.sokolov_aa;

import java.util.ArrayList;

public class TesterForGetColor {
    private static final ArrayList<PointColor> pointColors = new ArrayList<>(36);

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
        pointColors.add(new PointColor(1, -6, SimpleColor.GRAY));
        pointColors.add(new PointColor(2, -5, SimpleColor.GRAY));
        pointColors.add(new PointColor(3, -4, SimpleColor.GRAY));
        pointColors.add(new PointColor(3, -3, SimpleColor.GRAY));
        pointColors.add(new PointColor(3, -2, SimpleColor.GRAY));
        pointColors.add(new PointColor(2, -1, SimpleColor.GRAY));
        pointColors.add(new PointColor(-2, -8, SimpleColor.GRAY));
        pointColors.add(new PointColor(-1, -3, SimpleColor.GRAY));
        pointColors.add(new PointColor(1, -0, SimpleColor.GRAY));
        pointColors.add(new PointColor(0, -3, SimpleColor.GRAY));
        pointColors.add(new PointColor(0, -6, SimpleColor.GRAY));
        pointColors.add(new PointColor(0, -8, SimpleColor.GRAY));
        pointColors.add(new PointColor(0, 2, SimpleColor.GRAY));
        pointColors.add(new PointColor(3, 0, SimpleColor.BLUE));
        pointColors.add(new PointColor(4, -1, SimpleColor.BLUE));
        pointColors.add(new PointColor(4, -2, SimpleColor.BLUE));
        pointColors.add(new PointColor(4, -4, SimpleColor.BLUE));
        pointColors.add(new PointColor(4, -5, SimpleColor.BLUE));
        pointColors.add(new PointColor(3, -6, SimpleColor.BLUE));
        pointColors.add(new PointColor(2, -6, SimpleColor.BLUE));
        pointColors.add(new PointColor(-3, -5, SimpleColor.ORANGE));
        pointColors.add(new PointColor(-3, -4, SimpleColor.ORANGE));
        pointColors.add(new PointColor(-3, -5, SimpleColor.ORANGE));
        pointColors.add(new PointColor(-3, -6, SimpleColor.ORANGE));
        pointColors.add(new PointColor(-2, -6, SimpleColor.ORANGE));
        pointColors.add(new PointColor(-3, -0, SimpleColor.WHITE));
        pointColors.add(new PointColor(-3, -1, SimpleColor.WHITE));
        pointColors.add(new PointColor(-2, -5, SimpleColor.WHITE));
        pointColors.add(new PointColor(-1, -5, SimpleColor.WHITE));
        pointColors.add(new PointColor(-1, -6, SimpleColor.WHITE));
        pointColors.add(new PointColor(-1, -7, SimpleColor.WHITE));
        pointColors.add(new PointColor(-3, -7, SimpleColor.WHITE));
        pointColors.add(new PointColor(-4, -6, SimpleColor.WHITE));

        for (int i = 0; i < pointColors.size(); i++) {
            if (Main.getColor(pointColors.get(i).x, pointColors.get(i).y) != pointColors.get(i).color) {
                return false;
            }
        }
        return true;
    }

}
