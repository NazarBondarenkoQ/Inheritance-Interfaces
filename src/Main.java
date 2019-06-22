import planets.HotPlanet;
import planets.OceanPlanet;
import planets.WindPlanet;
import robots.Terminator;
import robots.TerminatorLatest;
import robots.TerminatorUpgrade;
import planets.Galaxy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Galaxy galaxy = new Galaxy();
        Random random = new Random();
        int choice = random.nextInt(12) + 1;
        int temp = random.nextInt(3) + 65;
        char destination = (char) temp;
        Terminator currentTerminator;

        if (choice <= 3) {
            currentTerminator = new Terminator("Desolator", "T-70", "Shotgun");
            terminatorAction(choice, currentTerminator);
        } else if (choice > 3 && choice <= 8) {
            currentTerminator = new TerminatorUpgrade("Punisher", "T-2000", "Machine Gun", "Liquid");
            terminatorAction(choice, currentTerminator);
        } else {
            currentTerminator = new TerminatorLatest("Executor", "T-TX", "Rocket Launcher", "Solid");
            terminatorAction(choice, currentTerminator);
        }

        System.out.println("!!!Oh no, aliens have stole " + currentTerminator.getName() + " and taking him to another planet!!! " +
                "Random char is: " + destination + "\n");

        switch (destination) {
            case 'A':
                OceanPlanet oceanPlanet = galaxy.getOceanPlanet();
                robotTransformation(destination, currentTerminator);
                break;
            case 'B':
                WindPlanet windPlanet = galaxy.getWindPlanet();
                robotTransformation(destination, currentTerminator);
                break;
            case 'C':
                HotPlanet hotPlanet = galaxy.getHotPlanet();
                robotTransformation(destination, currentTerminator);
                break;
        }
    }


    public static void terminatorAction(int choice, Terminator currentTerminator) {
        System.out.println("Random number = " + choice + " so created Terminator is: " + currentTerminator.getName() + " " + currentTerminator.getModel() + "\n");
        currentTerminator.speak();
    }

    public static void robotTransformation(char destination, Terminator currentTerminator) {
        if (destination == 'A') {
            currentTerminator.activateArmor("Ocean Planet");
        } else if (destination == 'B') {
            currentTerminator.activateArmor("Wind Planet");
        } else {
            currentTerminator.activateArmor("Sun Planet");
        }
    }
}