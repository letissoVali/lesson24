package ru.valiullin;

import java.util.HashSet;
import java.util.Set;

public class Rem {
    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> setStr = new HashSet<>(set);
        setStr.removeIf(s -> s.length()%2==0); //lambda expression
        /*for (String str:set) {                //standard
            if (!(str.length()%2==0)) {
                setStr.add(str);
            }
        }*/

        return setStr;
    }
}
