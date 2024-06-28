package gr.aueb.cf.ch16_17;

public class MainShape {
    public static void main(String[] args) {


        Line line = new Line(23);
        System.out.println(line);

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Area: " + rectangle.getArea());

    }
}
