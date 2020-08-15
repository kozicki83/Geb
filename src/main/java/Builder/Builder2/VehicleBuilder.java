package Builder.Builder2;

public class VehicleBuilder extends Builder<Vehicle>{

    VehicleBuilder newVehicle(){
        VehicleBuilder val = new VehicleBuilder();
        val.obj = new Vehicle();
        return val;
    }

    VehicleBuilder addMark(String mark){
        obj.mark = mark;
        return this;
    }
}
