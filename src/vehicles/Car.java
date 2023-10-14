/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

import oocminihw2.Drivable;
import oocminihw2.Vehicle;

/**
 *
 * @author Douglas
 */
public class Car extends Vehicle implements Drivable {

    //Object constructor from super class
    public Car(float speed, String make, String type, int numPassengers, int numWheels) {
        super(speed, make, type, numPassengers);
        super.numWheels = numWheels;

    }

    //Interface abstract methods
    @Override
    public void accelerate(float speed) {
        super.setSpeed(speed);
    }

    @Override
    public void brake() {
        super.setSpeed(0);
    }

    @Override
    public void turn(float angle) {
        super.setDirection(angle);
    }

    @Override
    public float getDirection() {
        return super.getDirection();
    }

    @Override
    public float getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

}
