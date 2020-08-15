package strategy;

public class DemoStrategy {

    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new OperationAdd());
        System.out.println(context.executeStrategy(5, 6));

        context.setStrategy(new OperationSubstract());
        System.out.println(context.executeStrategy(8, 6));
    }
}
