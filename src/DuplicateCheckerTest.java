import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DuplicateCheckerTest {

    @Test
    void testWithDuplicates() {
        List<String> list = List.of("apple", "banana", "orange", "apple");
        assertTrue(DuplicateChecker.hasDuplicates(list), "Expected duplicates in the list");
    }

    @Test
    void testListWithoutDuplicates() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        assertFalse(DuplicateChecker.hasDuplicates(list), "Expected no duplicates in the list");
    }

    @Test
    void testEmptyList() {
        List<String> list = List.of();
        assertFalse(DuplicateChecker.hasDuplicates(list), "Expected no duplicates in an empty list");
    }

    @Test
    void testSingleElementList() {
        List<Character> list = List.of('A');
        assertFalse(DuplicateChecker.hasDuplicates(list), "Expected no duplicates in a single-element list");
    }

    @Test
    void testListWithAllSameElements() {
        List<String> list = List.of("test", "test", "test");
        assertTrue(DuplicateChecker.hasDuplicates(list), "Expected duplicates in a list with identical elements");
    }
}