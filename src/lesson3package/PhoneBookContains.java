package lesson3package;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PhoneBookContains {

    private ArrayList<String> names = new ArrayList<String>(Arrays.asList("Иванов", "Петров", "Иванов"));
    private ArrayList<HashSet<Long>>phones = new ArrayList<>(Arrays.asList(
            new HashSet<>(Arrays.asList(895222255588L, 895222255588L, 895223432345L,895232255588L)),
            new HashSet<>(Arrays.asList(890822255588L, 890822255588L, 890823432345L,895232255588L)),
            new HashSet<>(Arrays.asList(892122255588L, 895222255588L, 898523432345L,895232255588L))));

    public ArrayList<String> getNames() {
        return names;
    }

    public ArrayList<HashSet<Long>> getPhones() {
        return phones;
    }
}
