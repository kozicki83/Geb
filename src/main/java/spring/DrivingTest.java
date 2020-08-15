package spring;

public class DrivingTest implements IDrivingTest {

    private Auto auto;

    DrivingTest(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void test() {
        auto.driver();
    }
}
