/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

import oocminihw2.Drivable;
import oocminihw2.Vehicle;

/**
 *
 * @author dougl
 */
public class Car extends Vehicle implements Drivable{

    public Car(float speed, String make, String type, int numPassengers) {
        super(speed, make, type, numPassengers);
    }
    

    @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {
        this.direction = angle;
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
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
