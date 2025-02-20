package Demo1;


public class Demo1 {

    //main is technically a class method. I don't need to initialize an instance of my
    //Demo1 class in order for main to be called. 
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int num1 = 5;
        int num2 = 10;

        int sum = num1 + num2;

        System.out.println(sum);

        //boolean
        //int
        //double
        //char 
        //float
        //long - very large numbers
        //byte - very small numbers
        //short

        //string - treated as a char array, which means its immutable.  
        //if I want a dynamically updated string, I should probably consider
        //a StringBuilder

        //Stringbuilder is not a primitive type. I need to initialize an object of type
        //StringBuilder. 
        
        StringBuilder paragraphsb = new StringBuilder("Initial string");

        System.out.println(paragraphsb);
        
        //Preview: append() is an instance method. I NEED an instance of type StringBuilder
        //in order to call this method. 
        paragraphsb.append("... adding more to my sb");

        System.out.println(paragraphsb);

        double numToSquare = 2.2;

        double resultOfSquare = square(numToSquare);

        System.out.println(resultOfSquare);
    }

    public static double square(double num){
        
        double result = num * num;
        
        return result;
    }
    
}
