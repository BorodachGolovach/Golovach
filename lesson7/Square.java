public class Square extends Rectangle {
    Square(Point center, int width, int height) {
        super(center, width, height);

    }
    @Override
    FigureType getFigureType() {
        return FigureType.SQUARE;
    }
}
