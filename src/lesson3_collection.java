import java.util.*;

/**
 * Java. Level 2. Lesson 3.
 * @author Dmitry Pozdeyev
 * @version 31.01.2019
 */

/*

Урок 3. Коллекции

1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
 Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 Посчитать, сколько раз встречается каждое слово.
2. Написать простой класс телефонный справочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
 номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
  (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
  Желательно как можно меньше добавлять своего, чего нет в задании
  (т.е. не надо в телефонную запись добавлять еще дополнительные поля
  (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
  Консоль желательно не использовать (в том числе Scanner), тестировать просто из метода main(),
  прописывая add() и get().

*/


public class lesson3_collection {

    public static void main(String[] args) {

        //Создаем Hashmap
        Map<String, Integer> map = new HashMap<>();
        //Создаем массив слов
        String[] word = {"Жизнь", "Взгляд", "Глаза", "Улыбка", "Смех", "Радость", "Успех", "Глаза", "Жизнь", "Взгляд",
                "Абракадабра"};

        //Задание 1

        System.out.println("Слово = количество повторений:");

        for (int i = 0; i < word.length; i++) {
            if (map.containsKey(word[i])) //если map содержит ключ соответствующий элементу массива.
                // в начале цикла пропускаем
                map.put(word[i], map.get(word[i]) + 1);//значение увеличиваем на 1, таким образом
                //считаем количество повторов
            else                     //если не содержит ключ
                map.put(word[i], 1); //записываем ключ и значение 1
        }
        System.out.println(map);


        //Задание 2

        //Создаем экземпляр  telephonebook
        telephonebook telebook = new telephonebook();

        telebook.add("Поздеев", "+7(921)785-55-82");
        telebook.add("Антуфьев", "+7(921)-884-64-69");
        telebook.add("Орманов", "+7(921)435-91-70");
        telebook.add("Елсаков", "+7(921)435-91-84");
        telebook.add("Поздеев", "+7(921)555-55-55");


        System.out.println("\nТелефоны Поздеева: " + telebook.get("Поздеев"));

    }
}
