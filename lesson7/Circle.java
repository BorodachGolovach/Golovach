public class Circle extends Figure implements Printable {
    private int radius;

    Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }


    @Override
    FigureType getFigureType() {
        return FigureType.CIRCLE;
    }

    @Override
    double getSquare() {
        return (radius * radius) / Math.PI;
    }

    @Override
    double getPerimeter() {
        return (radius * radius) * (2 * Math.PI);
    }

    @Override
    public int containsPoint(Point point) {
        if (Math.sqrt(Math.pow(point.getX() - getCenter().getX(), 2) + (Math.pow(point.getY() - getCenter().getY(), 2))) > radius) {
            return true;
        } else {
            return false;
        }

        @Override
        public void printInformation () {
            System.out.println(getFigureType());
            System.out.println("Circle Square " + getSquare());
            System.out.println("Circle Perimeter " + getPerimeter());
        }

        public int getRadius () {
            return radius;
        }
    }
}
