package Rozne;

public class Tank {

    private static int ide = 1;
    private int id;
    private static int capasity;

    public Tank() {
        id = ide++;
    }

    public Tank(int value) {
        System.out.println("Przed capasity: " + capasity);
        capasity = value;
        System.out.println("Po capasity: " +  capasity);

        System.out.println("Przed id: " + id);
        System.out.println("Przed ide: " +  ide);
        id = ide++;
        System.out.println("Po id: " + id);
        System.out.println("Po ide: " +  ide);
    }

    int getId(){
        return id;
    }

    int getIde(){
        return ide;
    }

    int getCapcity(){
        return capasity;
    }
}
