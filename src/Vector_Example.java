import java.util.*;

class Vector_Example {
    public static void main(String[] args){
        String[] cars = new String[]{"Dzire","Alto","Brezza","Grand Vitara","Swift"};
        List<String> newCars = new ArrayList<>();
        newCars.add("Punch");
        newCars.add("Harrier Ev");
        newCars.add("Nexon");
        List<String> allCars = new Vector<>(Arrays.asList(cars));
        allCars.add("i20");
        allCars.remove("Alto");
        allCars.removeFirst();
        allCars.addAll(allCars.size()-1,newCars);

        Iterator<String> allCarsIterator = allCars.iterator();
        while(allCarsIterator.hasNext()){
            System.out.print(allCarsIterator.next()+", ");
        }

     }
}
