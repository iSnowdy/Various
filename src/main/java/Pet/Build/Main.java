package Pet.Build;

import Pet.Domain.*;

public class Main {
    public static void main(String[] args) {
        Doggo dog1 = new Doggo("Charly", (byte) 3, Pet.Status.ALIVE,"2024-05-13", "Husky", false);
        Cat cat1 = new Cat("Miau", (byte) 5, Pet.Status.ALIVE, "2023-01-12", "Blue", true);
        Parrot parrot1 = new Parrot("Doty", (byte) 1, Pet.Status.ALIVE, "2023-03-05", true, true, "Asia", true);
        Canary canary1 = new Canary("Cana", (byte) 0, Pet.Status.ALIVE, "2024-01-14", true, true, "Yellow", true);

        Inventory inventory = new Inventory();

        inventory.addPet(dog1);
        inventory.addPet(cat1);
        inventory.addPet(parrot1);
        inventory.addPet(canary1);

        inventory.showList();
        inventory.showPet(parrot1);
        inventory.showAllPets();

        parrot1.birthday();
        parrot1.birthday();

        inventory.showPet(parrot1);

        parrot1.talk();
        parrot1.fly();
        parrot1.setFlier(false);
        parrot1.fly();

        canary1.fly();
    }
}
