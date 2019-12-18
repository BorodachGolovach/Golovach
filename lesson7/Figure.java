public abstract class Figure implements Printable {
    private Point center;

    Figure(Point center){
        this.center = center;
    }
    public Point getCenter() {
        return center;
    }

    abstract FigureType getFigureType();

    abstract double getSquare();

    abstract double getPerimeter();

    abstract int containsPoint(Point point);

    @Override
    public void printInformation() {
    }

}
