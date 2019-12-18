public class Rectangle extends Figure implements Printable {
    private int width;
    private int height;

    Rectangle(Point center, int width, int height) {
        super(center);
        this.height = height;
        this.width = width;
    }

    @Override
    FigureType getFigureType() {
        return FigureType.RECTANGLE;
    }

    @Override
    double getSquare() {
        return height * width;
    }

    @Override
    double getPerimeter() {
        return height + width;
    }

    @Override
    int containsPoint(Point point) {
        return false;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void printInformation() {
        System.out.println(getFigureType());
        System.out.println("Perimeter " + getPerimeter());
        System.out.println("Square " + getSquare());
    }
}
