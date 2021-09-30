package vsu.sokolov_aa;

import java.util.Scanner;

public class Main {

    public  static final HorizontalParabola parabola = new HorizontalParabola(1.75, -.15, -0.25);
    public static final Circle bigCircle = new Circle(1,-3,4);
    public static final Circle smallCircle = new Circle(-2,-5,2);

    public static void main(String[] args) {

        double x, y;

        do {
            x = getDoubleFromConsole("Enter X");
            y = getDoubleFromConsole("Enter Y");

            System.out.println("\n" + getColor(x, y) + "\n");
        } while (x <= 10 && y <= 10);
    }

    public static SimpleColor getColor(double x, double y) {
        SimpleColor color;

        if(parabola.isPointRightOfParabola(x, y)) {
            if(bigCircle.isPointInsideCircle(x, y)) {
                color = SimpleColor.BLUE;
            } else {
                color = SimpleColor.GRAY;
            }
        } else if (bigCircle.isPointInsideCircle(x, y)) {
             if(smallCircle.isPointInsideCircle(x, y)) {
                 color = SimpleColor.WHITE;
             } else {
                 color = SimpleColor.GRAY;
             }
        } else if (smallCircle.isPointInsideCircle(x, y)) {
            color = SimpleColor.ORANGE;
        } else {
            color = SimpleColor.WHITE;
        }

        return color;
    }

    public static double getDoubleFromConsole(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + massage + ": ");
        return in.nextDouble();
    }
}
