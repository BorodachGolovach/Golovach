package les10;

import sun.awt.CausedFocusEvent;

public class Method {
    public void println(String s) {
        try {
            throw new MyException(s);
        } catch (MyException e) {
            System.out.println(s);
        } finally {
            System.out.println();
        }
    }

    public void nullPointed(String s) {
        s = null;
        try {
            s.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown successfully");
        }
    }

    public void f() {
        try {
            g();
        } catch (MyException e) {
            int a = 1 / 0;
            System.out.println("ArithmeticException");
        }
    }

    public void g() throws MyException {
        throw new MyException();
    }

    public void f6() {
        g6();
    }

    public void g6() {
        throw wrapException(new RuntimeException());
    }

    RuntimeException wrapException(Exception e) {
        return new RuntimeException(e);
    }

    public void unwrapException(Exception e) throws Throwable {
        throw e.getCause();
    }

    public void generateArrayOutOfBoundsException(int i) {
        int[] array = new int[10];
        try {
            System.out.println(array[i]);
        } catch (ArrayIndexOutOfBoundsException) {
            System.out.println("такого числа нет");
        }
    }

    public void threesome() {
        try {
            if (true) {
                throw new MyException();
            } catch(MyException1 e | MyException2 e | MyException3 e){
                System.out.println("Not work");
            }
        }
    }
}

