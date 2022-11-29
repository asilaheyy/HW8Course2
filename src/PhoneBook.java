import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private final Map<Fullname, String> telephones = new HashMap<>();

    public void addPhone(Fullname fullname, String phone) {
        telephones.put(fullname, phone);
    }

    public Set<Map.Entry<Fullname, String>> getEntries() {
        return telephones.entrySet();

    }

}
