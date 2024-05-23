package Simulacro_3T;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Planta> plants;

    public Inventario() {
        this.plants = new ArrayList<Planta>();
    }

    public void setPlantType(Planta planta) {
        String type;

        if (planta instanceof Ficus) {
            type = "Ficus";
        } else if (planta instanceof Laurel) {
            type = "Laurel";
        } else if (planta instanceof Melocotonero) {
            type = "Melocotonero";
        } else if (planta instanceof Albaricoquero) {
            type = "Albaricoquero";
        } else {
            type = "Planta";
        }
        planta.setType(type);
    }

    public void showPlantList() {
        for (int i = 0; i < plants.size(); i ++) {
            System.out.println("Name: " + plants.get(i).getName());
            System.out.println("Type: " + plants.get(i).getType());
        }
    }

    public void showPlant(Planta planta) {
        System.out.println("Plant Information:\n\n");
        System.out.println(planta.toString());
    }

    public void showAllPlants() {
        System.out.println("Showing all plants...\n");
        for (int i = 0; i < plants.size(); i ++) {
            System.out.println(plants.get(i).toString() + "\n");
        }
    }

    public void addPlant(Planta planta) {
        plants.add(planta);
        System.out.println("A new plant has been added");
    }

    public void deletePlant(Planta planta) {
        plants.remove(planta);
        System.out.println("The plant has been removed");
    }

    public void emptyInventory() {
        System.out.println("Inventory has been cleared of all plants");
        plants.clear();
    }
}
