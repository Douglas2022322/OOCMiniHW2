/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

import oocminihw2.Flyable;
import oocminihw2.Vehicle;

/**
 *
 * @author Douglas
 */
public class Plane extends Vehicle implements Flyable {

    private float altitude;//Stores the plane altitude

    //Object constructor from super class
    public Plane(float speed, String make, String type, int numPassengers, int numWings) {
        super(speed, make, type, numPassengers);
        super.numWings = numWings;
    }
    
    
    //Interface abstract methods
    @Override
    public void changeAltitude(float change) {

    }

    @Override
    public float getAltitude() {
        return altitude;
    }

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

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }
    
    

}
