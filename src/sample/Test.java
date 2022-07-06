package sample;

public final class Test {
    private int x;
    private int y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Test() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @MethodParameters(inA = 10, inB = 23)
    public int getXY(int a, int b) {
        this.x = a;
        this.y = b;
        return x + y;
    }
}
