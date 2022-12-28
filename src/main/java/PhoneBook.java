import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        for (Map.Entry<String, String> entry : bookOfPhone.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return bookOfPhone.get(name);
    }

    public Set<String> printAllNames() {
        return bookOfPhone.keySet();
    }

}
