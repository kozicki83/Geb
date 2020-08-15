package over;

public class B extends A {

    int k;

    public B(int a, int b, int k) {
        super(a, b);
        this.k = k;
    }

    void show() {
        super.show();
        System.out.println("k " + k);
    }
}
