package org.example.sem1.z2;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottlesOfWater machine = new VendingMachineBottlesOfWater();
        machine.addBottleOfWater(new BottleOfWater("Вода1", 100, 250));
        machine.addBottleOfWater(new BottleOfWater("Вода2", 15, 300));
        machine.addBottleOfWater(new BottleOfWater("Вода3", 23, 0.5));
        machine.addBottleOfWater(new BottleOfWater("Вода4", 33, 10));
        System.out.println(machine.getProduct("Вода3"));
    }
}
