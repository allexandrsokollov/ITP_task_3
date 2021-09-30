package vsu.sokolov_aa;

import java.util.Scanner;

public class Main {

    public  static final HorizontalParabola parabola = new HorizontalParabola(1.75, -.15, -0.25);

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
            color = SimpleColor.GRAY;
        } else {
            color = SimpleColor.BLUE;
        }
        return color;
    }

    public static double getDoubleFromConsole(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + massage + ": ");
        return in.nextDouble();
    }
}
