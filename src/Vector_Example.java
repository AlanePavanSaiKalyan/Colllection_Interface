import java.util.*;

class Vector_Example {

    // its the replica of array list
    // initial capacity is 10
    //default capacity is 10
    // Allows null
    //Allows duplicate
    //Vector is introduced in java 1.0
    // Size doubles if we try to insert more than the size
    // Vector is synchronises ..allows one thread at a time.
    // Its good at multithreading programmes.and if the data grows exponentially.

    public static void main(String[] args){
        String[] cars = new String[]{"Dzire","Alto","Brezza","Grand Vitara","Swift"};
        List<String> newCars = new ArrayList<>();
        newCars.add("Punch");
        newCars.add("Harrier Ev");
        newCars.add("Nexon");
        Vector<String> allCars = new Vector<>(Arrays.asList(cars));
        allCars.add("i20");
        allCars.remove("Alto");
        allCars.removeFirst();
        System.out.println(allCars.capacity());
        allCars.addAll(allCars.size()-1,newCars);
        allCars.clear();
        Iterator<String> allCarsIterator = allCars.iterator();
        while(allCarsIterator.hasNext()){
            System.out.print(allCarsIterator.next()+", ");
        }
        }
}
