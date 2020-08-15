package Builder.Builder2;

public class DemoVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new VehicleBuilder().newVehicle().addMark("sfdgsfdgs").build();
        System.out.println(vehicle);
    }
}
