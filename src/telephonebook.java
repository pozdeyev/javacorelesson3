import java.util.*;


public class telephonebook {

    private Map<String, HashSet<String>> map; //инициируем новый Map

    //Конструктор
    public telephonebook() {
        this.map = new HashMap<>();
    }

    /**
     * Добавление человека (фамилия, телефон)
     * @param lastName,phone
     *
     */


    void add(String lastName, String phone) {

        HashSet<String> numbers;

        if (map.containsKey(lastName)) {   //Если map содержит ключ lastName
            numbers = map.get(lastName);   //numbers равен значению по ключу lastName
        } else {
            numbers = new HashSet<>();
        }

        numbers.add(phone); //добавляем номер телефона
        map.put(lastName, numbers); // добавляем к ключу lastNamе значение numbers
    }

    Set<String> get(String lastName) {
        return map.get(lastName);
    }


}
