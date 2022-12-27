import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public int add(String name, String phone) {
        phoneBook.put(name, phone);
        return phoneBook.size();
    }
}
