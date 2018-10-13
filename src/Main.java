import ru.valiullin.Rem;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    //TODO Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
    //public Set<String> removeEvenLength(Set<String> set);
    //Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]


    public static void main(String[] args) {
        //Set<String>  = new HashSet<>();
        Set<String> setStrArr = new HashSet<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        /*setStrArr.add("foo");
        setStrArr.add("buzz");
        setStrArr.add("bar");
        setStrArr.add("fork");
        setStrArr.add("bort");
        setStrArr.add("spoon");
        setStrArr.add("!");
        setStrArr.add("dude");
        setStrArr.add("foofoo");*/
        System.out.println(setStrArr.toString());
        System.out.println(Rem.removeEvenLength(setStrArr));
    }
}
