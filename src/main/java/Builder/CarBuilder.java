package Builder;

class CarBuilder extends Builder<CarBuilder> {

    String manufacture;
    String model = "DDDD";
    String variant = "RRRRR";


    CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    CarBuilder variant(String variant) {
        this.variant = variant;
        return this;
    }
}
