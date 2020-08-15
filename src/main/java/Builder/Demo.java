package Builder;

public class Demo {

    public static void main(String[] args) {

        CarBuilder car = new CarBuilder().model("asfas").variant("OOOOO");
        System.out.println(car.model);
        System.out.println(car.variant);

    }
}
