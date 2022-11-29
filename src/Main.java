import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {

        //Задание 1
        PhoneBook telephones = new PhoneBook();
        while (telephones.getEntries().size() < 20) {
            telephones.addPhone(getRandomName(), getRandomPhone());
        }

        for (Map.Entry<Fullname, String> entry : telephones.getEntries()) {
            System.out.printf("%s- %s%n", entry.getKey(), entry.getValue());
        }

    }

    public static Fullname getRandomName() {
        String firstName = "Name" + RANDOM.nextInt(1000);
        String lastName = "Lastname" + RANDOM.nextInt(1000);
        return new Fullname(firstName, lastName);
    }

    public static String getRandomPhone() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(10));
        }
        return stringBuilder.toString();
    }
}