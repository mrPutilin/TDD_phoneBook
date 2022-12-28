import org.junit.jupiter.api.*;

import java.util.*;

public class PhoneBookTest {
    PhoneBook sut;

    @BeforeEach
    public void init() {
        System.out.println("Test started");
        sut = new PhoneBook();


    }

    @BeforeAll
    public static void mes() {
        System.out.println("TESTS STARTED");

    }

    @Test
    public void addTestShouldReturnAmountContacts() {
        Map<String, String> s = new HashMap<>();
        s.put("dd", "11");
        s.put("aa", "22");
        s.put("dd", "77");
        int expected = s.size();

        sut.add("dd", "11");
        sut.add("aa", "22");
        int result = sut.add("dd", "77");

        Assertions.assertEquals(expected, result);
    }


    @Test
    void shouldFindNameByNumber() {
        sut.add("Robbi", "444");
        String expected = "Robbi";

        Assertions.assertEquals(expected, sut.findByNumber("444"));
    }

    @Test
    void shouldFindNumberByName() {
        sut.add("Markus", "555");
        String expected = "555";

        Assertions.assertEquals(expected, sut.findByName("Markus"));
    }

    @Test
    void shouldPrintAllNamesInAlphabetOrder() {
        Set<String> f = new TreeSet<>();
        f.add("Zahar");
        f.add("Goblin");
        f.add("Adam");

        sut.add("Goblin", "222");
        sut.add("Adam", "333");
        sut.add("Zahar", "555");

        Assertions.assertEquals(f, sut.printAllNames());

    }

    @AfterEach
    void finishedEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("TESTS FINISHED");
    }

}
