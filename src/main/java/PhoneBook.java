import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> bookOfPhone;

    public PhoneBook() {
        bookOfPhone = new HashMap<>();
    }

    public int add(String name, String phone) {
        bookOfPhone.put(name, phone);
        return bookOfPhone.size();
    }

    public String findByNumber(String value) {
        return null;
    }

}
