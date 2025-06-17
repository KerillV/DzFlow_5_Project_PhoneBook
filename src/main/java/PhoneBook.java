import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {

    private final HashMap<String, String> namesToNumbers = new HashMap<>(); // Имя -> Номер
    private final HashMap<String, String> numbersToNames = new HashMap<>(); // Номер -> Имя
    private final TreeSet<String> sortedNames = new TreeSet<>(); // Отсортированные имена

    public int addEntry(String name, String number) {
        if (!namesToNumbers.containsKey(name)) { // Проверяем наличие имени
            namesToNumbers.put(name, number); // Добавляем запись в основную карту
            numbersToNames.put(number, name); // Обновляем карту номеров
            sortedNames.add(name); // Добавляем имя в отсортированный набор
        }
        return namesToNumbers.size(); // Возвращаем размер списка контактов
    }

    public String findByNumber(String number) {
        return numbersToNames.get(number); // Получаем имя по номеру
    }

    public String findByName(String name) {
        return namesToNumbers.get(name); // Получаем номер по имени
    }

    public void printAllNames(java.util.function.Consumer<String> consumer) {
        sortedNames.forEach(consumer);
    }

}
