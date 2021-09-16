import java.util.Scanner;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value.";

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Do you want to calculate the area of a circle ?");
        System.out.println("Then please enter yes for yes and no for no.");
        String answer = scr.nextLine();
        questionAnswer(answer);

    }

    public static void questionAnswer(String answer) {
        Scanner scr = new Scanner(System.in);
        if (answer.equals("yes")) {
            System.out.println("To calculate the area of a circle please enter the radius.");
            double radius = scr.nextDouble();
            System.out.println(area(radius) + " is the area of your circle!");
        } else if (answer.equals("no")) {
            System.out.println("If you want to calculate the area of a rectangle please enter the x parameter.");
            double xParameter = scr.nextDouble();
            System.out.println("Now please enter the y parameter.");
            double yParameter = scr.nextDouble();
            System.out.println(area(xParameter, yParameter) + " is the area of your rectangle!");
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            System.err.println(INVALID_VALUE_MESSAGE);
            return -1d;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            System.err.println(INVALID_VALUE_MESSAGE);
            return -1d;
        } else {
            return x * y;
        }
    }
}
