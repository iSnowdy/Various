package Simulacro_3T;

public abstract class Frutal extends Planta {
    private boolean hasFruit;
    private String leafColor;

    public Frutal(String name, int monthsOld, boolean hasFruit, String leafColor) {
        super(name, monthsOld);
        this.hasFruit = hasFruit;
        this.leafColor = leafColor;
    }

    public abstract void giveFruit();

    // Getters and Setters
    public boolean isHasFruit() {
        return hasFruit;
    }

    public void setHasFruit(boolean hasFruit) {
        this.hasFruit = hasFruit;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }
}
