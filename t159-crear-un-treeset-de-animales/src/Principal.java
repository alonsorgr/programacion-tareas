import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        TreeSet<Animal> set = new TreeSet<>();
        set.add(new Animal("TOBI"));
        set.add(new Animal("GARY"));
        set.add(new Animal("TOBI"));

        Iterator<Animal> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
