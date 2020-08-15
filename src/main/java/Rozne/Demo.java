package Rozne;

public class Demo {

    public static void main(String[] args) {

        Tank tank0 = new Tank(100);
        System.out.println("---------------");
        Tank tank1 = new Tank(200);
        System.out.println("---------------");
        Tank tank2 = new Tank(300);
        System.out.println("---------------");
        Tank tank3 = new Tank(400);
        Tank tank4 = new Tank();

        System.out.println(tank0.getId() + " " + tank0.getIde() + " " + tank0.getCapcity());
        System.out.println(tank1.getId() + " " + tank1.getIde() + " " + tank1.getCapcity());
        System.out.println(tank2.getId() + " " + tank2.getIde() + " " + tank2.getCapcity());
        System.out.println(tank3.getId() + " " + tank3.getIde() + " " + tank3.getCapcity());
//        System.out.println(tank4.getId() + " " + tank4.getIde() + " " + tank4.getCapcity());
    }
}
