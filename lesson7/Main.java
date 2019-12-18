public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 2);
        Point point2 = new Point(3, 5);
        point.printInformation();
        Circle circle = new Circle(point,5);
        circle.printInformation();
        Rectangle rectangle = new Rectangle(point, 2, 4);
        rectangle.printInformation();
        Square square = new Square(point, 2,2);
        square.printInformation();
    }
}
