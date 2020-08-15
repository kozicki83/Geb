package spring;

public class Demo {

    public static void main(String[] args) {
        IDrivingTest drivingTest = new DrivingTest(new Audi());
        drivingTest.test();

        IDrivingTest drivingTest1 = new DrivingTest(new Bmw());
        drivingTest1.test();

    }
}
