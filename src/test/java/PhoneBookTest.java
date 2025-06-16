import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}