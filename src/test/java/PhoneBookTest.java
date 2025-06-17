import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {

    @Test
    public void testAddNewContact_IncreasesCount() {
        // Arrange
        PhoneBook phoneBook = new PhoneBook();
        // Act
        int countAfterAdding = phoneBook.addEntry("KIRILL", "+79125553535");
        // Assert
        assertEquals(1, countAfterAdding);
    }

    @Test
    public void testFindByNumberReturns_CorrectName() {
        // Arrange
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("KIRILL", "+79125553535");
        // Act
        String foundName = phoneBook.findByNumber("+79125553535");
        // Assert
        assertEquals("KIRILL", foundName);
    }

    @Test
    public void testFindByNameReturns_CorrectNumber() {
        // Arrange
        PhoneBook book = new PhoneBook();
        // Act
        book.addEntry("Alice", "+79001234567");
        // Assert
        assertEquals("+79001234567", book.findByName("Alice"));
    }

    @Test
    public void testFindByNonExistingName_ReturnsNull() {
        // Arrange
        PhoneBook book = new PhoneBook();
        // Act
        book.addEntry("Alice", "+79001234567");
        // Assert
        assertNull(book.findByName("Bob")); // Ищем несуществующее имя, вернется null
    }

    @Test
    public void testPrintAllNames_InAlphabeticalOrder() {
        // Arrange
        PhoneBook book = new PhoneBook();
        book.addEntry("Alice", "+79001234567");
        book.addEntry("Bob", "+79007654321");
        book.addEntry("Eve", "+79009876543");
        book.addEntry("Dave", "+79001112233");
        List<String> expectedNames = List.of("Alice", "Bob", "Dave", "Eve");
        List<String> actualNames = new ArrayList<>();
        // Act
        book.printAllNames(actualNames::add);  // Собираем имена в список
        // Assert
        assertEquals(expectedNames, actualNames);  // Проверяем равенство списков
    }
}