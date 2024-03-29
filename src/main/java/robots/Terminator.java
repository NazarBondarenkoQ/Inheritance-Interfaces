package robots;

import planets.Galaxy;

public class Terminator implements Transformation {
    private String name;
    private String model;
    private String weapon;

    public Terminator(String name, String model, String weapon) {
        this.name = name;
        this.model = model;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void speak() {
        System.out.println("Robot " + name + " says: \" I'm going to kill you with a "+ weapon +"\"\n");
    }

    @Override
    public void activateArmor(String name) {
        System.out.println("Robot has been taken to: " + Galaxy.valueOf(name).getName() + ". Armor is activated");
    }

}
