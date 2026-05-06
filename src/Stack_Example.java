import java.util.Stack;

public class Stack_Example {
    // Last in first out
    // capacity increases by capacity*2
    // we can't create a stask with the initial data like arraylist and vector..it calls only non parameterized constructor
    // We can create only empty stack
    //Search method traverse through stack from top to bottom..and search element
    // Since java 1.0 (Legacy)
    // default and initial capacity is 10.
    // allows dup and null
    // allows insertion order
    // no sorted order
    // allows random access but not good use stack methods.
    // Synchronised
    // LIFO scenario. undo and redo usage,back and fwd ,

    public boolean validParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' ||c == '(' ){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(top == '[' && c !=']') return false;
                if(top == '(' && c !=')') return false;
                if(top == '{' && c !='}') return false;

            }
        }
        return stack.isEmpty();
    }
    static void main(String[] args) {
        System.out.println( new Stack_Example().validParanthesis("[({)]"));
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
        Stack<String> games = new Stack<>();
        //index start from 1 at top (Last element entry)
        //    TOP
//            NFS most wanted  -> position 1
//            Forza horizon 5   -> position 2
//            GTA 5   -> position 3
//            BOTTOM
        games.add("GTA 5");
        games.push("Forza Horizon 5");
        games.push("NFS Most Wanted");
        System.out.println(games.peek());
        System.out.println(games.search("GTA 5")); //op:3 gives position based on the stack element position
        System.out.println(games.indexOf("GTA 5")); // op:0 gives based on index
        System.out.println(games.isEmpty());
        System.out.println(games.empty());
    }
}
