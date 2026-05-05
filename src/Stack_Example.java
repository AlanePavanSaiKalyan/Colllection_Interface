import java.util.Stack;

public class Stack_Example {
    // Last in first out
    // capacity increases by capacity*2
    // we can't create a stask with the initial data like arraylist and vector..it calls only non parameterized constructor
    // We can create only empty stack
    static void main(String[] args) {
        Stack<String> books  = new Stack<>();
        books.add("Java");
        books.add(0,"Sql");
        books.addFirst("DSA");
        books.addFirst("removed this");
        System.out.println(books);
        books.remove(0);
        books.addLast("Python");
        System.out.println(books.getLast());
        books.set(books.indexOf("Python"),"Springboot");
        System.out.println(books.get(books.indexOf("Java")));
    }
}
