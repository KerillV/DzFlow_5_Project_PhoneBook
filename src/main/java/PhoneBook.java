import java.util.HashMap;

public class PhoneBook {

    private final HashMap<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        if (!contacts.containsKey(name)) { // Проверяем наличие дубликатов имен
            contacts.put(name, number);   // Если имя новое, добавляем контакт
        }
        return contacts.size();           // Возвращаем общее число записей
    }
}
