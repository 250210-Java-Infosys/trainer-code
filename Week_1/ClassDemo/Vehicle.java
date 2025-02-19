package ClassDemo;

public class Vehicle {
    
    //Attributes/Fields for our vehicle
    string color;
    int doorNumber;
    int maxSpeed;
    int currentSpeed = 0;
    string make;
    string model;
    string type;

    // A constructor for our vehicle
    // This is an empty constructor. Calling this creates an object
    //of type Vehicle - but all the attributes above are empty when initialized.
    public Vehicle() {}

    public Vehicle(string colorArg, int doorNumber, int maxSpeed, string make, string model, 
        string type) {

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

    

}



// Why would we want a private class?

//OuterClass {

    //public void OuterClassMethod(InnerClass InnerClassObject)

    //private class InnerClass()

//}