package over;

public class DemoSub {
    public static void main(String[] args) {
        Sub sub = new Sub();
        Sub1 sub1 = new Sub1();
        Sub2 sub2 = new Sub2();

        Sub obSub;

        obSub = sub;
        obSub.show();

        obSub = sub1;
        obSub.show();

        obSub = sub2;
        obSub.show();
    }
}
