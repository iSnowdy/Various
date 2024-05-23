package Simulacro_3T;

public class ProgramaPrincipal {
    public static void main (String[] args) {
        Planta p1 = new Ficus("Ficus1", 3, "España", 3.9);
        Planta p2 = new Laurel("Laurel1", 10, "Negro");
        Planta p3 = new Melocotonero("Melocotonero1", 16, false, "Verde", "Mediterráneo", false);
        Planta p4 = new Albaricoquero("Albaricoquero1", 26, true, "Marrón", "Verde", false);

        Inventario inventario = new Inventario();

        p4.happyBirthday();
        p4.happyBirthday();

        inventario.addPlant(p1);
        inventario.addPlant(p2);
        inventario.addPlant(p3);
        inventario.addPlant(p4);

        inventario.setPlantType(p1);
        inventario.setPlantType(p2);
        inventario.setPlantType(p3);
        inventario.setPlantType(p4);



        inventario.showPlantList();
        inventario.showAllPlants();

        p4.killPlant();

        inventario.showPlant(p4);
        inventario.deletePlant(p4);
        inventario.showPlantList();
        inventario.emptyInventory();
        System.out.println("Showing Empty Inventory...");
        inventario.showPlantList();

        System.out.println("**************************");

        System.out.println(p1);

        System.out.println("**************************");
    }
}
