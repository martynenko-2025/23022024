import java.util.*;

public class DuplicateChecker {
    public static <T> boolean hasDuplicates(List<T> list) {
        Set<T> set = new HashSet<>();
        for (T item : list) {
            if (!set.add(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "apple");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(hasDuplicates(stringList));
        System.out.println(hasDuplicates(intList));
    }
}












