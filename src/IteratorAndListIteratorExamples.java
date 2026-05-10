import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorAndListIteratorExamples {
    public void removeEvenNumbers(Integer[] a){
        List<Integer> i = new ArrayList<>(Arrays.asList(a));
        Iterator<Integer> evenRemove = i.iterator();
        while (evenRemove.hasNext()){
            if(evenRemove.next() %2 ==0) evenRemove.remove();
        }
        System.out.println(i);
    }

    static void main(String[] args) {
        Integer[] a = new Integer[]{1,22,3,4,3,4,5,76,3,45};
        new IteratorAndListIteratorExamples().removeEvenNumbers(a);
    }
}
