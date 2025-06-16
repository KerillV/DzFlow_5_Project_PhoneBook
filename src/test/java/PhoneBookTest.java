import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {

    @Test
    public void testAddNewContact_IncreasesCount() {
        // Arrange
        PhoneBook phoneBook = new PhoneBook();

        // Act
        int countAfterAdding = phoneBook.add("KIRILL", "+79125553535");

        // Assert
        assertEquals(1, countAfterAdding);
    }

    @Test
    public void testFindByNumberReturns_CorrectName() {
        // Arrange
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("KIRILL", "+79125553535");

        // Act
        String foundName = phoneBook.findByNumber("+79125553535");

        // Assert
        assertEquals("KIRILL", foundName);
    }

    @Test
    public void testFindByNameReturns_CorrectNumber() {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "+79001234567");
        assertEquals("+79001234567", book.findByName("Alice"));
    }

    @Test
    public void testFindByNonExistingName_ReturnsNull() {
        PhoneBook book = new PhoneBook();
        book.add("Alice", "+79001234567");
        assertNull(book.findByName("Bob")); // Ищем несуществующее имя, вернется null
    }
}