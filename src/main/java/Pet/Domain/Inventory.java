package Pet.Domain;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Pet> pets;

    private String type;

    public Inventory() {
        this.pets = new ArrayList<Pet>();
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public void deletePet(Pet pet) {
        this.pets.remove(pet);
    }

    private void petType(Pet pet) {
        if (pet instanceof Doggo) {
            setType("Doggo");
        } else if (pet instanceof Cat) {
            setType("Cat");
        } else if (pet instanceof Canary) {
            setType("Canary");
        } else if (pet instanceof Parrot) {
            setType("Parrot");
        }
    }

    public void showList() {
        System.out.println("Showing pet names and types...\n");
        for (Pet pet : pets) {
            petType(pet);
            System.out.println("Pet Name: " + pet.getName() + ", Type: " + getType());
            System.out.println("---------");
        }
    }

    public void showPet(Pet pet) {
        System.out.println("--------- Showing Individual Pet Info ---------\n");
        System.out.println(pet.toString());
        System.out.println("--------- Showing Individual Pet Info ---------\n");
    }

    public void showAllPets() {
        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }

    // Getter

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public List<Pet> getPets() {
        return pets;
    }
}