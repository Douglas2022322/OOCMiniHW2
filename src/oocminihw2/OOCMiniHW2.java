/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

import vehicles.Boat;
import vehicles.Car;
import vehicles.Plane;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Drivable car1 = new Car(0, "Volvo", "SUV", 4);
        Flyable plane1 = new Plane(0, "Embraer", "Cargo", 2);
        Sailable boat1 = new Boat(0, "Princess", "Yacht", 2);

        car1.accelerate(20);
        System.out.println(car1.getSpeed());

    }

}
