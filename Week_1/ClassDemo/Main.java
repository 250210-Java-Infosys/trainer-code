package ClassDemo;

import java.beans.VetoableChangeSupport;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle mySecondVehicle = new Vehicle();
        Vehicle.vehicleStaticMethod();
        System.out.println(myVehicle.toString());

        Airplane myFirstAirplane = new Airplane("red", 2, 600, "Boeing", "737", "airplane", 0);
        
        myFirstAirplane.flying();
    }
}

class Vehicle {
    
    //Attributes/Fields for our vehicle
    String color;
    int doorNumber;
    int maxSpeed;
    int currentSpeed = 0;
    String make;
    String model;
    String type;

    // A constructor for our vehicle
    // This is an empty constructor. Calling this creates an object
    //of type Vehicle - but all the attributes above are empty when initialized.
    public Vehicle() {}

    public Vehicle(String colorArg, int doorNumber, int maxSpeed, String make, String model, 
        String type) {

            this.color = colorArg;
            this.doorNumber = doorNumber;
            this.maxSpeed = maxSpeed;
            this.make = make;
            this.model = model;
            this.type = type;

    }

    // Methods
    // Methods begin with a method signature.
    // 1. Access modifier - public, private, default, protected
    // public - visible for all classes
    // private - code is only accessible within the class it is written in
    // protected - same package and subclasses
    // default - same package, if no modifier is set default is given

    //2. Return type, void if the method doesnt return any value
    // If you give a method a return type, you MUST return something of that type
    public void accelerate(int newSpeed){
        this.currentSpeed = newSpeed;
    }

    public static void vehicleStaticMethod(){
        System.out.println("This is my static Vehicle method");
    }

    @Override
    public String toString(){
        return "This is my new ToString implementation";
    }

}

class Airplane extends Vehicle implements IFly{

    int wingspan;

    public Airplane(String colorArg, int doorNumber, int maxSpeed, String make, String model, 
    String type, int wingspan) {
        super(colorArg, doorNumber, maxSpeed, make, model, type);
    }

    public void flying(){
        System.out.println("My plane is flying!");
    }
}

interface IFly {
    public void flying();
}

// Why would we want a private class?

//OuterClass {

    //public void OuterClassMethod(InnerClass InnerClassObject)

    //private class InnerClass()

//}

/*
 * 
 *  Vehicle
 *     I
 *  Airplane 
 *     I
 *  PropellorPlane
 * 
 * 
 * 
 * 
 */