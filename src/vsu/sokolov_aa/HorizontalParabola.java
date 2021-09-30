package vsu.sokolov_aa;

public class HorizontalParabola {
    public double c;
    public double y0;
    public double a;

    public HorizontalParabola(double x0, double y0, double a) {
        this.c = x0;
        this.y0 = y0;
        this.a = a;
    }

    public boolean isPointRightOfParabola(double x, double y) {
        return x > a * Math.pow(y, 2) + c + y0*y;
    }
}
