import java.util.*;

public class StudentMain {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students details are you going to provide: ");
        int count = scanner.nextInt();
//        List<Student> s = new ArrayList<>();
        Stack<Student> s = new Stack<>();
        for(int i = 0; i < count; i++) {

            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("School: ");
            String school = scanner.nextLine();

            s.add(new Student(id, name, marks, school));
        }
        ListIterator<Student> lis= s.listIterator();
//        while(lis.hasNext()){
//            System.out.println(lis.nextIndex());
//            System.out.println(lis.hasPrevious());
//            System.out.println(lis.previousIndex());
//            System.out.println(lis.next());
//        }
        s.peek();
        s.push(new Student(5,"Alane",99,"Bashyam"));
        System.out.println(s.pop());
    }
}
