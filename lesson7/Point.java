public class Point implements Printable {
    private int x;
    private int y;

    Point (int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void printInformation() {
        System.out.println(x);
        System.out.println(y);
    }
}
