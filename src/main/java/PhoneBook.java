import java.util.HashMap;

public class PhoneBook {

    private final HashMap<String, String> namesToNumbers = new HashMap<>(); // Имя -> Номер
    private final HashMap<String, String> numbersToNames = new HashMap<>(); // Номер -> Имя

    public int add(String name, String number) {
        if (!namesToNumbers.containsKey(name)) { // Проверяем наличие имени
            namesToNumbers.put(name, number); // Добавляем запись в основную карту
            numbersToNames.put(number, name); // Обновляем карту номеров
        }
        return namesToNumbers.size(); // Возвращаем размер списка контактов
    }

    public String findByNumber(String number) {
        return numbersToNames.get(number); // Получаем имя по номеру
    }

    public String findByName(String name) {
        return namesToNumbers.get(name); // Возвращаем номер по имени
    }

}
