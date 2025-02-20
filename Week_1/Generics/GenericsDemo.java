    //Generics Class 
class Box<T> {
        private T content;

        //Because the content field is private, I need to create a setter if I want to modify it.
        public void setContent(T content) { this.content = content; }

        //I also need a getter if I want to be able to access this field from somewhere else.
        public T getContent() { return this.content;}
}


public class GenericsDemo {


    //Generic Method
    public static <T> void printArray(T[] array){
        //This is a shorthand syntax for iterating through a collection and 
        // running one operation
        for (T element : array) System.out.println(element + ", ");        
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

        
    }
}