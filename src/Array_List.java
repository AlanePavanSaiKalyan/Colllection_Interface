import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Array_List {
//    The ArrayList
//    An ArrayList is an implementation of the List interface backed by a dynamic array.
//    How it works under the hood: When you create an ArrayList, it creates an internal array with a default capacity (usually 10). When you add the 11th element, Java automatically creates a new, larger array (typically 1.5x the size of the old one), copies the old elements over, and then adds your new element.
//    Pros: Extremely fast for retrieving data (get(index)) because it uses an index.
//    Cons: Slower for inserting or deleting elements in the middle of the list, because all subsequent elements have to shift over to fill the gap or make room.
static void main(String[] args) {
    String[] names = new String[]{"Pheonix", "Wolf", "Eagle"};
    List<String> students = new ArrayList<>(Arrays.asList(names));
    students.add("Pavan");
    students.add("Sai");
    students.add(null);
    students.add("Sai");
    students.add("Sai");
    students.add("Sai");
    students.add("Kalyan");
    students.add(null);
    System.out.println("Student at index 1 is" + students.get(1));
    students.set(1, "Alane");
    students.remove("Alane");
    students.remove(1);
    for (String s : students) {
        System.out.print(s + ", ");
    }

    // using list iterator
    ListIterator<String> studentIterator = students.listIterator();
    while (studentIterator.hasNext()){
        System.out.println(studentIterator.next());
    }



    //Fast beacause it uses index to retreive elements
    //slow at insertion and deletion at the middle of the list because once if element removed the next should be adjusted by moving forward.
    // Default capacity is 0 -when instance is created
    // initial capacity is 10 - after we add a value
    // internal implementation is resizable array
    //if we add 11th element it automatically creates new array with the capacity of 1.5x size of old one and moves all existing elements into it
}
}
