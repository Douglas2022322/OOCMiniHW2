/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss edit by Douglas Vinicius Dierings
 */
public abstract class Vehicle {

    private float speed;
    private float direction = 0;
    protected String make;
    protected String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;

    //Constructor
    public Vehicle(float speed, String make, String type, int numPassengers) {
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + ", direction=" + direction + ", make=" + make + ", type=" + type + ", numWheels=" + numWheels + ", numWings=" + numWings + ", numSails=" + numSails + ", numPassengers=" + numPassengers + '}';
    }
    
    

    //Getters and setters
    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDirection() {
        return direction;
    }

    public void setDirection(float direction) {
        this.direction = direction;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

}
