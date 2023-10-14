/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

import oocminihw2.Sailable;
import oocminihw2.Vehicle;

/**
 *
 * @author Douglas
 */
public class Boat extends Vehicle implements Sailable {

    private boolean isSailHoisted;

    //Object constructor from super class
    public Boat(float speed, String make, String type, int numPassengers, int numSails) {
        super(speed, make, type, numPassengers);
        super.numSails = numSails;
    }

    //Interface abstract methods
    @Override
    public void hoistSail() {
        isSailHoisted = true;
        System.out.println("Sail hoisted.");
    }

    @Override
    public void lowerSail() {
        isSailHoisted = false;
        System.out.println("Sail lowered.");
    }

    @Override
    public boolean isSailHoisted() {
        return isSailHoisted();
    }

    @Override
    public void landHo() {
        System.out.println("Land ho!");
    }

}
