import java.util.Arrays;
import java.util.List;

public class RoyDemo {
    public static void main(String[] args) {
        List <String> myArray = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        
        long start = System.currentTimeMillis();
        myArray.stream().forEach(x ->  System.out.print(x));
        System.out.println("\n" + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        myArray.stream().forEach(System.out::print);
        System.out.println("\n" + (System.currentTimeMillis() - start) + "ms");
    }
}