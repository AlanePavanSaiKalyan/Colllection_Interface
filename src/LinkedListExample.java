import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListExample {
    public void listImplementation(){
        List<String> train = new java.util.LinkedList<>();
        train.add("Engine");
        train.add("Generator Car");
        train.add("Passenger car");
        train.add("Pantry Car");
        train.add("Passenger Car");
        train.add("Cargo Car");
        System.out.println("Train Allignment"+train);
        train.set(train.indexOf("Pantry Car"),"Passenger car");
        System.out.println("Train Allignment after replacing"+train);
        train.remove("Passenger Car");
        System.out.println("Train Allignment after removing"+train);
        System.out.println(train.contains("Generator car"));
        train.add(1,"Engine 0");
        System.out.println("Train Allignment after Engine added"+train);
    }

    public void queueImplementation(){
        //First in first out
        LinkedList<String> ticketCounter = new java.util.LinkedList<>();
        ticketCounter.offer("Person 1");
        ticketCounter.offer("Person 2");
        ticketCounter.offer("Person3");

        //Ticket allotmnet starts

        ticketCounter.poll();
        System.out.println("Current Waiting List"+ticketCounter);
    }

    public void stackImplementation(){
        //the last element that we add will come first  out
         LinkedList<String> browser = new LinkedList<>();
         browser.push("Google.com");
         browser.push("Youtube");
         browser.push("Hacker rank");
        System.out.println("Current Webpage "+browser.peek());

        browser.pop();
        System.out.println("Current Webpage after clicking back button "+browser.peek());


    }

    static void main(String[] args) {
        LinkedListExample ll = new LinkedListExample();
        ll.stackImplementation();

    }
}
