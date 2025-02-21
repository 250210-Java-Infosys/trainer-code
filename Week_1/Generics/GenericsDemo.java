//Generics Class 

import java.util.ArrayList;

class Box<T> {
        private T content;

        //Because the content field is private, I need to create a setter if I want to modify it.
        public void setContent(T content) { this.content = content; }

        //I also need a getter if I want to be able to access this field from somewhere else.
        public T getContent() { return this.content;}

        //Creating a toString()
        @Override
        public String toString(){
            return content.toString();
        }
}


public class GenericsDemo {


    //Generic Method
    public static <T> void printArray(T[] array){
        //This is a shorthand syntax for iterating through a collection and 
        // running one operation
        for (T element : array) System.out.print(element + ", ");     
        System.out.println();   
    }
    
    //Creating a method to create an array of box types.
    //It can accept a variable number of arguments of any type, as long as all arguments passed in are the same type.
    public static <T> ArrayList<Box<T>> createBoxArray(T... values) {
        ArrayList<Box<T>> boxList = new ArrayList<>();

        for(T value : values) {
            Box<T>boxedValue = new Box<T>();
            boxedValue.setContent(value);
            boxList.add(boxedValue);
        }

        return boxList;
    }

    public static void main(String[] args) {
        
        //Here Im creating objects using my generic Box class
        //I get to pick, what my box holds, without having to create specific
        //box classes for any given type of object
        Box<String> stringBox = new Box<>(); 
        Box<Integer> intBox = new Box<>();

        stringBox.setContent("Hello from my stringBox");
        intBox.setContent(467);

        //Using my generic printArray() method
        printArray(new Integer[]{1, 4, 66, 7});
        printArray(new String[]{"This", "is", "from", "my ", "generic", "method"});

        //Creating a list of box generics
        ArrayList<Box<Integer>> myList = createBoxArray(1, 2, 4, 5, 6, 8, 9);
        
        printArray(myList.toArray());
    }
}