
/**
 *
 * @author foggia
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("Concurrent modification 1");
        salute("World");
        salute("Universe");
        System.out.println("Modified version");
        System.out.println("Concurrent modification 2");
    }
    
    public static void salute(String name) {
        System.out.println("Hello, "+name);
    }
}
