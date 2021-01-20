package lesson3package;

import java.util.*;

public class PhoneBook {
    private Map<String, HashSet<Long>> book;

    public PhoneBook(){
        book = new HashMap<>();
    }

    public void add(String key, HashSet<Long> values){
        if(book.containsKey(key)){
            book.get(key).addAll(values);
        }
        else{
            book.put(key, values);
        }
    }

    public void getPhones(String name){
        if(book.containsKey(name)){
            System.out.println(name);
            Iterator<Long> it = book.get(name).iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
            System.out.println();
        }
    }
}
