// package ClassDemo;

// public class Vehicle {
    
//     //Attributes/Fields for our vehicle
//     String color;
//     int doorNumber;
//     int maxSpeed;
//     int currentSpeed = 0;
//     String make;
//     String model;
//     String type;

//     // A constructor for our vehicle
//     // This is an empty constructor. Calling this creates an object
//     //of type Vehicle - but all the attributes above are empty when initialized.
//     public Vehicle() {}

//     public Vehicle(String colorArg, int doorNumber, int maxSpeed, String make, String model, 
//         String type) {

//             this.color = colorArg;
//             this.doorNumber = doorNumber;
//             this.maxSpeed = maxSpeed;
//             this.make = make;
//             this.model = model;
//             this.type = type;

//     }

//     // Methods
//     // Methods begin with a method signature.
//     // 1. Access modifier - public, private, default, protected
//     // public - visible for all classes
//     // private - code is only accessible within the class it is written in
//     // protected - same package and subclasses
//     // default - same package, if no modifier is set default is given

//     //2. Return type, void if the method doesnt return any value
//     // If you give a method a return type, you MUST return something of that type
//     public void Accelerate(int newSpeed){
//         this.currentSpeed = newSpeed;
//     }

//     public static void VehicleStaticMethod(){
//         System.out.println("This is my static Vehicle method");
//     }

//     // public void ToString(){

//     // }

// }



// Why would we want a private class?

//OuterClass {

    //public void OuterClassMethod(InnerClass InnerClassObject)

    //private class InnerClass()

//}