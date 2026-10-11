import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    public static void main(String[] args) {
        Deque<String> history = new ArrayDeque<>();

        history.push("Typed a title");
        history.push("Added a paragraph");
        history.push("Changed the font");

        System.out.println("Undo: " + history.pop());
        System.out.println("Undo: " + history.pop());

       
    }
}
