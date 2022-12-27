import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PhoneBookTest {

    static PhoneBook sut;

    @BeforeAll
    public static void mes () {
        System.out.println("TESTS STARTED");
        sut = new PhoneBook();
    }

    @BeforeEach
    public void init() {
        System.out.println("Test started");
    }

    @ParameterizedTest
    @MethodSource("source")
    public void shouldReturnAmountContacts(String name, String phone, int expected) {

        Assertions.assertEquals(expected, sut.add(name, phone));

    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of("Tony", "444", 1 ),
                        Arguments.of("Ben", "555", 2),
                        Arguments.of("Tony", "666", 2));
    }

    @AfterEach
    public void finishedEach() {
        System.out.println("Test completed");
    }

    @AfterAll
    public static void finishedAll () {
        System.out.println("TESTS FINISHED");
    }


}
