package lesson3package;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//                Найти и вывести список уникальных слов, из которых состоит массив
//                (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
//        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий
//        и телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//        добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует
//    учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//                тогда при запросе такой фамилии должны выводиться все телефоны.
//        Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в
//                телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
//                делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно
//        не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
        //----------------------------------------------------------------------------------
        WordArray wordArray = new WordArray();
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < wordArray.getMass().length; i++) {
            int correctVal = map.getOrDefault(wordArray.getMass()[i], 0);
            map.put(wordArray.getMass()[i], correctVal + 1);
        }

        Iterator <Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        //------------------------------------------------------------------------------------

        PhoneBook phoneBook = new PhoneBook();
        PhoneBookContains contains = new PhoneBookContains();
        for (int i = 0; i < contains.getNames().size(); i++) {
            phoneBook.add(contains.getNames().get(i), contains.getPhones().get(i));
        }

        phoneBook.getPhones("Иванов");
        phoneBook.getPhones("Петров");

    }

}
