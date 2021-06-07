import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        Jeep jeep = new Jeep("Wrangler", 4, 200, 4);
        Frigate frigate = new Frigate("Modern Frigate", 300, 500, 50);
        HoverCraft hoverCraft1 = new HoverCraft("Garuda.", 265, 500, 10, 100, true);
        HoverCraft hoverCraft2 = new HoverCraft("Batik Air", 265, 500, 6, 300, false);
        PoliceCar policeCar1 = new PoliceCar("BMW", 4, 80, 4, true);
        PoliceCar policeCar2 = new PoliceCar("Tesla", 6, 90, 4, false);
        PoliceCar policeCar3 = new PoliceCar("Fortuner", 5, 85, 4, false);
        PoliceCar policeCar4 = new PoliceCar("", 4, 70, 4, true);

        System.out.println("Jeep: ");
        jeep.drive();
        jeep.soundHorn();
        System.out.println(jeep);
        System.out.println("Frigate: ");
        frigate.launch();
        frigate.fireGun();
        System.out.println(frigate);

        ArrayList<HoverCraft> hoverCraftList = new ArrayList<>();
        hoverCraftList.add(hoverCraft1);
        hoverCraftList.add(hoverCraft2);

        hoverCraft1.drive();
        hoverCraft1.checkSurface();

        hoverCraft2.drive();
        hoverCraft2.checkSurface();

        for(HoverCraft hoverCraft: hoverCraftList) {
            System.out.println(hoverCraft);
        }

        ArrayList<PoliceCar> policeCarList = new ArrayList<>();
        policeCarList.add(policeCar1);
        policeCarList.add(policeCar2);
        policeCarList.add(policeCar3);
        policeCarList.add(policeCar4);

        printList(policeCarList);

        System.out.print("Police1 =>");
        policeCar1.checkOnDuty();
        System.out.print("Police2 => ");
        policeCar2.checkOnDuty();
    }

    public static void printList(ArrayList<PoliceCar> ArrayList) {
        int x = 1;
        for (PoliceCar policeCar : ArrayList) {
            System.out.println("PoliceCar No => " + x + ", " + policeCar);
            x++;
        }
    }
}

