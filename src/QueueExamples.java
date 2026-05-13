import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

    public void example1(){
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.poll();
        System.out.println(queue);
    }

    public void dequeueExample(){
        Deque<String> q = new LinkedList<>();
        q.offerFirst("Start");
        q.addFirst("addStart");
        q.add("add");
        q.addLast("last");
        q.peekFirst();
        q.peekLast();
        System.out.println(q);


    }

    static void main(String[] args) {
        new QueueExamples().dequeueExample();
    }
}
