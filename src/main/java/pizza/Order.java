package pizza;

public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Zamówienie: " + pizza.getName() + " Cena: " + pizza.getPrice());
    }
}
