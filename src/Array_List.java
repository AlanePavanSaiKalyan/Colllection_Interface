import java.util.ArrayList;
import java.util.List;

public class Array_List {
//    The ArrayList
//    An ArrayList is an implementation of the List interface backed by a dynamic array.
//    How it works under the hood: When you create an ArrayList, it creates an internal array with a default capacity (usually 10). When you add the 11th element, Java automatically creates a new, larger array (typically 1.5x the size of the old one), copies the old elements over, and then adds your new element.
//    Pros: Extremely fast for retrieving data (get(index)) because it uses an index.
//    Cons: Slower for inserting or deleting elements in the middle of the list, because all subsequent elements have to shift over to fill the gap or make room.
static void main(String[] args) {
    List<String> students= new ArrayList<>();
    students.add("Pavan");
    students.add("Sai");
    students.add("Kalyan");

}
}
