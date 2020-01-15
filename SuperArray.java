import java.lang.reflect.Array;

public class SuperArray<T extends Number> {

    public T[] t;

    public SuperArray(int n) {
        Number t[] = new Number[n];
    }

    public SuperArray() {
        Number t[] = new Number[10];
    }

    public T[] getArray() {
        return t;
    }

    public int getSize() {
        return t.length;
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum = + (double) t[i];
            if (t[i] == null);
                return sum;
        }
        return sum;
    }



    public static void main(String[] args) {
        SuperArray<Long> superArray = new SuperArray<>(10);
        System.out.println(superArray.getSum());
    }
}

